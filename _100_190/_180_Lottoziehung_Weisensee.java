package Uebungen._100_190;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class _180_Lottoziehung_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Lottoziehung
         *
         * Teil 1:
         * Schreibe ein Programm,
         * das sechs VERSCHIEDENE Lottozahlen aus dem Zahlenraum 1 bis 49 zieht
         * und in einer ArrayList abspeichert.
         *
         * Teil 2:
         * Schreibe ein Programm,
         * das sechs VERSCHIEDENE Lottozahlen aus dem Zahlenraum 1 bis 49 zieht
         * und in einem Array abspeichert.
         * Benutze ausser Random.nextInt() keine Java-Methoden.
         * Die System.out.print() ist natütlich auch erlaubt.
         * Collections.sort() ist auch erlaubt.
         */

        System.out.println(getLottozahlen());
        System.out.println(Arrays.toString(getLottozahlen2()));
    }

    // Teil 1
    static ArrayList<Integer> getLottozahlen()
    {
        ArrayList<Integer> lottozahlen = new ArrayList<>();
        int number;
        while (lottozahlen.size() < 6)
        {
            number = (int)(Math.random() * 49 + 1);
            if (!lottozahlen.contains(number))
                lottozahlen.add(number);
        }
        return lottozahlen;
    }

    //Teil 2
    static int[] getLottozahlen2()
    {
        int[] lottozahlen = new int[6];
        Random r = new Random();
        int number;

        for (int i = 0; lottozahlen[5] == 0; i++)
        {
            number = r.nextInt(49) + 1;
            for (int j = 0; j < lottozahlen.length; j++)
            {
                if (lottozahlen[j] != 0)
                {
                    if (lottozahlen[j] == number)
                    {
                        i--;
                        break;
                    }
                }
                else
                {
                    lottozahlen[i] = number;
                    break;
                }
            }
        }
        return lottozahlen;
    }
}
