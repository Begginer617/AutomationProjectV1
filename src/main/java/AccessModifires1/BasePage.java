package AccessModifires1;

public class BasePage {

    public String title;
    public String url;

    String userName;

    public void goTo(String pageUrl) {
        System.out.println( "going to page" );

    }

    // private oznacza, ze jest dostepne tylko w tej klasie
    //protected oznacza ze bedzie dostpone tylko z tego samego pakietu
    // protected oznacza ze mozna korzystac ( z metody np) po klasa dziedziczacych tylko po tej klasie
     public void searchForProduct(String product) {
        System.out.println( "Search for product" + product );
    }
}
