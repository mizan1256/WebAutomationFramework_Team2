package testforesthills;

import common.WebAPI;
import foresthills.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import redcard.RedCardPage;

public class ForestHillsTest extends WebAPI {

    MainPage mainPage;

    @BeforeMethod
    public void getInit(){
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testAgeActivesButton() throws InterruptedException {
        mainPage.ageActivesButton();
        mainPage.validateAgeActivesButton();
    }
}
