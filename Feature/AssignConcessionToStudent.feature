Feature: Assign concession to student
    As a user I would like to assign concession to student 
    So that I don't have to do it myself

  @scenario1
  Scenario Outline: To test assign concession to student
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then assign concession to student page is opened
    Then select class "<class>" on assign concession to student page
    Then select section "<section>" on assign concession to student page
    Then assign concession "<concession>" to student "<name>" on assign concession to student page
    Then click update on assign concession to student page

    Examples: 
      | url                              | uname | password  | class | section | concession                           | name   |
      | http://qaerp.franciscanecare.net | admin | Admin@987 | test1 | A       | 100% Concession on Tuition Fee APRIL | sonia5 |
