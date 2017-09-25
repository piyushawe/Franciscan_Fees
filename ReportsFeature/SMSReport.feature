Feature: SMS Report
      As a user I would like to open sms report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario: To test SMS report based on filters
    Then sms report page is opened
    Then user select from date as month "April" year"2017" and day "1" on sms report
    Then user select to date as month "May" year"2017" and day "31" on sms report
    Then user click on show on sms report

  @scenario2
  Scenario Outline: To test SMS report based on sms type
    Then sms report page is opened
    Then user select from date as month "April" year"2017" and day "1" on sms report
    Then user select to date as month "May" year"2017" and day "31" on sms report
    Then user select sms type "<sms type>" on sms report
    Then user click on show on sms report

    Examples: 
      | sms type      |
      | Defaulter SMS |

  #with no filter
  @scenario3
  Scenario: To test SMS report with no filter
    Then sms report page is opened
    Then user click on show on sms report
