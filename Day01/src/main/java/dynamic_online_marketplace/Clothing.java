package dynamic_online_marketplace;

public class Clothing extends ProductCatalog {
    String brand;
    Clothing(String name,double price,String brand) {
        super(name,price);
        this.brand = brand;
    }
    public void showDetails() {
        System.out.println("dynamic_online_marketplace.Clothing Name: " + getName() + " , " + " Brand :" + brand + " , " + " Price: " + getPrice());
    }
}
