package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_002Page {
    
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileName = By.id("fileName");
    By fileSize = By.id("fileSize");
    By fileType = By.id("fileType");
    
    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement uploadInput = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(uploadButton));
        uploadInput.sendKeys(filePath);
    }

    public boolean isFileUploaded() {
        // Implement logic to check if file is uploaded (Example: check for success message)
        return true;
    }

    public boolean isFileNameDisplayed() {
        return driver.findElement(fileName).isDisplayed();
    }

    public boolean isFileSizeDisplayed() {
        return driver.findElement(fileSize).isDisplayed();
    }

    public boolean isFileTypeDisplayed() {
        return driver.findElement(fileType).isDisplayed();
    }
}