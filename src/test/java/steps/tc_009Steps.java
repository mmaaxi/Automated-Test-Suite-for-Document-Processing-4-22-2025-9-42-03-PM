package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page fileUploadPage = new tc_009Page();

    @Given("el usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        fileUploadPage.navigate();
    }

    @When("el usuario carga un archivo de {int} MB")
    public void elUsuarioCargaUnArchivoDeMB(int fileSize) {
        fileUploadPage.uploadFile(fileSize);
    }

    @Then("el tiempo de carga y procesamiento es inferior al tiempo especificado")
    public void elTiempoDeCargaYProcesamientoEsInferiorAlTiempoEspecificado() {
        long loadTime = fileUploadPage.getLoadTime();
        Assert.assertTrue(loadTime < fileUploadPage.getExpectedLoadTime());
    }

    @When("el usuario mide el tiempo de respuesta desde la selección hasta la vista previa")
    public void elUsuarioMideElTiempoDeRespuesta() {
        fileUploadPage.measureResponseTime();
    }

    @Then("el tiempo total está dentro de los límites establecidos")
    public void elTiempoTotalEstaDentroDeLosLimitesEstablecidos() {
        long responseTime = fileUploadPage.getResponseTime();
        Assert.assertTrue(responseTime < fileUploadPage.getExpectedResponseTime());
    }
}