package model;

public class Prosentase {
    private int     id;
    private double  prosens;

    public Prosentase(int id, double prosens) {
        this.id = id;
        this.prosens = prosens;
    }

    public int getId() {
        return id;
    }

    public double getProsens() {
        return prosens;
    }
}
