package Database;

import java.sql.*;

public class CreateDatabase
{
    public static int createDatabase(Connection conn, String name)
    {
        try
        {
            Statement s = conn.createStatement();
            int result = s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + name);
            s.close();
            return result;
        }
        catch (SQLException sqle)
        {
            System.out.println("Failed to create Database:\n" + sqle);
            return -1;
        }
    }
}
