package Uebungen._500_590._560_FliegenAufgabenstellung_Weisensee;

public class App
{
    public static void main(String[] args)
    {
        Biene biene = new Biene();
        abflug((biene));
    }

    static void abflug(Fliegen fliegen)
    {
        fliegen.fliegen();
    }
}
