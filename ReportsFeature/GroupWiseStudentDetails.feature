Feature: Group Wise Student Details
     As a user I would like to open group wise student details
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test group wise student details on the basis of different filters
    Then group wise student details page is opened
    Then user select class "<class>" on group wise student details page
    Then user select section "<section>" on group wise student details page
    Then user select group "<group>" on group wise student details page
    Then user click show on group wise student details page

    Examples: 
      | class | section | group     |
      | 1     | A       | CLASS I-V |

  #with no filter
  @scenario2
  Scenario Outline: To test group wise student details with no filters
    Then group wise student details page is opened
    Then user select group "<group>" on group wise student details page
    Then user click show on group wise student details page

    Examples: 
      | group     |
      | CLASS I-V |
