package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        page.navigateToUploadPage();
        Assert.assertTrue(page.isUploadPageDisplayed());
    }

    @When("the user uploads structured and unstructured documents")
    public void the_user_uploads_structured_and_unstructured_documents() {
        page.uploadStructuredDocument("path/to/structured_document");
        page.uploadUnstructuredDocument("path/to/unstructured_document");
    }

    @Then("the system should process the documents with OCR")
    public void the_system_should_process_the_documents_with_OCR() {
        Assert.assertTrue(page.isOCRProcessingComplete());
    }

    @Then("the system should extract data")
    public void the_system_should_extract_data() {
        Assert.assertTrue(page.isDataExtractionComplete());
    }

    @Then("the system should display the information for confirmation")
    public void the_system_should_display_the_information_for_confirmation() {
        Assert.assertTrue(page.isInformationDisplayedForConfirmation());
    }
}