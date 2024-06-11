package Uebungen._600_690;

public class _650_MerkbaresZufallspasswort_Weisensee
{

    /*
     * Merkbares Zufallspasswort
     *
     * Für eine Webseite muss ein Passwort erzeugt werden.
     * Du hast gemerkt, dass eine zufällige Folge von Buchstaben,
     * Ziffern und Sonderzeichen leicht zu progarmmieren,
     * jedoch schlecht zu merken ist.
     *
     * Nun mache folgende Vorgaben an ein automatisch generientes Passwort.
     * Das Passwort muss insgesamt mindestens sechs, maximal zehn Zeichen enthalten.
     * Das Passwort soll aus einem Wort bestehen,
     * gefolgt von genau einem Sonderzeichen und danach aus einer Zahl.
     * Das Wort hat vier, fünf oder sechs Buchstaben,
     * wobei nur der erste ein Großbuchstabe sein soll.
     * Die Zahl hat eine, zwei oder drei Stellen.
     * Im Wort wechseln Konsonanten mit Vokalen immer ab.
     *
     * Verwechselbare Zeichen sollen nicht vorkommen.
     *
     * Schreibe ein Programm, das ein "merkbares" Zufallspasswort ausgibt.
     */

    public static void main(String[] args)
    {
        System.out.println(erstellePasswort());
    }

    private static String erstellePasswort()
    {
        StringBuilder passwort = new StringBuilder();
        int anzahl = (int)(Math.random() * 3 + 4);
        for (int i = 0; i < anzahl; i++)
        {
            if (i % 2 == 0)
                passwort.append(getKonsonant());
            else
                passwort.append(getVokal());
            if (i == 0)
                passwort.replace(0, 1, passwort.substring(0, 1).toUpperCase());
        }

        passwort.append(getSonderzeichen());

        anzahl = (int)(Math.random() * 3 + 1);
        for (int i = 0; i < anzahl; i++)
        {
            passwort.append(getZahl());
        }
        return passwort.toString();
    }

    private static String getZahl()
    {
        String str = "123456789";
        int i = (int)(Math.random() * str.length());
        return str.substring(i, i + 1);
    }

    private static String getSonderzeichen()
    {
        String str = "!@#$%&*()_+=|<>?{}\\[\\]~-";
        int i = (int)(Math.random() * str.length());
        return str.substring(i, i + 1);
    }

    private static String getVokal()
    {
        String str = "aeiu";
        int i = (int)(Math.random() * str.length());
        return str.substring(i, i + 1);
    }

    private static String getKonsonant()
    {
        String str = "bcdfghjklmnpqrstvwxyz";
        int i = (int)(Math.random() * str.length());
        return str.substring(i, i + 1);
    }
}
