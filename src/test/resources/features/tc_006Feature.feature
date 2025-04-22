Feature: Validate correct integration and processing of OCR and METIQ

  Scenario: Upload structured and unstructured documents and validate processing
    Given the user is on the document upload page
    When the user uploads structured and unstructured documents
    Then the system should process the documents with OCR
    And the system should extract data
    And the system should display the information for confirmation