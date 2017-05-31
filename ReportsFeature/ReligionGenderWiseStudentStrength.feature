Feature: Religion Gender Wise Student Strength report
      As a user I would like to open monthly consolidated report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test religion gender wise student strength report religion wise
    Then religion gender wise student strength report is opened
    Then user select class "<class>" on religion gender wise student strength report
    Then user check click for section wise checkbox on religion gender wise student strength report
    Then user select section "<section>" on religion gender wise student strength report
    Then user click religion wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

    Examples: 
      | class | section |
      |     1 | A       |

  @scenario2
  Scenario Outline: To test religion gender wise student strength report gender wise
    Then religion gender wise student strength report is opened
    Then user select class "<class>" on religion gender wise student strength report
    Then user click gender wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

    Examples: 
      | class |
      |     1 |

  @scenario3
  Scenario Outline: To test religion gender wise student strength report religion and gender wise
    Then religion gender wise student strength report is opened
    Then user select class "<class>" on religion gender wise student strength report
    Then user click religion and gender wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

    Examples: 
      | class |
      |     1 |

  # with no filters
  @scenario4
  Scenario: To test religion wise without section
    Then religion gender wise student strength report is opened
    Then user click religion wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

  @scenario5
  Scenario: To test gender wise without section
    Then religion gender wise student strength report is opened
    Then user click gender wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

  @scenario6
  Scenario: To test religion and gender wise without section
    Then religion gender wise student strength report is opened
    Then user click religion and gender wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

  @scenario7
  Scenario: To test religion wise with section
    Then religion gender wise student strength report is opened
    Then user check click for section wise checkbox on religion gender wise student strength report
    Then user click religion wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

  @scenario8
  Scenario: To test gender wise with section
    Then religion gender wise student strength report is opened
    Then user check click for section wise checkbox on religion gender wise student strength report
    Then user click gender wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report

  @scenario9
  Scenario: To test religion and gender wise with section
    Then religion gender wise student strength report is opened
    Then user check click for section wise checkbox on religion gender wise student strength report
    Then user click religion and gender wise on religion gender wise student strength report
    Then user click show on religion gender wise student strength report
