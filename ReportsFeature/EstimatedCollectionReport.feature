Feature: Estimated Collection Report
     As a user I would like to open estimated collection report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test estimated collection report when consolidate filter is selected
    Then estimated collection report is opened
    Then user select school "<school>" on estimated collection report
    Then user select fee type "<fee type>" on estimated collection report
    Then user select user "eCare Admin" on estimated collection report
    Then user select report filter "Consolidate" on estimated collection report
    Then user click show on estimated collection report

    Examples: 
      | class-sec | school                         | fee type |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   |

  @scenario2
  Scenario Outline: To test estimated collection report when class wise filter is selected
    Then estimated collection report is opened
    Then user select class "<class-sec>" on estimated collection report
    Then user select fee type "<fee type>" on estimated collection report
    Then user select installment "<installment>" on estimated collection report
    Then user select till date as month "April" year "2017" and day "30" on estimated collection report
    Then user select report filter "Class Wise" on estimated collection report
    Then user click show on estimated collection report

    Examples: 
      | class-sec | school                         | fee type | installment |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  #with no filter
  @scenario3
  Scenario: To test estimated collection report when no filter is selected
    Then estimated collection report is opened
    Then user select till date as month "May" year "2017" and day "31" on estimated collection report
    Then user click show on estimated collection report
