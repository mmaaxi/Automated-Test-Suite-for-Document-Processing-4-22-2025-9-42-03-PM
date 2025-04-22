package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFileUploadPage() {
        driver.get("http://www.example.com/file-upload");
    }

    public void uploadInvalidFormatOrLargeFile(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}