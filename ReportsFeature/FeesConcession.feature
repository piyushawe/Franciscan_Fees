Feature: Fees Concession report
     As a user I would like to open fees concession report 
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fees concession report when paid concession and assigned is selected
    Then fees concession page is opened
    Then user select school "<school>" on fees concession page
    Then user select class "<class>" on fees concession page
    Then user select section "<section>" on fees concession page
    Then user select fee type "<fee type>" on fees concession page
    Then user click consolidated on fees concession page
    Then user click paid concession on fees concession page
    Then user click assigned on fees concession page
    Then user click show on fees concession page

    Examples: 
      | class | school              | fee type | installment | section |
      | 1     | Delhi Public School | SCHOOL   | APRIL-JUNE  | A       |

  @scenario2
  Scenario Outline: To test fees concession report when entry time and assigned is selected
    Then fees concession page is opened
    Then user select school "<school>" on fees concession page
    Then user select class "<class>" on fees concession page
    Then user select section "<section>" on fees concession page
    Then user select fee type "<fee type>" on fees concession page
    Then user click separated on fees concession page
    Then user select installment "<installment>" on fees concession page
    Then user select till date as month "April" year "2017" and day"30" on fees concession page
    Then user click entry time on fees concession page
    Then user click assigned on fees concession page
    Then user click show on fees concession page

    Examples: 
      | class | school              | fee type | installment | section |
      | 1     | Delhi Public School | SCHOOL   | APRIL-JUNE  | A       |

  #with no filter
  @scenario3
  Scenario: To test when all checkboxes are selected with consolidated
    Then fees concession page is opened
    Then user click consolidated on fees concession page
    Then user click paid concession on fees concession page
    Then user click entry time on fees concession page
    Then user click show on fees concession page

  @scenario4
  Scenario: To test with consolidated when all checkboxes are not selected
    Then fees concession page is opened
    Then user click consolidated on fees concession page
    Then user click assigned on fees concession page
    Then user click show on fees concession page

  @scenario5
  Scenario: To test when all checkboxes are selected with separated
    Then fees concession page is opened
    Then user click separated on fees concession page
    Then user click paid concession on fees concession page
    Then user click entry time on fees concession page
    Then user click show on fees concession page

  @scenario6
  Scenario: To test with separated when all checkboxes are not selected
    Then fees concession page is opened
    Then user click separated on fees concession page
    Then user click assigned on fees concession page
    Then user click show on fees concession page
