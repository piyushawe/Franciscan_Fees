Feature: Receipt Wise Fee Type Collection
      As a user I would like to open receipt wise fee type collection report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test receipt wise fee type collection on different filters
    Then receipt wise fee type collection report is opened
    Then user select school "<school>" on receipt wise fee type collection report
    Then user select fee type "<fee type>" on receipt wise fee type collection report
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "April" year "2017" and day "30" on receipt wise fee type collection report
    Then user select user "eCare Admin" on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

    Examples: 
      | class-sec | school                    | fee type |
      | 1-A       | Inspiration public school | SCHOOL   |

  @scenario2
  Scenario Outline: To test receipt wise fee type collection on different filters
    Then receipt wise fee type collection report is opened
    Then user select school "<school>" on receipt wise fee type collection report
    Then user select class "<class-sec>" on receipt wise fee type collection report
    Then user select fee type "<fee type>" on receipt wise fee type collection report
    Then user select pay mode "Cash" and "Cheque" on receipt wise fee type collection report
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "April" year "2017" and day "30" on receipt wise fee type collection report
    Then user select user "eCare Admin" on receipt wise fee type collection report
    Then user click student wise only on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

    Examples: 
      | class-sec | school     | fee type |
      | 1-A       | fspl@12345 | SCHOOL   |

  #with no filter
  @scenario3
  Scenario: To test with all students
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "All Students" on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario4
  Scenario: To test with active students
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Active Students" on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario5
  Scenario: To test with inactive students
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Inactive Students" on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario6
  Scenario: To test with all students student wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "All Students" on receipt wise fee type collection report
    Then user click student wise only on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario7
  Scenario: To test with active students head wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Active Students" on receipt wise fee type collection report
    And select head wise on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario8
  Scenario: To test with inactive students date wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Inactive Students" on receipt wise fee type collection report
    And select date wise on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario9
  Scenario: To test with all students head wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "All Students" on receipt wise fee type collection report
    And select head wise on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario10
  Scenario: To test with all students date wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "All Students" on receipt wise fee type collection report
    And select date wise on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario11
  Scenario: To test with active students date wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Active Students" on receipt wise fee type collection report
    And select date wise on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario12
  Scenario: To test with active students student wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Active Students" on receipt wise fee type collection report
    Then user click student wise only on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario13
  Scenario: To test with inactive students student wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Inactive Students" on receipt wise fee type collection report
    Then user click student wise only on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report

  @scenario14
  Scenario: To test with inactive students head wise
    Then receipt wise fee type collection report is opened
    Then user select date from as month "April" year "2017" and day "1" on receipt wise fee type collection report
    Then user select date to as month "March" year "2018" and day "31" on receipt wise fee type collection report
    And click student type as "Inactive Students" on receipt wise fee type collection report
    And select head wise on receipt wise fee type collection report
    Then user click show on receipt wise fee type collection report
