package dynamic_online_marketplace;

public class DiscountUtil {
    public static <T extends ProductCatalog> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getName() + " is $" + product.getPrice());
    }
}
