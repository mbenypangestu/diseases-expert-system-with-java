package data;

import model.Data;
import model.GejalaFisik;
import model.GejalaKlinis;
import model.Penyakit;

import java.util.List;

public class View {
    Data data = Data.getInstance();

    public void showGejalaFisik() {
        System.out.println("|====================== Gejala Fisik =======================|");
        for (GejalaFisik gejala : data.getGejalaFisik()) {
            System.out.println(
                            gejala.getId() + " \t| " +
                            gejala.getName()
            );
        }
        System.out.println("|===========================================================|\n");
    }

    public void showGejalaKlinis() {
        List<Penyakit> penyakitList = data.getPenyakitList();

        System.out.println("|====================== Gejala Klinis ========================|\n");
        for (Penyakit penyakit : penyakitList)  {
            for (GejalaKlinis klinis : penyakit.getGejalaKlinisLists()) {
                System.out.println("|  " + klinis.getName() + " => " + klinis.getProsens());

                for (GejalaFisik fisik : klinis.getGejalaFisikLists()) {
                    System.out.println(fisik.getId() + " | " +fisik.getName() + " | " + fisik.getProsens());
                }

                System.out.println();
            }
        }
        System.out.println("\n|===========================================================|\n");
    }

    public void showPenyakit() {
        for (Penyakit penyakit : data.getPenyakitList()) {
            System.out.println(
                    penyakit.getId() + " | " +
                            penyakit.getName() + " | " +
                            penyakit.getTreshold() + " | "
            );
        }
    }



}
