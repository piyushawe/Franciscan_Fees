Feature: Student Ledger Class Wise
      As a user I would like to open student ledger class wise
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test Student Ledger Class Wise report with fine
    Then student ledger class wise page is opened
    Then user select school "<school>" on student ledger class wise page
    Then user select class "<class>" on student ledger class wise page
    Then user select section "<section>" on student ledger class wise page
    Then user select installment "<installment>" on student ledger class wise page
    Then user select with fine on student ledger class wise page
    Then user select date as month "April" year "2017" and day "30" on student ledger class wise page
    Then user click show on student ledger class wise page

    Examples: 
      | class | school              | installment | section |
      | 1     | Delhi Public School | APRIL-JUNE  | A       |

  @scenario2
  Scenario Outline: To test Student Ledger Class Wise report when full year paid fees is selected
    Then student ledger class wise page is opened
    Then user select class "<class>" on student ledger class wise page
    Then user select fee type "<fee type>" on student ledger class wise page
    Then user select only full year paid fees on student ledger class wise page
    Then user click show on student ledger class wise page

    Examples: 
      | class | fee type |
      | 1     | SCHOOL   |

  #with no filter
  @scenario3
  Scenario: To test with fine when full year paid fees is selected
    Then student ledger class wise page is opened
    Then user select only full year paid fees on student ledger class wise page
    Then user select with fine on student ledger class wise page
    Then user click show on student ledger class wise page

  @scenario4
  Scenario: To test with fine when full year paid fees is selected
    Then student ledger class wise page is opened
    Then user click show on student ledger class wise page
