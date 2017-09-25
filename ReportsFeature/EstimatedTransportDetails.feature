Feature: Estimated Transport Details
     As a user I would like to open estimated transport details report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test estimated transport details report with different filters
    Then estimated transport details page is opened
    Then user select school "<school>" on estimated transport details page
    Then user select route "<route>" on estimated transport details page
    Then user select vehicle "<vehicle>" on estimated transport details page
    Then user select class "<class>" on estimated transport details page
    Then user select installment "<installment>" on estimated transport details page
    Then user click show on estimated transport details page

    Examples: 
      | class | school              | vehicle | installment | route |
      | 1     | Delhi Public School | Bus     | APRIL-JUNE  | R01   |

  #with no filter
  @scenario2
  Scenario Outline: To test estimated transport details report with no filters selected
    Then estimated transport details page is opened
    Then user select vehicle "<vehicle>" on estimated transport details page
    Then user click show on estimated transport details page

    Examples: 
      | class | vehicle |
      | 1     | Bus     |
