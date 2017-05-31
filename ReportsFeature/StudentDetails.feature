Feature: Student Details
     As a user I would like to open student details report
     So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario: To open student details report with no filter selected
    Then student details report page is opened
    Then click on show on student details report page

  @scenario2
  Scenario: To open student details report
    Then student details report page is opened
    And click group by class on student details page
    Then click on show on student details report page
