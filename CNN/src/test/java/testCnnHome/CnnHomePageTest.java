package testCnnHome;

import cnnhome.CnnHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHomePageTest extends WebAPI {
    CnnHomePage cnnHomePage;
    @BeforeMethod
    public void getInit()
    { cnnHomePage= PageFactory.initElements(driver,CnnHomePage.class);
    }
    @Test
    public void testCheckCnnLogo() throws InterruptedException {
      cnnHomePage.checkUSButton();
      cnnHomePage.validateUSButton();
    }
    @Test
    public void testDisplayCnnLogo() throws InterruptedException {
     cnnHomePage.displayCnnLogo();
     cnnHomePage.validateDisplayCnnLogo();
    }


}
