package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_006Page {

    private WebDriver driver = DriverFactory.getDriver();
    private By uploadPageLocator = By.id("upload-page");
    private By structuredDocUploadInput = By.id("upload-structured");
    private By unstructuredDocUploadInput = By.id("upload-unstructured");
    private By confirmationMessageLocator = By.id("confirmation-message");

    public void navigateToUploadPage() {
        driver.get("http://yourapp.com/upload");
    }

    public boolean isUploadPageDisplayed() {
        return driver.findElement(uploadPageLocator).isDisplayed();
    }

    public void uploadStructuredDocument(String filePath) {
        WebElement uploadElement = driver.findElement(structuredDocUploadInput);
        uploadElement.sendKeys(filePath);
    }

    public void uploadUnstructuredDocument(String filePath) {
        WebElement uploadElement = driver.findElement(unstructuredDocUploadInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isOCRProcessingComplete() {
        // Insert logic to verify OCR processing
        return true;
    }

    public boolean isDataExtractionComplete() {
        // Insert logic to verify data extraction
        return true;
    }

    public boolean isInformationDisplayedForConfirmation() {
        return driver.findElement(confirmationMessageLocator).isDisplayed();
    }
}