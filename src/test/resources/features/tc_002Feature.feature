Feature: File Upload Validation and Preview
  Scenario: Validate file upload with valid format and preview

    Given the user is on the file upload page
    When the user selects a valid PDF/DOCX file less than 50MB
    Then the file is uploaded successfully
    And the preview shows the file name, size, and type