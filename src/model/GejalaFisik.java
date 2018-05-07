package model;

import java.util.List;

public class GejalaFisik {
    private int id;
    private String name;
    private double prosens;

    public GejalaFisik() {}

    public GejalaFisik(int id, String name) {
        this.id = id;
        this.name = name;
        this.prosens = 0.0;
    }

    public GejalaFisik(int id, String name, double prosens) {
        this.id = id;
        this.name = name;
        this.prosens = prosens;
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
}
