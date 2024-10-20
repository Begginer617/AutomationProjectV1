package GettersAndSetters;

public class Address {

    private String street;
    private final String apartmentNumber;
    private String city;
    private String postalCode;

    // Constructor with all parameters except postalCode
    public Address(String street, String apartmentNumber, String city) {
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
    }

    // Constructor with all parameters including postalCode
    public Address(String street, String apartmentNumber, String city, String postalCode) {
        this(street, apartmentNumber, city);  // Call the other constructor
        this.postalCode = postalCode;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getApartment() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Setters
    public void setCity(String cityName) {
        this.city = cityName;
    }

    public void setStreet(String streetName) {
        this.street = streetName;
    }

    public void setApartment(String apartmentNumber) {
    }


}