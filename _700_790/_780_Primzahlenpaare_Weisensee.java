package Uebungen._700_790;

public class _780_Primzahlenpaare_Weisensee
{

    /*
     * Primzahlenpaare
     *
     * Suche alle Paare aus Primzahlen, deren Abstand 2 ist.
     *
     * Beispiele:
     * (3, 5), (5, 7), (11, 13), …, (569, 571), …
     *
     * Schreibe eine Methode, welche alle Primzahlpaare kleiner 2000 ausgibt.
     */

    public static void main(String[] args)
    {
        getPrimzahlBis(2000);
    }

    static void getPrimzahlBis(int bis)
    {
        int j = 2;
        for (int i = 2; i <= bis; i++)
        {
            if (isPrimzahl(i))
            {
                if (i - j == 2)
                    System.out.println("(" + j + ", " + i + ")");
                j = i;
            }
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
