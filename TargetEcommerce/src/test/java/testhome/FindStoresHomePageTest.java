package testhome;

import common.WebAPI;
import findStores.FindStoresHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindStoresHomePageTest extends WebAPI {
    FindStoresHomePage findStores;

    @BeforeMethod
    public void getInit() {
        findStores = PageFactory.initElements(driver, FindStoresHomePage.class);
    }

    @Test
    public void testSearchFindStores() throws InterruptedException {
        findStores.searchFindStores();
        findStores.ValidateSearchFindStores();
    }
    @Test
    public void testQueenStore() throws InterruptedException {
        findStores.searchQueensStores();
        findStores.ValidateSearchQueensStores();
    }
}