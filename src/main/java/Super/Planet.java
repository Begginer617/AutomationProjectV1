package Super;

public class Planet extends AstronomicalObject {
    private int numberOfMoons;
    private int mass;
    private float rotationPeriodDays;
    private boolean hasRings;


        // twrzymy obiekt typu Planet i korzystamy z konstruktora nadrzednego w innej klasie
    public Planet(String name){
        super(name);
    }

    public Planet(String name,int orbitalPeriodDays, float radius, boolean hasRings ) {
        super( name , orbitalPeriodDays , radius );
        this.hasRings = hasRings;

    }
        public Planet(int mass){
        this.mass= mass;
        }

    @Override
    public int getOrbitalPeriod() {
        return super.getOrbitalPeriod()/365;
    }
}

