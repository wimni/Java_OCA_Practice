package Uebungen._600_690;

public class _610_Steganografie_Weisensee
{

    /*
     * Steganografie
     *
     * Steganografie ist die Technik, eine geheime Information in einem Dokument so zu verstecken,
     * dass sie nur von einer eingeweihten Person gefunden werden kann.
     * Schreibe eine Methode mit zwei Parametern s und n,
     * die einen Klartext s auf folgende Weise durch Steganografie unleserlich macht:
     *
     * - Der String s wird in Großbuchstaben umgewandelt.
     * - Hinter jedes Zeichen werden n zufällige Großbuchstaben eingefügt.
     * - Das Argument n ist optional (Default=1).
     *
     * Beispielaufrufe:
     */

    // System.out.println(verstecke("Um acht an der Uhr"));
    // AUSGABE z.B.: UFMF LACCRHXTF GAXNJ VDCEYRA IUGHBRW

    // System.out.println(verstecke("Um acht an der Uhr", 2));
    // AUSGABE z.B.: UALMVD SPAHNCWDHAHTPH PJAMUNSY REDKNEQBRIB PIUBTHZBRWN

    public static void main(String[] args)
    {
        System.out.println(verstecke("Um acht an der Uhr"));
        System.out.println(verstecke("Um acht an der Uhr", 2));
    }

    static String verstecke(String s, int n)
    {
        StringBuilder stb = new StringBuilder();
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++)
        {
            stb.append(s.charAt(i));
            for (int j = 0; j < n; j++)
            {
                stb.append(getRandomString());
            }
        }
        return stb.toString();
    }

    private static String getRandomString()
    {
        return String.valueOf((char)(Math.random() * 26 + 65));
    }

    static String verstecke(String s)
    {
        return verstecke(s, 1);
    }
}
