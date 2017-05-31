Feature: Category Gender Wise Student Strength report
    As a user I would like to open category gender wise student strength report
    So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test category gender wise student strength report by category wise
    Then category gender wise student strength report is opened
    Then user select class "<class>" on category gender wise student strength report
    Then user click on category wise category gender wise student strength report
    Then user click show on category gender wise student strength report

    Examples: 
      | class |
      | 1     |

  @scenario2
  Scenario Outline: To test category gender wise student strength report by gender wise
    Then category gender wise student strength report is opened
    Then user select class "<class>" on category gender wise student strength report
    Then user click gender wise on category gender wise student strength report
    Then user click show on category gender wise student strength report

    Examples: 
      | class |
      | 1     |

  @scenario3
  Scenario Outline: To test category gender wise student strength report by category and gender wise
    Then category gender wise student strength report is opened
    Then user select class "<class>" on category gender wise student strength report
    Then user check click for section wise checkbox on category gender wise student strength report
    Then user select section "<section>" on category gender wise student strength report
    Then user click on category and gender wise on category gender wise student strength report
    Then user click show on category gender wise student strength report

    Examples: 
      | class | section |
      | 1     | A       |

  # without filters
  @scenario4
  Scenario: To test category wise without section
    Then category gender wise student strength report is opened
    Then user click on category wise category gender wise student strength report
    Then user click show on category gender wise student strength report

  @scenario5
  Scenario: To test gender wise without section
    Then category gender wise student strength report is opened
    Then user click gender wise on category gender wise student strength report
    Then user click show on category gender wise student strength report

  @scenario6
  Scenario: To test category and gender wise without section
    Then category gender wise student strength report is opened
    Then user click on category and gender wise on category gender wise student strength report
    Then user click show on category gender wise student strength report

  @scenario7
  Scenario: To test category wise with section
    Then category gender wise student strength report is opened
    Then user check click for section wise checkbox on category gender wise student strength report
    Then user click on category wise category gender wise student strength report
    Then user click show on category gender wise student strength report

  @scenario8
  Scenario: To test gender wise with section
    Then category gender wise student strength report is opened
    Then user check click for section wise checkbox on category gender wise student strength report
    Then user click gender wise on category gender wise student strength report
    Then user click show on category gender wise student strength report

  @scenario9
  Scenario: To test category and gender wise with section
    Then category gender wise student strength report is opened
    Then user check click for section wise checkbox on category gender wise student strength report
    Then user click on category and gender wise on category gender wise student strength report
    Then user click show on category gender wise student strength report
