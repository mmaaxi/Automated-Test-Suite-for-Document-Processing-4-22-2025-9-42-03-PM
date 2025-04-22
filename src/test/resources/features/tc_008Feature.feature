Feature: Validate file preview usability and delete functionality

  Scenario: Validate file upload preview and deletion
    Given I upload files to the system
    Then I should see the file name, size, and type displayed for each file
    When I delete a file using the delete option
    Then The file should be removed from the list