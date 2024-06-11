package Uebungen._200_290;

public class _260_CaesarChiffreBruteforcen_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Cäsar-Chiffre bruteforcen
         *
         * Schreibe ein Programm das alle möglichen Lösungen
         * eines Cäsar-chiffrierten Strings ausgibt.
         *
         * Was bedeutet "vxumxgssokxkt sginz yvgyy"?
         *
         * Wer Cäsar-Chiffre nicht kennt: https://de.wikipedia.org/wiki/Caesar-Verschlüsselung
         */

        String text = "vxumxgssokxkt sginz yvgyy";
        bruteforce(text);
    }

    private static void bruteforce(String text)
    {
        int temp;
        for (int i = 1; i < 26; i++)
        {
            for (int j = 0; j < text.length(); j++)
            {
                temp = (int)text.charAt(j);
                if (temp != 32)
                {
                    temp += i;
                    if (temp > 122) temp -= 26;
                }
                System.out.print((char)temp);
            }
            System.out.println();
        }
    }
}
