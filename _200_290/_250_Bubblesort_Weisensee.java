package Uebungen._200_290;

import java.util.Arrays;

public class _250_Bubblesort_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Bubblesort
         *
         * Schreibe ein Methode,
         * der man ein Array mit beliebig vielen Integern als Werten übergeben kann
         * und die dieses Array sortiert und zurück gibt.
         *
         * Benutze hierzu den Bubblesort-Algorithmus.
         * Bei diesem wird das Array durchlaufen
         * und jede Zahl mit der jeweils nachfolgenden Zahl verglichen.
         * Wenn die nachfolgende Zahl kleiner ist,
         * werden die Zahlen getauscht.
         * Das Array wird solange durchlaufen,
         * bis bei einem Durchlauf keine Zahlen getauscht werden müssen.
         */

        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        array = bubblesortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] bubblesortArray(int[] array)
    {
        boolean repeat = true;
        int temp = 0;
        while (repeat)
        {
            repeat = false;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    repeat = true;
                }
            }
        }
        return array;
    }

    private static int[] getArray()
    {
        int[] array = new int[(int)(Math.random() * 10 + 10)];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 20 + 1);
        }
        return array;
    }
}
