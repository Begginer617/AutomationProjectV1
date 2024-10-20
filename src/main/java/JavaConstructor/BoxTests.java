package JavaConstructor;

import org.junit.Test;



public class BoxTests {

    @Test
    public void secondTest() {
    BoxMain pierwszyBox = new BoxMain( 10 ,20 ,3 ,4 , true );
    pierwszyBox.printLength( 10 );
    pierwszyBox.printWeight( 20 );
    pierwszyBox.printHeight( 30 );
    pierwszyBox.printWidht( 40 );
    }

    public BoxTests() {

    }
}
