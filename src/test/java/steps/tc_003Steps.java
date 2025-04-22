package steps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page uploadPage;

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        driver = new ...; // Initialize the WebDriver
        uploadPage = new tc_003Page(driver);
        uploadPage.navigateToFileUploadPage();
    }

    @When("the user attempts to upload a file with invalid format or size more than 50 MB")
    public void the_user_attempts_to_upload_a_file_with_invalid_format_or_size_more_than_50_MB() {
        uploadPage.uploadInvalidFormatOrLargeFile("path/to/invalid/format/or/large/file");
    }

    @Then("the system displays an error message indicating invalid format or size exceeded")
    public void the_system_displays_an_error_message_indicating_invalid_format_or_size_exceeded() {
        assertTrue(uploadPage.isErrorMessageDisplayed());
    }
}