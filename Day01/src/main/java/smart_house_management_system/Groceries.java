package smart_house_management_system;

public class Groceries extends WareHouseItem{
    private String expireDate;

    public Groceries(String name, double price, String expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public void showDetails() {
        System.out.println("smart_house_management_system.Electronics :"+ super.name);
        System.out.println("ExpireDate :"+ this.expireDate);
        System.out.println("Price :"+ super.price);
    }
}
