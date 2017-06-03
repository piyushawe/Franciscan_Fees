Feature: Student Wise Receipt Report
      As a user I would like to open student wise receipt report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test student wise receipt report with all filters
    Then student wise receipt report page is opened
    Then user select class "<class>" on student wise receipt report page
    Then user select section "<section>" on student wise receipt report page
    Then user enter student "<name>" to search on student wise receipt report page
    Then user select fee type "<fee type>" on student wise receipt report page
    Then user select from date as month "April" year "2017" and day "1" on student wise receipt report page
    Then user select to date as month "April" year "2017" and day "30" on student wise receipt report page
    Then user click show on student wise receipt report page

    Examples: 
      | class | section | name   | fee type |
      | 1     | A       | aarohi | SCHOOL   |

  #with no filter
  @scenario2
  Scenario Outline: To test student wise receipt report with no filter selected
    Then student wise receipt report page is opened
    Then user enter student "<name>" to search on student wise receipt report page
    Then user select from date as month "April" year "2017" and day "1" on student wise receipt report page
    Then user select to date as month "March" year "2018" and day "31" on student wise receipt report page
    Then user click show on student wise receipt report page

    Examples: 
      | name   |
      | aarohi |
