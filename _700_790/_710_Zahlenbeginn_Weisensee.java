package Uebungen._700_790;

public class _710_Zahlenbeginn_Weisensee
{

    /*
     * Zahlenbeginn
     *
     * In einem Spiel werden die Zahlen von 1 bis n durchgezählt.
     * Man kann nun folgende Feststellung machen:
     * Die 12. Zahl, die mit den Ziffern 253 beginnt, ist 25 300;
     * denn 253 ist die 1., 2530 die 2., 2531 die 3., ..., 2539 die 11., und 25 300 die 12. Zahl.
     *
     * Schreibe ein Programm, das die 1000. Zahl ermittelt, die mit den Ziffern 9876 beginnt.
     */

    public static void main(String[] args)
    {
        System.out.println(getZahlenBeginn(9876, 1000));
    }

    private static int getZahlenBeginn(int zahl, int anzahl)
    {
        int count = 0;
        int zahlzahl = 0;
        for (int i = 0;; i++)
        {
            zahlzahl = i;
            for (int j = 4; j < String.valueOf(i).length(); j++)
            {
                zahlzahl /= 10;
            }
            if (zahl == zahlzahl)
                count++;
            if (count == anzahl)
                return i;
        }
    }
}
