package Database;

import java.sql.*;

public class MySQLConnect
{
    private static String user = "adminOnlineShop";
    private static String password = "password";

    public static Connection getSQLConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=" + user + "&password=" + password);
        }
        catch (SQLException | ClassNotFoundException sqle)
        {
            System.out.println("Failed to establish a Connection to MySQL:\n" + sqle);
        }
        return conn;
    }

    public static Connection getDBConnection(String dbName)
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName,user, password);
        }
        catch (SQLException | ClassNotFoundException sqle)
        {
            System.out.println("Failed to establish a Connection to DB:\n" + sqle);
        }
        return conn;
    }
}
