package Uebungen._500_590;

import java.util.ArrayList;
import java.util.Arrays;

public class _580_StreamIt_Weisensee
{

    /*
     * Stream it
     *
     * Erzeuge jeweils aus der ArrayList die angegebene Ausgabe.
     * Benutze jeweils nur eine (lange) Anweisung.
     * Benutze stream(), filter(), map() und forEach()
     * Du kannst filter() und map() jeweils so of benutzen, wie es nötig ist.
     *
     * Siehe Beispiel.
     */

    public static void main(String[] args) {

        // Beispiel:
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        a.stream().filter(e -> e % 2 == 1).map(e -> e * e).forEach(e -> System.out.print(e + " "));
        // 1 9
        System.out.println();


        // Aufgabe 1:
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(12, 2, 3, 16, 17, 9, 14, 1));
        a1.stream().filter(e -> e % 2 == 0 && e >= 10).map(e -> e * 2).forEach(e -> System.out.print(e + " "));

        // 24 32 28
        System.out.println();

        // Aufgabe 2:
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList("Peter", "Paul", "Mary", "Panos", "Jane"));
        a2.stream().filter(e -> e.equals("Peter") || e.equals("Jane"))
                .map(e -> e.toUpperCase())
                .forEach(e -> System.out.print(e + " "));

        // PETER JANE
        System.out.println();

        // Aufgabe 3:
        // Schwer
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(4, 9, 13, 6, 12, 19, 23, 41));

        // 3 4 6 7
        System.out.println();
    }
}
