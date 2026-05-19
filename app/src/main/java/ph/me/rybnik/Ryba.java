package ph.me.rybnik;

public class Ryba {
    String nazwaGatunku;
    int sposobZyienia;
    int dlugosc;
    boolean okresOchronny;
    int waga;

    public Ryba(String nazwaGatunku, int sposobZyienia, int dlugosc, boolean okresOchronny, int waga) {
        this.nazwaGatunku = nazwaGatunku;
        this.sposobZyienia = sposobZyienia;
        this.dlugosc = dlugosc;
        this.okresOchronny = okresOchronny;
        this.waga = waga;
    }

    @Override
    public String toString() {
        String sposob;
        switch (sposobZyienia){
            case 1:{
                sposob = "roslinozerne";
                break;
            }
            case 2:{
                sposob = "wszystkozerne";
                break;
            }
            default:{
                sposob = "drapiezne";
            }
        }
        if (okresOchronny){
            return "Nazwa gatunku: " + nazwaGatunku + " | Sposob Zywienia: " + sposob + " | Dlugosc: " + dlugosc + "cm | Waga: " + waga + "g | Podczas Okresu Ochronnego";
        }
        else {
            return "Nazwa gatunku: " + nazwaGatunku + " | Sposob Zywienia: " + sposob + " | Dlugosc: " + dlugosc + "cm | Waga: " + waga + "g";
        }
    }
}
