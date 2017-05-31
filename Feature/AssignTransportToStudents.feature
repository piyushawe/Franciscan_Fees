Feature: Assign transport to students
    As a user I would like to assign transport to students
    So that I don't have to do it myself

  @scenario1
  Scenario Outline: Assign transport to students
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then assign transport to students page is opened
    Then user select class "<class>" on assign transport to students page
    Then user select section "<section>" on assign transport to students page
    Then assign transport to "<name>" route "<route>" stop "<stop>" vehicle "<vehicle>" and months "<months>" on assign transport to students page
    Then user click update on assign transport to students page

    Examples: 
      | url                              | uname | password  | class | section | name   | route | stop | vehicle | months |
      | http://qaerp.franciscanecare.net | admin | Admin@987 | test1 | A       | sonia9 | R01   | A2   | Bus     | all    |
