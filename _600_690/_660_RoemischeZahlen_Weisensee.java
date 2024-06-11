package Uebungen._600_690;

public class _660_RoemischeZahlen_Weisensee
{
    /*
     * Römische Zahlen
     *
     * Schreiben Sie ein Programm,
     * das eine römische Zahl in eine Dezimalzahl umrechnet.
     *
     * "MCMLXXXIV" -> 1984
     */

    public static void main(String[] args)
    {
        System.out.println(roemischToInt("MCMLXXXIV"));
    }

    static int roemischToInt(String s)
    {
        int i = 0;
        for (int j = 0; j < s.length(); j++)
        {
            if (j + 1 < s.length() && roemischToInt(s.charAt(j)) < roemischToInt(s.charAt(j + 1)))
            {
                i -= roemischToInt(s.charAt(j));
                i += roemischToInt(s.charAt(j + 1));
                j++;
            }
            else
                i += roemischToInt(s.charAt(j));
        }
        return i;
    }

    static int roemischToInt(char c)
    {
        switch (c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }
}
