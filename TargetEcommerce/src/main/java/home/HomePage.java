package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePagewebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementSearchBox) public WebElement searchBox;

    @FindBy(how = How.CSS, using = webElementSearchButton) public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSearchText) public WebElement searchText;

    @FindBy(how = How.XPATH, using = webElementTargetLogo) public WebElement targetLogo;

    @FindBy(how = How.XPATH, using = disposableMaskText) public WebElement faceMask;

    @FindBy(how =How.XPATH, using = clothMasks) public WebElement clothMask;

    @FindBy(how = How.XPATH, using = clearanceImg) public WebElement clearance;
    @FindBy(how = How.XPATH, using = webElementFurnitureClerance)public WebElement furnitureClearance;
    @FindBy(how = How.XPATH, using = webElementFilterResultText) public WebElement filterText;

//Action Method with Validation
    public void searchBoxIsDisplayed(){
        searchBox.isDisplayed();
        System.out.println("EASY FOR EVERYONE");
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
    }
//    Action Method
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }
   // validate Method
    public void validateSearchText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=searchText.getText();
        String expectedResult= "Registry";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }
    //    Action Methiod
    public void disposableMaskIsDisplayed(String searchItem) {
    searchBox.sendKeys(searchItem);
    searchButton.click();
    clothMask.click();
}
    // Validation
    public void validateFaceMasks() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=faceMask.getText();
        String expectedResult= "Registry";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }
//Action Method with validation
    public void targetLogoIsDisplayed(){
        targetLogo.isDisplayed();
        System.out.println("EASY FOR EVERYONE");
        Assert.assertTrue(driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 1c6.07')]")).isDisplayed());
    }
//Action Method
    public void clearanceImage() throws InterruptedException {
        Thread.sleep(3000);
        clearance.click();
        Thread.sleep(3000);
        furnitureClearance.click();
    }
//    Validation
    public void validateClearanceImage(){
        String actualresult = filterText.getText();
        String expectedResult = "Filter results";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualresult,expectedResult,"Not Match");
    }


}

