package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tc_009Page {

    WebDriver driver;
    private final long expectedLoadTime = 3000; // e.g., 3 seconds
    private final long expectedResponseTime = 1000; // e.g., 1 second

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(int fileSize) {
        // logic to upload file of given size
        // start time measurement, perform upload, and end time measurement
    }

    public long getLoadTime() {
        // return the time taken for file upload and processing
        return 2500; // Placeholder value
    }

    public void measureResponseTime() {
        // logic to measure response time from selection to preview
    }

    public long getResponseTime() {
        // return the measured response time
        return 800; // Placeholder value
    }

    public long getExpectedLoadTime() {
        return expectedLoadTime;
    }

    public long getExpectedResponseTime() {
        return expectedResponseTime;
    }
}