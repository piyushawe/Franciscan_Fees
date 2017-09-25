Feature: Bad Debts Report
    As a user I would like to open bad debts report
    So that I don't have to do it myself

  Background: 
    Given user enters url"http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test bad debts report with all filters
    Then bad debts report page is opened
    Then user select fee type "<fee type>" on bad debts report page
    Then user select class "<class>" on bad debts report page
    Then user select installment "<installment>" on bad debts report page
    Then user click show on bad debts report page

    Examples: 
      | class | installment | fee type |
      | 1     | APRIL-JUNE  | SCHOOL   |

  #with no filters
  @scenario2
  Scenario: To test when no filters are selected
    Then bad debts report page is opened
    Then user click show on bad debts report page
