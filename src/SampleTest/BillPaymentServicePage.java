package SampleTest;

import org.openqa.selenium.WebDriver;

public class BillPaymentServicePage {
    WebDriver driver;
    BillPaymentServicePageElements elements = new BillPaymentServicePageElements();
    CustomerData data = new CustomerData();

    BillPaymentServicePage(WebDriver driver){
        this.driver = driver;
    }

    void sendPayment(){
        try {
            driver.findElement(elements.billPayBtn).click();
            driver.findElement(elements.payeeName).sendKeys(data.firstName + " " + data.lastName);
            driver.findElement(elements.payeeAddress).sendKeys(data.street);
            driver.findElement(elements.payeeAddressCity).sendKeys(data.city);
            driver.findElement(elements.payeeAddressState).sendKeys(data.state);
            driver.findElement(elements.payeeZipCode).sendKeys(data.zipCode);
            driver.findElement(elements.payeePhoneNumber).sendKeys(data.phoneNum);
            driver.findElement(elements.payeeAccountNum).sendKeys(data.accountNum);
            driver.findElement(elements.verifyAccountNum).sendKeys(data.accountNum);
            driver.findElement(elements.amount).sendKeys("20");
            driver.findElement(elements.pay).click();
        }finally{
                driver.close();
        }
    }
}
