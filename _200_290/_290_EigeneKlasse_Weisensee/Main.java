package Uebungen._200_290._290_EigeneKlasse_Weisensee;

public class Main
{
    public static void main(String[] args)
    {

        /*
         * Eigene Klasse
         *
         * Überlege dir ein Objekt aus deiner Umgebung oder deiner Phantasie.
         * Schreibe eine Klasse zum Erzeugen eines solchen Objekts.
         * Anforderungen:
         *     - Mindestens zwei Attribute
         *     - Diverse Konstruktoren
         *     - Kapselung mit private, Gettern & Settern
         *     - Statischer Counter
         *     - toString()-Methode
         *     - Mindestens eine zusätzliche Methode
         *     - Die Klasse in eine getrennte Datei (Abgabe als Package/Ordner mit zwei Dateien)
         */

        Buch b1 = new Buch("IT-Berufe - Grundstufe Lernfelder 1-5",
                "Westermann",
                "978-3-14-220000-2",
                "Jürgen Gratzke", "Bernhard Hauser", "Ingo Patett", "Dr. Klaus Ringhand");
        System.out.println(b1);

        Buch b2 = new Buch("OCA Java SE 8 Programmer | Exam Guide",
                "McGraw-Hill Education Ltd",
                "978-1260011395",
                "Kathy Sierra");
        System.out.println(b2);

        System.out.println("\nAnzahl Bücher:" + b1.getCounter());
        System.out.println(b1.buecherListtoString());
    }
}
