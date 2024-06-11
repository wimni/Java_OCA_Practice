package Uebungen._100_190;

public class _190_Kniffel_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Kniffel
         *
         * Verwende einen Zufallszahlengenerator
         * um Würfelergebnisse (1-6) zu simulieren.
         * Werfe nun 5 Würfel und bilde die Augensumme.
         * Spiele dieses Experiment 1000 Mal durch
         * und ermittel, wie oft jede mögliche Augensumme
         * (Minimum = 5, Maximum = 30) vorgekommen ist.
         * Gib das Ergebnis wie unten grafisch aus.
         */

/*
05->
06->
07->xx
08->xxxxx
09->xxxxxxxxx
10->xxxxxxxxxxxxx
11->xxxxxxxxxxxxxxxxxxxxxxxxxxx
12->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
13->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
14->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
15->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
16->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
17->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
18->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
19->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
20->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
21->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
22->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
23->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
24->xxxxxxxxxxxxxxxx
25->xxxxxxxxxxxxxxxx
26->xxxxxxxxxxx
27->xxxxx
28->xx
29->xx
30->
*/

        int anzahl = 1000;
        int[] wuerfel = getWuerfelArray(anzahl);
        for (int i = 0; i < wuerfel.length; i++)
        {
            System.out.print(String.format("%02d", (i + 5)) + "->");
            for (int j = 0; j < wuerfel[i]; j++)
            {
                System.out.print("x");
            }
            System.out.println();
        }

    }

    static int[] getWuerfelArray(int anzahl)
    {
        int[] wuerfel = new int[26];
        int augen;
        for (int i = 0; i < anzahl; i++)
        {
            augen = 0;
            for (int j = 0; j < 5; j++)
            {
                augen += getWuerfel();
            }
            wuerfel[augen - 5]++;
        }
        return wuerfel;
    }

    static int getWuerfel()
    {
        return (int)(Math.random() * 6 + 1);
    }
}
