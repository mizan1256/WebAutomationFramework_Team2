package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.sql.SQLOutput;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBoxByXpath)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchLogoButtonByXpath)
    public WebElement searchLogoButton;

    @FindBy(how = How.ID, using = searchForProductById)
    public WebElement searchProduct;
    @FindBy(how = How.XPATH, using = searchForProductByXpath_Actual)
    public WebElement actualText;

//    @FindBy(how = How.XPATH, using = searchForProduct_Expected)
//    public WebElement expectedItemByXpath;

    public void searchBoxIsDisplayed() throws InterruptedException {// case# 1
        searchBox.isDisplayed();
    }

    public void validating_SearchBoxIsDisplayed() throws InterruptedException {
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
        Thread.sleep(2000);
    }

    public void searchBoxIsClickable(String searchItem) throws InterruptedException {// case # 2
        Thread.sleep(2000);
        searchBox.sendKeys("candle");
        Thread.sleep(2000);
        searchLogoButton.click();
    }

    public void validating_SearchBoxIsClickable() throws InterruptedException {
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
        Thread.sleep(2000);
    }

    public void searchingForProduct_Method( String searchItem) throws InterruptedException { // case # 3
        //searchBoxIsDisplayed();
        searchBox.sendKeys(searchItem);
        searchLogoButton.click();
        Thread.sleep(2000);
    }

    public void validating_SearchingForProduct_Method() throws InterruptedException {
//        Assert.assertEquals(searchForProductById_Actual,expectedItemByXpath);
            Thread.sleep(2000);
            String actualResult=actualText.getText();
            Thread.sleep(2000);
            String expectedResult="“headphones”";
            Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        }

    }




