package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using= webElementSearchBox) public WebElement searchBox;
    @FindBy(how =How.XPATH, using =webElementSearchButton) public WebElement searchButton;
    @FindBy(how = How.XPATH,using = webElementSearchText) public WebElement searchText;

    @FindBy (xpath = "//input[@id='search']") WebElement searchField;
    @FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']") WebElement searchFieldButton;
    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']") WebElement headerIPhone;
    
    public void serchBoxIsDisplayed(){
    searchField.isDisplayed();
    Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
}
    //Action Method
    public void serchBoxCheck(String searchItem){
        searchField.clear();
        searchField.sendKeys(searchItem);
        searchFieldButton.click();
    }

    //Validate Method
    public void validateSeachText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=headerIPhone.getText();
        Thread.sleep(3000);
        String expectedResult="iPhone";
        System.out.println(actualResult);
       Assert.assertEquals(actualResult,expectedResult,"Text do not match");
    }

}
