package Uebungen._200_290;

public class _210_Teilersumme_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Teilersumme
         *
         * Schreibe eine Methode, die überprüft, ob bei einer Zahl
         * die Summe aller Teiler kleiner ist als die Zahl.
         * Die Zahl selber soll hierbei nicht zu den Teilern zählen.
         *
         * Bei 81 würde true zurück gegeben werden, da
         * 1 + 3 + 9 + 27 = 40
         * und 40 < 81
         *
         * Bei 80 würde false zurück gegeben werden, da
         * 1 + 2 + 4 + 5 + 8 + 10 + 16 + 20 + 40 = 106
         * und 106 > 80
         */
        System.out.println(istTeilersummeKleiner(81));
        System.out.println(istTeilersummeKleiner(80));
    }

    private static boolean istTeilersummeKleiner(int zahl)
    {
        int teilerSumme = 1;
        System.out.print("1 ");
        for (int i = 2; i < zahl; i++)
        {
            if (zahl % i == 0)
            {
                teilerSumme += i;
                System.out.printf("+ %d ", i);
            }
        }
        System.out.println("= " + teilerSumme);
        if (teilerSumme < zahl)
        {
            System.out.printf("und %d < %d\n", teilerSumme, zahl);
            return true;
        }
        System.out.printf("und %d > %d\n", teilerSumme, zahl);
        return false;
    }
}
