package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page uploadPage = new tc_002Page();

    @Given("the user is on the file upload page")
    public void user_is_on_file_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("the user selects a valid PDF/DOCX file less than 50MB")
    public void user_selects_valid_file() {
        uploadPage.uploadFile("path/to/valid/file.pdf");
    }

    @Then("the file is uploaded successfully")
    public void file_is_uploaded_successfully() {
        Assert.assertTrue("File upload failed", uploadPage.isFileUploaded());
    }

    @Then("the preview shows the file name, size, and type")
    public void preview_shows_file_details() {
        Assert.assertTrue("File name not displayed", uploadPage.isFileNameDisplayed());
        Assert.assertTrue("File size not displayed", uploadPage.isFileSizeDisplayed());
        Assert.assertTrue("File type not displayed", uploadPage.isFileTypeDisplayed());
    }
}