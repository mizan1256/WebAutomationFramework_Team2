package home;

public class HomePageWebElement {
    public static final String searchBoxByXpath = "//*[@id=\"search\"]";
    public static final String searchLogoButtonByXpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']";
    public static final String searchForProductById = "//input[@id='search']";
    public static final String searchForProductByXpath_Actual="//*[@id=\"mainContainer\"]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div[1]/h2";

    public static final String dealsTargetHomePageByXpath="//a[@id='secondary']";//4
    public static final String dealsTarget_TopDealsByXpath="//div[@class='Row-uds8za-0 iFzQdH'][contains(text(),'Top Deals')]";//4
    public static final String expected_topDealText="//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']";

    public static final String sameDayDeliveryTargetByXpath="//span[@class='SameDayLink__StyledLinkText-cdh2k4-1 cvOROU']//span[contains(text(),'Same Day Delivery')]";//5

    public static final String heartLogoByXpath="//div[@class='h-display-inline-block h-margin-r-tiny']//div[@class='sc-AxhCb eSwYtm']//*[local-name()='svg']";//6

    public static final String cartLogoByXpath="//span[@class='sc-AxjAm hhuVxr']//div[@class='sc-AxiKw eSbheu']";//7
    public static final String  expected_helpByXpath="//span[contains(text(),'Have an account? Sign in to see your cart')]";//7
//8 on findstore class
    //#9
    public static final String signInTarget="//span[@class='styles__AccountName-sc-1kk0q5l-0 gIhNhN']";//byxpath//9
    public static final String signInTextFromList="//div[contains(text(),'Sign in')]";//byxpath////9
    public static final String emailBox="//input[@id='username']";//byxpath///9
    public static final String passwordBox="//input[@id='password']";//byxpath///9
    public static final String signInButtonTarget ="//button[@id='login']";//byxpath//9
    public static final String jonyUnderSignIn="//span[@class='styles__AccountName-sc-1kk0q5l-0 gIhNhN']";//xpath
//#10

    public static final String createAccountTextFromList="//div[contains(text(),'Create account')]";//byxpath.....10
    public static final String firstNameBox="//input[@id='firstname']";//byxpath
    public static final String lastNameBox ="//input[@id='lastname']";//byxpath
    public static final String mobileNumberBox="//input[@id='phone']";//byxpath
    public static final String verifyYourPageText="//h1[@class='sc-lkqHmb PaqLm']";//xpath......10
    public static final String createYourAccountButton ="//button[@id='createAccount']";//byxpath....10

    public static final String erorMessageForNegativeTest="//div[@class='sc-fAjcbJ bKqnDO']";//xpath....11
}