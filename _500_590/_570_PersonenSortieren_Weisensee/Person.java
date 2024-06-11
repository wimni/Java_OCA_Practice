package Uebungen._500_590._570_PersonenSortieren_Weisensee;

abstract public class Person implements Comparable
{
    private int alter;
    private String nachname;
    private String vorname;

    public Person(){}

    public Person(String vorname) {
        this.vorname = vorname;
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nachname = '" + nachname + '\'' +
                ", vorname = '" + vorname + '\'' +
                ", alter = " + alter +
                '}';
    }

    @Override
    public int compareTo(Object obj)
    {
        if (!(obj instanceof Person p2)) return 0;

        for (int i = 0; i < this.nachname.length() ; i++)
        {
            if (p2.nachname.length() == i || this.nachname.charAt(i) > p2.nachname.charAt(i))
                return -1;
            else if (this.nachname.charAt(i) < p2.nachname.charAt(i))
                return 1;
        }

        for (int i = 0; i < this.vorname.length() ; i++)
        {
            if (p2.vorname.length() == i || this.vorname.charAt(i) > p2.vorname.charAt(i))
                return -1;
            else if (this.vorname.charAt(i) < p2.vorname.charAt(i))
                return 1;
        }

        if (this.alter > p2.alter)
            return -1;
        else if (this.alter < p2 .alter)
            return 1;
        return 0;
    }
}
