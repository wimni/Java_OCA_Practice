package Uebungen._700_790;

import java.util.HashMap;

public class _750_ZeichenanzahlInString_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Zeichenanzahl in String
         *
         * Schreibe eine Methode, die einen String entgegen nimmt
         * und die Anzahl der einzelnen Zeichen in Form einer HashMap zurück gibt.
         *
         * Z.B. 'Hello World' wird zu:
         * { =1, r=1, d=1, e=1, W=1, H=1, l=3, o=2}
         *
         * Tipp: String.toCharArray()
         */

        // Möglicher Zusatz:
        // Keine Sonderzeichen, toLowerCase()

        HashMap<Character, Integer> anzahlZeichen = new HashMap<>();
        anzahlZeichen = getZeichen("Hello World");
        System.out.println(anzahlZeichen);
    }

    private static HashMap<Character, Integer> getZeichen(String str)
    {
        HashMap<Character, Integer> anzahlZeichen = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
        {
            anzahlZeichen.putIfAbsent(str.charAt(i), 0);
            anzahlZeichen.put(str.charAt(i), anzahlZeichen.get(str.charAt(i)) + 1);
        }
        return anzahlZeichen;
    }
}
