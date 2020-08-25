package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBoxByXpath)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchLogoButtonByXpath)
    public WebElement searchLogoButton;

    public void searchBoxIsDisplayed() throws InterruptedException {// case# 1
        searchBox.isDisplayed();

            Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
            Thread.sleep(2000);
        }
        public void searchBoxIsClickable (String searchItem) throws InterruptedException {
            Thread.sleep(2000);
            searchBox.sendKeys("candle");
            Thread.sleep(2000);
            searchLogoButton.click();
            //Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
            //Thread.sleep(2000);
        }
    }



