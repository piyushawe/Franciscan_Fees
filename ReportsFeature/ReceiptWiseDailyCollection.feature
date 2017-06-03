Feature: Receipt Wise Daily Collection
      As a user I would like to open receipt wise daily collection report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test receipt wise daily collection report without head
    Then receipt wise daily collection report is opened
    Then user select school "<school>" on receipt wise daily collection report
    Then user select class "<class-sec>" on receipt wise daily collection report
    Then user select fee type "<fee type>" on receipt wise daily collection report
    Then user select pay mode "Cash" and "Cheque" on receipt wise daily collection report
    Then user select date from as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select date to as month "April" year "2016" and day "30" on receipt wise daily collection report
    Then user select order by "Class" on receipt wise daily collection report
    Then user click without head on receipt wise daily collection report
    Then user click show on receipt wise daily collection report

    Examples: 
      | class-sec | school                         | fee type |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   |

  @scenario2
  Scenario Outline: To test receipt wise daily collection report with head
    Then receipt wise daily collection report is opened
    Then user select school "<school>" on receipt wise daily collection report
    Then user select class "<class-sec>" on receipt wise daily collection report
    Then user select fee type "<fee type>" on receipt wise daily collection report
    Then user select pay mode "Cash" on receipt wise daily collection report
    Then user select date from as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select date to as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select user "eCare Admin" on receipt wise daily collection report
    #Then user select bank name "<bank name>" on receipt wise daily collection report
    Then user select order by "Class" on receipt wise daily collection report
    Then user click with head on receipt wise daily collection report
    Then user click show on receipt wise daily collection report

    Examples: 
      | class-sec | school                         | fee type | bank name |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | Others    |

  @scenario3
  Scenario Outline: To test receipt wise daily collection report when amalgamated is clicked
    Then receipt wise daily collection report is opened
    Then user select school "<school>" on receipt wise daily collection report
    Then user select fee type "<fee type>" on receipt wise daily collection report
    Then user select date from as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select date to as month "April" year "2016" and day "30" on receipt wise daily collection report
    Then user select order by "Class" on receipt wise daily collection report
    Then user click amalgamated report on receipt wise daily collection report
    Then user click show on receipt wise daily collection report

    Examples: 
      | class-sec | school                         | fee type |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   |

  #with no filter
  @scenario4
  Scenario: To test without head when no filter is selected
    Then receipt wise daily collection report is opened
    Then user select date from as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select date to as month "March" year "2017" and day "31" on receipt wise daily collection report
    Then user click without head on receipt wise daily collection report
    Then user click show on receipt wise daily collection report

  @scenario5
  Scenario: To test with head when no filter is selected
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then receipt wise daily collection report is opened
    Then user select date from as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select date to as month "March" year "2017" and day "31" on receipt wise daily collection report
    Then user click with head on receipt wise daily collection report
    Then user click show on receipt wise daily collection report

  @scenario6
  Scenario: To test amalgamated report without head when no filter is selected
    Then receipt wise daily collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise daily collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise daily collection report
    Then user click without head on receipt wise daily collection report
    Then user click amalgamated report on receipt wise daily collection report
    Then user click show on receipt wise daily collection report

  @scenario7
  Scenario: To test amalgamated report with head when no filter is selected
    Then receipt wise daily collection report is opened
    Then user select date from as month "April" year "2016" and day "1" on receipt wise daily collection report
    Then user select date to as month "March" year "2017" and day "31" on receipt wise daily collection report
    Then user click with head on receipt wise daily collection report
    Then user click amalgamated report on receipt wise daily collection report
    Then user click show on receipt wise daily collection report
