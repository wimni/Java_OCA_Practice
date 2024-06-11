package Uebungen._300_390._340_Ferienhaus_Weisensee;

import java.text.DecimalFormat;

public class Wohnung
{
    private String name;
    private String standort;
    private int betten;
    private double preis;

    // Konstruktor

    public Wohnung(String name, String standort, int betten, double preis) {
        this.name = name;
        this.standort = standort;
        this.betten = betten;
        this.preis = preis;
    }

    public Wohnung(String name, String standort) {
        this.name = name;
        this.standort = standort;
    }

    public Wohnung(String name, String standort, int betten) {
        this.name = name;
        this.standort = standort;
        this.betten = betten;
    }

    public Wohnung(String name, String standort, double preis) {
        this.name = name;
        this.standort = standort;
        this.preis = preis;
    }

    // Getter + Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public int getBetten() {
        return betten;
    }

    public void setBetten(int betten) {
        this.betten = betten;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    //Methoden

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        String string = (this.name + " liegt in " + this.standort + ".");
        if (this.betten != 0 && this.preis != 0)
            string += (" Es hat " + this.betten + " Betten und kostet " + df.format(this.preis) + "€ pro Nacht.");
        else if (this.betten != 0)
            string += (" Es hat " + this.betten + " Betten.");
        else if (this.preis != 0)
            string += (" Es kostet " + df.format(this.preis) + "€ pro Nacht.");
        return string;
    }
}
