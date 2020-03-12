package testsWithPom;

import org.testng.annotations.Test;
import pages.HomePage_2;

public class AlertsTest extends Base {

    HomePage_2 obj;

    @Test
    public void verifylogin (){
        obj = new HomePage_2(driver);
        obj.clickJsConfirmButton();
//        obj.clickJsAlertButton();
//        obj.acceptAlert();
        obj.dismissAlert();
    }

    @Test
    public void verifyWindowHandle (){
        obj = new HomePage_2(driver);
        obj.clickonClickHere();
    }
}