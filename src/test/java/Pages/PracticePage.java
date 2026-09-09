package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='📚']")
    WebElement LearnDropdownButton;

    @FindBy(xpath = "//span[normalize-space()='Learning Materials']")
    WebElement LearningMaterialsButton;

    @FindBy(xpath = "//span[@class='tab-label' and normalize-space()='Web Automation Advance']")
    WebElement WebAutomationAdvanceButton;

    @FindBy(xpath = "//select[@id='deviceType' and @name='deviceType']")
    WebElement DeviceTypeSelect;

    @FindBy(xpath = "//select[@id='brand' and @name='brand']")
    WebElement BrandSelect;

    @FindBy(xpath = "//input[@type='radio' and @name='storage' and @value='128GB']")
    WebElement StorageSelect;

    @FindBy(xpath = "//select[@id='color' and @name='color']")
    WebElement ColorSelect;

    @FindBy(xpath = "//input[@id='quantity' and @data-testid='quantity-input']")
    WebElement QuantityInput;

    @FindBy(xpath = "//input[@id='address' and @data-testid='address-input']")
    public WebElement AddressInput;

    @FindBy(xpath = "//button[@id='inventory-next-btn' and @data-testid='inventory-next-btn']")
    WebElement NextButton;

    @FindBy(xpath = "//label[@id='shipping-option-express' and @data-testid='shipping-option-express']")
    WebElement ShippingOptionExpress;

    @FindBy(xpath = "//label[@id='warranty-option-1yr' and @data-testid='warranty-option-1yr']")
    WebElement WarrantyOption1Year;

    @FindBy(xpath = "//input[@id='discount-code' and @data-testid='discount-code']")
    WebElement DiscountCodeInput;

    @FindBy(xpath = "//button[@id='apply-discount-btn' and @data-testid='apply-discount-btn']")
    WebElement ApplyDiscountButton;

    @FindBy(xpath = "//button[@id='purchase-device-btn' and @data-testid='purchase-device-btn']")
    WebElement ConfirmPurchaseButton;

    @FindBy(xpath = "//button[@id='view-history-btn' and @data-testid='view-history-btn']")
    WebElement ViewInvoiceButton;

    @FindBy(xpath = "//button[contains(@data-testid, 'view-invoice-') and contains(normalize-space(.), 'View')]")
    WebElement ViewInvoiceButton2;


    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLearnDropdownButton() {
        LearnDropdownButton.click();
    }

    public void clickLearningMaterialsButton() {
        LearningMaterialsButton.click();
    }

    public void clickWebAutomationAdvanceButton() {
        WebAutomationAdvanceButton.click();
    }

    public void selectDeviceType(String deviceType) {
        Select select = new Select(DeviceTypeSelect);
        select.selectByValue(deviceType.toLowerCase());
    }

    public void clickDeviceTypeSelect() {
        DeviceTypeSelect.click();
    }

    public void clickBrandSelect() {
        BrandSelect.click();
    }

    public void selectBrandSelect(String brand) {
        Select brandSelect = new Select(BrandSelect);
        brandSelect.selectByValue(brand.toLowerCase());
    }

    public void selectStorageSelect(String storage) {
        driver.findElement(By.cssSelector("input[name='storage'][value='" + storage + "']")).click();
    }

    public void selectColorSelect(String color) {
        Select colorSelect = new Select(ColorSelect);
        colorSelect.selectByValue(color.toLowerCase());
    }

    public void enterQuantity(String quantity) {
        QuantityInput.clear();
        QuantityInput.sendKeys(quantity);
    }

    public void enterAddress(String address) {
        AddressInput.clear();
        AddressInput.sendKeys(address);
    }

    public void clickNextButton() {
        NextButton.click();
    }

    public void clickShippingOptionExpress() {
        ShippingOptionExpress.click();
    }

    public void clickWarrantyOption1Year() {
        WarrantyOption1Year.click();
    }

    public void enterDiscountCode(String discountCode) {
        DiscountCodeInput.clear();
        DiscountCodeInput.sendKeys(discountCode);
    }

    public void clickApplyDiscountButton() {
        ApplyDiscountButton.click();
    }

    public void clickConfirmPurchaseButton() {
        ConfirmPurchaseButton.click();
    }

    public void clickViewInvoiceButton() {
        ViewInvoiceButton.click();
    }

    public void clickViewInvoiceButton2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement viewButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@data-testid, 'view-invoice-') and contains(normalize-space(.), 'View')]")));
        viewButton.click();
    }

}




