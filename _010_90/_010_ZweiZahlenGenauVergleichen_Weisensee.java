package Uebungen._010_90;

import java.util.Random;

public class _010_ZweiZahlenGenauVergleichen_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Zwei Zahlen genau vergleichen
         *
         * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt.
         * Dann soll das Programm testen und ausgeben,
         * welche von den beiden Zahlen größer ist oder ob beide Zahlen gleich groß sind.
         */
        Random r = new Random();
        int zahl1 = r.nextInt(10) + 1;
        int zahl2 = r.nextInt(10) + 1;

        if (zahl1 > zahl2)
        {
            System.out.println("Zahl 1 ist größer als Zahl 2.");
            zahlenAusgeben(zahl1, zahl2);
        }
        else if(zahl1 < zahl2)
        {
            System.out.println("Zahl 1 ist kleiner als Zahl 2.");
            zahlenAusgeben(zahl1, zahl2);
        }
        else
        {
            System.out.println("Zahl 1 und Zahl 2 sind gleichgroß.");
            zahlenAusgeben(zahl1, zahl2);
        }
    }

    static void zahlenAusgeben(int zahl1, int zahl2)
    {
        System.out.println("Zahl 1: " + zahl1 + "\n" + "Zahl 2: " + zahl2);
    }
}