package dynamic_online_marketplace;

import java.util.ArrayList;

public class Product<T extends ProductCatalog>{
    private ArrayList<T> product = new ArrayList<>();
    public void addItem(T item) {
        product.add(item);
    }
    public void removeItem(T item) {
        product.remove(item);
    }
    public ArrayList<T> getItems() {
        return product;
    }
    public void showDetails()
    {
        for(T p: product){
            p.showDetails();
        }
    }
}
