package testfindstore;

import common.WebAPI;
import findstores.StorePage;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StorePageTest extends WebAPI {

    StorePage myStorePage;

    @BeforeMethod
    public void getInIt(){
        myStorePage= PageFactory.initElements(driver, StorePage.class);
    }

    @Test
    public void testing_validate_FindStoreByXpath_method() throws InterruptedException {
        myStorePage.findStoreByXpath_method();
        myStorePage.validate_FindStoreByXpath_method();
    }

}
