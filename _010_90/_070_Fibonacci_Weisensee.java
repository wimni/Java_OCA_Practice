package Uebungen._010_90;

public class _070_Fibonacci_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Fibonacci
         *
         * Schreibe ein Programm, das die ersten 10 Zahlen der
         * Fibonacci-Folge ausgibt: 0 1 1 2 3 5 8 13 21 34
         *
         * Die ersten beiden Zahlen dürfen hardcodiert ausgegeben werden.
         *
         * Die Fibonacci-Folge beginnt mit 0 und 1.
         * Ab dann entsteht die folgende Zahl
         * indem man jeweils die beiden vorherigen Zahlen addiert.
         *
         * Zusatz: Gib alle Zahlen unter 500 aus
         */

        int zahl1 = 0;
        int zahl2 = 1;
        int newNumber = 1;

        System.out.print(zahl1 + " " + zahl2 + " ");

        while (newNumber < 500)
        {
            System.out.print(newNumber + " ");
            zahl1 = zahl2;
            zahl2 = newNumber;
            newNumber = zahl1 + zahl2;
        }
    }
}
