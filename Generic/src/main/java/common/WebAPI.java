package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class WebAPI {

//Browser setup
    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
//    public void setup(@Optional("http://www.google.com") String url){
    public void setup(@Optional("http://www.cnn.com")String url){
        System.setProperty("webdriver.chrome.driver","../Generic/BrowserDriver/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }

    @AfterMethod (alwaysRun = true)
    public void cleanUp(){
// driver.close();
        driver.quit();
    }
}
