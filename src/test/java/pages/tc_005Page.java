package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;
    
    By startUploadButton = By.id("start-upload");
    By errorMessage = By.id("error-message");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptUploadWithoutDocument() {
        driver.findElement(startUploadButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}