package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElements.*;

public class CnnHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsUSButton) public WebElement uSButton;
    @FindBy(how = How.XPATH,using = webElementsUSButtonText) public WebElement uSButtonText;
    @FindBy(how = How.XPATH,using = webElementsCnnLogo) public WebElement cNnLogo;
    @FindBy(how = How.XPATH,using = webElementsCnnLogoText) public WebElement cNnLogoText;


    //Action Method
    public void checkUSButton() throws InterruptedException {
        uSButton.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateUSButton() throws InterruptedException {
        String actualResult =uSButtonText.getText();
        Thread.sleep(3000);
        String expectedResult = "US";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    //Action Method
    public void displayCnnLogo() throws InterruptedException {
        cNnLogo.isDisplayed();
        Thread.sleep(2000);
    }
    //Validate Method
    public void validateDisplayCnnLogo()throws InterruptedException {
        String expectedResult=cNnLogoText.getText();
        String actualResult="TRENDING:";
        Assert.assertEquals(actualResult,expectedResult,"Not exist");
    }
}
