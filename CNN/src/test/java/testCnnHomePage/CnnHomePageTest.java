package testCnnHomePage;

import common.WebAPI;
import home.CnnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHomePageTest extends WebAPI {
    CnnHomePage cnnHomePage;
    @BeforeMethod
    public void getInIt(){
        cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
    }
@Test
    public void testCnnLogoIsDisplay(){
        cnnHomePage.cnnLogoIsDisplay();
    }

}
