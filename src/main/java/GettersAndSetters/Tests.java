package GettersAndSetters;

import org.junit.Test;

public class Tests {
    @Test
    public void testGettersAndSetters() {
        Customer customer = new Customer();
        int age = 15;
        customer.setAge(age);
        System.out.println("Age is " + customer.getAge());
    }

    @Test
    public void testGettersAndSettersObjects() {
        Customer customer = new Customer();
        Address address = new Address("Bobolowa", "15/22", "Warsaw");
        address.setStreet( "zielona" );
        customer.setAddress(address);
        Address address2 = customer.getAddress();
        System.out.println("Address: " + customer.getAddress().getStreet() + " " + customer.getAddress().getApartment() + " , " + customer.getAddress().getCity());
        address2.setCity("Gdansk");
        System.out.println("Address: " + customer.getAddress().getStreet() + " " + customer.getAddress().getApartment() + " , " + customer.getAddress().getCity());

    }
}
