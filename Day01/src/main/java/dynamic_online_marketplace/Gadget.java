package dynamic_online_marketplace;

public class Gadget extends ProductCatalog {
    String gadgetbrand;
    Gadget(String name,double price,String gadgetbrand) {
        super(name,price);
        this.gadgetbrand = gadgetbrand;
    }
    public void showDetails() {
        System.out.println("dynamic_online_marketplace.Gadget Name: " + getName() + " , " + " GadgetBrand : " + gadgetbrand + " , " + " Price: " + getPrice());
    }
}
