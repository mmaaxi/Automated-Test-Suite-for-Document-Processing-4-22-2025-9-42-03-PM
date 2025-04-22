package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver = Hooks.driver;
    tc_001Page cargaPagina = PageFactory.initElements(driver, tc_001Page.class);

    @Given("^el usuario está en la página de carga de documentos$")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        cargaPagina.navegarAPaginaDeCarga();
    }

    @When("^selecciona la opción 'cargar documentos'$")
    public void selecciona_opcion_cargar_documentos() {
        cargaPagina.seleccionarOpcionCargarDocumentos();
    }

    @Then("^el sistema muestra opción para carga única y carga múltiple$")
    public void el_sistema_muestra_opciones_de_carga() {
        Assert.assertTrue(cargaPagina.opcionesDeCargaMostradas());
    }

    @When("^elige 'carga en un solo archivo'$")
    public void elige_carga_en_un_solo_archivo() {
        cargaPagina.elegirCargaUnica();
    }

    @Then("^se habilita un único recuadro para subir el archivo$")
    public void se_habilita_unico_recuadro_para_archivo() {
        Assert.assertTrue(cargaPagina.recuadroUnicoHabilitado());
    }

    @When("^elige 'cargar documentos por separado'$")
    public void elige_cargar_documentos_por_separado() {
        cargaPagina.elegirCargaMultiple();
    }

    @Then("^se muestran múltiples recuadros correspondientes a cada documento requerido$")
    public void se_muestran_multiples_recuadros() {
        Assert.assertTrue(cargaPagina.recuadrosMultiplesMostrados());
    }
}