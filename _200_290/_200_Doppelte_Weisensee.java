package Uebungen._200_290;

public class _200_Doppelte_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Doppelte
         *
         * Schreibe eine Methode, die überprüft,
         * ob in einem Array doppelte Elemente sind.
         * Der Methode wird das Array übergegen
         * und sie soll den Boolean true zurück geben,
         * wenn es doppelte Elemente in dem Array gibt.
         * Anderfalls soll die Methode den Boolean false zurück geben.
         */

        int[] zahlen1 = {1, 3, 7, 9, 7, 11, 17};
        int[] zahlen2 = {1, 3, 7, 9, 11, 17};
        System.out.println(checkeDoppelte(zahlen1));  // true
        System.out.println(checkeDoppelte(zahlen2));  // false
    }

    static boolean checkeDoppelte(int[] zahlen)
    {
        int zahl;
        for (int i = 0; i < zahlen.length; i++)
        {
            zahl = zahlen[i];
            for (int j = i + 1; j < zahlen.length; j++)
            {
                if (zahlen[j] == zahl)
                    return true;
            }
        }
        return false;
    }
}
