package findstores;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static findstores.StorePageWebElement.expected_FindStoreByXpath;
import static findstores.StorePageWebElement.findStoreByXpath;

public class StorePage extends WebAPI {

    @FindBy(how = How.XPATH, using= findStoreByXpath)//8
    public WebElement findStore;

    @FindBy(how = How.XPATH, using= expected_FindStoreByXpath)//8
    public WebElement expectedFindStoreText;

    public void findStoreByXpath_method() throws InterruptedException {// case # 8
        Thread.sleep(3000);
        findStore.click();
        //System.out.println(driver.getTitle());
    }
    public void validate_FindStoreByXpath_method() throws InterruptedException {
        String actualResult=expectedFindStoreText.getText();
        String expectedResult= "Find a store";
        Assert.assertEquals(actualResult,expectedResult,"Test case do not match");
        Thread.sleep(1000);
    }


}
