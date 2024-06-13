package Uebungen._800_890._820_OnlineShop_Weisensee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse
{
    public Map<String, Integer> prices = new HashMap<>();
    public Map<String, Integer> stock = new HashMap<>();

    // Which adds a product to the warehouse with the price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock)
    {
        prices.put(product, price);
        if (this.stock.containsKey(product))
            this.stock.put(product, this.stock.get(product) + stock);
        else
            this.stock.putIfAbsent(product, stock);

    }

    // returns the price of the product it received as a parameter.
    // If the product hasn't been added to the warehouse, the method must return -99.
    public int price(String product)
    {
        return prices.getOrDefault(product, -99);
    }

    // Returns the current remaining stock of the product in the warehouse.
    // If the product hasn't been added to the warehouse, the method must return 0.
    public int stock(String product)
    {
        return stock.getOrDefault(product, 0);
    }

    // Reduces the stock remaining for the product it received as a parameter by one,
    // and returns true if there was stock remaining.
    // If the product was not available in the warehouse the method returns false.
    // A products stock can't go below zero.
    public boolean take(String product)
    {
        if (stock.containsKey(product))
            if (stock.get(product) > 0)
            {
                stock.put(product, stock.get(product) - 1);
                if (stock.get(product) == 0)
                    stock.remove(product);
                return true;
            }
        return false;
    }

    // returns the names of the products in the warehouse as a Set.
    public Set<String> products()
    {
        return new HashSet<>(prices.keySet());
    }
}
