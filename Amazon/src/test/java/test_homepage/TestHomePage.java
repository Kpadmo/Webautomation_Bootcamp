package test_homepage;

import base.CommonAPI;
import homepage.HomePage;
import homepage.ProductNavigate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.transform.Result;
import java.util.List;

public class TestHomePage extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void getloginclass() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void setloginclass() {

        homePage.SearchValue();
    }


    ProductNavigate productNavigate;

    @BeforeMethod
    public void getsearchproductclass()
    {
        productNavigate = PageFactory.initElements(driver, ProductNavigate.class);
    }

    @Test
    public void setSearchProduct()
    {
        productNavigate.productInfo();
    }

}




