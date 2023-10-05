package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("bumbs");


        ArrayList<Customer> Customers = new ArrayList<Customer>();

        Customers.add(new Customer("Jens", "Brain", "JensBrianTheThird"));

        printCustomers(Customers);
    }

    static void printCustomers(ArrayList<Customer> CustomersArray){
        for (Customer Budiaudua : CustomersArray){
            System.out.println(Budiaudua);
        }
    }
}
