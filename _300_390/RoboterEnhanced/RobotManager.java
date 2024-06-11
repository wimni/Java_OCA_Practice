package Uebungen._300_390.RoboterEnhanced;

import Uebungen._300_390.RoboterEnhanced.direction;

import javax.swing.*;

public class RobotManager
{
    Roboter rb1;
    public static void playerTurn(Roboter rb1, Gridmap gridmap)
    {
        int option = JOptionPane.showOptionDialog(null, "", "", JOptionPane.OK_CANCEL_OPTION ,
                JOptionPane.PLAIN_MESSAGE,  null, new String[]{"Richtung ändern", "bewegen"}, null);
        if (option == 0)
        {
            changeDirection(rb1);
        }
        else
        {
            moveRobot(rb1, gridmap);
        }
    }

    private static void moveRobot(Roboter rb1, Gridmap gridmap)
    {
        String input = JOptionPane.showInputDialog("Anzahl Felder eingeben: ");
        if (input != null && checkInput(input))
            rb1.move(gridmap, Integer.parseInt(input));
    }

    private static void changeDirection(Roboter rb1)
    {
        int option = JOptionPane.showOptionDialog(null, "", "", JOptionPane.OK_CANCEL_OPTION ,
                JOptionPane.PLAIN_MESSAGE,  null, new String[]{"Norden", "Osten", "Süden", "Westen"}, null);

        switch(option)
        {
            case 0:
                rb1.setDirection(direction.north);
                break;
            case 1:
                rb1.setDirection(direction.east);
                break;
            case 2:
                rb1.setDirection(direction.south);
                break;
            case 3:
                rb1.setDirection(direction.west);
                break;
        }
    }

    private static boolean checkInput(String input)
    {
        return input.matches(".*[0123456789]*.");
    }
}
