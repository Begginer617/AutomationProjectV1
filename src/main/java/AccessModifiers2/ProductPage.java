package AccessModifiers2;

import AccessModifires1.BasePage;

public class ProductPage extends BasePage {
    String productName;
    String productPrice;

    protected void addToTheCart(){
        searchForProduct( "product" );
        System.out.println("Product added to the cart");
    }
}
