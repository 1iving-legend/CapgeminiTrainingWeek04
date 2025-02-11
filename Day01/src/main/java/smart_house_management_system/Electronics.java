package smart_house_management_system;

public class Electronics extends WareHouseItem{
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("smart_house_management_system.Electronics :"+ super.name);
        System.out.println("Brand :"+ this.brand);
        System.out.println("Price :"+ super.price);
    }
}
