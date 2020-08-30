package testhome;

import common.WebAPI;
import cnnhome.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void testSearchBoxIsDisplayed() throws InterruptedException {
        homePage.searchBoxIsDisplayed();
        homePage.validateSearchBoxDisplayed();
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        homePage.searchBoxCheck("samsung");
        homePage.validateSearchText();
    }
    @Test
    public void testSearchNewArrivals() throws InterruptedException {
        homePage.searchBoxCheck("new arrivals");
        homePage.validateSearchNewArrival();
    }
    @Test
    public void testSearchCartDisplayed() throws InterruptedException {
        homePage.searchCartIsDisplayed();
        homePage.validateSearchBoxDisplayed();
    }
    @Test
    public void testGetHomePageLogo() throws InterruptedException {
        homePage.getHomePageLogo();
        homePage.validateGetHomePageLogo();
    }
    @Test
    public void testClickCollegeButton() throws InterruptedException {
        homePage.clickCollegeButton();
        homePage.validateClickCollegeButton();
    }
    @Test
    public void testClickMensButton() throws InterruptedException {
        homePage.clickMensButton();
        homePage.validateClickMensButton();
    }
    @Test
    public void testClickSameDayDelivery() throws InterruptedException {
        homePage.clickSameDayDelivery();
        homePage.validateClickSameDayDelivery();
    }
    @Test
    public void testCheckCreateAccount() throws InterruptedException {
        homePage.checkCreateAccount();
        homePage.validateCheckCreateAccount();
    }

}
