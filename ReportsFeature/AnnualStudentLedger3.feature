Feature: Annual Student Ledger3
   As a user I would like to open annual student ledger3
   So that I don't have to do it myself

  Background: 
    Given user enters url"http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test annual student ledger3 with different filters
    Then annual student ledger three page is opened
    Then user select installment "<installment>" on annual student ledger three page
    Then user select class"<class>" on annual student ledger three page
    Then user select section"<section>" on annual student ledger three page
    Then user click show on annual student ledger three page

    Examples: 
      | class | section | installment |
      | 1     | A       | APRIL       |

  #with no filter
  @scenario2
  Scenario: To test annual student ledger3 with different filters
    Then annual student ledger three page is opened
    Then user click show on annual student ledger three page
