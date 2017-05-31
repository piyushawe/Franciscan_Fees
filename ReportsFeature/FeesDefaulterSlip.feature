Feature: Fees Defaulter Slip
     As a user I would like to open fees defaulter slip
     So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fees defaulter slip with different filters
    Then fees defaulter slip page is opened
    Then user select school "<school>" on fees defaulter slip page
    Then user select class "<class>" on fees defaulter slip page
    Then user select section "<section>" on fees defaulter slip page
    Then user select fee type "<fee type>" on fees defaulter slip page
    Then user select installment "<installment>" on fees defaulter slip page
    Then user click date range on fees defaulter slip page
    Then user select from date as month "April" year "2017" and day "1" on fees defaulter slip page
    Then user select to date as month "May" year "2017" and day "27" on fees defaulter slip page
    Then user click with fine on fees defaulter slip page
    Then user click show on fees defaulter slip page

    Examples: 
      | class | school                         | fee type | installment | section |
      |     1 | Convent of Jesus & Mary School | SCHOOL   | APRIL       | A       |

  @scenario2
  Scenario Outline: To test fees defaulter slip with different filters
    Then fees defaulter slip page is opened
    Then user select class "<class>" on fees defaulter slip page
    Then user select section "<section>" on fees defaulter slip page
    Then user click date range on fees defaulter slip page
    Then user select from date as month "April" year "2017" and day "1" on fees defaulter slip page
    Then user select to date as month "May" year "2017" and day "27" on fees defaulter slip page
    Then user click show on fees defaulter slip page

    Examples: 
      | class | section |
      |     1 | A       |

  #with no filter
  @scenario3
  Scenario: To test fees defaulter slip with till date
    Then fees defaulter slip page is opened
    Then user select to date as month "May" year "2017" and day "31" on fees defaulter slip page
    Then user click show on fees defaulter slip page

  @scenario4
  Scenario: To test fees defaulter slip with date range
    Then fees defaulter slip page is opened
    Then user click date range on fees defaulter slip page
    Then user select from date as month "April" year "2017" and day "1" on fees defaulter slip page
    Then user select to date as month "March" year "2018" and day "31" on fees defaulter slip page
    Then user click show on fees defaulter slip page

  @scenario5
  Scenario: To test fees defaulter slip with till date and fine
    Then fees defaulter slip page is opened
    Then user select to date as month "May" year "2017" and day "31" on fees defaulter slip page
    Then user click with fine on fees defaulter slip page
    Then user click show on fees defaulter slip page

  @scenario6
  Scenario: To test fees defaulter slip with date range and fine
    Then fees defaulter slip page is opened
    Then user click date range on fees defaulter slip page
    Then user select from date as month "April" year "2017" and day "1" on fees defaulter slip page
    Then user select to date as month "March" year "2018" and day "31" on fees defaulter slip page
    Then user click with fine on fees defaulter slip page
    Then user click show on fees defaulter slip page
