package Uebungen._500_590;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class EmptyStringException extends NumberFormatException
{
    EmptyStringException()
    {
        super();
    }
    EmptyStringException(String str)
    {
        super(str);
    }
}

class FloatException extends NumberFormatException
{
    FloatException()
    {
        super();
    }
    FloatException(String str)
    {
        super(str);
    }
}

class IllegalInputException extends NumberFormatException
{
    IllegalInputException()
    {
        super();
    }

    IllegalInputException(String str)
    {
        super(str);
    }
}

public class _540_Validieren_Weisensee
{
    /*
     * Validieren
     *
     * Validiere eine Benutzereingabe vom Scanner.
     *
     * Der Benutzer soll aufgefordert werden, eine Ganzzahl (zahl) einzugeben
     * und es soll das Ergebnis von 100 / zahl als Fließkommazahl ausgegeben werden.
     *
     * Folgende Fälle sollen getrennt abgefangen werden:
     * 1. Der Benutzer gibt nichts ein.
     * 2. Der Benutzer gibt eine Fließkommazahl ein.
     * 3. Der Benutzer gibt 0 ein.
     *
     * Benutze die Exceptions ArithmeticException und NumberFormatException.
     * Für den Fall, dass der Benutzer Nichts eingibt,
     * schreibe eine eigene Exception als Kindklasse von NumberFormatException.
     *
     * Der Benutzer soll eine Meldung bekommen, was nicht stimmt
     * und solange wieder eine neue Zahl eingeben müssen, bis die Eingabe korrekt ist.
     *
     * Zusatz:
     * 4. Der Benutzer gibt mindestens ein Zeichen ein, das nichts mit Zahlen zu tun hat.
     */

    public static void main(String[] args)
    {
        System.out.printf("%.2f", (double)100 / eingabe());
    }

    private static int eingabe()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String eingabe;
        int zahl;

        try
        {
            System.out.println("Bitte Zahl eingeben: ");
            eingabe = reader.readLine();
            if (eingabe.isEmpty()) throw new EmptyStringException();
            for (int i = 0; i < eingabe.length(); i++)
            {
                if (!eingabe.substring(i, i + 1).matches(".*[0123456789].*"))
                    throw new IllegalInputException();
            }
            if (Double.parseDouble(eingabe) % 1 != 0) throw  new FloatException();
            if (eingabe.equals("0")) throw  new ArithmeticException();
            zahl = Integer.parseInt(eingabe);
        }
        catch(EmptyStringException ese)
        {
            System.out.println("Es wurde nichts eingeben! " + ese);
            return eingabe();
        }
        catch(FloatException fe)
        {
            System.out.println("Es wurde eine Fließkommazahl eingeben! " + fe);
            return eingabe();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Es wurde eine Null eingeben! " + ae);
            return eingabe();
        }
        catch (IllegalInputException iie)
        {
            System.out.println("Die Eingabe darf nur aus Zahlen bestehen! " + iie);
            return eingabe();
        }
        catch(Exception exc)
        {
            System.out.println(exc);
            return eingabe();
        }
        return zahl;
    }
}
