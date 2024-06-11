package Uebungen._200_290;

public class _270_Passwortqualitaet_Weisensee
{
    public static void main(String[] args)
    {

        /* Passwortqualität
         *
         * Schreibe eine Methode, die die Qualität von Passwörtern nach
         * einem einfachen Punktesystem bewertet.
         * Es gelten dabei die folgenden Regeln:
         * – Passwort mit 7 oder weniger Zeichen: immer 0 Punkte,
         * - egal, welche Kriterien noch erfüllt sind.
         * – Ab 8 Zeichen: 1 Punkt
         * – Enthält sowohl Groß- als auch Kleinbuchstaben: +1 Punkt
         * – Enthält mehr als sechs unterschiedliche Zeichen: +1 Punkt
         * – Enthält zumindest eine Ziffer: +1 Punkt
         * – Enthält zumindest ein Sonderzeichen: +1 Punkt
         * Beispiele:
         * – 'abc': 0 Punkte
         * – 'abcdefghij': 2 Punkte
         * – 'ab1122$$!!': 3 Punkte
         * – 'Abcd1234$!': 5 Punkte
         */

        pruefePasswort("abc");
        pruefePasswort("abcdefghij");
        pruefePasswort("ab1122$$!!");
        pruefePasswort("Abcd1234$!");
    }

    private static void pruefePasswort(String abc)
    {
        int punkte = 0;
        System.out.print("'" + abc + "': ");

        if (pruefeLaenge(abc))
            punkte++;
        else
        {
            System.out.println("0 Punkte");
            return;
        }
        if (pruefeGrossKlein(abc))
            punkte++;
        if (pruefeUnterschiedlich(abc))
            punkte++;
        if (pruefeZiffer(abc))
            punkte++;
        if (pruefeSonderzeichen(abc))
            punkte++;

        System.out.println(punkte + " Punkte");
    }

    private static boolean pruefeSonderzeichen(String abc)
    {
        if (abc.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*"))
            return true;
        return false;
    }

    private static boolean pruefeZiffer(String abc)
    {
        if (abc.matches(".*[0123456789].*"))
            return true;
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
        if (abc.matches(".*[abcdefghijklmnopqrstuvwxyz].*"))
            if (abc.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*"))
                return true;
        return false;
    }

    private static boolean pruefeLaenge(String abc)
    {
        return abc.length() > 7;
    }
}
