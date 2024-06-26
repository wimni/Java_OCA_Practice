import OnlineShop.Store;
import OnlineShop.Warehouse;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        String dbName = "OnlineShopWarehouse";
        Warehouse warehouse = new Warehouse(dbName);

        if (warehouse.stock("coffee") == 0)
            warehouse.addProduct("coffee", 5, 10);
        if (warehouse.stock("milk") == 0)
            warehouse.addProduct("milk", 3, 20);
        if (warehouse.stock("cream") == 0)
            warehouse.addProduct("cream", 2, 55);
        if (warehouse.stock("bread") == 0)
            warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);

        store.shop("Florian");

        warehouse.closeConnections();
    }
}
