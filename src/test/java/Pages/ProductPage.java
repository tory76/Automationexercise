package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productButton;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement submitSearch;


    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void click_product_button() throws InterruptedException{
        productButton.click();
        Thread.sleep(2000);
    }

    public void user_search_product() throws InterruptedException{
        searchBox.sendKeys("T-Shirt");
        Thread.sleep(2000);

        submitSearch.click();
        Thread.sleep(2000);
    }

}
