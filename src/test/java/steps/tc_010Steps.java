package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el usuario ha cargado todos los documentos necesarios")
    public void el_usuario_ha_cargado_todos_los_documentos_necesarios() {
        page.uploadDocuments();
    }

    @When("el sistema procesa los documentos")
    public void el_sistema_procesa_los_documentos() {
        page.processDocuments();
    }

    @Then("el sistema debe generar un 'Slip de salida'")
    public void el_sistema_debe_generar_un_slip_de_salida() {
        Assert.assertTrue(page.isSlipGenerated());
    }

    @Then("los documentos originales y los datos extraídos se guardan en el historial de la solicitud")
    public void los_documentos_originales_y_los_datos_extraidos_se_guardan_en_el_historial_de_la_solicitud() {
        Assert.assertTrue(page.areDocumentsAndDataStoredInHistory());
    }
}