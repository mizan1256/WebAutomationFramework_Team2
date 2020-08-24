package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class WebAPI {

//Browser setup
    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setup(@Optional("http://www.google.com")String url){
        System.setProperty("webdriver.chrome.driver","../Genric/BrowserDriver/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod (alwaysRun = true)
    public void cleanUp(){
// driver.close();
        driver.quit();
    }
}
