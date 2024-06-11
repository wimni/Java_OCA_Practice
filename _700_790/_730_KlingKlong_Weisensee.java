package Uebungen._700_790;

public class _730_KlingKlong_Weisensee 
{

    /*
     * Kling-klong
     *
     * 1. Schreiben Sie ein Programm, das die Zahlen von 1 bis 100 ausgibt.
     * Bei jeder Zahl, die durch 5 teilbar ist, soll "kling" ausgegeben werden
     * und bei jeder Zahl, die durch 7 teilbar ist, soll "klong" ausgegeben werden.
     * Wenn die Zahl sowohl durch 7 als auch durch 5 teilbar ist, soll "kling-klong" ausgegeben werden.
     *
     * 2. Zusätzlich soll folgendes gelten:
     * Auch wenn die Zahl die Ziffer 7 enthält, soll "klong" ausgegeben werden.
     * Und auch wenn die Zahl die Ziffer 7 enthält und durch 5 teilbar ist, soll "kling-klong" ausgegeben werden.
     */

    public static void main(String[] args) 
    {
        for (int i = 1; i <= 100 ; i++)
        {
            System.out.print(i);
            if (i % 5 == 0 && i % 7 == 0)
                System.out.print(" kling-klong");
            else if (i % 5 == 0 && i / 10 == 7 || i % 5 == 0 && i % 10 == 7)
                System.out.print(" kling-klong");
            else if (i % 5 == 0)
                System.out.print(" kling");
            else if (i / 10 == 7)
                System.out.print(" klong");
            else if (i % 10 == 7)
                System.out.print(" klong");
            System.out.println();
        }
    }
}
