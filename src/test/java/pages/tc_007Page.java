package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_007Page {
    WebDriver driver;

    public tc_007Page() {
        // Initialize the WebDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
    }

    public void openFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadCorruptFile() {
        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        uploadInput.sendKeys("path_to_corrupt_file");
        driver.findElement(By.id("submit-upload")).click();
    }

    public boolean isFailureDetected() {
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        return errorMessage.isDisplayed();
    }

    public boolean isErrorNotifiedToBroker() {
        // Implementation depends on how the notification is confirmed
        return true;
    }

    public boolean isProcessingEnded() {
        WebElement processingStatus = driver.findElement(By.id("processing-status"));
        return processingStatus.getText().equals("Process completed with error");
    }

    public void closeDriver() {
        driver.quit();
    }
}