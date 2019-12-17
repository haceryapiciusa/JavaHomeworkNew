package SeleniumHomework.day3;
// https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// Check the Multiple Checkbox and check the button message
// When you check all the checkboxes, button message will change to 'Uncheck All'
// When you uncheck at least one checkbox, button message will change to 'Check All'

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-checkbox-demo.html" );

        WebElement check = driver.findElement(By.id("check1"));
        check.click();


//        List<WebElement> option = driver.findElements( By.className( "cb1-element" ) );
//
//        for(WebElement options : option) {
//            options.click();
//        }
        Thread.sleep(3000);

        WebElement uncheck = driver.findElement(By.id("check1"));
        uncheck.click();

        Thread.sleep(4000);
        driver.quit();

    }
}
