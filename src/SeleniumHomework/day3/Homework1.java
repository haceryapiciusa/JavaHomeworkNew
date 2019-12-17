package SeleniumHomework.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// Check the Single Checkbox and check the message bellow it
public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-checkbox-demo.html" );
        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
        checkbox.click();

        WebElement succes = driver.findElement(By.id("txtAge"));
        String message = succes.getText();
        System.out.println(message);
        Thread.sleep(5000);
        driver.quit();
    }
}
