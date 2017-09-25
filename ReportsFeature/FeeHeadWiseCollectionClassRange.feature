Feature: Fee Head Wise Collection Class Range Report
     As a user I would like to open fee defaulter report with receiving
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fee head wise collection class range report with different filters
    Then fee head wise collection class range report is opened
    Then user select entry mode "School" on fee head wise collection class range report
    Then user select from date as month "April" year "2017" and day "1" on fee head wise collection class range report
    Then user select to date as month "May" year "2017" and day "31" on fee head wise collection class range report
    Then user select class "<class-sec>" on fee head wise collection class range report
    Then user select fee type "<fee type>" on fee head wise collection class range report
    Then user select school "<school>" on fee head wise collection class range report
    Then user select pay mode "Cash" and "Cheque" on fee head wise collection class range report
    Then user select user "eCare Admin" on fee head wise collection class range report
    Then user click show on fee head wise collection class range report

    Examples: 
      | class-sec | school                         | fee type |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   |

  #with no filter
  @scenario2
  Scenario: To test when no filter is selected
    Then fee head wise collection class range report is opened
    Then user select from date as month "April" year "2017" and day "1" on fee head wise collection class range report
    Then user select to date as month "March" year "2018" and day "31" on fee head wise collection class range report
    Then user click show on fee head wise collection class range report
