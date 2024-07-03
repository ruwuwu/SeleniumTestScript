package SampleTest;

import java.util.UUID;

public class CustomerData {

    public static String generateRandomUUID(int length) {
        String uuid = UUID.randomUUID().toString();
        String uuidWithoutHyphens = uuid.replace("-", "");

        if (length > uuidWithoutHyphens.length()) {
            throw new IllegalArgumentException("Desired length is greater than the length of UUID without hyphens");
        }
        return uuidWithoutHyphens.substring(0, length);
    }

    String firstName = "John Doe";
    String lastName = "Doe";
    String street = "3434 Kovar Road";
    String city = "Marion";
    String state = "Illinois";
    String zipCode = "62959";
    String phoneNum = "508-623-9218";
    String ssn = "12121";
    String userName = "test"+ generateRandomUUID(4);
    String password = "testpass";
    String accountNum = "28512";

}
