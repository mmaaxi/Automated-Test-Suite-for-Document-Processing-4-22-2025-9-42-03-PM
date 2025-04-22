Feature: Validar obligatoriedad de documentos en la carga

  Scenario: Intentar iniciar proceso de carga sin documento obligatorio
    Given el usuario está en la página de carga de documentos
    When el usuario intenta iniciar el proceso de carga sin un documento obligatorio
    Then el sistema muestra un mensaje de error indicando que el documento es obligatorio