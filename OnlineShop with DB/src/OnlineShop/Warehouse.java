package OnlineShop;

import Database.*;

import java.sql.*;

import java.util.*;

public class Warehouse
{
    private Connection sqlConn;
    private Connection dbConn;

    public Warehouse(String dbName)
    {
        // Establish Connection to MySQL
        sqlConn = MySQLConnect.getSQLConnection();
        if (sqlConn == null) System.exit(-1);
        else System.out.println("Established Connection to MySQL");

        // Create Database
        int result = CreateDatabase.createDatabase(sqlConn, dbName);
        if (result == -1) System.exit(-1);
        if (result == 0) System.out.println("Database Found");
        else System.out.println("Database created");

        // Establish Connection to DB
        dbConn = MySQLConnect.getDBConnection(dbName);
        if (dbConn == null) System.exit(-1);
        else System.out.println("Established Connection to Database");

        // Create Table
        if (!CreateTable.createTable(dbConn, "stock",
                "ID int NOT NULL AUTO_INCREMENT," +
                        "Product VARCHAR(255) NOT NULL," +
                        "Price VARCHAR(128)," +
                        "Stock INT," +
                        "PRIMARY KEY (ID)," +
                        "UNIQUE (Product)")) System.exit(-1);
    }

    // Which adds a product to the warehouse with the price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock)
    {
        try
        {
            Statement s = dbConn.createStatement();
            ResultSet result = (s.executeQuery(
                        "SELECT EXISTS(" +
                            "SELECT * " +
                            "FROM stock " +
                            "WHERE Product LIKE '" + product + "');"));
            result.next();
            if (result.getInt(1) == 0)
                s.execute("INSERT INTO stock (Product, Price, Stock)" +
                        "VALUES ('" + product + "', '" + price + "', '" + stock + "');");
            else
                s.execute(
                            "UPDATE stock " +
                                "SET Price = " + price + "," +
                                "Stock = " + (stock + stock(product)) + " " +
                                "WHERE Product LIKE '" + product + "';");
            s.close();
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }
    }

    // returns the price of the product it received as a parameter.
    // If the product hasn't been added to the warehouse, the method must return -99.
    public int price(String product)
    {
        ResultSet result = null;
        try
        {
            Statement s = dbConn.createStatement();
            result = s.executeQuery(
                    "SELECT Price " +
                        "FROM stock " +
                        "WHERE EXISTS" +
                            "(SELECT Price " +
                            "FROM stock " +
                            "WHERE Product LIKE '" + product + "');");
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }
        finally
        {
            try
            {
                result.next();
                return result.getInt(1);
            }
            catch (SQLException sqle)
            {
                return -99;
            }
        }
    }

    // Returns the current remaining stock of the product in the warehouse.
    // If the product hasn't been added to the warehouse, the method must return 0.
    public int stock(String product)
    {
        ResultSet result = null;
        try
        {
            Statement s = dbConn.createStatement();
            result = s.executeQuery(
                    "SELECT Stock " +
                        "FROM stock " +
                        "WHERE Product LIKE '" + product + "';");
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }
        finally
        {
            try
            {
                result.next();
                return result.getInt(1);
            }
            catch (SQLException sqle)
            {
                return 0;
            }
        }
    }

    // Reduces the stock remaining for the product it received as a parameter by one,
    // and returns true if there was stock remaining.
    // If the product was not available in the warehouse the method returns false.
    // A products stock can't go below zero.
    public boolean take(String product)
    {
        if (stock(product) > 0)
        {
            try
            {
                Statement s = dbConn.createStatement();
                s.execute("UPDATE stock " +
                                "SET Stock = " + (stock(product) - 1) + " " +
                                "WHERE Product LIKE '" + product + "';");
                s.close();
                return true;
            }
            catch (SQLException sqle)
            {
                return false;
            }
        }

        return false;
    }

    // returns the names of the products in the warehouse as a Set.
    public Set<String> products()
    {
        Set<String> treeSet = new TreeSet<>();
        try
        {
            Statement s = dbConn.createStatement();
            ResultSet result = s.executeQuery(
                    "SELECT Product, Price, Stock " +
                        "FROM stock " +
                        "ORDER BY Product;");

            while (result.next())
            {
                if (result.getInt(3) != 0)
                    treeSet.add(result.getString(1)
                            .concat("\t")
                            .concat(result.getString(2))
                            .concat("€\tx")
                            .concat(result.getString(3)));
            }
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }

        return treeSet;
    }

    // Close DB Connections
    public void closeConnections()
    {
        try
        {
            sqlConn.close();
            dbConn.close();
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }
    }
}
