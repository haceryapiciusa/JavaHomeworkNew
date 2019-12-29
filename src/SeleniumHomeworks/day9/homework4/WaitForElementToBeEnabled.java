package SeleniumHomeworks.day9.homework4;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToBeEnabled {
    /**
     * Open "http://the-internet.herokuapp.com/dynamic_controls"
     *
     * click on "Enable" button
     * wait for <input> of type="text" to be enabled within 5 seconds
     * if <input> of type="text" is enabled print success
     * verify that <p> with id="message"  is visible and has text "It's enabled!"
     *
     * click on "Disable" button
     * wait for <input> of type="text" to be disabled within 5 seconds
     * if <input> of type="text" is disabled print success
     * verify that <p> with id="message"  is visible and has text "It's disabled!"
     *
     **/

    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_controls" );

        WebDriverWait wait = new WebDriverWait( driver, 5 );
        driver.findElement( By.cssSelector( "#input-example input[type='text'][disabled]" ) ); //check the element is present

        driver.findElement( By.xpath( "//button[contains(text(), 'Enable')]" ) ).click();

        try {
            wait.until( ExpectedConditions.invisibilityOfElementLocated( By.cssSelector( "#input-example input[type='text'][disabled]")) );
            System.out.println( "Success!" );
        } catch(TimeoutException e) {
            System.out.println( "Failure, textInput was not enabled in 5 seconds!" );
        }

        try {
            WebElement message = wait.until( ExpectedConditions.presenceOfElementLocated( By.xpath( "//p[@id='message']" ) ) );
            System.out.println( message.getText().equals( "It's enabled!" ) ? "Success!" : "Failure");
        } catch(TimeoutException e) {
            System.out.println( "Failure, message was not 'It's enabled!' in 5 seconds!" );
        }

        driver.findElement( By.xpath( "//button[contains(text(), 'Disable')]" ) ).click();

        try {
            wait.until( ExpectedConditions.visibilityOfElementLocated( By.cssSelector( "#input-example input[type='text'][disabled]")));
            System.out.println( "Success!" );
        } catch(TimeoutException e) {
            System.out.println( "Failure, textInput was not disabled in 5 seconds!" );
        }

        try {
            WebElement message = wait.until( ExpectedConditions.presenceOfElementLocated( By.xpath( "//p[@id='message']" ) ) );
            System.out.println( message.getText().equals( "It's disabled!" ) ? "Success!" : "Failure");
        } catch(TimeoutException e) {
            System.out.println( "Failure, message was not 'It's disabled!' in 5 seconds!" );
        }

        driver.quit();
    }
}
