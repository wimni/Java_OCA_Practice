package Uebungen._300_390._300_Roboter_Weisensee;

public class Main
{
    public static void main(String[] args)
    {
        Roboter robo1 = new Roboter("Herbert");
        Roboter robo2 = new Roboter("Bernd");
        System.out.println(robo1.getName() + " und " + robo2.getName());  // Herbert und Herbert

        robo2.setName("Bernd");

        System.out.println(robo2.getName());
    }

}
