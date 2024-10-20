package ReferentialTypes;

import ClassAndObjects.PlanetarySystems;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestsTypes {
    @Test
    public void doesIntChangeValue() {
        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 6;

        System.out.println( firstInt );
        System.out.println( secondInt );

        Assert.assertEquals( 5 , secondInt );
    }

    @Test
    public void doesObjectChangesValueTest() {
        PlanetarySystems pierwszySystem = new PlanetarySystems();
        PlanetarySystems drugiSystem = pierwszySystem;
        pierwszySystem.setNumberOfPlanets( 13 );
        Assertions.assertEquals( 13 , drugiSystem.getNumberOfPlanets() );

    }

    @Test
    // W Strinach typy sie nie zmieniaja i zachowuje sie jak typ primitywny. Przypisujac jakos wartosc do Strina tworzmy zupełnie nowy obekt.
    // Typ prmittywny dziala na wartosciach.
    // Typy złozone ( klasy) działa na referencjach.  Referencje odnosza sie do konkretnego obektu i beda odnosci sie do tego samego obiektu.

    public void doesStringChangeValueTestBasedOnString(){
        String firstString = "jeden";
        String secondString = firstString;
        firstString = "zmieniony";
        Assertions.assertEquals(firstString,secondString);
    }


}
