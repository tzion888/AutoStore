import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Access to Google Chrome
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Tzion and Hadas\\Downloads\\chromedriver.exe");

        //Driver settings
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com/index.php");
        //Sign In
        WebElement signIn = driver.findElement(By.className("login"));
        signIn.click();

        String myEmail = "Tzions888@Gmail.com";
        String myPassword = "12345";

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(myEmail);
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys(myPassword);
        WebElement submitBtn = driver.findElement(By.id("SubmitLogin"));
        submitBtn.click();

        //orders
        WebElement dresses = driver.findElement(new By.ByClassName("sf-with-ul"));
        dresses.click();
        WebElement firstProductInCart = driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
        firstProductInCart.click();
        WebElement addToCartBtn = driver.findElement(By.id("add_to_cart"));
        addToCartBtn.click();
        WebElement continueInShopping = driver.findElement(By.xpath("//span[contains(@title, 'Continue shopping')]"));
        Thread.sleep(5000);
        continueInShopping.click();
        WebElement dressesAgain = driver.findElement(new By.ByClassName("sf-with-ul"));
        dressesAgain.click();
        WebElement secondProductInCart = driver.findElement(By.linkText("Printed Dress"));
        secondProductInCart.click();
        WebElement addToCartBtnAgain = driver.findElement(By.id("add_to_cart"));
        addToCartBtnAgain.click();

        //payment process
        WebElement checkout = driver.findElement(By.xpath("//a[contains(@title, 'Proceed to checkout')]"));
        Thread.sleep(5000);
        checkout.click();
        WebElement checkoutAgain = driver.findElement(By.linkText("Proceed to checkout"));
        checkoutAgain.click();
        Thread.sleep(2000);
        WebElement checkoutAddress = driver.findElement(By.xpath("//button[contains(@name, 'processAddress')]"));
        checkoutAddress.click();
        Thread.sleep(5000);
        WebElement readTerms = driver.findElement(By.className("iframe"));
        readTerms.click();
        Thread.sleep(7000);
        WebElement closeWindow = driver.findElement(By.xpath("//a[contains(@title, 'Close')]"));
        closeWindow.click();
        WebElement checker = driver.findElement(By.id("uniform-cgv"));
        checker.click();
        WebElement checkoutShipping = driver.findElement(By.xpath("//button[contains(@name, 'processCarrier')]"));
        checkoutShipping.click();
        WebElement payment = driver.findElement(By.className("bankwire"));
        payment.click();
        WebElement confirmOrder = driver.findElement(By.xpath("//button[contains(@class, 'button btn btn-default button-medium')]"));
        confirmOrder.click();

    }


// A function to create a new user, I didn't use it because I thought it was a mistake to create many users on the site while running the code.
//In addition, the site asked not to fill it with spam.
//I left the code in a comment to be available in case you want to see the code.


//    public void createNewAccount (){
//
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\Tzion and Hadas\\Downloads\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://automationpractice.com/index.php");
//        WebElement signIn = driver.findElement(By.className("login"));
//        signIn.click();
//
//        String firstName= "Tzion";
//        String lastName= "Shiber";
//        String myEmail = "Tzion@Gmail.com";
//        String myPassword = "12345";
//        String address = "Alabama 57064";
//        String city = "Ashdod";
//        String zip = "(605) 498-2415";
//        String mobilePhone= "123456789";
//
//
//        WebElement emailInput = driver.findElement(By.id("email_create"));
//        emailInput.sendKeys(myEmail);
//        WebElement createAnAccount = driver.findElement(By.id("SubmitCreate"));
//        createAnAccount.click();
//
//
//        WebElement emailInputToCreateAccount = driver.findElement(By.id("email_create"));
//        emailInput.sendKeys(myEmail);
//        WebElement createAnAccountBtn = driver.findElement(By.id("SubmitCreate"));
//        createAnAccount.click();
//        WebElement gender= driver.findElement(By.xpath("//div[contains(@id, 'uniform-id_gender1')]"));
//        gender.click();
//        WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
//        firstNameInput.sendKeys(firstName);
//        WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
//        lastNameInput.sendKeys(lastName);
//        WebElement passwordInput = driver.findElement(By.id("passwd"));
//        passwordInput.sendKeys(myPassword);
//        WebElement firstNameAddress = driver.findElement(By.id("firstname"));
//        firstNameAddress.sendKeys(firstName);
//        WebElement lastNameAddress = driver.findElement(By.id("lastname"));
//        lastNameAddress.sendKeys(lastName);
//        WebElement addressInput = driver.findElement(By.id("address1"));
//        addressInput.sendKeys(address);
//        WebElement cityAddress = driver.findElement(By.id("city"));
//        cityAddress.sendKeys(city);
//        WebElement mobileInput = driver.findElement(By.id("phone_mobile"));
//        mobileInput.sendKeys(mobilePhone);
//        WebElement alias = driver.findElement(By.id("alias"));
//        alias.sendKeys(address);
//        WebElement registerBtn = driver.findElement(By.id("submitAccount"));
//        registerBtn.click();
//
//    }

}