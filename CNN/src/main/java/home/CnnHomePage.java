package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static home.CnnHomePageWebElement.*;

public class CnnHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementCnnLogo)public WebElement cnnLogo;
    @FindBy(how = How.XPATH, using = webElementLogInIcon)public WebElement cnnLogInIcon;
    @FindBy(how = How.XPATH, using = webElementCnnSearchIcon)public WebElement cnnSearchIcon;
    @FindBy(how = How.XPATH, using = webElementCnnSearchBox)public WebElement cnnSearchBox;
    @FindBy(how = How.XPATH, using = webElementSearchTextIcon)public WebElement cnnSearchBoxTextIcon;


    public void cnnLogoIsDisplay(){
        cnnLogo.isDisplayed();}

    public void cnnUserIconIsDisplay(){
        cnnLogInIcon.isDisplayed();
    }
    //Action Method
    public void cnnLogInIconIsClickable(){

        cnnLogInIcon.click();
    }
    //Validation Method
    public void validateCnnLogInIconIsClickable(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNN - Breaking News, Latest News and Videos", driver.getTitle());
    }

    //Action Method
    public void cnnSearchIconIsClickable(){
        cnnSearchIcon.click();
    }
    //validation Method
    public void validateCnnSearchIconIsClickable(){
        Assert.assertTrue(cnnSearchBox.isDisplayed());
        //System.out.println("Cnn Search Box is displayed :  "+cnnSearchBox.isDisplayed());
    }

    //Action Method
    public void cnnSearchBoxTypeAble() throws InterruptedException {
        cnnSearchIconIsClickable();
        cnnSearchBox.clear();
        cnnSearchBox.sendKeys("Sports");
        cnnSearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
       // cnnSearchBoxTextIcon.submit();
        //WebDriverWait webDriverWait=new WebDriverWait(driver,7);
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Text-sc-1amvtpj-0 iEWJSI']"))).click();
    }
    //Validation Method
    public void validateCNNSearchBoxTypeAble(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com",driver.getTitle());

    }
}

