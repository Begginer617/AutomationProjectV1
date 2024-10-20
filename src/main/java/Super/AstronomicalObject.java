package Super;

public abstract class AstronomicalObject {

    private int orbitalPeriodDays;
    private float radius;
    private String name;


    public AstronomicalObject(String name) {
        this.name = name;
    }

    public AstronomicalObject(String name,int orbitalPeriodDays, float radius ) {
        this.name = name;
        this.orbitalPeriodDays = orbitalPeriodDays;
        this.radius = radius;

    }
    public AstronomicalObject(){

    }

    public int getOrbitalPeriodDays() {
        return orbitalPeriodDays;
    }

    public int getOrbitalPeriod() {
        return getOrbitalPeriod();
    }
}
