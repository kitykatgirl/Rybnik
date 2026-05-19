package ph.me.rybnik;

public class Ryba {
    String nazwaGatunku;
    int sposobZyienia;
    int dlugosc;
    boolean okresOchronny;
    double waga;

    public Ryba(String nazwaGatunku, int sposobZyienia, int dlugosc, boolean okresOchronny, double waga) {
        this.nazwaGatunku = nazwaGatunku;
        this.sposobZyienia = sposobZyienia;
        this.dlugosc = dlugosc;
        this.okresOchronny = okresOchronny;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "nazwaGatunku='" + nazwaGatunku + '\'' +
                ", sposobZyienia=" + sposobZyienia +
                ", dlugosc=" + dlugosc +
                ", okresOchronny=" + okresOchronny +
                ", waga=" + waga +
                '}';
    }
}
