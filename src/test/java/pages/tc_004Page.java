package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    // Navegar a la página de carga de archivos
    public void navigateToFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    // Subir archivo comprimido
    public void uploadCompressedFile(String filePath) {
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys(filePath);
        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();
    }

    // Verificar descompresión de archivos
    public boolean isFileDecompressed() {
        WebElement successMessage = driver.findElement(By.id("decompress-success"));
        return successMessage.isDisplayed();
    }

    // Verificar listado de documentos
    public boolean areDocumentsListedForValidation() {
        WebElement fileList = driver.findElement(By.id("file-list"));
        return fileList.isDisplayed() && fileList.findElements(By.tagName("li")).size() > 0;
    }
}