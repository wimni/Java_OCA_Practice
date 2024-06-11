package Uebungen._500_590._520_BuchKapitel06_Weisensee;

public class Girokonto extends Konto
{
    private double limit;

    Girokonto(String kontonummer, double kontostand, double limit)
    {
        super(kontonummer, kontostand);
        this.limit = limit;
    }

    public double getLimit()
    {
        return limit;
    }

    public void setLimit(double limit)
    {
        this.limit = limit;
    }

    @Override
    public void auszahlen(double betrag)
    {
        if (getKontostand() - betrag > limit)
            super.auszahlen(betrag);
        else
            System.out.println("Kontostand: " + (getKontostand() - betrag) + "\nFehler: Kreditlimit überschritten!");
    }
}
