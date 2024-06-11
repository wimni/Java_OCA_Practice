package Uebungen._100_190;

public class _110_Dominosteine_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Dominosteine
         *
         * Schreibe ein Programm,
         * das alle möglichen Dominosteine in der folgenden Form ausgibt.
         *
         * (0|0)(0|1)(0|2)(0|3)(0|4)(0|5)(0|6)
         *      (1|1)(1|2)(1|3)(1|4)(1|5)(1|6)
         *           (2|2)(2|3)(2|4)(2|5)(2|6)
         *                (3|3)(3|4)(3|5)(3|6)
         *                     (4|4)(4|5)(4|6)
         *                          (5|5)(5|6)
         *                               (6|6)
         */

        for (int i = 0; i <= 6; i++)
        {
            for (int j = 0; j <= 6; j++)
            {
                if (i > j)
                    System.out.print("     ");
                else
                    System.out.print("(" + i + "|" + j + ")");
            }
            System.out.println();
        }
    }
}
