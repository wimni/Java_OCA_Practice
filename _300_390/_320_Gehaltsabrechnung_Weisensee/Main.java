package Uebungen._300_390._320_Gehaltsabrechnung_Weisensee;

public class Main
{
    public static void main(String[] args)
    {
        PersonalVerwaltung.addMitarbeiter("Agop", "Ayse", "Cord", "Daniel", "Daniel", "Eduard", "Florian",
                                            "Leah", "Loui", "Mana", "Mark", "Markus", "Maya", "Mina", "Obada",
                                            "Philipp", "Raimund", "Rene", "Sebastian", "Valeriia", "William");

        PersonalVerwaltung.shuffleMitarbeiterList();
        PersonalVerwaltung.listMitarbeiter();
        PersonalVerwaltung.sortMitarbeiter();
        PersonalVerwaltung.listMitarbeiter();
    }
}
