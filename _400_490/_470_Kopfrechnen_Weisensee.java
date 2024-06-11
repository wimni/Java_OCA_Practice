package Uebungen._400_490;

import javax.swing.*;
import java.awt.*;

class Aufgabe
{
    int zahl1;
    int zahl2;
    char operator;
    int ergebnis;
}

public class _470_Kopfrechnen_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Kopfrechnen
         *
         * Schreibe ein Programm, das dem Benutzer fünf Rechenaufgaben stellt.
         *
         * Welche Operatoren (+, -, *, /, %) jeweils benutzt werden,
         * soll per Zufall ermittel werden.
         * Jede Zahl und jedes Ergebnis der Rechenaufgaben muss eine ganze,
         * positive Zahl unter hundert sein.
         *
         * Wenn der Benutzer seine Ergebnisse absendet,
         * soll ausgegeben werden, wieviele Ergebnisse richtig waren
         * und wie lange der Benutzer gebraucht hat.
         */

        int anzahlAufgabe = 5;
        Aufgabe[] aufgaben = new Aufgabe[anzahlAufgabe];

        for (int i = 0; i < anzahlAufgabe; i++)
        {
            aufgaben[i] = getRechenaufgabe();
        }

        createWindow(aufgaben);
    }

    private static void createWindow(Aufgabe[] aufgaben)
    {
        int zahl1;
        int zahl2;
        int ergebnis;
        int eingabe;
        char operator;
        int count = 0;

        JTextField[] textFields = new JTextField[aufgaben.length];
        for (int i = 0; i < textFields.length; i++)
        {
            textFields[i] = new JTextField(5);
        }

        JPanel panel = new JPanel(new GridLayout(textFields.length, 0));
        for (int i = 0; i < textFields.length; i++)
        {
            zahl1 = aufgaben[i].zahl1;
            zahl2 = aufgaben[i].zahl2;
            operator = aufgaben[i].operator;

            panel.add(new JLabel(zahl1 + " " + operator + " " + zahl2 + " = "));
            panel.add(textFields[i]);
        }

        long start = System.currentTimeMillis();

        int result = JOptionPane.showConfirmDialog(null, panel,
                "", JOptionPane.OK_CANCEL_OPTION);

        long end = System.currentTimeMillis();

        if (result == JOptionPane.OK_OPTION)
        {
            panel = new JPanel(new GridLayout(textFields.length + 1, 0));
            for (int i = 0; i < textFields.length; i++)
            {
                zahl1 = aufgaben[i].zahl1;
                zahl2 = aufgaben[i].zahl2;
                ergebnis = aufgaben[i].ergebnis;
                try
                {
                    eingabe = Integer.parseInt(textFields[i].getText());
                }
                catch (Exception exc)
                {
                    eingabe = 0;
                }
                operator = aufgaben[i].operator;
                if (eingabe == ergebnis) count++;

                panel.add(new JLabel(zahl1 + " " + operator + " " + zahl2 + " = " + ergebnis +
                                    ". Ihre Antwort war : " + eingabe));
            }
            panel.add(new JLabel("\nSie haben " + count + " Fragen richtig in " + (end - start) / 1000 + " sekunden beantwortet."));

            JOptionPane.showConfirmDialog(null, panel,
                    "", JOptionPane.OK_CANCEL_OPTION);
        }
    }

    static Aufgabe getRechenaufgabe()
    {
        Aufgabe aufgabe = new Aufgabe();
        int operator = (int)(Math.random() * 5);
        do {
            aufgabe = fillAufgabe(operator);
        } while (!pruefeAufgabe(aufgabe));
        return aufgabe;
    }

    static Aufgabe fillAufgabe(int operator)
    {
        Aufgabe aufgabe = new Aufgabe();
        aufgabe.zahl1 = (int)(Math.random() * 100);
        aufgabe.zahl2 = (int)(Math.random() * 100);
        switch (operator)
        {
            case 0:
                aufgabe.operator = '+';
                break;
            case 1:
                aufgabe.operator = '-';
                break;
            case 2:
                aufgabe.operator = '*';
                break;
            case 3:
                aufgabe.operator = '/';
                break;
            case 4:
                aufgabe.operator = '%';
                break;
        }
        return aufgabe;
    }

    static boolean pruefeAufgabe(Aufgabe aufgabe)
    {
        aufgabe.ergebnis = getErgebniss(aufgabe);
        return aufgabe.ergebnis > 0 && aufgabe.ergebnis < 99;
    }

    static int getErgebniss(Aufgabe aufgabe)
    {
        double ergebnis = -1;
        switch (aufgabe.operator)
        {
            case '+':
                return aufgabe.zahl1 + aufgabe.zahl2;
            case '-':
                return aufgabe.zahl1 - aufgabe.zahl2;
            case '*':
                return aufgabe.zahl1 * aufgabe.zahl2;
            case '/':
                while (aufgabe.zahl2 > 0)
                {
                    ergebnis = (double)((double)aufgabe.zahl1 / (double)aufgabe.zahl2) - (aufgabe.zahl1 / aufgabe.zahl2);
                    if (ergebnis == 0 && aufgabe.zahl1 != aufgabe.zahl2)
                        return aufgabe.zahl1 / aufgabe.zahl2;
                    else aufgabe.zahl2--;
                }
            case '%':
                try
                {
                    if (aufgabe.zahl1 > aufgabe.zahl2)
                        return aufgabe.zahl1 % aufgabe.zahl2;
                }
                catch (Exception exc)
                {
                    return -1;
                }
        }
        return -1;
    }
}
