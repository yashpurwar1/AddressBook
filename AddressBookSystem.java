package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
    static Scanner sc = new Scanner(System.in);
    private List<Person> personList = new ArrayList<>();

     // UC1 Taking User Input for person detail
     // UC2 this method adds object person and its element to ArrayList

    private void addNewContact() {
        Person person = new Person();
        System.out.println("Enter First Name");
        String firstName = sc.next();
        person.setFirstName(firstName);
        System.out.println("Enter last Name");
        String lastName = sc.next();
        person.setLastName(lastName);
        System.out.println("Enter the Address");
        String address = sc.next();
        person.setAddress(address);
        System.out.println("Enter the City");
        String city = sc.next();
        person.setCity(city);
        System.out.println("Enter the State");
        String state = sc.next();
        person.setState(state);
        System.out.println("Enter the PinCode");
        String pinCode = sc.next();
        person.setPinCode(pinCode);
        System.out.println("Enter the Phone Number");
        String phoneNumber = sc.next();
        person.setPhoneNumber(phoneNumber);
        System.out.println("Enter the Email");
        String emailId = sc.next();
        person.setEmailId(emailId);

        personList.add(person);
    }
    /*
     * UC3
     * Ability to edit existing contact of person using there first name
     */
    private void editContact(){
        String enterName;
        System.out.println("Enter First Name To  edit Your Contact Details");
        enterName=sc.next();
        for(int i=0;i <= personList.size();i++){
            if(personList.get(i).getFirstName().equals(enterName));{

                System.out.println("Person Found, Enter option that you want to edit");
                System.out.println("Enter\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Pin Code\n7.Phone Number\n8.EmailId");
                int check;
                check=sc.nextInt();
                switch (check){
                    case 1:
                        System.out.println("Enter new first name");
                        personList.get(i).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter new last name");
                        personList.get(i).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        personList.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter new city");
                        personList.get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter new state");
                        personList.get(i).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter new zip");
                        personList.get(i).setPinCode(sc.next());
                        break;
                    case 7:
                        System.out.println("Enter new phone number");
                        personList.get(i).setPhoneNumber(sc.next());
                        break;
                    case 8:
                        System.out.println("Enter new email");
                        personList.get(i).setEmailId(sc.next());
                        break;
                    default :
                        System.out.println("Invalid Entry");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookSystem Contact = new AddressBookSystem();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Enter your choice \n1.Add New Contact\n2.Edit Contact\n3.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Contact.addNewContact();
                    break;
                case 2:
                    Contact.editContact();
                case 3:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}