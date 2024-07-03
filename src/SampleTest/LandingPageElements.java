package SampleTest;
import org.openqa.selenium.By;

public class LandingPageElements {
    By registerLT = By.linkText("Register");
    By cutomerFirstName = By.xpath("//input[contains(@id,'customer.firstName')]");
    By customerLastName = By.xpath("//input[contains(@id,'customer.lastName')]");
    By customerAddress = By.xpath("//input[contains(@id,'customer.address.street')]");
    By customerAddressCity = By.xpath("//input[contains(@id,'customer.address.city')]");
    By customerAddressState = By.xpath("//input[contains(@id,'customer.address.state')]");
    By customerZipCode = By.xpath("//input[contains(@id,'customer.address.zipCode')]");
    By customerPhoneNumber = By.xpath("//input[contains(@id,'customer.phoneNumber')]");
    By customerSsn = By.xpath("//input[contains(@id,'customer.ssn')]");
    By customerUsername = By.xpath("//input[contains(@id,'customer.username')]");
    By customerPassword = By.xpath("//input[contains(@id,'customer.password')]");
    By customerConfirmPass = By.xpath("//input[contains(@id,'repeatedPassword')]");
    By registerBtn = By.xpath("//input[contains(@value,'Register')]");
}
