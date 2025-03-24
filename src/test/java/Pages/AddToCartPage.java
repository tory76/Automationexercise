package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    public WebElement viewProduct;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement quantityField;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    public WebElement addCartBtn;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement viewCart;

    public AddToCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void click_view_product() throws InterruptedException{
        viewProduct.click();
        Thread.sleep(2000);
    }

    public void set_product_quantity() throws InterruptedException{
        quantityField.clear();
        quantityField.sendKeys("4");
        Thread.sleep(2000);
    }

    public void click_add_to_cart_btn() throws InterruptedException{
        addCartBtn.click();
        Thread.sleep(2000);
    }

    public void click_view_cart_button() throws InterruptedException{
        viewCart.click();
        Thread.sleep(2000);
    }
}
