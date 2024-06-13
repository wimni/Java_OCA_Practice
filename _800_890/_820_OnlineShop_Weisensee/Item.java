package Uebungen._800_890._820_OnlineShop_Weisensee;

public class Item
{
    private String product;
    private int qty;
    private int unitPrice;

    // creates an item corresponding to the product given as a parameter.
    // qty tells us how many of the product are in the item,
    // while unitPrice is the price of a single product.
    public Item(String product, int qty, int unitPrice)
    {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Returns the price of the item.
    public int price()
    {
        return unitPrice * qty;
    }

    // Increases the quantity by one.
    public void increaseQuantity()
    {
        qty++;
    }

    // Returns the string representation of the item.
    @Override
    public String toString()
    {
        return product + ": " + qty;
    }
}
