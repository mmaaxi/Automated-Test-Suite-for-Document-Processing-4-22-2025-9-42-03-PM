package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void user_on_documents_upload_page() {
        driver = new ChromeDriver();
        driver.get("http://url-to-document-upload-page.com");
        page = new tc_005Page(driver);
    }

    @When("el usuario intenta iniciar el proceso de carga sin un documento obligatorio")
    public void user_attempts_to_upload_without_required_document() {
        page.attemptUploadWithoutDocument();
    }

    @Then("el sistema muestra un mensaje de error indicando que el documento es obligatorio")
    public void system_shows_error_message_for_missing_document() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}