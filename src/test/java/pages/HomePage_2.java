package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;

// This home page refers to 'http://the-internet.herokuapp.com'
public class HomePage_2 {

    WebDriver driver;

    public HomePage_2(WebDriver driver) {
        this.driver = driver;
    }

    // we can use other type of locators also.
    // used Xpath for learning purpose only
    By jsAlert = By.xpath("//*[text()='Click for JS Alert']");
    By jsConfirm = By.xpath("//*[text()='Click for JS Confirm']");
    By multipleWindows = By.xpath("//*[text()='Multiple Windows']");
    By clickHere = By.xpath("//*[text()='Click Here']");
    By newWindow = By.xpath("//h3");


    public void clickJsAlertButton() {
        driver.findElement(jsAlert).click();
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void clickJsConfirmButton() {
        driver.findElement(jsConfirm).click();
    }

    //Multiple Window code
    public void clickClickHereButton() {
        driver.findElement(multipleWindows).click();
        driver.findElement(clickHere).click();
        Set<String> windows = driver.getWindowHandles();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("No. of windows - " + windows.size());

        for (String str : windows){
            driver.switchTo().window(str);
            System.out.println("Got text - " + driver.findElement(newWindow).getText());
        }
    }
}