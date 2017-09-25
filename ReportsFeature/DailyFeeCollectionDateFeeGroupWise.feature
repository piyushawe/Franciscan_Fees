Feature: Daily Fee Collection Date Fee Group Wise Report
     As a user I would like to open daily fee collection date fee group wise report with different options
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test daily fee collection date fee group wise report when full details is clicked
    Then daily fee collection date fee group wise report is opened
    Then user select entry mode "School" on daily fee collection date fee group wise report
    Then user select school "<school>" on daily fee collection date fee group wise report
    Then user select class "<class>" on daily fee collection date fee group wise report
    Then user select fee type "<fee type>" on daily fee collection date fee group wise report
    Then user select pay mode "Cash" and "Cheque" on daily fee collection date fee group wise report
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select to date as month "August" year "2017" and day "31" on daily fee collection date fee group wise report
    Then user click full details on daily fee collection date fee group wise report
    Then user click show on daily fee collection date fee group wise report

    Examples: 
      | class | school                         | fee type |
      |     1 | Convent of Jesus & Mary School | SCHOOL   |

  @scenario2
  Scenario Outline: To test daily fee collection date fee group wise report when summary is clicked
    Then daily fee collection date fee group wise report is opened
    Then user select school "<school>" on daily fee collection date fee group wise report
    Then user select class "<class>" on daily fee collection date fee group wise report
    Then user select fee type "<fee type>" on daily fee collection date fee group wise report
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select to date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select user "eCare Admin" on daily fee collection date fee group wise report
    Then user click summary on daily fee collection date fee group wise report
    Then user click show on daily fee collection date fee group wise report

    Examples: 
      | class | school                         | fee type |
      |     1 | Convent of Jesus & Mary School | SCHOOL   |

  @scenario3
  Scenario Outline: To test daily fee collection date fee group wise report when separated is clicked
    Then daily fee collection date fee group wise report is opened
    Then user select school "<school>" on daily fee collection date fee group wise report
    Then user select class "<class>" on daily fee collection date fee group wise report
    Then user select fee type "<fee type>" on daily fee collection date fee group wise report
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select to date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user click separated on daily fee collection date fee group wise report
    Then user click show on daily fee collection date fee group wise report

    Examples: 
      | class | school                         | fee type |
      |     1 | Convent of Jesus & Mary School | SCHOOL   |

  #with no filter
  @scenario4
  Scenario: To test when no filter is selected with full details
    Then daily fee collection date fee group wise report is opened
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select to date as month "March" year "2018" and day "31" on daily fee collection date fee group wise report
    Then user click full details on daily fee collection date fee group wise report
    Then user click show on daily fee collection date fee group wise report

  @scenario5
  Scenario: To test when no filter is selected with summary
    Then daily fee collection date fee group wise report is opened
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select to date as month "March" year "2018" and day "31" on daily fee collection date fee group wise report
    Then user click summary on daily fee collection date fee group wise report
    Then user click show on daily fee collection date fee group wise report

  @scenario6
  Scenario: To test when no filter is selected with separated
    Then daily fee collection date fee group wise report is opened
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date fee group wise report
    Then user select to date as month "March" year "2018" and day "31" on daily fee collection date fee group wise report
    Then user click separated on daily fee collection date fee group wise report
    Then user click show on daily fee collection date fee group wise report
