package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By processButton = By.id("processButton");
    private By slipMessage = By.id("slipMessage");
    private By historySection = By.id("historySection");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocuments() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
        // Additional logic for file upload
    }

    public void processDocuments() {
        WebElement processBtn = driver.findElement(processButton);
        processBtn.click();
        // Additional logic for processing
    }

    public boolean isSlipGenerated() {
        WebElement slipMsg = driver.findElement(slipMessage);
        return slipMsg.isDisplayed();
    }

    public boolean areDocumentsAndDataStoredInHistory() {
        WebElement history = driver.findElement(historySection);
        return history.isDisplayed() && history.getText().contains("Expected Data");
    }
}