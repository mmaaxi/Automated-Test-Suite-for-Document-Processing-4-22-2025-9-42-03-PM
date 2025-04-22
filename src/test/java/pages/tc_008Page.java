package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;

    private By fileInput = By.id("file-upload");
    private By fileDetails = By.className("file-details");
    private By deleteButton = By.className("delete-button");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void uploadFiles() {
        driver.findElement(fileInput).sendKeys("path/to/file1\npath/to/file2");
    }

    public boolean verifyFileDetails() {
        // Assume we get file detail text from each file's detail section
        String details = driver.findElement(fileDetails).getText();
        return details.contains("File1") && details.contains("Type") && details.contains("Size");
    }

    public void deleteFile() {
        driver.findElement(deleteButton).click();
    }

    public boolean verifyFileDeleted() {
        // Assume checking the file list size or if file-specific elements still exist
        return !driver.findElement(fileDetails).getText().contains("File1");
    }
}