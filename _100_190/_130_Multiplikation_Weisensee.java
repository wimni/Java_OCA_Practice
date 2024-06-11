package Uebungen._100_190;

public class _130_Multiplikation_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Multiplikation
         *
         * Schreibe ein Programm, das ermittelt,
         * wie viele ganzzahlige Multiplikator-Multiplikand-Kombinationen
         * vom Produkt 8.420.000 es gibt,
         * bei denen sowohl Multiplikator, als auch Multiplikand
         * kleiner als 10.000 sind.
         *
         * 1000*8420 und 8420*1000 ist nur eine Kombination
         */

        int counter = 0;
        for (int i = 1; i < 10000; i++)
        {
            for (int j = 1; j < 10000; j++)
            {
                if (i * j == 8420000) {
                    System.out.println(i + "*" + j);
                    counter++;
                }
            }
        }
        System.out.println("Anzahl: " + counter / 2);
    }
}
