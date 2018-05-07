import ai.ExpertSystem;
import data.View;
import input.Input;
import model.Data;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        String          again       = null;
        BufferedReader  keyboard    = new BufferedReader(new InputStreamReader(System.in));

        Input           input   = new Input();
        View            view    = new View();
        ExpertSystem    ai      = new ExpertSystem();

        input.setData();

        do {
            view.showGejalaFisik();
            input.inputGejalaPasien();

            ai.analyze(input.getGejalaPasien());
            ai.checkTresholdPenyakit();
            ai.showResultPenyakit();

            System.out.print("Mau Lagi (y/n) ? ");
            again = keyboard.readLine();
        } while (again.equals("y") || again.equals("Y"));
    }
}
