package dynamic_online_marketplace;

public class Book extends ProductCatalog {
    String author;
    Book( String name,double price,String author) {
        super(name ,price);
        this.author = author;
    }
    public void showDetails() {
        System.out.println("dynamic_online_marketplace.Book Name: " + getName() + " , "+ " Author : " + author + " , " + "  Price: " + getPrice());
    }
}
