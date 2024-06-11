package Uebungen._300_390._330_Roboter2_Weisensee;

public class Main
{
    public static void main(String[] args)
    {
        Roboter rb1 = new Roboter("RoboterCharlie");
        System.out.println(rb1.getName());
        System.out.println(rb1.getDirection());
        rb1.move(5);
        rb1.setDirection(direction.west);
        rb1.move(7);
        rb1.outPos();
    }
}
