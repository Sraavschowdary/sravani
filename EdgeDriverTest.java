import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EdgeDriverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("Selenium WebDriver");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='btnK']"))
        );
        searchButton.click();

        WebElement resultsStats = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#result-stats"))
        );

        if (resultsStats.isDisplayed()) {
            System.out.println("Element is displayed");
        }

        driver.quit();
    }
}
