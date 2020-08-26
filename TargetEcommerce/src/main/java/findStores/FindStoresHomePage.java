package findStores;

import common.WebAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static findStores.FindStoresHomePageElements.*;

public class FindStoresHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsFindStores) public WebElement findStoresSearch;
    @FindBy(how = How.XPATH,using = webElementsFindStoresText) public WebElement findStoresText;
    @FindBy(how = How.XPATH,using = webElementsQueensStores) public WebElement queensStore;
    @FindBy(how = How.XPATH,using = webElementsQueensStoresText) public WebElement queenStoreText;


    //Test-6
    //Action Method
    public void searchFindStores(){
    findStoresSearch.click();
    }
    //Validate method
    public void ValidateSearchFindStores() throws InterruptedException {
    String actualResult=findStoresText.getText();
    Thread.sleep(5000);
    String expectedResult="Find a store";
    Assert.assertEquals(actualResult,expectedResult,"not match");
    }
    // Test-7
    //Action Method
    public void searchQueensStores() throws InterruptedException {
     Thread.sleep(5000);
      findStoresSearch.click();
      Thread.sleep(5000);
      queensStore.click();
    }
    //Validate method
    public void ValidateSearchQueensStores() throws InterruptedException {
    String actualResult=queenStoreText.getText();
    Thread.sleep(5000);
    String expectedResult="Queens Place";
    Assert.assertEquals(actualResult,expectedResult,"Text don't match");
    }

}
