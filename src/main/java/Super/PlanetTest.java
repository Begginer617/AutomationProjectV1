package Super;

import org.junit.Test;

public class PlanetTest {

    @Test
    public void test() {
        Planet earth = new Planet( "earth" );
        Planet mars = new Planet( "mars" , 687 , 3389.5f , false );
        mars.getOrbitalPeriod();
        earth.getOrbitalPeriod();
    }


}
