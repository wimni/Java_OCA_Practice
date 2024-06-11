package Uebungen._400_490._480_Buchkapitel05_Weisensee;

public class Rechteck
{
    double laenge;
    double breite;

    Rechteck()
    {
        this.laenge = 0;
        this.breite = 0;
    }

    Rechteck(double laenge, double breite)
    {
        this.laenge = laenge;
        this.breite = breite;
    }

    public void setLaenge(double l)
    {
        this.laenge = l;
    }

    public void setBreite(double b)
    {
        this.breite = b;
    }

    public void SetSeiten(double l, double b)
    {
        this.laenge = l;
        this.breite = b;
    }

    public double getLaenge()
    {
        return laenge;
    }

    public double getBreite()
    {
        return breite;
    }

    public double getLangeSeite()
    {
        if (this.laenge > this.breite)
            return this.laenge;
        return this.breite;
    }

    public double getkurzeSeite()
    {
        if (this.laenge > this.breite)
            return this.breite;
        return this.laenge;
    }

    public double getDiagonale()
    {
        return Math.sqrt(Math.pow(this.laenge, 2) + Math.pow(this.breite, 2));
    }

    public double getFlaeche()
    {
        return this.laenge * this.breite;
    }

    public double getUmfang()
    {
        return this.laenge * 2 + this.breite * 2;
    }

    public void laengeAusgeben()
    {
        double laenge = 5.4;
        System.out.println("Länge: " + laenge);
    }

    public void laengeVergroessern(double l)
    {
        this.laenge += l;
    }

    public void breiteVergroessern(double b)
    {
        this.breite += b;
    }

    public void laengeVerkleinern(double l)
    {
        this.laenge -= l;
    }

    public void breiteVerkleinern(double b)
    {
        this.breite -= b;
    }
}
