package Uebungen._400_490._400_Personen_Weisensee;

public class Kunde extends Person
{
    private String betreuer;
    private int kundenNummer;

    Kunde(){}

    public Kunde(String vorname, String nachname, int alter, int kundenNummer, String betreuer) {
        super(vorname, nachname, alter);
        this.kundenNummer = kundenNummer;
        this.betreuer = betreuer;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public String getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(String betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "betreuer='" + betreuer + '\'' +
                ", kundenNummer=" + kundenNummer +
                '}';
    }
}
