package Uebungen._500_590._520_BuchKapitel06_Weisensee;

public class Konto
{
    private String kontonummer;
    private double kontostand;

    Konto (String kontonummer, double kontostand)
    {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public double getKontostand()
    {
        return kontostand;
    }

    public String getKontonummer()
    {
        return kontonummer;
    }

    public void einzahlen(double betrag)
    {
        kontostand += betrag;
    }

    public void auszahlen(double betrag)
    {
        kontostand -= betrag;
    }
}
