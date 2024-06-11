package Uebungen._100_190;

public class _140_PotenzenVonZwei_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Potenzen von Zwei
         *
         * Schreibe ein Programm, das alle Potenzen von 2 ausgibt
         * deren Ergebnis kleiner als 10.000 ist.
         *
         * Zusatz: Die Ausgabe soll folgendermaßen aussehen:
         * 2 ** 0 = 1
         * 2 ** 1 = 2
         * ...
         * 2 ** 12 = 4096
         * 2 ** 13 = 8192
         */

        int potenz = 0;
        do
        {
            System.out.printf("2 ** " + potenz + " = %.0f\n", Math.pow(2, potenz));
            potenz++;
        }while(Math.pow(2, potenz) < 10000);
    }
}
