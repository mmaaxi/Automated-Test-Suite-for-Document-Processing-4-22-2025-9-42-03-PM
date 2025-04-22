Feature: Validar descompresión automática de archivos comprimidos

  Scenario: Subir un archivo comprimido y validar su descompresión
    Given el usuario está en la página de carga de archivos
    When el usuario sube un archivo comprimido que contiene múltiples documentos
    Then el sistema debe descomprimir el archivo
    And el sistema lista cada documento para su validación