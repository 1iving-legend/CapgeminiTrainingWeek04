package smart_house_management_system;
import java.util.*;

class SmartHouseManagementSystem{
    public static void main(String[] args) {

        Storage<Electronics> electronicStorage = new Storage<Electronics>();
        Storage<Groceries> groceriesStorage = new Storage<Groceries>();
        Storage<Furniture> furnitureStorage = new Storage<Furniture>();
        electronicStorage.addItem(new Electronics("Laptop", 1200,"Dell"));
        electronicStorage.addItem(new Electronics("Mobile", 30000,"OnePlus"));

        groceriesStorage.addItem(new Groceries("Milk",20,"2025-1-10"));
        groceriesStorage.addItem(new Groceries("Chocklate",50,"2027-4-11"));

        furnitureStorage.addItem(new Furniture("Sofa",4000,"Wood"));
        furnitureStorage.addItem(new Furniture("chair",2000,"Wood"));

        System.out.println(" *smart_house_management_system.Electronics in smart_house_management_system.Storage:*");
        WarehouseUtil.displayItems(electronicStorage.getItems());

        System.out.println("*smart_house_management_system.Groceries in smart_house_management_system.Storage:*");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("*smart_house_management_system.Furniture in smart_house_management_system.Storage:*");
        WarehouseUtil.displayItems(furnitureStorage.getItems());

    }
}
