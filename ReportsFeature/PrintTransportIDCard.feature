Feature: Print Transport ID Card
      As a user I would like to open print transport ID card page
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test print transport ID card page with filters
    Then print transport ID card page is opened
    Then user select school "<school>" on print transport ID card page
    Then user select class "<class>" on print transport ID card page
    Then user select section "<section>" on print transport ID card page
    Then user enter student "<name>" on print transport ID card page
    Then user click show on print transport ID card page

    Examples: 
      | class | school              | section | name   |
      |     1 | Delhi Public School | A       | aarohi |

  #with no filter
  @scenario2
  Scenario: To test print transport ID card page with no filter selected
    Then print transport ID card page is opened
    Then user click show on print transport ID card page
