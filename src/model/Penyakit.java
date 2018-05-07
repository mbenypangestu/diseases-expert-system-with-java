package model;

import java.util.*;

public class Penyakit {
    private int                 id;
    private String              name;
    private double              treshold;
    private List<Prosentase>    prosentase;
    private List<GejalaKlinis>  gejalaKlinisLists;

    Data data = Data.getInstance();

    public Penyakit() {}

    public Penyakit(int id, String name, double treshold, List<Prosentase> listProsentase) {
        this.id                 = id;
        this.name               = name;
        this.treshold           = treshold;
        this.prosentase         = listProsentase;

        this.gejalaKlinisLists  = new ArrayList<>();

        this.updateGejalaKlinis();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTreshold() {
        return treshold;
    }

    public List<GejalaKlinis> getGejalaKlinisLists() {
        return gejalaKlinisLists;
    }

    public void addGejalaKlinis(GejalaKlinis gejalaKlinis, Prosentase prosens) {
        this.gejalaKlinisLists.add(
                new GejalaKlinis(
                        gejalaKlinis.getId(),
                        gejalaKlinis.getName(),
                        prosens.getProsens(),
                        gejalaKlinis.getGejalaFisikLists()
                )
        );
    }

    public void updateGejalaKlinis() {
        for (Prosentase prosen : this.prosentase) {
            GejalaKlinis gejala     = data.getGejalaKlinis()
                    .stream()
                    .filter(o -> o.getId() == prosen.getId())
                    .findFirst().get();

            gejala.setProsens(prosen.getProsens());
            this.addGejalaKlinis(gejala, prosen);
        }
    }
}
