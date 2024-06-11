package Uebungen._500_590;

import java.util.Arrays;

public class _510_PokerMuster_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Poker-Muster
         *
         * Das Würfelspiel Yahtzee verwendet ähnliche Muster wie das Kartenspiel Poker,
         * verzichtet aber auf die verschiedenen Farben.
         * Bei Yahtzee werden fünf Spielwürfel (Augenzahlen 1 bis 6) geworfen.
         * Verwende dazu Zufallszahlen.
         *
         * Schreibe ein Programm, das die fünf Zahlen in einem Array speichert
         * und mittels einer Funktion in der Standardausgabe anzeigt.
         *
         * Entscheide dann, ob alle Zahlen gleich sind (5-Poker).
         * istPoker5()            // alle sind gleich
         *
         * Zusatz:
         * Entscheide, ob es sich um ein anderes Poker-Muster handelt:
         * istVierling()          // vier gleiche
         * istDrilling()          // drei gleiche
         * istPaar()              // zwei gleiche
         * istDoppelPaar()        // zwei Paare
         * istStrasse()           // Reihe
         * istFullHouse()         // Paar + Tripel
         */

        int[] wuerfe = new int[5];
        wuerfe = getWuerfe();
        istMuster(wuerfe);
        System.out.println(Arrays.toString(wuerfe));
    }

    private static void istMuster(int[] wuerfe)
    {
        Arrays.sort(wuerfe);
        if (istPoker5(wuerfe)) System.out.println("istPoker5");
        if (istVierling(wuerfe)) System.out.println("istVierling");
        if (istDrilling(wuerfe)) System.out.println("istDrilling");
        if (istPaar(wuerfe)) System.out.println("istPaar");
        if (istDoppelPaar(wuerfe)) System.out.println("istDoppelPaar");
        if (istStrasse(wuerfe)) System.out.println("istStrasse");
        if (istFullHouse(wuerfe)) System.out.println("istFullHouse");
    }

    private static boolean istFullHouse(int[] wuerfe)
    {
        if (wuerfe[0] == wuerfe[1] && wuerfe[0] == wuerfe[2])
            return wuerfe[3] == wuerfe[4];
        if (wuerfe[1] == wuerfe[2] && wuerfe[1] == wuerfe[3])
            return wuerfe[0] == wuerfe [4];
        if (wuerfe[2] == wuerfe[3] && wuerfe[2] == wuerfe[4])
            return wuerfe[0] == wuerfe[1];
        return false;
    }

    private static boolean istStrasse(int[] wuerfe)
    {
        return wuerfe[0] == 1 && wuerfe[1] == 2 && wuerfe[2] == 3 && wuerfe[3] == 4 && wuerfe[4] == 5 ||
                wuerfe[0] == 2 && wuerfe[1] == 3 && wuerfe[2] == 4 && wuerfe[3] == 5 && wuerfe[4] == 6;
    }

    private static boolean istDoppelPaar(int[] wuerfe)
    {
        if (wuerfe[0] == wuerfe[1])
            return wuerfe[2] == wuerfe[3] || wuerfe[3] == wuerfe[4];
        if (wuerfe[1] == wuerfe[2])
            return wuerfe[3] == wuerfe[4];
        return false;
    }

    private static boolean istPaar(int[] wuerfe)
    {
        return wuerfe[0] == wuerfe[1] || wuerfe[1] == wuerfe[2] || wuerfe[2] == wuerfe[3] || wuerfe[3] == wuerfe[4];
    }

    private static boolean istDrilling(int[] wuerfe)
    {
        return wuerfe[0] == wuerfe[1] && wuerfe[0] == wuerfe[2] ||
                wuerfe[1] == wuerfe[2] && wuerfe[1] == wuerfe[3] ||
                wuerfe[2] == wuerfe[3] && wuerfe[2] == wuerfe[4];
    }

    private static boolean istVierling(int[] wuerfe)
    {
        return wuerfe[0] == wuerfe[1] && wuerfe[0] == wuerfe[2] && wuerfe[0] == wuerfe[3] ||
            wuerfe[1] == wuerfe[2] && wuerfe[1] == wuerfe[3] && wuerfe[1] == wuerfe[4];

    }

    private static boolean istPoker5(int[] wuerfe)
    {
        return wuerfe[0] == wuerfe[1] && wuerfe[0] == wuerfe[2] && wuerfe[0] == wuerfe[3] &&
                wuerfe[0] == wuerfe[4] && wuerfe[0] == wuerfe[5];
    }

    private static int[] getWuerfe()
    {
        int[] wuerfe = new int[5];
        for (int i = 0; i < 5; i++)
        {
            wuerfe[i] = (int)(Math.random() * 6 + 1);
        }
        return wuerfe;
    }

}
