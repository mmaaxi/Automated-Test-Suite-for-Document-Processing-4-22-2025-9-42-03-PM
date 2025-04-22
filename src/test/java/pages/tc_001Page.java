package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    @FindBy(id = "cargarDocumentosBtn")
    WebElement cargarDocumentosBtn;

    @FindBy(id = "opcionCargaUnica")
    WebElement opcionCargaUnica;

    @FindBy(id = "opcionCargaMultiple")
    WebElement opcionCargaMultiple;

    @FindBy(id = "recuadroArchivoUnico")
    WebElement recuadroArchivoUnico;

    @FindBy(css = ".recuadroArchivoMultiple")
    WebElement recuadrosArchivoMultiple;

    // Actions
    public void navegarAPaginaDeCarga() {
        driver.get("http://example.com/carga-documentos");
    }

    public void seleccionarOpcionCargarDocumentos() {
        cargarDocumentosBtn.click();
    }

    public boolean opcionesDeCargaMostradas() {
        return opcionCargaUnica.isDisplayed() && opcionCargaMultiple.isDisplayed();
    }

    public void elegirCargaUnica() {
        opcionCargaUnica.click();
    }

    public boolean recuadroUnicoHabilitado() {
        return recuadroArchivoUnico.isDisplayed();
    }

    public void elegirCargaMultiple() {
        opcionCargaMultiple.click();
    }

    public boolean recuadrosMultiplesMostrados() {
        return recuadrosArchivoMultiple.isDisplayed();
    }
}