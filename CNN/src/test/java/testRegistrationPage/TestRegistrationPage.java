package testRegistrationPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.CnnRegistrationPage;

public class TestRegistrationPage extends WebAPI {
    CnnRegistrationPage cnnRegistrationPage;
    @BeforeMethod
    public void getInit(){
        cnnRegistrationPage= PageFactory.initElements(driver,CnnRegistrationPage.class);
    }
    @Test
    public void testCheckSignUpButton() throws InterruptedException {
        cnnRegistrationPage.checkSignUpButton();
        cnnRegistrationPage.validateCheckSignUpButton();
    }
    @Test
    public void testCheckLogInButton() throws InterruptedException {
        cnnRegistrationPage.checkLogInButton();
        cnnRegistrationPage.validateCheckLogInButton();
    }
}
