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
    public void testing_SearchBoxIsDisplayed() throws InterruptedException {//1
        myHomePage.searchBoxIsDisplayed();
        myHomePage.validating_SearchBoxIsDisplayed();
    }

    @Test
    public void testing_SearchBoxIsClickable() throws InterruptedException {//2
        myHomePage.searchBoxIsClickable("candle");
        myHomePage.validating_SearchBoxIsClickable();
    }
    @Test
    public void testing_validating_SearchingForProduct_Method()  throws InterruptedException {//3
        myHomePage.searchingForProduct_Method("headphones");
        myHomePage.validating_SearchingForProduct_Method();
    }
    @Test//4
    public void testing_dealsTarget() throws InterruptedException {//4
        myHomePage.dealsTarget();
        myHomePage.validate_DealsTarget();
    }
    @Test//5
    public void testing_Validate_sameDayDeliveryTarget_Method() throws InterruptedException {//5
        myHomePage.sameDayDeliveryTarget_Method();
        myHomePage.validate_sameDayDeliveryTarget_Method();
    }
    @Test//6
    public void testing_validate_heartLogoFavorite_Method() throws InterruptedException {//6
        myHomePage.heartLogoFavorite_Method();
        myHomePage.validate_heartLogoFavorite_Method();
    }
    @Test//7
    public void testing_validate_cartLogo_method() throws InterruptedException {//7
        myHomePage.cartLogo_method();
        myHomePage.validate_cartLogo_method();
    }
    @Test//# 9
    public void testing_signInMethod() throws InterruptedException {//...9
        myHomePage.signInMethod();
       myHomePage.validate_cartLogo_method();
    }
    @Test//#10
    public void testing_ValidateCreateAccountMethod() throws InterruptedException {
        myHomePage.createAccountMethod();
        myHomePage.validateCreateAccountMethod();
    }
    @Test//#11
    public void testing_ValidateCreateAccountMethod_NegativeTest() throws InterruptedException {
        myHomePage.createAccountMethod_NegativeTest();
        myHomePage.validateCreateAccountMethod_NegativeTest();
    }



}



