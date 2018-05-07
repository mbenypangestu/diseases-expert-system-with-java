package ai;

import model.Data;
import model.GejalaFisik;
import model.GejalaKlinis;
import model.Penyakit;

import java.util.List;

public class ExpertSystem {
    double      max_prosen_penyakit = 0.0;
    Penyakit    result_penyakit     = null;
    String      terjangkit          = "Tidak Terjangkit";

    Data    data                = Data.getInstance();

    public void analyze(int gejalaPasien[]) {
        double  prosenKlinis        = 0.0;
        double  resultKlinis        = 0.0;
        double  prosenPenyakit      = 0.0;

        List<Penyakit> penyakitList     = data.getPenyakitList();

        for (Penyakit penyakit : penyakitList) {

            for (GejalaKlinis gejalaKlinis : penyakit.getGejalaKlinisLists()) {
                prosenKlinis    = this.increaseProsenKlinis(gejalaKlinis, gejalaPasien);
                resultKlinis    = this.setResultKlinis(gejalaKlinis, prosenKlinis);

                prosenPenyakit  = this.increaseProsenPenyakit(prosenPenyakit, resultKlinis);

                prosenKlinis = 0.0;
            }

            this.setResultPenyakit(penyakit, prosenPenyakit);
            System.out.println("Penyakit " + penyakit.getName() + " : " + prosenPenyakit + " %");
            prosenPenyakit = 0.0;
        }
    }

    public double increaseProsenKlinis(GejalaKlinis klinis, int gejpasien[]) {
        double result = 0;

        for (GejalaFisik fisik : klinis.getGejalaFisikLists()) {
            for (int i = 0; i < gejpasien.length; i++) {
                if (gejpasien[i] == fisik.getId()) {
                    result += fisik.getProsens();
                }
            }
        }
        return result;
    }

    public double setResultKlinis(GejalaKlinis klinis, double prosentase) {
        return prosentase * klinis.getProsens() / 100;
    }

    private double increaseProsenPenyakit(double result, double resultKlinis) {
        result  += resultKlinis;
        return result;
    }

    private void setResultPenyakit(Penyakit penyakit, double prosenPenyakit) {
        if (prosenPenyakit > max_prosen_penyakit) {
            max_prosen_penyakit = prosenPenyakit;
            result_penyakit     = penyakit;
        }
    }

    public void checkTresholdPenyakit() {
        if (max_prosen_penyakit >= result_penyakit.getTreshold()) terjangkit = "Terjangkit";
    }

    public void showResultPenyakit() {
        System.out.println("|========================================================================|");
        System.out.println(" Prosentase Penyakit Terbesar\t : " + result_penyakit.getName());
        System.out.println(" Treshold Penyakit\t\t\t\t : " + result_penyakit.getTreshold() + " %");
        System.out.println(" Nilai Prosentase\t\t\t\t : " + max_prosen_penyakit + " %");
        System.out.println(" Keterjangkitan Penyakit\t\t : " + terjangkit);
        System.out.println("|========================================================================|\n\n");
    }
}
