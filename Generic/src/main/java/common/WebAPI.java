package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class WebAPI {

    public static WebDriver driver = null;


    @Parameters({"url"})

    @BeforeMethod
    public void setUp(@Optional("https://www.target.com") String url) {
        System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS );
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        //driver.close();
        driver.quit();

    }
}