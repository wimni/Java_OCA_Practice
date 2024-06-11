package Uebungen._010_90;

import java.util.Random;

public class _020_Begruessung_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Begrüßung
         *
         * Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit
         * ausgegeben werden.
         * Zwischen 22Uhr und 5Uhr: Gute Nacht
         * Vor 11Uhr: Guten Morgen
         * Vor 15Uhr: Mahlzeit
         * Vor 18Uhr: Guten Nachmittag
         * Vor 22Uhr: Guten Abend
         *
         * Erstelle die Stunde per Zufall zwischen 0 - 23.
         */

        Random r = new Random();

        int hour = r.nextInt(24);

        if (hour >= 22 || hour <= 5)
            System.out.println("Gute Nacht");
        else if (hour < 11)
            System.out.println("Guten Morgen");
        else if (hour < 15)
            System.out.println("Mahlzeit");
        else if (hour < 18)
            System.out.println("Guten Nachmittag");
        else
            System.out.println("Guten Abend");
    }
}
