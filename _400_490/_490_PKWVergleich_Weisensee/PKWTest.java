package Uebungen._400_490._490_PKWVergleich_Weisensee;

public class PKWTest {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        System.out.println(pkw1);
        // PKW{kofferraumVolumen=300} Fahrzeug{hersteller='Volvo', farbe='Silber'}

        PKW pkw2 = new PKW("Mercedes");
        System.out.println(pkw2);
        // PKW{kofferraumVolumen=300} Fahrzeug{hersteller='Mercedes', farbe='Silber'}

        PKW pkw3 = new PKW("Audi", "Schwarz");
        System.out.println(pkw3);
        // PKW{kofferraumVolumen=300} Fahrzeug{hersteller='Audi', farbe='Schwarz'}

        PKW pkw4 = new PKW("Audi", "Schwarz", 300);
        System.out.println(pkw4);
        // PKW{kofferraumVolumen=300} Fahrzeug{hersteller='Audi', farbe='Schwarz'}

        PKW pkw5 = new PKW(1200);
        System.out.println(pkw5);
        // PKW{kofferraumVolumen=1200} Fahrzeug{hersteller='Volvo', farbe='Silber'}

        System.out.println(pkw3.equals(pkw4));

    }
}
