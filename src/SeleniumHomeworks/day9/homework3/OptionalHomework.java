package SeleniumHomeworks.day9.homework3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OptionalHomework {
    /**
     * go to "https://ultimateqa.com/automation/fake-pricing-page/"
     * maximize page
     * validate that "Free Trial" is $0
     * validate that "Basic" is $80
     * validate that "Enterprise" is $900
     **/
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/automation/fake-pricing-page/");

        validatePrice( driver, "0", "0" );
        validatePrice( driver, "1", "80" );
        validatePrice( driver, "2", "900" );
        driver.quit();
    }

    private static void validatePrice(WebDriver driver, String index, String testPrice) {
        WebElement actualFreePriceElement = driver.findElement( By.cssSelector( ".et_pb_pricing_tables_" + index + " span.et_pb_sum" ) );
        ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView(true);", actualFreePriceElement );

        WebDriverWait wait = new WebDriverWait( driver, 15 );
        wait.until( ExpectedConditions.visibilityOfAllElements( actualFreePriceElement ) );

        String actualFreePrice = actualFreePriceElement.getText().replaceAll( "\\$", "" );
        System.out.println( testPrice.equals( actualFreePrice ) ? "Success!" : "Failure!" );
    }
}