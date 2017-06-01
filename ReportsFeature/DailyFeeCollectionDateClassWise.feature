Feature: Daily Fee Collection Date Class Wise
     As a user I would like to open daily fee collection date class wise report with different options
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test daily fee collection date class wise on the basis of class and section
    Then user opens daily fee collection date class wise report
    Then user select class"<class>" on daily fee collection date class wise report
    Then user select section"<section>" on daily fee collection date class wise report
    Then user click on show on daily fee collection date class wise report

    Examples: 
      | class | section |
      | 1     | A       |

  @scenario2
  Scenario Outline: To test daily fee collection date class wise on the basis of different filters
    Then user opens daily fee collection date class wise report
    Then user select class"<class>" on daily fee collection date class wise report
    Then user select section"<section>" on daily fee collection date class wise report
    Then user enter student"<name>" on daily fee collection date class wise report
    Then user select order by"Slip No." on daily fee collection date class wise report
    Then user select user"eCare Admin" on daily fee collection date class wise report
    Then user click on show on daily fee collection date class wise report

    Examples: 
      | class | section | name   |
      | 1     | A       | aarohi |

  #with no filter
  @scenario3
  Scenario: To test daily fee collection date class wise when no filter is selected
    Then user opens daily fee collection date class wise report
    Then user click on show on daily fee collection date class wise report
