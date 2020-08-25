package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    HomePage myHomePage;

    @BeforeMethod
    public void getInIt(){
        myHomePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testingSearchBoxIsDisplayed() throws InterruptedException {
        myHomePage.searchBoxIsDisplayed();
    }

    @Test
    public void testingSearchBoxIsClickable() throws InterruptedException {
        myHomePage.searchBoxIsClickable("candle");
    }

}
