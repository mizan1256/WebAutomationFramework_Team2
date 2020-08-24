package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomePageWebElements.webElementSearchBox;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS, using= webElementSearchBox)public WebElement searchBox;

}
