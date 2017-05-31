Feature: Assigned Transport Report
    As a user I would like to open assigned transport report
    So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test assigned transport report based on different filters
    Then assigned transport report page is opened
    Then user select class"<class>" on assigned transport report page
    Then user select section"<section>" on assigned transport report page
    Then user select user "eCare Admin" on assigned transport report page
    Then user click show on assigned transport report page

    Examples: 
      | class | section |
      | 1     | A       |

  @scenario2
  Scenario Outline: To test assigned transport report based on different filters
    Then assigned transport report page is opened
    Then user select class"<class>" on assigned transport report page
    Then user select section"<section>" on assigned transport report page
    Then user select month"<month>" on assigned transport report page
    Then user enter "<name>" in search text box on assigned transport report page
    Then user click show on assigned transport report page

    Examples: 
      | class | section | month | name   |
      | 1     | A       | May   | aarohi |

  #with no filter
  @scenario3
  Scenario: To test assigned transport report with no filter selected
    Then assigned transport report page is opened
    Then user click show on assigned transport report page
