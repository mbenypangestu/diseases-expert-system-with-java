package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GejalaKlinis {
    private int                 id;
    private String              name;
    private double              prosens;
    private List<Prosentase>    prosentaseFisik;
    private List<GejalaFisik>   gejalaFisikLists;

    Data data = Data.getInstance();

    public  GejalaKlinis() {}

    public GejalaKlinis(int id, String name, List<Prosentase> prosentaseList) {
        this.id                 = id;
        this.name               = name;
        this.prosens            = 0.0;
        this.prosentaseFisik    = prosentaseList;

        this.gejalaFisikLists   = new ArrayList<>();

        this.updateGejalaFisik();
    }

    public GejalaKlinis(int id, String name, double prosens, List<GejalaFisik> gejalaFisikLists) {
        this.id                 = id;
        this.name               = name;
        this.prosens            = prosens;
        this.gejalaFisikLists   = gejalaFisikLists;
    }

    public List<GejalaFisik> getGejalaFisikLists() {
        return gejalaFisikLists;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getProsens() {
        return prosens;
    }

    public void setProsens(double prosens) {
        this.prosens = prosens;
    }

    public void addGejalaFisik(GejalaFisik gejalaFisik, Prosentase prosen) {
        this.gejalaFisikLists.add(
                new GejalaFisik(
                        gejalaFisik.getId(),
                        gejalaFisik.getName(),
                        prosen.getProsens()
                )
        );
    }

    public void updateGejalaFisik() {
        for (Prosentase prosen : this.prosentaseFisik) {
            GejalaFisik gejala     = data.getGejalaFisik()
                    .stream()
                    .filter(o -> o.getId() == prosen.getId())
                    .findFirst().get();

            gejala.setProsens(prosen.getProsens());
            this.addGejalaFisik(gejala, prosen);
        }
    }
}
