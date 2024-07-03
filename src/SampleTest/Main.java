package SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        BillPaymentServicePage billPaymentServicePage = new BillPaymentServicePage(driver);
        LandingPage landingPage = new LandingPage(driver);

        //Register New User
        landingPage.registerNewUser();

        //Pay Bill
        billPaymentServicePage.sendPayment();
    }
}
