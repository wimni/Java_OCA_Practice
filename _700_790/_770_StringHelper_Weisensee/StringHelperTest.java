package Uebungen._700_790._770_StringHelper_Weisensee;

import static Uebungen._700_790._770_StringHelper_Weisensee.StringHelper.*;

public class StringHelperTest
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        System.out.println(woerterAnzahl(str));
        System.out.println(zeichenAnzahl(str, true));
        System.out.println(zeichenAnzahl(str, false));
        System.out.println(wortAnteil("Hello", str));
        System.out.println(zeichenAnteil("o", str));
        System.out.println(multiplizieren("45", 3));
        System.out.println(multiplizieren("45"));
    }
}
