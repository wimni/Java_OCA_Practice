package Uebungen._600_690;

public class _620_Palindrom_Weisensee
{

    /*
     * Palindrom
     *
     * Ein Palindrom ist ein Text,
     * der von vorne und hinten gelesen den gleichen Inhalt hat.
     * Z. B. »Lagerregal« oder »Trug Tim eine so helle Hose nie mit Gurt?«.
     * Leer- und Satzzeichen werden dabei ignoriert.
     * Schreibe eine Methode, die testet,
     * ob eine Zeichenkette ein Palindrom ist.
     */

    public static void main(String[] args)
    {
        System.out.println(pruefe("Lagerregal"));
        System.out.println(pruefe("Trug Tim eine so helle Hose nie mit Gurt?"));
    }

    static boolean pruefe(String s)
    {
        s = s.toUpperCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.isEmpty()) return false;
        String s2 = new StringBuilder(s).reverse().toString();

        for (int i = 0; i <= s.length() / 2; i++)
        {
            if (!s.substring(i, i + 1).equals(s2.substring(i, i + 1)))
                return false;
        }
        return true;
    }
}
