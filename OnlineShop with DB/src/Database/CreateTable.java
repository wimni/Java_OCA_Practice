package Database;

import java.sql.*;

public class CreateTable
{
    public static boolean createTable(Connection conn, String tableName, String... columns    )
    {
        try
        {
            Statement s = conn.createStatement();
            StringBuilder sb = new StringBuilder("CREATE Table IF NOT EXISTS " + tableName + "(");
            for (String string : columns)
            {
                sb.append(string);
            }
            sb.append(");");
            s.execute("" + sb);
            s.close();
        }
        catch (SQLException sqle)
        {
            System.out.println("Failed to create Table:\n" + sqle);
            return false;
        }
        return true;
    }
}
