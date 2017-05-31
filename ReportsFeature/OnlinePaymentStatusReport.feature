Feature: Online Payment Status Report
      As a user I would like to open online payment status report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario: To test online payment status report
    Then online payment status report is opened
    Then user select from date as month "April" year "2017" and day "1" on online payment status report
    Then user select to date as month "March" year "2018" and day "31" on online payment status report
    Then clicks show button on online payment status report
