package testsWithoutPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoFirstTestngTest {

    WebDriver driver;

    // This was very simple first test where we did not use setup() method and did not use page object model

    @Test
    public void test1 (){
	// write your code here
        System.setProperty("webdriver.chrome.driver" ,  "/Users/lovely.munjal/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi.herokuapp.com");

        Select category = new Select(driver.findElement(By.id("taxon")));
        category.selectByVisibleText("Brands");
        // we can select by index and value also as shown below:
//        category.selectByIndex(2);
//        category.selectByValue("5");

        Assert.assertEquals(driver.getTitle(),"Spree Demo Site");
        driver.close();
    }

    @Test
    public void test2 (){
        System.setProperty("webdriver.chrome.driver" ,  "/Users/lovely.munjal/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi.herokuapp.com");

        WebElement bagCategory = driver.findElement(By.linkText("Bags"));
        bagCategory.click();

        WebElement secondBag = driver.findElement(By.cssSelector("[alt='Ruby on Rails Bag']"));
        Assert.assertEquals(secondBag.getText(),"Ruby on Rails Bag");
        driver.close();
    }
}