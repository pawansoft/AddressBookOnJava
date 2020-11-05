import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, AddressBook> addressBookList = new HashMap<String, AddressBook>();

        while (true) {
            System.out.println("1: for create new AddressBook \n" +
                    "2: for access existing AddressBook \n" +
                    "0: for terminate the program");
            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.println("Enter AddressBook Name : ");
                    String addressBookName = scanner.next();

                    if (addressBookList.containsKey(addressBookName)) {
                        System.out.println("This addressBook already exist");
                    }else {
                        AddressBook addressBooName = new AddressBook();
                        addressBookList.put(addressBookName, addressBooName);
                    }
                    break;
                case 2:
                    System.out.println(addressBookList.keySet() + "\n" +
                            "Choose any of AddressBook");
                    String selectedAddressBook = scanner.next();

                    if (!addressBookList.containsKey(selectedAddressBook)){
                        System.out.println("Please provide valid AddressBook name");
                    }else {
                        AddressBook searchedAddressBook = addressBookList.get(selectedAddressBook);
                        searchedAddressBook.getUserChoice();
                    }
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
