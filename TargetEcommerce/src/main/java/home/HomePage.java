package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
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

    @FindBy(how = How.XPATH, using = dealsTargetHomePageByXpath)//4
    public WebElement deals;

    @FindBy(how = How.XPATH,using = dealsTarget_TopDealsByXpath)//4
    public WebElement topDeals;

    @FindBy(how = How.XPATH,using = sameDayDeliveryTargetByXpath)//5
    public WebElement sameDayDelivery;

   @FindBy(how=How.XPATH, using = heartLogoByXpath)//6
   public WebElement heartLogo;

    @FindBy(how=How.XPATH, using = cartLogoByXpath)//7
    public WebElement cartLogo;

    @FindBy(how=How.XPATH, using = expected_helpByXpath)//7
    public WebElement expected;

    @FindBy(how=How.XPATH, using = expected_topDealText)//7
    public WebElement expected_topDeal;

    public void cartLogo_method(){//7 - click on- cart logo- land on the cart page.
        cartLogo.click();

    }
    public void validate_cartLogo_method() throws InterruptedException {
        String actualCartLogo= driver.getTitle();
       //System.out.println(driver.getTitle());
        Assert.assertEquals(actualCartLogo,driver.getTitle());
       Thread.sleep(2000);
    }

   public void heartLogoFavorite_Method() throws InterruptedException {//6 - click on- heart logo- land on the favorite page.
       heartLogo.click();
   }
    public void validate_heartLogoFavorite_Method() throws InterruptedException {
        String actualHeartLogo= driver.getTitle();;
        Assert.assertEquals("Your Favorites : Target",driver.getTitle());
        Thread.sleep(2000);
    }


    public void sameDayDeliveryTarget_Method(){//5- click on same day delivery and land on the delivery page.
        sameDayDelivery.click();
    }
      public void validate_sameDayDeliveryTarget_Method() throws InterruptedException {
        String actualSameDayDelivery= driver.getTitle();
        Assert.assertEquals("Same Day Delivery : Target",driver.getTitle());
        Thread.sleep(2000);
   }


    public void dealsTarget() throws InterruptedException {// case # 4-unfinished
    deals.click();
    Thread.sleep(5000);
    topDeals.click();
    Thread.sleep(5000);
}
    public void validate_DealsTarget(){
        String actualTopDeal="Top Deals";
        Assert.assertEquals(actualTopDeal,expected_topDeal.getText());
}

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




