package input;

import model.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Input {
    private String          input;
    private String[]        inputSplit;
    private int[]           gejalaPasien;

    BufferedReader  keyboard        = new BufferedReader(new InputStreamReader(System.in));

    Data data = Data.getInstance();

    public void setData() {
        this.setGejalaFisik();
        this.setGejalaKlinis();
        this.setPenyakit();
    }

    public void setGejalaFisik() {
        data.addGejalaFisik(new GejalaFisik(1, "Buang Air Besar"));
        data.addGejalaFisik(new GejalaFisik(2, "Berak Encer"));
        data.addGejalaFisik(new GejalaFisik(3, "Berak Berdarah"));
        data.addGejalaFisik(new GejalaFisik(4, "Lesu dan tidak Bergairah"));
        data.addGejalaFisik(new GejalaFisik(5, "Tidak Selera Makan"));
        data.addGejalaFisik(new GejalaFisik(6, "Mual dan sering Muntah"));
        data.addGejalaFisik(new GejalaFisik(7, "Sakit dibagian Perut"));
        data.addGejalaFisik(new GejalaFisik(8, "Tekanan Darah Rendah"));
        data.addGejalaFisik(new GejalaFisik(9, "Pusing"));
        data.addGejalaFisik(new GejalaFisik(10, "Pingsan"));
        data.addGejalaFisik(new GejalaFisik(11, "Suhu Badan Tinggi"));
        data.addGejalaFisik(new GejalaFisik(12, "Luka dibagian tertentu"));
        data.addGejalaFisik(new GejalaFisik(13, "Tidak dapat menggerakkan anggota badan tertentu"));
        data.addGejalaFisik(new GejalaFisik(14, "Memakan sesuatu"));
        data.addGejalaFisik(new GejalaFisik(15, "Memakan Daging"));
        data.addGejalaFisik(new GejalaFisik(16, "Memakan Jamur"));
        data.addGejalaFisik(new GejalaFisik(17, "Memakan Makanan Kaleng"));
        data.addGejalaFisik(new GejalaFisik(18, "Membeli Susu"));
        data.addGejalaFisik(new GejalaFisik(19, "Meminum Susu"));
    }

    public void setGejalaKlinis() {
        List<Prosentase> mapProsens = new ArrayList<>();

        mapProsens.add(new Prosentase(1, 30));
        mapProsens.add(new Prosentase(2, 20));
        mapProsens.add(new Prosentase(4, 20));
        mapProsens.add(new Prosentase(5, 30));
        data.addGejalaKlinis(new GejalaKlinis(20, "Mencret", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(4, 25));
        mapProsens.add(new Prosentase(5, 50));
        mapProsens.add(new Prosentase(6, 25));
        data.addGejalaKlinis(new GejalaKlinis(21, "Muntah", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(4, 60));
        mapProsens.add(new Prosentase(7, 40));
        data.addGejalaKlinis(new GejalaKlinis(22, "Sakit Perut", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(4, 30));
        mapProsens.add(new Prosentase(8, 40));
        mapProsens.add(new Prosentase(9, 30));
        data.addGejalaKlinis(new GejalaKlinis(23, "Darah Rendah", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(8, 50));
        mapProsens.add(new Prosentase(10, 50));
        data.addGejalaKlinis(new GejalaKlinis(24, "Koma", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(4, 25));
        mapProsens.add(new Prosentase(5, 15));
        mapProsens.add(new Prosentase(9, 30));
        mapProsens.add(new Prosentase(11, 30));
        data.addGejalaKlinis(new GejalaKlinis(25, "Demam", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(4, 20));
        mapProsens.add(new Prosentase(8, 35));
        mapProsens.add(new Prosentase(11, 20));
        mapProsens.add(new Prosentase(12, 15));
        data.addGejalaKlinis(new GejalaKlinis(26, "Septicaemia", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(4, 60));
        mapProsens.add(new Prosentase(13, 40));
        data.addGejalaKlinis(new GejalaKlinis(27, "Lumpuh", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(1, 20));
        mapProsens.add(new Prosentase(2, 25));
        mapProsens.add(new Prosentase(3, 25));
        mapProsens.add(new Prosentase(4, 10));
        mapProsens.add(new Prosentase(5, 20));
        data.addGejalaKlinis(new GejalaKlinis(28, "Mencret Berdarah", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(14, 45));
        mapProsens.add(new Prosentase(15, 55));
        data.addGejalaKlinis(new GejalaKlinis(29, "Makan Daging", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(14, 55));
        mapProsens.add(new Prosentase(16, 45));
        data.addGejalaKlinis(new GejalaKlinis(30, "Makan Jamur", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(14, 50));
        mapProsens.add(new Prosentase(17, 50));
        data.addGejalaKlinis(new GejalaKlinis(31, "Makan Makanan Kaleng", mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(18, 55));
        mapProsens.add(new Prosentase(19, 45));
        data.addGejalaKlinis(new GejalaKlinis(32, "Minum Susu", mapProsens));
    }

    public void setPenyakit() {
        List<Prosentase> mapProsens = new ArrayList<>();

        mapProsens.add(new Prosentase(20, 25));
        mapProsens.add(new Prosentase(21, 25));
        mapProsens.add(new Prosentase(22, 15));
        mapProsens.add(new Prosentase(23, 20));
        mapProsens.add(new Prosentase(29, 15));
        data.addPenyakit(new Penyakit(33, "Keracunan Staphylococcus aureus", 70.0, mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(20, 25));
        mapProsens.add(new Prosentase(21, 25));
        mapProsens.add(new Prosentase(22, 15));
        mapProsens.add(new Prosentase(24, 20));
        mapProsens.add(new Prosentase(30, 15));
        data.addPenyakit(new Penyakit(34, "Keracunan jamur beracun", 70.0, mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(20, 15));
        mapProsens.add(new Prosentase(21, 25));
        mapProsens.add(new Prosentase(22, 10));
        mapProsens.add(new Prosentase(25, 20));
        mapProsens.add(new Prosentase(26, 15));
        mapProsens.add(new Prosentase(29, 15));
        data.addPenyakit(new Penyakit(35, "Keracunan Salmonellae", 70.0, mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(21, 40));
        mapProsens.add(new Prosentase(27, 30));
        mapProsens.add(new Prosentase(31, 30));
        data.addPenyakit(new Penyakit(36, "Keracunan Salmonellae", 70.0, mapProsens));

        mapProsens.clear();

        mapProsens.add(new Prosentase(22, 25));
        mapProsens.add(new Prosentase(25, 25));
        mapProsens.add(new Prosentase(28, 30));
        mapProsens.add(new Prosentase(32, 20));
        data.addPenyakit(new Penyakit(37, "Keracunan Campylobacter", 70.0, mapProsens));

        mapProsens.clear();
    }

    public void inputGejalaPasien() {
        boolean statusAvailableGejala = false;
        try {
            System.out.print("Pilih gejala (ex : 1,5,10) : ");

            input           = keyboard.readLine();
            inputSplit      = input.split(",");
            gejalaPasien    = new int[inputSplit.length];

            for (int i = 0; i < gejalaPasien.length; i++) {
                gejalaPasien[i] = Integer.parseInt(inputSplit[i]);
            }
            System.out.println("\nResult : ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int[] getGejalaPasien() {
        return gejalaPasien;
    }
}