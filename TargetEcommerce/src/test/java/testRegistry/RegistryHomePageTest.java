package testRegistry;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registry.RegistryHomePage;

import java.rmi.registry.Registry;
import java.security.PublicKey;

public class RegistryHomePageTest extends WebAPI {
    RegistryHomePage registryPage;

    @BeforeMethod
    public void getInit(){
        registryPage = PageFactory.initElements(driver,RegistryHomePage.class);
    }

    @Test
    public void testLogoIsDisplayed(){
        registryPage.logoIsDisplayed();
    }
    @Test
    public void testRegistryButtonIsClickable() throws InterruptedException {
        registryPage.registryButtonIsClickable();
        registryPage.validateRegistryButton();
    }
    @Test
    public void testBoxLogo(){
        registryPage.boxLogo();
        registryPage.validateBoxLogo();
    }
    @Test
    public void testCreateBabyRegistry() throws InterruptedException {
        registryPage.creatBabyRegistry();
        registryPage.validateShoppingCar();
    }
    @Test
    public void testAppStroeLogo() throws InterruptedException {
        registryPage.appsStroeLogo();
        registryPage.validateAppsStroeLogo();
    }

    }



