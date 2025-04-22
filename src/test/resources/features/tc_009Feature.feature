Feature: Validar rendimiento en la carga de archivos de diferentes tamaños

  Scenario: Cargar archivos pequeños y medir tiempos de respuesta
    Given el usuario está en la página de carga de archivos
    When el usuario carga un archivo de 3 MB
    Then el tiempo de carga y procesamiento es inferior al tiempo especificado

    When el usuario carga un archivo de 6 MB
    Then el tiempo de carga y procesamiento es inferior al tiempo especificado

    And el usuario mide el tiempo de respuesta desde la selección hasta la vista previa
    Then el tiempo total está dentro de los límites establecidos