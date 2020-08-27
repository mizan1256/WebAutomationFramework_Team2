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
    //public static final String helpButtonInsideCartByXpath="//button[@class='Button-bwu3xu-0 gjynXd h-margin-v-tight h-margin-r-tight']";//7
    public static final String  expected_helpByXpath="//span[contains(text(),'Have an account? Sign in to see your cart')]";

        }