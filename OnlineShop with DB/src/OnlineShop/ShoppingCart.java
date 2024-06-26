package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart
{
    private Map<String, Item> cart = new HashMap<>();

    // Adds an item to the cart that matches the product given as a parameter,
    // with the price given as a parameter.
    public void add(String product, int price)
    {
        if (!cart.containsKey(product))
            cart.put(product, new Item(product, 1, price));
        else
            cart.get(product).increaseQuantity();
    }

    // Returns the total price of the shopping cart.
    public int price()
    {
        int price = 0;
        for (Item i : cart.values())
        {
            price += i.price();
        }
        return price;
    }

    // prints the Item-objects in the cart.
    public void print()
    {
        for (Item i : cart.values())
        {
            System.out.println(i.toString());
        }
    }
}
