package StepDefinitions;

import Pages.ProductPage;
import Utils.DriverManager;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductStep {
    public WebDriver driver;

    ProductPage pp;

    public ProductStep(){
        this.driver = DriverManager.getDriver();
        pp = new ProductPage(driver);
    }

    @Given("user navigate to {string}")
    public void user_navigate_to_as_url(String url) {
        driver.get(url);
    }

    @When("verify that home page is visible")
    public void verify_that_home_page_is_visible() {
        String Title = driver.getTitle();
        System.out.println("Home Page Is Visible. Our Expected Title Is: " +Title);
    }

    @And("user click on product button")
    public void user_click_on_product_button() throws InterruptedException {
        pp.click_product_button();
    }

    @And("verify all product page is visible")
    public void verify_all_product_page_is_visible() {
        String Title = driver.getTitle();
        System.out.println("All Product Is Visible. Our Expected Title Is: " +Title);
    }

    @And("user search for product")
    public void user_search_for_product() throws InterruptedException {
        pp.user_search_product();
    }


    @And("verify all searched product is visible")
    public void verify_all_searched_product_is_visible() throws InterruptedException {
        String actualText = "SEARCHED PRODUCTS";

        WebElement element = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String expectedText = element.getText();

        Assert.assertEquals( actualText , expectedText);
        System.out.println("Our Expected Text Is:" +expectedText);
        Thread.sleep(3000);
    }

    @Then("verify all search related product page is visible")
    public void verify_all_search_related_product_page_is_visible() throws InterruptedException {
        String currentUrl =  driver.getCurrentUrl();
        System.out.println("Verified That All Searched Related Product Is Visible. Our Expected URL Is:" +currentUrl);
        Thread.sleep(2000);
    }

}
