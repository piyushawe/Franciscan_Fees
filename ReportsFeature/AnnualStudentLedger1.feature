Feature: Annual Student Ledger1
    As a user I would like to open annual student ledger1 
    So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test annual student ledger1 with different filters
    Then annual student ledger1 page is opened
    Then user select class"<class>" on annual student ledger1 page
    Then user select section"<section>" on annual student ledger1 page
    Then user enter the student "<name>" to search on annual student ledger1 page
    Then user select fee type "<fee type>" on annual student ledger1 page
    Then user click show on annual student ledger1 page

    Examples: 
      | class | section | name   | fee type |
      | 1     | A       | aarohi | SCHOOL   |

  #with no filter
  @scenario2
  Scenario Outline: To test annual student ledger1 with no filters
    Then annual student ledger1 page is opened
    Then user enter the student "<name>" to search on annual student ledger1 page
    Then user click show on annual student ledger1 page

    Examples: 
      | name   |
      | aarohi |
