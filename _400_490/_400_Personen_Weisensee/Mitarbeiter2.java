package Uebungen._400_490._400_Personen_Weisensee;

public class Mitarbeiter2 extends Person
{
    private String abteilung;
    private int mitarbeiterNummer;

    Mitarbeiter2(){}

    public Mitarbeiter2(String vorname, String nachname, int alter, String abteilung, int mitarbeiterNummer) {
        super(vorname, nachname, alter);
        this.abteilung = abteilung;
        this.mitarbeiterNummer = mitarbeiterNummer;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public int getMitarbeiterNummer() {
        return mitarbeiterNummer;
    }

    public void setMitarbeiterNummer(int mitarbeiterNummer) {
        this.mitarbeiterNummer = mitarbeiterNummer;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "abteilung='" + abteilung + '\'' +
                ", mitarbeiterNummer=" + mitarbeiterNummer +
                '}';
    }
}
