package Uebungen._400_490;

import javax.swing.*;

public class _420_ZahlRaten_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Zahl raten
         *
         * Schreibe ein Programm,
         * das sich eine Zahl zwischen 1 und 10 ausdenkt
         * und den Benutzer diese Zahl raten läßt.
         * Nach jedem Versuch gibt das Programm aus,
         * ob zu hoch, zu niedrig oder richtig geraten wurde.
         * Am Ende soll ausgegeben werden, wie viele Versuche gebraucht wurden.
         */

        int number = (int)(Math.random() * 10 + 1);
        int versuche = 1;
        int input = 0;

        input = getInput("Bitte Zahl zwischen 1 und 10 eingeben");
        while(input != number)
        {
            if (input > number)
                input = getInput("Die gesuchte Zahl ist kleiner\nBitte Zahl zwischen 1 und 10 eingeben");
            else
                input = getInput("Die gesuchte Zahl ist größer\nBitte Zahl zwischen 1 und 10 eingeben");
            versuche++;
        }
        System.out.println("Die gesuchte Zahl war " + number + ".\nEs wurden " + versuche + " Versuche gebraucht.");
    }

    private static int getInput(String msg)
    {
        int input = 0;
        while (input < 1 || input > 10)
        {
            try
            {
                input = Integer.parseInt(JOptionPane.showInputDialog(msg));
            }
            catch (Exception exc)
            {
                System.out.println("Fehler: " + exc);
            }
        }
        return input;
    }
}
