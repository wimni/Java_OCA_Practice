package Uebungen._500_590._520_BuchKapitel06_Weisensee;

public class Kontotest
{
    public static void main(String[] args)
    {
        Konto k1 = new Konto("0000000001", 1000);
        System.out.println(k1.getKontonummer());
        System.out.println(k1.getKontostand());
        k1.einzahlen(500);
        k1.auszahlen(750.50);
        System.out.println(k1.getKontostand());
    }
}
