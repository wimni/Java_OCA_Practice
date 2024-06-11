package Uebungen._300_390.RoboterEnhanced;

public class Main
{
    public static void main(String[] args)
    {
        int width = 10;
        int heigth = 10;

        Gridmap gridmap = new Gridmap(width, heigth);
        Roboter rb1 = new Roboter(gridmap, "player", (int)(width / 2), (int)(heigth / 2));
        int randomx = (int)(Math.random() * width);
        int randomy = (int)(Math.random() * heigth);
        Roboter rb2 = new Roboter(gridmap, "enemy", randomx, randomy);

        while (true)
        {
            System.out.println(rb1.getDirection() + "    Pos: " + rb1.getXpos() + ":" + rb1.getYpos());
            gridmap.drawGrid();
            RobotManager.playerTurn(rb1, gridmap);
        }
    }
}
