Feature: Transport Report Class Wise
      As a user I would like to open transport report class wise
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test transport report class wise when class wise is selected
    Then transport report class wise page is opened
    Then user click class wise on transport report class wise page
    Then user select installment "<installment>" on transport report class wise page
    Then user enter stop fare "1000" on transport report class wise page
    Then user select class "<class-sec>" on transport report class wise page
    Then user click show on transport report class wise page

    Examples: 
      | class-sec | installment |
      | 1-A       | APRIL-JUNE  |

  @scenario2
  Scenario Outline: To test transport report class wise when classbus stop wise is selected
    Then transport report class wise page is opened
    Then user click bus stop wise on transport report class wise page
    Then user select installment "<installment>" on transport report class wise page
    Then user select route "<route>" on transport report class wise page
    Then user select bus stop "<stop>" on transport report class wise page
    Then user click show on transport report class wise page

    Examples: 
      | installment | route | stop |
      | APRIL-JUNE  | R01   | A1   |

  #with no filter
  @scenario3
  Scenario Outline: To test class wise with no filters
    Then transport report class wise page is opened
    Then user click class wise on transport report class wise page
    Then user select class "<class-sec>" on transport report class wise page
    Then user click show on transport report class wise page

    Examples: 
      | class-sec |
      | 1-A       |

  @scenario4
  Scenario: To test bus stop wise with no filters
    Then transport report class wise page is opened
    Then user click bus stop wise on transport report class wise page
    Then user click show on transport report class wise page
