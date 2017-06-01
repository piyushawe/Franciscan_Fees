Feature: Cancelled Fees Receipt Report
   As a user I would like to open cancelled fee receipt report
   So that I don't have to open it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test cancelled fee receipt report and find a student on report
    Then user opens cancelled fees receipt report page
    Then user selects from date as month"April" year"2017" and day"15"
    Then user selects to date as month"May" year"2017" and day"15"
    Then user clicks on show
    Then user enter name "<name>" and click find on cancelled fees receipt report page

    Examples: 
      | name   |
      | aarohi |

  # with no filters
  @scenario2
  Scenario: To test for a complete session
    Then user opens cancelled fees receipt report page
    Then user selects from date as month"April" year"2017" and day"1"
    Then user selects to date as month"March" year"2018" and day"31"
    Then user clicks on show
