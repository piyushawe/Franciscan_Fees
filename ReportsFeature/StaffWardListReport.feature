Feature: Staff Ward List Report
      As a user I would like to open staff ward list report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test staff ward list report on the basis of filters
    Then staff ward list report page is opened
    Then user select class "<class>" on staff ward list report
    Then user select section "<section>" on staff ward list report
    #Then user select staff ward "<staff name>" on staff ward list report
    Then user click show on staff ward list report

    Examples: 
      | class | section | staff name    |
      |     1 | A       | ANJANA MISHRA |

  # with no filter
  @scenario2
  Scenario: To test staff ward list report on the basis of filters
    Then staff ward list report page is opened
    Then user click show on staff ward list report
