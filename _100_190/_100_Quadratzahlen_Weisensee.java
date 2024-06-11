package Uebungen._100_190;

public class _100_Quadratzahlen_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Quadratzahlen
         *
         * Schreibe ein Programm, das alle Quadratzahlen von natürlichen
         * Zahlen (1, 2, 3, ...) ausgibt, die kleiner als 100 sind.
         * (Die Quadratzahlen sollen kleiner 100 sein!)
         *
         * Zusatz: Gib auch die Anzahl der gefunden Quadratzahlen aus
         */

        int i = 1;
        while (Math.pow((int) i, 2) < 100)
        {
            System.out.print((int)Math.pow( i, 2) + " ");
            i++;
        }
        System.out.print("\nAnzahl: " + (i - 1));
    }
}
