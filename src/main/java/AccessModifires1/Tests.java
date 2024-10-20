package AccessModifires1;

import org.junit.Test;

public class Tests {

    @Test
    public void addtoCartTest() {
        ProductPage productPage = new ProductPage();
        productPage.setAmount(3).addToCart().gotToCart();
        productPage.goTo("https://onedrive.live.com/login/");
        String productPrice = productPage.productPrice;

        // Assuming you want to do something with productPrice
        System.out.println("Product Price: " + productPrice);

        HomePage homePage = new HomePage();
    }

    @Test
    public void productPageTest() {
        ProductPage productPage = new ProductPage();
        // Uncomment and use if needed
        // productPage.productName = "Product Name";
        // productPage.productPrice = "Product Price";

        productPage.goTo("https://onedrive.live.com/login/");
        String productPrice = productPage.productPrice;

        HomePage homePage = new HomePage();
    }
}
