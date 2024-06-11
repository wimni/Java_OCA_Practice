package Uebungen._400_490;

public class _430_WuerfelWahrscheinlichkeit_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Würfel-Wahrscheinlichkeit
         *
         * Wie groß ist die Wahrscheinlichkeit,
         * dass beim Wurf zweier Würfel die Summe der Augenzahlen 7 entspricht?
         *
         * Die Wahrscheinlichkeit dafür, dass die Summe der Augenzahlen 7 ist,
         * berechnet sich aus der Anzahl aller Würfe mit Summe 7,
         * geteilt durch die Anzahl aller möglichen Würfe.
         *
         * Zusatz:
         * Schreibe eine Methode,
         * die obige Wahrscheinlichkeit für eine beliebige Summe berechnet.
         */

        wahrscheinlichkeit(2, 1);
        wahrscheinlichkeit(2, 5);
        wahrscheinlichkeit(3, 6);
        wahrscheinlichkeit(3, 2);
        wahrscheinlichkeit(4, 16);
        wahrscheinlichkeit(8, 32);
    }

    private static void wahrscheinlichkeit(int wuerfel, int summe)
    {
        int anzahlwuerfe = (int)Math.pow(6, wuerfel);
        int anzahlSumme = 0;
        int summeArray;
        int ggt = 1;

        int[] wuerfelArray = new int[wuerfel];

        for (int i = 0; i < wuerfel; i++)
        {
            wuerfelArray[i] = 1;
        }

        for (int i = 0; i < anzahlwuerfe; i++)
        {
            summeArray = 0;
            for (int j = 0; j < wuerfel; j++)
            {
                summeArray += wuerfelArray[j];
            }
            if (summeArray == summe)
            {
                anzahlSumme++;
            }
            wuerfelArray[0]++;
            for (int j = 0; j < wuerfel; j++)
            {
                if (wuerfelArray[j] == 7 && j != wuerfel - 1)
                {
                    wuerfelArray[j] = 1;
                    wuerfelArray[j + 1] += 1;
                }
            }
        }

        // get größterGemeinsamerTeiler
        for (int i = 2; i < anzahlwuerfe; i++)
        {
            if (anzahlSumme % i == 0 && anzahlwuerfe % i == 0 && summe >= wuerfel)
                ggt = i;
        }

        // output array
//        for (int i = 0; i < wuerfelArray.length; i++)
//        {
//            System.out.print(wuerfelArray[i] + " ");
//        }
//        System.out.println();
//        System.out.println(anzahlwuerfe + " " + anzahlSumme + " " + ggt);

        System.out.print("Die Wahrscheinlichkeit bei " + wuerfel + " Würfeln eine " + summe + " zu bekommen beträgt " +
                            anzahlSumme / ggt + " zu " + anzahlwuerfe / ggt + ". ");
        System.out.printf("%.2f", 100d / anzahlwuerfe * anzahlSumme);
        System.out.println("%");
    }
}
