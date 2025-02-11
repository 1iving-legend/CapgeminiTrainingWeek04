package smart_house_management_system;

public abstract class WareHouseItem{
    protected String name;
    protected double price;

    public WareHouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void showDetails();
}
