Feature: Fees Concession Install HeadWise
     As a user I would like to open fees concession install headwise report 
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fees concession install headwise report when fee head wise is selected
    Then fees concession install headwise page is opened
    Then user select school "<school>" on fees concession install headWise page
    Then user select class "<class>" on fees concession install headWise page
    Then user select section "<section>" on fees concession install headWise page
    Then user select fee type "<fee type>" on fees concession install headWise page
    Then user click fee head wise on fees concession install headWise page
    Then user click paid concession on fees concession install headWise page
    Then user click assigned on fees concession install headWise page
    Then user click show on fees concession install headWise page

    Examples: 
      | class | school              | fee type | section |
      | 1     | Delhi Public School | SCHOOL   | A       |

  @scenario2
  Scenario Outline: To test fees concession install headwise report when installment wise is selected
    Then fees concession install headwise page is opened
    Then user select school "<school>" on fees concession install headWise page
    Then user select class "<class>" on fees concession install headWise page
    Then user select section "<section>" on fees concession install headWise page
    Then user select fee type "<fee type>" on fees concession install headWise page
    Then user click installment wise on fees concession page
    Then user select installment "<installment>" on fees concession install headWise page
    Then user select till date as month "April" year "2017" and day"30" on fees concession install headWise page
    Then user click entry time on fees concession install headWise page
    Then user click assigned on fees concession install headWise page
    Then user click show on fees concession install headWise page

    Examples: 
      | class | school              | fee type | installment | section |
      | 1     | Delhi Public School | SCHOOL   | APRIL-JUNE  | A       |

  #with no filter
  @scenario3
  Scenario: To test fee head wise when all checkboxes are selected
    Then fees concession install headwise page is opened
    Then user click fee head wise on fees concession install headWise page
    Then user click paid concession on fees concession install headWise page
    Then user click assigned on fees concession install headWise page
    Then user click entry time on fees concession install headWise page
    Then user click show on fees concession install headWise page

  @scenario4
  Scenario: To test fee head wise when all checkboxes are not selected
    Then fees concession install headwise page is opened
    Then user click fee head wise on fees concession install headWise page
    Then user click show on fees concession install headWise page

  @scenario5
  Scenario: To test installment wise when all checkboxes are selected
    Then fees concession install headwise page is opened
    Then user click installment wise on fees concession page
    Then user click paid concession on fees concession install headWise page
    Then user click assigned on fees concession install headWise page
    Then user click entry time on fees concession install headWise page
    Then user click show on fees concession install headWise page

  @scenario6
  Scenario: To test installment wise when all checkboxes are not selected
    Then fees concession install headwise page is opened
    Then user click installment wise on fees concession page
    Then user click show on fees concession install headWise page
