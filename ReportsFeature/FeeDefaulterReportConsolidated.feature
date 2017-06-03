Feature: Fee Defaulter Report Consolidated
     As a user I would like to open fee defaulter report consolidated
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fee defaulter report consolidated with different filters
    Then fee defaulter report consolidated page is opened
    Then user select school "<school>" on fee defaulter report consolidated page
    Then user select class "<class>" on fee defaulter report consolidated page
    Then user select section "<section>" on fee defaulter report consolidated page
    Then user select fee type "<fee type>" on fee defaulter report consolidated page
    Then user select installment "<installment>" on fee defaulter report consolidated page
    Then user click date range on fee defaulter report consolidated page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter report consolidated page
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report consolidated page
    Then user click with fine on fee defaulter report consolidated page
    Then user click show on fee defaulter report consolidated page

    Examples: 
      | class | school                         | fee type | installment | section |
      |     1 | Convent of Jesus & Mary School | SCHOOL   | APRIL       | A       |

  #with no filter
  @scenario2
  Scenario: To test fee defaulter report consolidated with date range
    Then fee defaulter report consolidated page is opened
    Then user click date range on fee defaulter report consolidated page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter report consolidated page
    Then user select till date as month "March" year"2018" and day "31" on fee defaulter report consolidated page
    Then user click show on fee defaulter report consolidated page

  @scenario3
  Scenario: To test fee defaulter report consolidated with date range and fine
    Then fee defaulter report consolidated page is opened
    Then user click date range on fee defaulter report consolidated page
    Then user select from date as month "April" year"2017" and day "1" on fee defaulter report consolidated page
    Then user select till date as month "March" year"2018" and day "31" on fee defaulter report consolidated page
    Then user click with fine on fee defaulter report consolidated page
    Then user click show on fee defaulter report consolidated page

  @scenario4
  Scenario: To test fee defaulter report consolidated with till date
    Then fee defaulter report consolidated page is opened
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report consolidated page
    Then user click show on fee defaulter report consolidated page

  @scenario5
  Scenario: To test fee defaulter report consolidated with till date and fine
    Then fee defaulter report consolidated page is opened
    Then user select till date as month "May" year"2017" and day "31" on fee defaulter report consolidated page
    Then user click with fine on fee defaulter report consolidated page
    Then user click show on fee defaulter report consolidated page
