package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.CnnHomePageWebElement.webElementCnnLogo;
import static home.CnnHomePageWebElement.webElementUserIcon;

public class CnnHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementCnnLogo)public WebElement cnnLogo;
    @FindBy(how = How.XPATH, using = webElementUserIcon)public WebElement cnnUserIcon;
    public void cnnLogoIsDisplay(){
        cnnLogo.isDisplayed();
    }
    public void cnnUserIcon(){
        cnnUserIcon.isDisplayed();
    }
    public void setCnnUserIcon(){
        cnnUserIcon.click();
    }
}

