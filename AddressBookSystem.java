package addressBook;

import java.util.*;

public class AddressBookSystem {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Person> personList = null;
    private Map<String,ArrayList<Person>> contactBook = new HashMap<>();
    public String city;

    /*
     * UC1 Taking User Input for person detail
     * UC2 this method adds object person and its element to ArrayList
     */
    private void addNewContact() {
        System.out.println("Which City You Want To Add");
        city = sc.next();
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

        if (contactBook.containsKey(city)) {
            contactBook.get(city).add(person);
        }
        else {
            personList = new ArrayList<>();
            personList.add(person);
            contactBook.put(city, personList);
        }
    }
    /*
     * UC3
     * Ability to edit existing contact of person using there first name
     */
    private void editContact(){
        System.out.println("Enter City to which you want edit person details");
        city=sc.next();
        String enterName;
        System.out.println("Enter First Name To edit Your Contact Details");
        enterName=sc.next();
        for(int i=0;i <= contactBook.get(city).size();i++){
            if(contactBook.get(city).get(i).equals(enterName));
            {
                System.out.println("Person Found, Enter option that you want to edit");
                System.out.println("Enter\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Pin Code\n7.Phone Number\n8.EmailId");
                int check;
                check=sc.nextInt();
                switch (check){
                    case 1:
                        System.out.println("Enter new first name");
                        contactBook.get(city).get(i).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter new last name");
                        contactBook.get(city).get(i).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        contactBook.get(city).get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter new city");
                        contactBook.get(city).get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter new state");
                        contactBook.get(city).get(i).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter new zip");
                        contactBook.get(city).get(i).setPinCode(sc.next());
                        break;
                    case 7:
                        System.out.println("Enter new phone number");
                        contactBook.get(city).get(i).setPhoneNumber(sc.next());
                        break;
                    case 8:
                        System.out.println("Enter new email");
                        contactBook.get(city).get(i).setEmailId(sc.next());
                        break;
                    default :
                        System.out.println("Invalid Entry");
                }
            }
        }
    }
    /**
     * UC4
     * This method removes person from list using  first name.
     */
    private void deletePerson (){
        String enteredName;
        System.out.println("Enter First name of contact to delete it ");
        enteredName=sc.next();
        for(int i=0;i<contactBook.get(city).size();i++)
        {
            if(contactBook.get(city).get(i).getFirstName().equals(enteredName))
                contactBook.get(city).remove(i);
        }
        System.out.println("Person removed from Address book");
    }
    /*
     *UC5
     * Added show method to see multiple person contact list
     */
    public void showPerson(){
        System.out.println(contactBook);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookSystem contact = new AddressBookSystem();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Enter your choice \n1.Add New Contact\n2.Edit Contact\n3.Delete Contact\n4.Show Person Contact\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contact.addNewContact();
                    break;
                case 2:
                    contact.editContact();
                    break;
                case 3:
                    contact.deletePerson();
                    break;
                case 4:
                    contact.showPerson();
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}