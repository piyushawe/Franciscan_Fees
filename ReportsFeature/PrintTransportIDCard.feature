Feature: Print Transport ID Card
      As a user I would like to open print transport ID card page
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
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
