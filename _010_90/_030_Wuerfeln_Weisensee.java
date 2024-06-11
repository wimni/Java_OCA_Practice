package Uebungen._010_90;

import java.util.Random;

public class _030_Wuerfeln_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Würfeln
         *
         * Würfel eine Zahl (von 1 bis 6) und gib aus,
         * was gewürfelt wurde:
         * Super, eine 6!
         * Immerhin noch eine 5!
         * Das reicht nicht! (bei 1-4)
         */

        Random r = new Random();
        int number = r.nextInt(6) + 1;

        System.out.println("Gewürfelte Zahl: " + number);

        if (number == 6)
            System.out.println("Super, eine 6");
        else if (number == 5)
            System.out.println("Immeerhin noch ein 5!");
        else
            System.out.println("Das reicht nicht!");
    }
}