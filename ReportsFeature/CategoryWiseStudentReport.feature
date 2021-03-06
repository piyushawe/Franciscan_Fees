Feature: Category Wise Student Report
     As a user I would like to open category wise student report
     So that I don't have to do it manually

  Background: 
    Given user enters url"http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test category wise student report based on filters
    Then category wise student report page is opened
    Then user select category"General" on category wise student report page
    Then user select class "<class>" on category wise student report page
    And select section "<section>" on category wise student report page
    And select father profession"Business" on category wise student report page
    Then user click on show on category wise student report page

    Examples: 
      | class | section |
      | 1     | A       |

  #with no filter
  @scenario2
  Scenario: To test category wise student report when no filter is selected
    Then category wise student report page is opened
    Then user click on show on category wise student report page
