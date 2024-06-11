package Uebungen._500_590._520_BuchKapitel06_Weisensee;

class Bruch {
    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    int getZaehler() {
        return zaehler;
    }

    int getNenner() {
        return nenner;
    }

    void setZaehler(int z) {
        zaehler = z;
    }

    void setNenner(int n) {
        nenner = n;
    }

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }

    String Bruchstring() {
        return zaehler + "/" + nenner;
    }

    void kuerzen() {
        int m, n, r; // lokale Variablen
        m = zaehler;
        n = nenner;
        r = m % n;
        while (r > 0) { // Berechnung des ggT
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }

    void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

    boolean equals(Bruch x) {
        Bruch a = new Bruch(this.zaehler, this.nenner);
        Bruch b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
            return true;
        } else {
            return false;
        }
    }

    Bruch addiere (Bruch b)
    {
        return new Bruch(this.getZaehler() * b.getNenner() + b.getZaehler() * this.getNenner(),
                        this.getNenner() * b.getNenner());
    }

    Bruch subtrahiere (Bruch b)
    {
        return new Bruch(this.getZaehler() * b.getNenner() - b.getZaehler() * this.getNenner(),
                this.getNenner() * b.getNenner());
    }

    double dezimalwert()
    {
        return 1d / this.getNenner() * this.getZaehler();
    }
}
