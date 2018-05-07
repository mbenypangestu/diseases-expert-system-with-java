package model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Penyakit>      penyakit        = new ArrayList<>();
    private List<GejalaKlinis>  gejalaKlinis    = new ArrayList<>();
    private List<GejalaFisik>   gejalaFisik     = new ArrayList<>();

    private static Data instance = new Data();

    public static Data getInstance() {
        return instance;
    }

    public List<Penyakit> getPenyakitList() {
        return penyakit;
    }

    public void addPenyakit(Penyakit penyakit) {
        this.penyakit.add(penyakit);
    }

    public List<GejalaFisik> getGejalaFisik() {
        return gejalaFisik;
    }

    public void addGejalaFisik(GejalaFisik gejalaFisik) {
        this.gejalaFisik.add(gejalaFisik);
    }

    public List<GejalaKlinis> getGejalaKlinis() {
        return gejalaKlinis;
    }

    public void addGejalaKlinis(GejalaKlinis gejalaKlinis) {
        this.gejalaKlinis.add(gejalaKlinis);
    }
}
