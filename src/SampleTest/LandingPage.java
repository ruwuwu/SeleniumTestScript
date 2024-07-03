package SampleTest;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    LandingPageElements element = new LandingPageElements();
    CustomerData customerData = new CustomerData();
    String url = "https://parabank.parasoft.com/";
    WebDriver driver;

    LandingPage(WebDriver driver){
        this.driver = driver;
    }

    void registerNewUser(){
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(element.registerLT).click();
        driver.findElement(element.cutomerFirstName).sendKeys(customerData.firstName);
        driver.findElement(element.customerLastName).sendKeys(customerData.lastName);
        driver.findElement(element.customerAddress).sendKeys(customerData.street);
        driver.findElement(element.customerAddressCity).sendKeys(customerData.city);
        driver.findElement(element.customerAddressState).sendKeys(customerData.state);
        driver.findElement(element.customerZipCode).sendKeys(customerData.zipCode);
        driver.findElement(element.customerPhoneNumber).sendKeys(customerData.phoneNum);
        driver.findElement(element.customerSsn).sendKeys(customerData.ssn);
        driver.findElement(element.customerUsername).sendKeys(customerData.userName);
        driver.findElement(element.customerPassword).sendKeys(customerData.password);
        driver.findElement(element.customerConfirmPass).sendKeys(customerData.password);
        driver.findElement(element.registerBtn).click();
    }
}
