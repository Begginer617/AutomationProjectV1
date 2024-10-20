package JavaMethods;

public class Car {
    String colour = "red";
    Boolean isBeltOn = true;
    Boolean IsBeltOff = false;
    private Object komunikatPasyNiezapmiete;

    void breaking() {
        System.out.println("Car is breaking");
    }

    void driving() {
        System.out.println("Car is breaking");
    }

    boolean changeColour(String wantedColour) {
        return wantedColour == "Black";
    }

    boolean isColourRed(String wantedColour) {
        return wantedColour.equals("Red");
    }


    }


