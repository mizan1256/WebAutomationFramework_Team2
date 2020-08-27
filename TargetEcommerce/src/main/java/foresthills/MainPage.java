package foresthills;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class MainPage extends WebAPI {

//    @FindBy(how = How.XPATH, using = forestHillsTab) public WebElement forestHills;
    @FindBy(xpath = "//h3[contains(text(),'activities')]") public  WebElement kidsButton;
    @FindBy(xpath = "//span[contains(text(),'Ages 2')]")public WebElement ageButton;
    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']")
    public WebElement testText;

//    Action Method
    public void ageActivesButton() throws InterruptedException {
        kidsButton.click();
        Thread.sleep(6000);
        ageButton.click();
    }
//    Validation
    public void validateAgeActivesButton(){
        String actualResul=testText.getText();
        String expectedResult="Kids' Play Activities";
        Assert.assertEquals(actualResul,expectedResult);
        System.out.println("PASSED");
    }





}
