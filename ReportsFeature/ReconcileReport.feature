Feature: Reconcile Report
      As a user I would like to open reconcile report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test reconcile report when summary is selected
    Then reconcile report page is opened
    Then user select school "<school>" on reconcile report page
    Then user select class "<class>" on reconcile report page
    Then user select fee type "<fee type>" on reconcile report page
    Then user select installment "<installment>" on reconcile report page
    Then user select user "eCare Admin" on reconcile report page
    Then user click summary on reconcile report page
    Then user click show on reconcile report page

    Examples: 
      | class | school              | fee type | installment |
      |     1 | Delhi Public School | SCHOOL   | APRIL-JUNE  |

  @scenario2
  Scenario Outline: To test reconcile report when consolidated is selected
    Then reconcile report page is opened
    Then user select school "<school>" on reconcile report page
    Then user select class "<class>" on reconcile report page
    Then user select fee type "<fee type>" on reconcile report page
    Then user select installment "<installment>" on reconcile report page
    Then user select user "eCare Admin" on reconcile report page
    Then user click consolidated on reconcile report page
    Then user click show on reconcile report page

    Examples: 
      | class | school              | fee type | installment |
      | 1     | Delhi Public School | SCHOOL   | APRIL-JUNE  |

  #with no filter
  @scenario3
  Scenario: To test reconcile report when summary is selected with no filter selected
    Then reconcile report page is opened
    Then user click summary on reconcile report page
    Then user click show on reconcile report page

  @scenario4
  Scenario: To test reconcile report when consolidated is selected with no filter selected
    Then reconcile report page is opened
    Then user click consolidated on reconcile report page
    Then user click show on reconcile report page
