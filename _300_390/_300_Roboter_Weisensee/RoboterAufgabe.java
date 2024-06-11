package Uebungen._300_Roboter_Weisensee;

public class RoboterAufgabe
{
            /*
     * Roboter
     *
     * Wir haben folgende einfache Roboterklasse geschrieben:

        public class Roboter {
            private String name;
            public Roboter(String name) { this.name = name;}
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
        }

     * Diese Klasse erfreut sich nun auf einmal weltweit großer Beliebtheit.
     * Wir haben allerdings ein Problem:
     * Die internationale Robotergewerkschaft konnte ein weltweites Verbot durchsetzen,
     * dass Roboter nicht mehr "Bernd" genannt werden dürfen.
     * Alle anderen Namen sind erlaubt.
     * Schreibe nun die Klasse so um,
     * dass Roboter automatisch "Herbert" genannt werden,
     * wenn jemand versucht, sie "Bernd" zu taufen
     * oder versucht den Roboter in "Bernd" umzubenennen.
     * Eine Test-Klasse könnte so aussehen:

        public class Main {
            public static void main(String[] args) {
                Roboter robo1 = new Roboter("Herbert");
                Roboter robo2 = new Roboter("Bernd");
                System.out.println(robo1.getName() + " und " + robo2.getName());  // Herbert und Herbert
            }
        }

     * Für die Benutzer der Klasse darf sich natürlich nichts ändern
     * Nur muss jetzt zweimal "Herbert" ausgegeben werden.
     *
     * Bitte auch das Umbenennen testen.
     * Nach dem Versuch, einen Roboter in „Bernd” umzubenennen,
     * muss dieser Roboter „Herbert” heissen:

        Roboter robo3 = new Roboter("Stefan");
        System.out.println(robo3.getName());  // Stefan
        robo3.setName("Bernd");
        System.out.println(robo3.getName());  // Herbert
     */

    // Bitte als Ordner (mir angefügtem Namen) mit drei Dateien abgeben:
    // RoboterAufgabe (mit nur der Aufgaben-Stellung), Roboter, Main
}
