Feature: Validar manejo de error en procesamiento OCR por archivo corrupto

  Scenario: Subir un archivo corrupto que afecte el proceso OCR
    Given El usuario navega a la página de carga de archivos
    When El usuario sube un archivo corrupto
    Then El sistema detecta el fallo
    And El sistema notifica el error al Bróker
    And El sistema finaliza el procesamiento