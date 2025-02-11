package smart_house_management_system;

public class Furniture extends WareHouseItem{
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void showDetails() {
        System.out.println("smart_house_management_system.Electronics :"+ super.name);
        System.out.println("Material :"+ this.material);
        System.out.println("Price :"+ super.price);
    }
}
