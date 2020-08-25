package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElement.searchBoxByXpath;

public class HomePage extends WebAPI {
    @FindBy (how = How.XPATH, using = searchBoxByXpath)
    public WebElement searchBox;

    public void searchBoxIsDisplayed() throws InterruptedException {

        searchBox.isDisplayed();
      //  System.out.println(driver.getTitle());
//        Thread.sleep(2000);
       // Assert.assertTrue(driver.findElement(By.className("//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li[1]/a")).isDisplayed());
        Assert.assertEquals("Target : Expect More. Pay Less.",driver.getTitle());
        Thread.sleep(2000);
    }

}
