import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import smart_house_management_system.*;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class WareHouseTest {

    private Storage<Electronics> electronicStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUp() {
        electronicStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }

    @Test
    void testElectronicsItemCreation() {
        Electronics laptop = new Electronics("Laptop", 1200, "Dell");
        assertEquals("Laptop", laptop.name);
        assertEquals(1200, laptop.price);
    }

    @Test
    void testGroceriesItemCreation() {
        Groceries milk = new Groceries("Milk", 20, "2025-01-10");
        assertEquals("Milk", milk.name);
        assertEquals(20, milk.price);
    }

    @Test
    void testFurnitureItemCreation() {
        Furniture chair = new Furniture("Chair", 2000, "Wood");
        assertEquals("Chair", chair.name);
        assertEquals(2000, chair.price);
    }

    @Test
    void testAddAndRetrieveElectronics() {
        Electronics laptop = new Electronics("Laptop", 1200, "Dell");
        electronicStorage.addItem(laptop);

        ArrayList<Electronics> items = electronicStorage.getItems();
        assertTrue(items.contains(laptop));
        assertEquals(1, items.size());
    }

    @Test
    void testAddAndRemoveGroceries() {
        Groceries milk = new Groceries("Milk", 20, "2025-01-10");
        groceriesStorage.addItem(milk);
        assertEquals(1, groceriesStorage.getItems().size());

        groceriesStorage.removeItem(milk);
        assertEquals(0, groceriesStorage.getItems().size());
    }

    @Test
    void testWarehouseUtilDisplay() {
        Electronics mobile = new Electronics("Mobile", 30000, "OnePlus");
        electronicStorage.addItem(mobile);

        assertDoesNotThrow(() -> WarehouseUtil.displayItems(electronicStorage.getItems()));
    }
}