package Uebungen._400_490._480_Buchkapitel05_Weisensee;

public class FlaechegleicherKreis
{
    static Kreis kreis = new Kreis();
    static Rechteck rechteck = new Rechteck();

    public static void FlaechegleicherKreisAusgeben(double l, double b)
    {
        rechteck.setLaenge(l);
        rechteck.setBreite(b);
        kreis.setFlaeche(rechteck.getFlaeche());
        System.out.println("Rechtecklänge: " + rechteck.laenge);
        System.out.println("Rechteckbreite: " + rechteck.breite);
        System.out.println("Rechteckfläche: " + rechteck.getFlaeche());
        System.out.println("Kreisradius: " + kreis.getRadius());
        System.out.println("Kreisfläche: " + kreis.getFlaeche());
    }
}
