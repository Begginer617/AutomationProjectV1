package ClassAndObjects;

public class PlanetarySystems {
    private String starName = "sun";
    private String starType = "yellow dwarf";
    private int numberOfPlanets = 8;

    // Metody dostępowe (gettery)
    public String getStarType() {
        return starType;
    }

    public String getStarName() {
        return starName;
    }

    public int getNumberOfPlanets() {
        return numberOfPlanets;
    }

    // Metody modyfikujące (settery)
    public void setNumberOfPlanets(int number) {
        numberOfPlanets = number;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public void setStarType(String starType) {
        this.starType = starType;
    }

    // Inne metody
    public void printNumberOfPlanets() {
        System.out.println("Number of planets: " + numberOfPlanets);
    }
}