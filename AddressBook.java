import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    //Declaring HasMap to store all contact details
    HashMap<String, ContactDetails> contactList = new HashMap<String, ContactDetails>();
    Scanner scanner = new Scanner(System.in);

    public ContactDetails getDetailsFromUser()
    {
        System.out.println("Enter first name : ");
        String fName = scanner.next();
        System.out.println("Enter last name : ");
        String lName = scanner.next();
        System.out.println("Enter email id : ");
        String email = scanner.next();
        System.out.println("Enter phone number : ");
        String phone = scanner.next();
        System.out.println("Enter address : ");
        String address = scanner.next();
        System.out.println("Enter zip code : ");
        int zip = scanner.nextInt();
        System.out.println("Enter city : ");
        String city = scanner.next();
        System.out.println("Enter state : ");
        String state = scanner.next();

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setfName(fName);
        contactDetails.setlName(lName);
        contactDetails.setEmailId(email);
        contactDetails.setPhoneNumber(phone);
        contactDetails.setAddress(address);
        contactDetails.setZip(zip);
        contactDetails.setCity(city);
        contactDetails.setState(state);

        return contactDetails;
    }

    public void addNewContact() {
        ContactDetails contactDetails = getDetailsFromUser();
        contactList.put(contactDetails.getEmailId(), contactDetails);
    }

    public void updateContactDetail(String emailId){
        ContactDetails contactDetails = contactList.get(emailId);

        System.out.println("1 : For first name \n" +
                "2 : For Last Name \n" +
                "3 : For email id \n" +
                "4 : For phone number \n" +
                "5 : For address \n" +
                "6 : For zip code \n" +
                "7 : For city \n" +
                "8 : For state");
        int selectOption = scanner.nextInt();

        switch (selectOption){
            case 1:
                System.out.println("Enter the first name : ");
                String fName = scanner.next();
                contactDetails.setfName(fName);
                break;
            case 2:
                System.out.println("Enter the last name : ");
                String lName = scanner.next();
                contactDetails.setlName(lName);
                break;
            case 3:
                System.out.println("Enter email id : ");
                String email = scanner.next();
                contactDetails.setEmailId(emailId);
                break;
            case 4:
                System.out.println("Enter phone number : ");
                String phone = scanner.next();
                contactDetails.setPhoneNumber(phone);
                break;
            case 5:
                System.out.println("Enter address : ");
                String address = scanner.next();
                contactDetails.setAddress(address);
                break;
            case 6:
                System.out.println("Enter zip code : ");
                int zipCode = scanner.nextInt();
                contactDetails.setZip(zipCode);
                break;
            case 7:
                System.out.println("Enter City");
                String city = scanner.next();
                contactDetails.setCity(city);
                break;
            case 8:
                System.out.println("Enter state");
                String state = scanner.next();
                contactDetails.setState(state);
                break;
            default:
                System.out.println("please select valid option");
                break;
        }
    }

    //This method is used to print the contact details
    public void printAllDetails()
    {
        System.out.println(contactList);
    }

    // This function will be used to ask the user choice
    public void getUserChoice()
    {
        while (true){
            System.out.println("1: For add new contact \n" +
                    "2: For update existing contact \n" +
                    "3: For print contact list \n" +
                    "0: For terminate the program");
            int selectedOption = scanner.nextInt();
            switch (selectedOption){
                case 1:
                    addNewContact();
                    break;
                case 2:
                    System.out.println("Enter email id to update");
                    String email = scanner.next();
                    updateContactDetail(email);
                    break;
                case 3:
                    printAllDetails();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select valid option");
                    break;
            }

        }

    }
}
