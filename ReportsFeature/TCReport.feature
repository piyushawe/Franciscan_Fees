Feature: TC report
      As a user I would like to open TC report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario: To test TC report
    Then tc report page is opened
    Then user enter from date as month "March" year "2017" and day "1" on tc report page
    Then user enter to date as month "March" year "2017" and day "31" on tc report page
    Then user select tc type "Generated TC" on tc report page
    Then user select order by "Issue Date" on tc report page
    Then user click show on tc report page

  #with no filter
  @scenario2
  Scenario: To test TC report
    Then tc report page is opened
    Then user click show on tc report page
