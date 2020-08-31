package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.CnnHomePageWebElement.UsText;
import static home.CnnHomePageWebElement.expectedUsText;

public class CnnHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = UsText)//4
    public WebElement us;

    @FindBy(how = How.XPATH, using = expectedUsText)//4
    public WebElement expectedUs;


    public void us() throws InterruptedException {// case # 4
        us.click();
        Thread.sleep(2000);

    }

    public void validate_Us() {
        String actualTopDeal = "US";
        Assert.assertEquals(actualTopDeal, expectedUs.getText());
    }
////////////////////////////////////////////////

}
