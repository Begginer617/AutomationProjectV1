package AccessModifires1;

// Product page extends BasePage
// You can inherit from only one class
public class ProductPage extends BasePage {
    String productName;
    String productPrice;

    // Protected method to add a product to the cart, returning the ProductPage object
    protected ProductPage addToCart() {
        BasePage basePage = new BasePage();
        basePage.searchForProduct("product");
        System.out.println("Product added to cart");
        return this;
    }

    // Method to set the amount of a product, returning a new ProductPage object
    protected ProductPage setAmount(int amount) {
        System.out.println("Selected quantity: " + amount);
        return new ProductPage();
    }

    // Method to go to the cart
    protected void gotToCart() {
        System.out.println("Navigating to the cart");
    }
}
