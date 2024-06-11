package Uebungen._500_590;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _530_GeradeUndUngeradeZiffern_Weisensee
{

    /*
     * Gerade und ungerade Ziffern
     *
     * Das Programm soll von einer positiven Ganzzahl bestimmen,
     * wieviele Ziffern der Ausgangszahl gerade und wieviele Ziffern der Ausgangszahl ungerade sind.
     *
     * Schreibe zuerst eine statische Methode zahlEinlesen(),
     * die per BufferedReader eine positiven Ganzzahl vom User einliest:
     * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     * String eingabe = reader.readLine();
     * Diese Zahl soll als int zurück gegeben werden.
     *
     * Die statische Methode bestimmeAnzahlGeraderUngeraderZiffern()
     * soll die Methode zahlEinlesen() aufrufen
     * und in einem int-Array zurück geben, wieviele Ziffern gerade sind und wieviele ungerade.
     * Am Index 0 soll die Anzahl der geraden Ziffern stehen
     * und am Index 1 die Anzahl der ungeraden Ziffern.
     *
     * In der main()-Methode soll dann für die Zahl 471123427 Folgendes ausgegeben werden
     * Gerade: 4 Ungerade: 5
     *
     * 1. Schreibe eine Lösung mit try catch.
     *
     * 2. Schreibe eine Lösung mit throws.
     */

    public static void main(String[] args)
    {
        int[] ziffern = bestimmeAnzahlGeraderUngeraderZiffern1();
        System.out.println("Gerade: " + ziffern[0] + " Ungerade: " + ziffern[1]);

        ziffern = bestimmeAnzahlGeraderUngeraderZiffern2();
        System.out.println("Gerade: " + ziffern[0] + " Ungerade: " + ziffern[1]);
    }

    static String zahleinlesen1()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String eingabe;

        try
        {
            System.out.println("Bitte Zahl eingeben: ");
            eingabe = reader.readLine();
            int zahl = Integer.parseInt(eingabe);
        }
        catch (Exception e)
        {
            return zahleinlesen1();
        }
        return eingabe;
    }

    static int[] bestimmeAnzahlGeraderUngeraderZiffern1()
    {
        String zahl = zahleinlesen1();
        return bestimme(zahl);
    }

    static String zahleinlesen2() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte Zahl eingeben: ");
        String eingabe = reader.readLine();
        int zahl = Integer.parseInt(eingabe);

        return eingabe;
    }

    static int[] bestimmeAnzahlGeraderUngeraderZiffern2()
    {
        String zahl;
        try
        {
            zahl = zahleinlesen2();
        }
        catch (Exception exc)
        {
            return   bestimmeAnzahlGeraderUngeraderZiffern2();
        }
        return bestimme(zahl);
    }

    static int[] bestimme(String zahl)
    {
        char ch;
        int[] geradeUngerade = new int[2];
        for (int i = 0; i < zahl.length(); i++)
        {
            ch = zahl.charAt(i);
            if (ch == '1' ||ch == '3' || ch == '5'||ch == '7'|| ch == '9')
                geradeUngerade[1]++;
            else
                geradeUngerade[0]++;
        }
        return geradeUngerade;
    }
}
