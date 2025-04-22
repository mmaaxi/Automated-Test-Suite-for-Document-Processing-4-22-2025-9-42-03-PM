package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("^El usuario navega a la página de carga de archivos$")
    public void navigateToFileUploadPage() {
        page.openFileUploadPage();
    }

    @When("^El usuario sube un archivo corrupto$")
    public void uploadCorruptFile() {
        page.uploadCorruptFile();
    }

    @Then("^El sistema detecta el fallo$")
    public void systemDetectsFailure() {
        Assert.assertTrue(page.isFailureDetected());
    }

    @Then("^El sistema notifica el error al Bróker$")
    public void systemNotifiesBroker() {
        Assert.assertTrue(page.isErrorNotifiedToBroker());
    }

    @Then("^El sistema finaliza el procesamiento$")
    public void systemEndsProcessing() {
        Assert.assertTrue(page.isProcessingEnded());
    }
}