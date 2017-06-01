Feature: Fee Defaulter Report With Receiving
     As a user I would like to open fee defaulter report with receiving
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fee defaulter report with receiving with different filters
    Then fee defaulter report with receiving page is opened
    Then user select class "<class>" on fee defaulter report with receiving page
    Then user select section "<section>" on fee defaulter report with receiving page
    Then user select fee type "<fee type>" on fee defaulter report with receiving page
    Then user select installment "<installment>" on fee defaulter report with receiving page
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report with receiving page
    Then user click with fine on fee defaulter report with receiving page
    Then user click show on fee defaulter report with receiving page

    Examples: 
      | class | fee type | installment | section |
      |     1 | SCHOOL   | APRIL       | A       |

  @scenario2
  Scenario Outline: To test fee defaulter report with receiving with different filters
    Then fee defaulter report with receiving page is opened
    Then user select school "<school>" on fee defaulter report with receiving page
    Then user select class "<class>" on fee defaulter report with receiving page
    Then user select section "<section>" on fee defaulter report with receiving page
    Then user select installment "<installment>" on fee defaulter report with receiving page
    Then user click date range on fee defaulter report with receiving page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter report with receiving page
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report with receiving page
    Then user click with fine on fee defaulter report with receiving page
    Then user click show on fee defaulter report with receiving page

    Examples: 
      | class | school                         | fee type | installment | section |
      |     1 | Convent of Jesus & Mary School | SCHOOL   | APRIL       | A       |

  #with no filter
  @scenario3
  Scenario: To test fee defaulter report with receiving with till date
    Then fee defaulter report with receiving page is opened
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report with receiving page
    Then user click show on fee defaulter report with receiving page

  @scenario4
  Scenario: To test fee defaulter report with receiving with till date and fine
    Then fee defaulter report with receiving page is opened
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report with receiving page
    Then user click with fine on fee defaulter report with receiving page
    Then user click show on fee defaulter report with receiving page

  @scenario5
  Scenario: To test fee defaulter report with receiving with date range
    Then fee defaulter report with receiving page is opened
    Then user click date range on fee defaulter report with receiving page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter report with receiving page
    Then user select till date as month "March" year"2018" and day "31" on fee defaulter report with receiving page
    Then user click show on fee defaulter report with receiving page

  @scenario6
  Scenario: To test fee defaulter report with receiving with date range and fine
    Then fee defaulter report with receiving page is opened
    Then user click date range on fee defaulter report with receiving page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter report with receiving page
    Then user select till date as month "March" year"2018" and day "31" on fee defaulter report with receiving page
    Then user click with fine on fee defaulter report with receiving page
    Then user click show on fee defaulter report with receiving page
