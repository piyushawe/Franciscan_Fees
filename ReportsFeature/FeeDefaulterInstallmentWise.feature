Feature: Fee Defaulter Installment Wise
     As a user I would like to open fee defaulter installment wise report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fee defaulter installment wise report with fine
    Then fee defaulter installment wise page is opened
    Then user select school "<school>" on fee defaulter installment wise page
    Then user select class "<class>" on fee defaulter installment wise page
    Then user select section "<section>" on fee defaulter installment wise page
    Then user select fee type "<fee type>" on fee defaulter installment wise page
    Then user select installment "<installment>" on fee defaulter installment wise page
    Then user click date range on fee defaulter installment wise page
    Then user select from date as month "May" year"2017" and day "1" on fee defaulter installment wise page
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter installment wise page
    Then user click with fine on fee defaulter installment wise page
    Then user click show on fee defaulter installment wise page

    Examples: 
      | class | school                         | fee type | installment | section |
      |     1 | Convent of Jesus & Mary School | SCHOOL   | APRIL       | A       |

  @scenario2
  Scenario Outline: To test fee defaulter installment wise report with fine and date range
    Then fee defaulter installment wise page is opened
    Then user select class "<class>" on fee defaulter installment wise page
    Then user select section "<section>" on fee defaulter installment wise page
    Then user select fee type "<fee type>" on fee defaulter installment wise page
    Then user select installment "<installment>" on fee defaulter installment wise page
    Then user select route "<route>" on fee defaulter installment wise page
    Then user select vehicle "<vehicle>" on fee defaulter installment wise page
    Then user click date range on fee defaulter installment wise page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter installment wise page
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter installment wise page
    Then user click with fine on fee defaulter installment wise page
    Then user click show on fee defaulter installment wise page

    Examples: 
      | class | fee type | installment | route        | vehicle        | section |
      |     1 | SCHOOL   | APRIL       | All Route(s) | All Vehicle(s) | A       |

  #with no filter
  @scenario3
  Scenario: To test with date range and fine
    Then fee defaulter installment wise page is opened
    Then user click date range on fee defaulter installment wise page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter installment wise page
    Then user select till date as month "March" year"2018" and day "31" on fee defaulter installment wise page
    Then user click with fine on fee defaulter installment wise page
    Then user click show on fee defaulter installment wise page

  @scenario4
  Scenario: To test with date range without fine
    Then fee defaulter installment wise page is opened
    Then user click date range on fee defaulter installment wise page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter installment wise page
    Then user select till date as month "March" year"2018" and day "31" on fee defaulter installment wise page
    Then user click show on fee defaulter installment wise page

  @scenario5
  Scenario: To test with till date without fine
    Then fee defaulter installment wise page is opened
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter installment wise page
    Then user click show on fee defaulter installment wise page

  @scenario6
  Scenario: To test with till date and fine
    Then fee defaulter installment wise page is opened
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter installment wise page
    Then user click with fine on fee defaulter installment wise page
    Then user click show on fee defaulter installment wise page
