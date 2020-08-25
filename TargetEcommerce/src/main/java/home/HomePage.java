package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePagewebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how = How.CSS, using = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSearchText)
    public WebElement searchText;

    @FindBy(how = How.XPATH, using = webElementTargetLogo)
    public WebElement targetLogo;

//Action Method
    public void searchBoxIsDisplayed(){
        searchBox.isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
    }
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }
   // validate Method
    public void validateSearchText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=searchText.getText();
        String expectedResult= "Registry";
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }

    public void targetLogoIsDisplayed(){
        targetLogo.isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 1c6.07')]")).isDisplayed());
    }


}

