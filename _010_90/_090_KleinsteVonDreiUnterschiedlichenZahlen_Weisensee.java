package Uebungen._010_90;

import java.util.Arrays;
import java.util.Random;

public class _090_KleinsteVonDreiUnterschiedlichenZahlen_Weisensee
{
    static Random random = new Random();
    public static void main(String[] args)
    {
        /*
         * Kleinste von drei UNTERSCHIEDLICHEN Zahlen
         *
         * Schreibe ein Programm,
         * das drei Variablen mit zufälligen,
         * UNTERSCHIEDLICHEN Zahlen (aus dem gleichen Zahlenraum) befüllt.
         * Dann soll das Programm testen,
         * welche der Zahlen die Kleinste ist und diese ausgeben.
         */

        int[] numbers = new int[3];
        int newNumber;

        for (int i = 0; i < 3; i++)
        {
            numbers[i] = 0;
            while(numbers[i] == 0)
            {
                newNumber = getNumber();
                numbers[i] = isNumberExist(numbers, newNumber);
            }
        }
        int klein = numbers[0];
        for (int i = 1; i < 3; i++)
        {
            if (klein > numbers[i])
                klein = numbers[i];
        }
        System.out.println("Zahlen: " + Arrays.toString(numbers));
        System.out.println("kleinste Zahl: " + klein);
    }

    private static int isNumberExist(int[] numbers, int newNumber)
    {
        for (int i = 0; i < 3; i++)
        {
            if (numbers[i] == newNumber)
                return 0;
        }
        return newNumber;
    }

    private static int getNumber()
    {
        int number = random.nextInt(10) + 1;;
        return number;
    }
}
