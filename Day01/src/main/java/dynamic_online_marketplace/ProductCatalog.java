package dynamic_online_marketplace;

public abstract class ProductCatalog {
    private String name;
    private double price;



    ProductCatalog( String name,double price){
        this.name = name;
        this.price = price;

    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void showDetails();
}
