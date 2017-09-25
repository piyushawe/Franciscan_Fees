Feature: Annual Student Ledger2
   As a user I would like to open annual student ledger2
   So that I don't have to do it myself

  Background: 
    Given user enters url"http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test annual student ledger2 when all filters are selected
    Then annual student ledger two page is opened
    Then user select class"<class>" on annual student ledger two page
    Then user select section"<section>" on annual student ledger two page
    Then user enter the student "<name>" to search on annual student ledger two page
    Then user select fee type "<fee type>" on annual student ledger two page
    Then user click show on annual student ledger two page

    Examples: 
      | class | section | name   | fee type   |
      |     1 | A       | aarohi | SCHOOL FEE |

  #with no filter
  @scenario2
  Scenario Outline: To test annual student ledger2 with no filter selected
    Then annual student ledger two page is opened
    Then user enter the student "<name>" to search on annual student ledger two page
    Then user click show on annual student ledger two page

    Examples: 
      | name   |
      | aarohi |
