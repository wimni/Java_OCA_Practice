package Uebungen._400_490._480_Buchkapitel05_Weisensee;

public class Kreis
{
    double radius;

    Kreis()
    {
        this.radius = 0;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double r)
    {
        this.radius = r;
    }

    public double getUmfang()
    {
        return 2 * Math.PI * this.radius;
    }

    public double getFlaeche()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public void setUmfange(double u)
    {
        this.radius = u / (2 * Math.PI);
    }

    public void setFlaeche( double f)
    {
        this.radius = Math.sqrt(f / Math.PI);
    }
}
