package SeleniumHomeworks.day9.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     */
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();

        String path = "file:///" + System.getProperty( "user.dir" ) + "/src/SeleniumHomeworks/day9/homework1/SignUpForm.html";
        driver.get( path );
        driver.findElement( By.name( "username" ) ).sendKeys( "name" );
        driver.findElement( By.name( "password" ) ).sendKeys( "password" );
        driver.findElement( By.name( "password_repeat" ) ).sendKeys( "password" );
        driver.findElement( By.name( "address" ) ).sendKeys( "7514 Riverview Rd.\n" + "Sheboygan, WI 53081" );
        driver.findElement( By.cssSelector( "input[type='radio'][value='male']" ) ).click();
        Select plan = new Select( driver.findElement( By.name( "plan" ) ) );
        plan.selectByIndex( plan.getOptions().size() - 1 ); //selects last option
        driver.findElement( By.name( "agreement" ) ).click();
//        driver.quit();
    }
}
