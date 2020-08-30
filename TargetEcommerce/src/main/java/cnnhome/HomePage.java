package cnnhome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static cnnhome.HomePageWEbElements.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementsSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = webElementsSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.CLASS_NAME, using = webElementsSearchTextClass)
    public WebElement searchText;
    /***/
    @FindBy(how = How.CLASS_NAME, using = getWebElementsSearchNewArrivalTextClass)
    public WebElement searchNewArrival;

    @FindBy(how = How.XPATH,using = checkWebElementsCartButton)
    public WebElement searchCart;

    @FindBy(how = How.XPATH,using = getWebElementsHomePageLogo)
    public WebElement homePageLogo;

    @FindBy(how = How.XPATH,using = webElementsClickCollege)
    public WebElement clickCollege;

    @FindBy(how = How.XPATH,using = webElementsClickCollegeTitle)
    public WebElement clickCollegeTitle;

    @FindBy(how = How.XPATH,using = webElementsClickMens)
    public WebElement clickMens;

    @FindBy(how = How.XPATH,using = webElementsClickSameDayDelivery)
    public WebElement sameDayDelivery;

    @FindBy(how = How.XPATH,using = webElementsClickSameDayDeliveryText)
    public WebElement sameDayDeliveryText;

    @FindBy(how = How.XPATH,using = webElementsSignInButton)
    public WebElement signInButton;

    @FindBy(how = How.XPATH,using = webElementsCreateAccountButton)
    public WebElement createAccountButton;

    @FindBy(how = How.XPATH,using = webElementsUserEmailId)
    public WebElement userEmailId;

    @FindBy(how = How.XPATH,using = webElementsUserFirstName)
    public WebElement userFirstName;

    @FindBy(how = How.XPATH,using = webElementsUserLastName)
    public WebElement userLastName;

    @FindBy(how = How.XPATH,using = webElementsUserMobileNumber)
    public WebElement userMobileNumber;

    @FindBy(how = How.XPATH,using = webElementsUserPasWord)
    public WebElement userPassword;

    @FindBy(how = How.XPATH,using = webElementsCreateAccountBox)
    public WebElement createAccountBox;


    //Test-1
    //Action Method
    public void searchBoxIsDisplayed() throws InterruptedException {
        searchBox.isDisplayed();
    }
    //Validate Method
    public void validateSearchBoxDisplayed() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
        Thread.sleep(2000);
    }

    //Test-2
    //Action Method
    public void searchBoxCheck(String searchItem) {
        searchBox.clear();
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }

    //Validate Method
    public void validateSearchText() throws InterruptedException {
        searchBoxCheck("samsung");
        Thread.sleep(3000);
        String actualResult = driver.getTitle();
        Thread.sleep(3000);
        String expectedResult = "Samsung : Target";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");

    }

    //Test-3
    //Action Method
    public void SearchNewArrival(String searchItem) {
        searchBox.clear();
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }
    //Validate Method
    public void validateSearchNewArrival() throws InterruptedException {
        searchBoxCheck("new arrivals");
        Thread.sleep(3000);
        String actualResult = driver.getTitle();
        Thread.sleep(3000);
        String expectedResult = "New Arrivals : Target";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");

    }
    // Test-4
    public void searchCartIsDisplayed() {
        searchBox.clear();
        searchCart.click();
    }
    //Validate Method
    public void validateSearchCartIsDisplayed() throws InterruptedException {
       Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN']")).isDisplayed());
        Thread.sleep(2000);
    }
    // Test-5
    //Action Method
    public void getHomePageLogo(){
        searchBox.clear();
        homePageLogo.isDisplayed();
    }
    //Validate Method
    public void validateGetHomePageLogo() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
        Thread.sleep(2000);
    }
    //Action Method
    public void clickCollegeButton() throws InterruptedException {
        clickCollege.click();
        Thread.sleep(3000);
    }

    //Validate Method
    public void validateClickCollegeButton() throws InterruptedException {
        String actualResult =clickCollegeTitle.getText();
        Thread.sleep(3000);
        String expectedResult = "College";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void clickMensButton() throws InterruptedException {
        clickMens.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateClickMensButton() throws InterruptedException {
        String actualResult = "Men's Apparel & Accessories : Target";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void clickSameDayDelivery() throws InterruptedException {
        sameDayDelivery.click();
        Thread.sleep(3000);
    }

    //Validate Method
    public void validateClickSameDayDelivery() throws InterruptedException {
        String actualResult =sameDayDeliveryText.getText();
        Thread.sleep(3000);
        String expectedResult = "Get it as soon as today";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkCreateAccount() throws InterruptedException {
        signInButton.click();
        Thread.sleep(3000);
        createAccountButton.click();
        userEmailId.sendKeys("pntitny@gmail.com");
        userFirstName.sendKeys("PNT");
        userLastName.sendKeys("IT");
        userMobileNumber.sendKeys("6464314010");
        userPassword.sendKeys("p1234567");
        createAccountBox.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateCheckCreateAccount() throws InterruptedException {
        String actualResult = "Target Login";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }


}