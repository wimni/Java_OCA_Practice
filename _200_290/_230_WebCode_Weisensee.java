package Uebungen._200_290;

public class _230_WebCode_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Web-Code
         *
         * Für ein Buchprojekt wird ein Web-Code benötigt.
         * Mit diesem Web-Code können Artikel direkt online abgefragt werden.
         * Der Code soll aus acht Zeichen bestehen.
         * Vorkommen dürfen Ziffern und Kleinbuchstaben.
         * Um Verwechslungen zu vermeiden,
         * kommen die Ziffer Eins (1) und der Kleinbuchstabe "ell" (l) nicht vor.
         * Ebenso kommt die Null (0) nicht vor.
         * Dass das große "Oh" (O) nicht vorkommen kann, ist klar,
         * denn die Vorgabe erlaubt nur Kleinbuchstaben.
         *
         * Schreibe ein Programm, das fünf zufällige Web-Codes erzeugt.
         */

        for (int i = 0; i < 5; i++)
        {
            System.out.println(getwebCode());
        }
    }

    private static String getwebCode()
    {
        String webCode = new String();
        for (int i = 0; i < 8; i++)
        {
            webCode += getZeichen();
        }
        return webCode;
    }

    private static char getZeichen()
    {
        int zahl = (int)(Math.random() * 34 + 2); // 2 - 9 | 10 = a
        if (zahl > 9)
        {
            if (zahl == 21)
                return getZeichen();
            return (char)(zahl + 39 +'0');
        }
        return (char)(zahl + '0');
    }
}
