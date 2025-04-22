package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("el usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        page.navigateToFileUploadPage();
    }

    @When("el usuario sube un archivo comprimido que contiene múltiples documentos")
    public void elUsuarioSubeUnArchivoComprimidoQueContieneMultiplesDocumentos() {
        page.uploadCompressedFile("ruta/del/archivo.zip");
    }
    
    @Then("el sistema debe descomprimir el archivo")
    public void elSistemaDebeDescomprimirElArchivo() {
        Assert.assertTrue(page.isFileDecompressed());
    }
    
    @Then("el sistema lista cada documento para su validación")
    public void elSistemaListaCadaDocumentoParaSuValidacion() {
        Assert.assertTrue(page.areDocumentsListedForValidation());
    }
}