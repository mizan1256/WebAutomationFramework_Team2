package cnnhometest;

import cnnhome.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends WebAPI {

    HomePage myHomePage;

    @BeforeMethod
    public void getInIt(){
        myHomePage = PageFactory.initElements(driver,HomePage.class);
    }


}
