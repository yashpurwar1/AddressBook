package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
    static Scanner sc = new Scanner(System.in);
    private List<Person> personList = new ArrayList<>();
    /*
     * UC1 Taking User Input for person details
     */
    private void addNewContact() {
        Person person = new Person();
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter last Name");
        String lastName = sc.next();
        System.out.println("Enter the Address");
        String address = sc.next();
        System.out.println("Enter the City");
        String city = sc.next();
        System.out.println("Enter the State");
        String state = sc.next();
        System.out.println("Enter the PinCode");
        String pinCode = sc.next();
        System.out.println("Enter the Phone Number");
        String phoneNumber = sc.next();
        System.out.println("Enter the Email");
        String emailId = sc.next();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookSystem Contact = new AddressBookSystem();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Enter your choice \n1.Add New Contact\n2.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Contact.addNewContact();
                    break;
                case 2:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
}
