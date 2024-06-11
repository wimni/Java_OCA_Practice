package Uebungen._400_490._480_Buchkapitel05_Weisensee;

public class Test
{
    public static void main(String[] args)
    {
        // Aufgabe 1 Kreis
        System.out.println("Aufgabe 1 Kreis");
        Kreis kreis = new Kreis();
        System.out.println(kreis.getRadius());
        kreis.setRadius(5);
        System.out.println(kreis.getFlaeche());
        System.out.println(kreis.getUmfang());

        // Aufgabe 2 Rechteck
        System.out.println("\nAufgabe 2 Rechteck");
        Rechteck rechteck = new Rechteck(10, 5);
        System.out.println(rechteck.getkurzeSeite());
        System.out.println(rechteck.getLangeSeite());
        System.out.println(rechteck.getDiagonale());
        System.out.println(rechteck.getFlaeche());
        System.out.println(rechteck.getUmfang());

        // Aufgabe 3
        System.out.println("\nAufgabe 3");
        rechteck.laengeAusgeben();

        // Aufgabe 4
        System.out.println("\nAufgabe 4");
        rechteck.laengeVergroessern(3); // lanege = 13
        rechteck.breiteVergroessern(17); // breite = 22
        System.out.println(rechteck.getLaenge() + " " + rechteck.getBreite());
        rechteck.laengeVerkleinern(8);  // laenge = 5
        rechteck.breiteVerkleinern(11); //breite = 11
        System.out.println(rechteck.getLaenge() + " " + rechteck.getBreite());

        // Aufgabe 5
        System.out.println("\nAufgabe 5");
        kreis.setUmfange(10);
        System.out.println(kreis.getUmfang());
        kreis.setFlaeche(10);
        System.out.println(kreis.getFlaeche());

        // Aufgabe 6 Kreistabelle
        System.out.println("\nAufgabe 6 Kreistabelle\n");
        Kreistabelle.tabelleAusgeben(5);

        // Aufgabe 7 FlaechegleicherKreis
        System.out.println("\nAufgabe 7 FlaechegleicherKreis");
        FlaechegleicherKreis.FlaechegleicherKreisAusgeben(10, 20);
    }
}
