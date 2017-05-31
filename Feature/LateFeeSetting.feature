Feature: Franciscan ERP

  @scenario1
  Scenario Outline: Late Fee Setting
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then late fee setting page is opened
    Then user select late fee type "<late fee type>" on late fee setting page

    Examples: 
      | url                              | uname | password  | late fee type |
      | http://qaerp.franciscanecare.net | admin | Admin@987 | Per Month     |
