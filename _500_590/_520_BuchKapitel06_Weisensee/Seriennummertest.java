package Uebungen._500_590._520_BuchKapitel06_Weisensee;

public class Seriennummertest
{
    public static void main(String[] args)
    {
        BruchMitSeriennummer bms1 = new BruchMitSeriennummer(2, 3);
        BruchMitSeriennummer bms2 = new BruchMitSeriennummer(1, 4);
        BruchMitSeriennummer bms3 = new BruchMitSeriennummer(7, 6);
        BruchMitSeriennummer bms4 = new BruchMitSeriennummer(1, 3);
        BruchMitSeriennummer bms5 = new BruchMitSeriennummer(5, 8);

        System.out.println(bms5.getSeriennummer());
        bms1.addiere(bms2).gekuerztausgeben();
        System.out.println();
        bms3.subtrahiere(bms4).gekuerztausgeben();
        System.out.println();
    }
}
