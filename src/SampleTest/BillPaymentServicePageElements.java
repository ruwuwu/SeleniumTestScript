package SampleTest;

import org.openqa.selenium.By;

public class BillPaymentServicePageElements {

    By billPayBtn = By.linkText("Bill Pay");
    By payeeName =  By.xpath("//input[contains(@name,'payee.name')]");
    By payeeAddress = By.xpath("//input[contains(@name,'payee.address.street')]");
    By payeeAddressCity = By.xpath("//input[contains(@name,'payee.address.city')]");
    By payeeAddressState = By.xpath("//input[contains(@name,'payee.address.state')]");
    By payeeZipCode = By.xpath("//input[contains(@name,'payee.address.zipCode')]");
    By payeePhoneNumber = By.xpath("//input[contains(@name,'payee.phoneNumber')]");
    By payeeAccountNum = By.xpath("//input[contains(@name,'payee.accountNumber')]");
    By verifyAccountNum = By.xpath("//input[contains(@name,'verifyAccount')]");
    By amount = By.xpath("//input[contains(@name,'amount')]");
    By pay = By.xpath("//input[contains(@type,'button')]");



}
