Feature: Student Health Entry Report
      As a user I would like to open student health entry report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test with a specific class
    Then student health entry report page is opened
    Then user select class "<class-sec>" on student health entry report page
    Then user click show on student health entry report page

    Examples: 
      | class-sec |
      | 1-A       |

  #with no filter
  @scenario2
  Scenario: To test with all classes
    Then student health entry report page is opened
    Then user click show on student health entry report page
