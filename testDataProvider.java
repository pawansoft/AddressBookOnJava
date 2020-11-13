import java.util.HashMap;

public class testDataProvider {

    public HashMap sampleData()
    {
        ContactDetails contactDetails1 = new ContactDetails("pawan", "kumar", "Rampur", "jehanadad", "bihar", "804426", "8083373213","pk.soft29@gmail.com");
        ContactDetails contactDetails2 = new ContactDetails("pankaj", "kumar", "Rampur", "jehanadad", "bihar", "804427", "8083373214","Pankaj@gmail.com");
        ContactDetails contactDetails3 = new ContactDetails("ankit", "kumar", "rajaBazar", "arwal", "bihar", "804429", "8083373219","Ankit@gmail.com");
        ContactDetails contactDetails4 = new ContactDetails("ayush", "gupta", "kothrud", "pune", "maharastra",  "411038", "966161955", "Aysuh@gmail.com");
        ContactDetails contactDetails5 = new ContactDetails("mohit", "raj", "kalyaniNagar", "pune", "maharastra",  "411031", "966161988", "Mohit@gmail.com");
        ContactDetails contactDetails6 = new ContactDetails("gyan", "gaurav", "Noida", "delhi", "delhi",  "500121", "966161999", "ggyan@gmail.com");

        HashMap <String, ContactDetails> testData = new HashMap<String, ContactDetails>();
        testData.put(contactDetails1.getEmailId(), contactDetails1);
        testData.put(contactDetails2.getEmailId(), contactDetails2);
        testData.put(contactDetails3.getEmailId(), contactDetails3);
        testData.put(contactDetails4.getEmailId(), contactDetails4);
        testData.put(contactDetails5.getEmailId(), contactDetails5);
        testData.put(contactDetails6.getEmailId(), contactDetails6);

        return testData;
    }
}
