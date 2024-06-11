package Uebungen._300_390;

public class _350_PasswortGueltigkeit_Weisensee
{

    /*
     * Passwort-Gültigkeit
     *
     * Prüfe die Gültigkeit eines Passwortes.
     * Dabei müssen die folgenden Kriterien erfüllt sein:
     * Das Passwort muss aus mindestens neun Zeichen bestehen.
     * Das Passwort muss Großbuchstaben aufweisen.
     * Das Passwort muss Kleinbuchstaben aufweisen.
     * Im Passwort müssen Ziffern vorkommen.
     * Im Passwort müssen Sonderzeichen vorkommen.
     * Aus jedem der vier oben genannten Zeichentypen müssen mindestens zwei Zeichen vorkommen.
     * Also zwei Großbuchstaben, zwei Kleinbuchstaben usw.
     */

    public static void main(String[] args)
    {
        pruefePasswort("abc");
        pruefePasswort("abcdefghij");
        pruefePasswort("ab1122$$!!");
        pruefePasswort("Abcd1234$!");
        pruefePasswort("ABcd1234$!");
    }

    private static boolean pruefePasswort(String abc)
    {
        System.out.print(abc + ": ");

        if (pruefeLaenge(abc) && pruefeGrossKlein(abc) && pruefeZiffer(abc) && pruefeSonderzeichen(abc))
        {
            System.out.println("gültig");
            return true;
        }
            System.out.println("ungültig");
            return false;
    }

    private static boolean pruefeSonderzeichen(String abc)
    {
        int count = 0;
        for (int i = 0; i < abc.length(); i++)
        {
            if (abc.substring(i, i + 1).matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*"))
                count++;
            if (count >= 2)
                return true;
        }
        return false;
    }

    private static boolean pruefeZiffer(String abc)
    {
        int count = 0;
        for (int i = 0; i < abc.length(); i++)
        {
            if (abc.substring(i, i + 1).matches(".*[0123456789].*"))
                count++;
            if (count >= 2)
                return true;
        }
        return false;
    }

    private static boolean pruefeUnterschiedlich(String abc)
    {
        int anzahl = 0;
        boolean unterschiedlich = true;
        for (int i = 0; i < abc.length(); i++)
        {
            unterschiedlich = true;
            for (int j = i + 1; j < abc.length(); j++)
            {
                if (abc.charAt(i) == abc.charAt(j))
                {
                    unterschiedlich = false;
                    break;
                }
            }
            if (unterschiedlich)
            {
                anzahl++;
                if (anzahl > 6)
                    return true;
            }
        }
        return false;
    }

    private static boolean pruefeGrossKlein(String abc)
    {
        int count = 0;
        for (int i = 0; i < abc.length(); i++)
        {
            if (abc.substring(i, i + 1).matches(".*[abcdefghijklmnopqrstuvwxyz].*"))
                count++;
            if (count >= 2)
                break;
        }
        if (count >= 2)
        {
            count = 0;
            for (int i = 0; i < abc.length(); i++)
            {
                if (abc.substring(i, i + 1).matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*"))
                    count++;
                if (count >= 2)
                    return true;
            }
        }
        return false;
    }

    private static boolean pruefeLaenge(String abc)
    {
        return abc.length() >= 9;
    }
}
