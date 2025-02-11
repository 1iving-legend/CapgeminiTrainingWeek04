package dynamic_online_marketplace;

import java.util.ArrayList;


public class DynamicOnlineMarketplace{
    public static void main(String[] args) {

        Product<Book> book1 = new Product<>();
        Product<Clothing> cloth1 = new Product<>();
        Product<Gadget> gadget1 = new Product<>();

        book1.addItem(new Book("The Thousand Splended Suns", 1200,"Khallid Hussaini"));
        book1.addItem(new Book("The Boy with the Broken Heart", 3000,"Dorjai Dutta"));

        cloth1.addItem(new Clothing("jeans",7000,"Flying Machine"));
        cloth1.addItem(new Clothing("shirt",5000,"pepe"));

        gadget1.addItem(new Gadget("X-Box",97000,"Microsoft"));
        gadget1.addItem(new Gadget("PS-5",56000,"sony"));

        System.out.println("Books: ");
        book1.showDetails();

        System.out.println("dynamic_online_marketplace.Clothing: ");
        cloth1.showDetails();

        System.out.println("dynamic_online_marketplace.Gadget: ");
        gadget1.showDetails();

        DiscountUtil.applyDiscount(book1.getItems().get(0),30);
        DiscountUtil.applyDiscount(book1.getItems().get(1),25);
        DiscountUtil.applyDiscount(cloth1.getItems().get(0),30);
        DiscountUtil.applyDiscount(cloth1.getItems().get(1),70);
        DiscountUtil.applyDiscount(gadget1.getItems().get(0),50);
        DiscountUtil.applyDiscount(gadget1.getItems().get(1),50);

    }
}