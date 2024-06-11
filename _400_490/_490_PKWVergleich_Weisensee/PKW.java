package Uebungen._400_490._490_PKWVergleich_Weisensee;

public class PKW extends Fahrzeug {

    // Neues, eigenes Attribut

    private int kofferraumVolumen = 300;

    PKW() {
        super();
    }

    PKW(String hersteller) {
        super(hersteller);
    }

    PKW(String hersteller, String farbe) {
        super(hersteller, farbe);
    }

    PKW(String hersteller, String farbe, int kofferraumVolumen) {
        super(hersteller, farbe);
        setKofferraumVolumen(kofferraumVolumen);
    }

    PKW(int kofferraumVolumen) {
        // super();  // Ist optional, da es vom Compiler immer gemacht werden muss,
        // um die zu erbenden Sachen (Attribute & Methoden) von der Elternklasse zu holen.
        setKofferraumVolumen(kofferraumVolumen);
    }

    public int getKofferraumVolumen() {
        return kofferraumVolumen;
    }

    public void setKofferraumVolumen(int kofferraumVolumen) {
        this.kofferraumVolumen = kofferraumVolumen;
    }

    @Override
    public String toString() {
        return "PKW{" +
                "kofferraumVolumen=" + getKofferraumVolumen() +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (! (obj instanceof PKW)) return false;

        PKW pkw = (PKW) obj;

        if (this.getHersteller().equals(pkw.getHersteller()) &&
                this.getFarbe().equals(pkw.getFarbe()) &&
                this.getKofferraumVolumen() == pkw.getKofferraumVolumen())
            return true;
        return false;
    }

}
