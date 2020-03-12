package testsWithoutPom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/lovely.munjal/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com");
    }

    @DataProvider(name = "sample-data-provider")
    public Object[][] createData1() {
        return new Object[][] {{ "Bags"},{ "Mugs"}};
    }

    // Below Test will run 2 times as data provider has an array of size 2
    // 1st time it will search Bags and then 2nd time it will search Mugs
    @Test(dataProvider = "sample-data-provider")
    public void verifySearch(String product) {
        driver.findElement(By.id("keywords")).sendKeys(product);
        System.out.println("Searched product:-> " + product );
    }
}