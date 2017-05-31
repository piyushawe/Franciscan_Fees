Feature: Route Wise Student Strength
      As a user I would like to open route wise student strength report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test route wise student strength report with filters
    Then route wise student strength page is opened
    Then user select school "<school>" on route wise student strength page
    Then user select route "<route>" on route wise student strength page
    Then user select class "<class>" on route wise student strength page
    Then user select installment "<installment>" on route wise student strength page
    Then user click show on route wise student strength page

    Examples: 
      | class | school              | route | installment |
      | 1     | Delhi Public School | R01   | APRIL-JUNE  |

  #with no filter
  @scenario2
  Scenario: To test route wise student strength report with no filter selected
    Then route wise student strength page is opened
    Then user click show on route wise student strength page

  @scenario3
  Scenario: To test route wise student strength report student wise
    Then route wise student strength page is opened
    And user click student wise on route wise student strength page
    Then user click show on route wise student strength page

  @scenario4
  Scenario: To test route wise student strength report with route wise summary
    Then route wise student strength page is opened
    And user click route wise summary on route wise student strength page
    Then user click show on route wise student strength page
