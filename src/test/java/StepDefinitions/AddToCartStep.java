package StepDefinitions;

import Pages.AddToCartPage;
import Utils.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class AddToCartStep {
    WebDriver driver;

    AddToCartPage cp;

    public AddToCartStep(){
        this.driver = DriverManager.getDriver();
        cp = new AddToCartPage(driver);
    }

    @When("user click on view Product")
    public void user_click_on_view_product() throws InterruptedException {
        cp.click_view_product();
    }

    @And("verify product details is opened")
    public void verify_product_details_is_opened() {
        String verifyWithTitle = driver.getTitle();
        System.out.println("verify product details is opened. Your verification code is: " +verifyWithTitle);
    }

    @And("user increase product to four")
    public void user_increase_product_to() throws InterruptedException {
        cp.set_product_quantity();
    }

    @When("user click add to cart button")
    public void user_click_add_to_cart_button() throws InterruptedException {
        cp.click_add_to_cart_btn();
    }

    @When("user click on view cart button")
    public void user_click_on_view_cart_button() throws InterruptedException {
        cp.click_view_cart_button();
    }

    @Then("verify that product is displayed in cart page with quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_quantity() throws InterruptedException {
        String verifyWithTitle = driver.getTitle();
        System.out.println("verify product details is opened. Your verification code is: " +verifyWithTitle);
        Thread.sleep(3000);
        driver.quit();
    }
}
