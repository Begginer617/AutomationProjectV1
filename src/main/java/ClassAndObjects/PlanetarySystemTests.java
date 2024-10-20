package ClassAndObjects;

import org.junit.Test;

public class PlanetarySystemTests {
    @Test
    public void firstTest() {
        PlanetarySystems solarSystem = new PlanetarySystems();
         //odniesieie do wszytkich elementow w klasie
        System.out.println("Number of planets: " + solarSystem.getNumberOfPlanets());
        solarSystem.setNumberOfPlanets(7);
        System.out.println("Number of planets: " + solarSystem.getNumberOfPlanets());
        solarSystem.printNumberOfPlanets();
    }

    public static PlanetarySystems anotherSystem = new PlanetarySystems();


}
