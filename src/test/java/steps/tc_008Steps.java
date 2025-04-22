package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page filePage = new tc_008Page();

    @Given("I upload files to the system")
    public void i_upload_files_to_the_system() {
        filePage.uploadFiles();
    }

    @Then("I should see the file name, size, and type displayed for each file")
    public void i_should_see_file_details() {
        Assert.assertTrue(filePage.verifyFileDetails());
    }

    @When("I delete a file using the delete option")
    public void i_delete_a_file_using_the_delete_option() {
        filePage.deleteFile();
    }

    @Then("The file should be removed from the list")
    public void the_file_should_be_removed_from_the_list() {
        Assert.assertTrue(filePage.verifyFileDeleted());
    }
}