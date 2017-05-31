Feature: Reconcile Installment Class Wise
      As a user I would like to open reconcile installment class wise report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test reconcile installment class wise report
    Then reconcile installment class wise page is opened
    Then user select fee type "<fee type>" on reconcile installment class wise page
    Then user select class "<class>" on reconcile installment class wise page
    Then user select installment "<installment>" on reconcile installment class wise page
    Then user click show on reconcile installment class wise page

    Examples: 
      | fee type | class | installment |
      | SCHOOL   |     1 | APRIL-JUNE  |

  # with no filters
  @scenario2
  Scenario: To test when no filters are selected
    Then reconcile installment class wise page is opened
    Then user click show on reconcile installment class wise page
