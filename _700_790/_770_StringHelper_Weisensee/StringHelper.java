package Uebungen._700_790._770_StringHelper_Weisensee;

public class StringHelper
{
    // Methode, die die Anzahl der Wörter in einem String ermittelt.
    public static int woerterAnzahl(String str)
    {
        int anzahl = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
                anzahl++;
        }

        if (anzahl != 0)
            anzahl++;

        return anzahl;
    }

    // Eine Methode, die die Anzahl der Zeichen in einem String ermittelt.
    public static int zeichenAnzahl(String s, boolean withSpaces)
    {
        if (withSpaces == false)
            s = s.replace(" ", "");

        return s.length();
    }

    // Eine Methode, die die prozentuale Häufigkeit eines Wortes in einem String ermittelt.
    public static double wortAnteil(String wort, String str)
    {
        int anzahl = 0;

        for (int i = 0; i < str.length() - wort.length(); i++)
        {
            if (str.substring(i, wort.length()).equals(wort))
                anzahl++;
        }

        try
        {
            return (double) 100 / woerterAnzahl(str) * anzahl;
        }
        catch (Exception exc)
        {
            return 0;
        }

    }

    // Methoden, die die prozentuale Häufigkeit eines Zeichens in einem String ermitteln.
    public static double zeichenAnteil(String zeichen, String str)
    {
        return zeichenAnteil(zeichen.charAt(0), str);
    }

    public static double zeichenAnteil(char zeichen, String str)
    {
        int anzahl = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == zeichen)
                anzahl++;
        }

        try
        {
            return (double) 100 / zeichenAnzahl(str, false) * anzahl;
        }
        catch (Exception exc)
        {
            return 0;
        }
    }

    // Methoden, die einen String um eine übergebene Anzahl vervielfachen.
    public static String multiplizieren(String s)
    {
        return multiplizieren(s, 2);
    }

    public static String multiplizieren(String s, int anzahl)
    {
        try
        {
            return String.valueOf(Double.parseDouble(s) * anzahl);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Can only multiplicate Numbers.");
            return s;
        }
    }
}
