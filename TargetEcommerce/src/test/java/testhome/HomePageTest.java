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
    public void testing_SearchBoxIsDisplayed() throws InterruptedException {
        myHomePage.searchBoxIsDisplayed();
        myHomePage.validating_SearchBoxIsDisplayed();
    }

    @Test
    public void testing_SearchBoxIsClickable() throws InterruptedException {
        myHomePage.searchBoxIsClickable("candle");
        myHomePage.validating_SearchBoxIsClickable();
    }
    @Test
    public void testing_validating_SearchingForProduct_Method()  throws InterruptedException {
        myHomePage.searchingForProduct_Method("headphones");
        myHomePage.validating_SearchingForProduct_Method();
    }
    @Test
    public void testing_dealsTarget() throws InterruptedException {
        myHomePage.dealsTarget();
    }

}
