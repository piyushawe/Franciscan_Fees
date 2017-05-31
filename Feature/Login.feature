Feature: To login

  Scenario Outline: To login the erp
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened

    Examples: 
      | url                              | uname | password  |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |
