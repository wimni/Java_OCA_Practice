package Uebungen._800_890;

import java.sql.Array;
import java.util.Arrays;

public class _800_Feldzug_Weisensee
{

    /*
     * Feldzug
     *
     * Ein König nahm bei einem Feldzug 100 feindliche Soldaten gefangen,
     * die er in 100 Einzelzellen sperren ließ.
     * An seinem Geburtstag will er durch Großzügigkeit glänzen
     * und plant eine Amnestie der gefangenen Soldaten.
     * Allerdings will er nicht alle Soldaten freilassen
     * und fragt deswegen seinen Hofmathematiker, wie er verfahren soll.
     * Dieser antwortet ihm wie folgt:
     * Öffne zunächst alle Türen, schließe sodann jede zweite Türe,
     * öffne nun wieder jede dritte Türe, schließe nun wieder jede vierte Türe
     * und verfahre weiter so bis zum 100sten Durchgang.
     * Der König ueberlegt eine Weile und sagt dann:
     * Ich habe den Eindruck, bei diesem Verfahren muß ich ziemlich viele Gefangene freilassen.
     * Darauf entgegnet der Hofmathematiker:
     * Nun gut, wenn eure Majestaet meinen, daß auf diese Weise zu viele Gefangene freikommen,
     * so habe ich noch ein zweites Verfahren anzubieten:
     * Öffne zunaechst alle Türen, schließe sodann jede zweite Türe,
     * beim dritten Durchgang nehme jede dritte Türe und öffne sie,
     * wenn sie geschlossen ist, bzw. schließe sie, wenn sie geöffnet ist.
     * Im vierten Durchgang wiederum nehme jede vierte Türe und öffne sie,
     * wenn sie geschlossen ist, bzw. umgekehrt.
     * Verfahre nun weiter so bis zum 100sten Durchgang.
     * Bei diesem zweiten Verfahren werden weniger Gefangene freikommen.
     *
     * Bei welchem Verfahren werden wie viel Türen (nach dem 100sten Durchgang) offenstehen
     * und welches sind ihre Tuernummern.
     * Beachte bitte, daß der König vorm-EDV-Zeitalter lebte.
     * Seine Numerierung der Türen beginnt natürlich bei 1 und endet bei 100.
     */

    public static void main(String[] args)
    {
        Boolean[] case1 = new Boolean[100];
        Boolean[] case2 = new Boolean[100];

        verfahren1(case1);
        verfahren2(case2);

        printOpenDoors(case1);
        printOpenDoors(case2);
    }

    private static void printOpenDoors(Boolean[] case1)
    {
        int count = 0;
        for (int i = 1; i < case1.length; i++)
        {
            if (case1[i])
            {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOpen Doors: " + count);
    }

    private static void verfahren1(Boolean[] case1)
    {
        for (int i = 1; i < case1.length; i++)
        {
            if (i % 2 != 0)
                openDoors(case1, i);
            else
                closeDoors(case1, i);
        }
    }

    private static void openDoors(Boolean[] case1, int i)
    {
        for (int j = i; j < case1.length; j += i)
        {
            case1[j] = true;
        }
    }

    private static void closeDoors(Boolean[] case1, int i)
    {
        for (int j = i; j < case1.length; j += i)
        {
            case1[j] = false;
        }
    }

    private static void verfahren2(Boolean[] case2)
    {
        for (int i = 1; i < case2.length; i++)
        {
            openOrCloseDoors(case2, i);
        }
    }

    private static void openOrCloseDoors(Boolean[] case2, int i)
    {
        for (int j = i; j < case2.length; j += i)
        {
            if (case2[j] == null || !case2[j])
                case2[j] = true;
            else
                case2[j] = false;
        }
    }
}
