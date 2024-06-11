package Uebungen._300_390;

import java.util.ArrayList;
import java.util.Collections;

public class _310_DoppelgaengerEntfernen_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Doppelgänger entfernen
         *
         * Entferne die Doppelgänger aus einer ArrayList von Zahlen
         * (z. B. aus [1, 2, 3, 2, 7, 3, 9]).
         * Die Ergebnisliste soll aufsteigend sortiert sein.
         */

        ArrayList<Integer> list = getRandomList();
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
        list = removeDouble(list);
        System.out.println(list.toString());
    }

    private static ArrayList<Integer> removeDouble(ArrayList<Integer> list)
    {
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) == list.get(i - 1))
            {
                list.remove(i);
                i--;
            }

        }
        return list;
    }

    private static ArrayList<Integer> getRandomList()
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add((int)(Math.random() * 10 + 1));
        }
        return list;
    }
}
