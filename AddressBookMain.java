public class AddressBookMain {
    public static void main(String[] args) {
        ContactDetails contactDetails = new ContactDetails();

        //setting the value of contact details
        contactDetails.setfName("Pawan");
        contactDetails.setlName("Kumar");
        contactDetails.setEmailId("pk.soft29@gmail.com");
        contactDetails.setPhoneNumber("91 8083373213");
        contactDetails.setAddress("Rampur");
        contactDetails.setZip(804426);
        contactDetails.setCity("Arwal");
        contactDetails.setState("Bihar");

        System.out.println("Details of Person" +contactDetails);
    }
}
