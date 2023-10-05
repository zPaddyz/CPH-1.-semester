package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;

    public Customer(String _firstName, String _lastName, String _username){
        firstName = _firstName;
        lastName = _lastName;
        username = _username;

    }

    @Override
    public String toString() {
        return "Customer name is: " + firstName + " " + lastName + ". \nTheir Username is: " + username + " and they have the id: " + id;
    }
}
