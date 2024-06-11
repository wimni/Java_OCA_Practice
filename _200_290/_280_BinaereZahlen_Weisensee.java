package Uebungen._200_290;

public class _280_BinaereZahlen_Weisensee
{
    public static void main(String[] args)
    {

                /*
        * Binäre Zahlen
        *
        * Schreibe ein Programm,
        * das alle Zahlen von 0-255 binär schreibt
        * und folgendermaßen ausgibt:

        0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 1
        0 0 0 0 0 0 1 0
        0 0 0 0 0 0 1 1
        0 0 0 0 0 1 0 0
        ...
        1 1 1 1 1 0 1 1
        1 1 1 1 1 1 0 0
        1 1 1 1 1 1 0 1
        1 1 1 1 1 1 1 0
        1 1 1 1 1 1 1 1

        */

        for (int i = 0; i <= 255; i++)
        {
            if (i / 128 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 128 / 64 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 64 / 32 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 32 / 16 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 16 / 8 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 8 / 4 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 4 / 2 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            if (i % 2 > 0) System.out.print("1 ");
            else System.out.print("0 ");

            System.out.println();
        }
    }
}
