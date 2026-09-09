package Tests;

import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public void clickLoginButton() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver, "landing page");
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTests() {
        loginPage.enterUsername(readData.username);
    }

    @Test(priority = 2)
    public void enterPassword() {
        loginPage.enterPassword(readData.password);
        takesScreenshots.takesSnapShot(driver, "login page");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "dashboard page");
    }

    @Test(priority = 4)
    public void verifyLoginSuccessTest() {
        landingPage.verifyLoginSuccess();
        takesScreenshots.takesSnapShot(driver, "Landing page");
    }

    @Test(priority = 5)
    public void clickLearnDropdownButtonTest() {
        practicePage.clickLearnDropdownButton();
        takesScreenshots.takesSnapShot(driver, "Learn Dropdown");
    }

    @Test(priority = 6)
    public void clickLearningMaterialsButtonTest() {
        practicePage.clickLearningMaterialsButton();
        takesScreenshots.takesSnapShot(driver, "Learning Materials");
    }

    @Test(priority = 7)
    public void clickWebAutomationAdvanceButtonTest() {
        practicePage.clickWebAutomationAdvanceButton();
        takesScreenshots.takesSnapShot(driver, "Web Automation Advance");
    }

    @Test(priority = 8)
    public void DeviceTypeSelect() {
        practicePage.selectDeviceType("Phone");
        takesScreenshots.takesSnapShot(driver, "Device Type Select");
    }

    @Test(priority = 9)
    public void clickDeviceTypeSelect() {
        practicePage.clickDeviceTypeSelect();
        takesScreenshots.takesSnapShot(driver, "Device Type Select");
    }

    @Test(priority = 10)
    public void clickBrandSelect() {
        practicePage.clickBrandSelect();
        takesScreenshots.takesSnapShot(driver, "Brand Select");
    }

    @Test(priority = 11)
    public void BrandSelect() {
        practicePage.selectBrandSelect("Apple");
        takesScreenshots.takesSnapShot(driver, "Brand Select");
    }

    @Test(priority = 12)
    public void StorageSelect() {
        practicePage.selectStorageSelect("128GB");
        takesScreenshots.takesSnapShot(driver, "Storage Select");
    }

    @Test(priority = 13)
    public void ColorSelect() {
        practicePage.selectColorSelect("Blue");
        takesScreenshots.takesSnapShot(driver, "Color Select");
    }

    @Test(priority = 14)
    public void enterQuantity() {
        practicePage.enterQuantity("2");
        takesScreenshots.takesSnapShot(driver, "Quantity Input");
    }

    @Test(priority = 15)
    public void enterAddress() {
        practicePage.enterAddress("123 Test Street");
        takesScreenshots.takesSnapShot(driver, "Address Input");
    }

    @Test(priority = 16)
    public void clickNextButton() {
        practicePage.clickNextButton();
        takesScreenshots.takesSnapShot(driver, "Next Button Clicked");
    }

    @Test(priority = 17)
    public void clickShippingOptionExpress() {
        practicePage.clickShippingOptionExpress();
        takesScreenshots.takesSnapShot(driver, "Shipping Option Express Clicked");
    }

    @Test(priority = 18)
    public void clickWarrantyOption1Year() {
        practicePage.clickWarrantyOption1Year();
        takesScreenshots.takesSnapShot(driver, "Warranty Option 1 Year Clicked");
    }

    @Test(priority = 19)
    public void enterDiscountCode() {
        practicePage.enterDiscountCode("SAVE10");
        takesScreenshots.takesSnapShot(driver, "Discount Code Entered");
    }

    @Test(priority = 20)
    public void clickApplyDiscountButton() {
        practicePage.clickApplyDiscountButton();
        takesScreenshots.takesSnapShot(driver, "Apply Discount Button Clicked");
    }

    @Test(priority = 21)
    public void clickConfirmPurchaseButton() {
        practicePage.clickConfirmPurchaseButton();
        takesScreenshots.takesSnapShot(driver, "Confirm Purchase Button Clicked");
    }

    @Test(priority = 22)
    public void clickViewInvoiceButton() {
        practicePage.clickViewInvoiceButton();
        takesScreenshots.takesSnapShot(driver, "View Invoice Button Clicked");
    }

    @Test(priority = 23)
    public void clickViewInvoiceButton2() {
        practicePage.clickViewInvoiceButton2();
        takesScreenshots.takesSnapShot(driver, "View Invoice Button 2 Clicked");
    }
}
