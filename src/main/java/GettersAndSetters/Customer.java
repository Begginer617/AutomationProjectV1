package GettersAndSetters;

public class Customer {

    private String name;
    private String lastName;
    private int age;
    private Address address;

    // Getter for Address
    public Address getAddress() {
        return address;
    }

    // Setter for Address with deep copy
    public void setAddress(Address addressParameter) {
        this.address = copy(addressParameter);
    }

    // Private method to create a deep copy of Address
    private Address copy(Address addressToCopy) {
        return new Address(addressToCopy.getStreet(),
                addressToCopy.getApartment(),
                addressToCopy.getCity(),
                addressToCopy.getPostalCode());
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int ageParameter) throws IllegalArgumentException {
        if (ageParameter < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = ageParameter;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
