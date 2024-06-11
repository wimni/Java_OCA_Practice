package Uebungen._600_690;

public class _630_PrimzahlenRueckwaerts_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Primzahlen rückwärts
         *
         * Schreibe eine Programm, das alle Primzahlen bis 1000 ausgibt,
         * die, wenn man sie rückwärts liest, auch eine Primzahl sind.
         *
         * Z.B. 199 und 991 sind beides Primzahlen.
         */

        getPrimzahlBis(1000);
    }

    static void getPrimzahlBis(int bis)
    {
        for (int i = 2; i <= bis; i++)
        {
            if (isPrimzahl(i))
                if (isPrimzahl(Integer.parseInt(new StringBuilder(Integer.toString(i)).reverse().toString())))
                    System.out.println(i);
        }
    }

    static boolean isPrimzahl(int zahl)
    {
        for (int j = 2; j < zahl; j++)
        {
            if ( zahl % j == 0)
                return false;
        }
        return true;
    }
}
