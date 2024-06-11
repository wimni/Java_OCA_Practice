package Uebungen._200_290;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _220_EinmaligesInArrayList_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Einmaliges in ArrayList
         *
         * Schreibe ein Programm, das eine ArrayList mit neun Zahlen zufällig befüllt.
         * Dabei sollen vier Zahlen doppelt vorkommen und eine Zahl nur einmal.
         *
         * Mische dann die ArrayList per Collections.shuffle(ArrayList)
         *
         * Finde dann aus dieser ArrayList die Zahl, die nur einmal vorkommt.
         * Tipp: Benutze eine HashMap<Integer, Integer>
         */

        ArrayList<Integer> zahlen = getZahlen();
        Collections.shuffle(zahlen);
        System.out.println(zahlen);
        System.out.println(getEinmaligeZahl(zahlen));
    }

    private static int getEinmaligeZahl(ArrayList<Integer> zahlen)
    {
        HashMap<Integer, Integer> zahlenMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> gesuchteZahl = new ArrayList<Integer>();
        for (int i = 0; i < zahlen.size(); i++)
        {
            if(zahlenMap.putIfAbsent(zahlen.get(i), zahlen.get(i)) == null)
                gesuchteZahl.add(zahlen.get(i));
            else
                gesuchteZahl.remove(zahlen.get(i));
        }
        return gesuchteZahl.get(0);
    }

    private static ArrayList<Integer> getZahlen()
    {
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        int randomZahl;
        zahlen.add(getZahl());
        for (int i = 1; i < 5; i++)
        {
            randomZahl = getZahl();
            if (!zahlen.contains(randomZahl))
            {
                zahlen.add(randomZahl);
                zahlen.add(randomZahl);
            }
            else
                i--;
        }
        return zahlen;
    }

    private static int getZahl()
    {
        return (int)(Math.random() * 10);
    }
}
