package Uebungen._200_290;

public class _240_Zahlenpyramide_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Zahlenpyramide
         *
         * Schreibe ein Programm, das folgendes Ergebnis ausgibt:
         *
         * 00
         * 01 02
         * 02 03 04
         * 03 04 05 06
         * 04 05 06 07 08
         * 05 06 07 08 09 10
         * 06 07 08 09 10 11 12
         * 07 08 09 10 11 12 13 14
         * 08 09 10 11 12 13 14 15 16
         *
         * Zusatz: Benutze nur eine Schleife.
         */

        printZahlenpyramide();
    }

    private static void printZahlenpyramide()
    {
        int temp = 0;
        for (int i = temp; i <= 16; i++)
        {
            System.out.printf("%02d ", i);
            if ( i == 16) break;
            if (temp * 2 <= i)
            {
                temp++;
                i = temp - 1;
                System.out.println();
            }
        }
    }
}
