Feature: Self Transport Report
      As a user I would like to open self transport report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test self transport report when active is selected
    Then self transport report page is opened
    Then user select transport "<transport>"	on self transport report
    Then user select class "<class>" on self transport report
    Then user select section "<section>" on self transport report
    Then user click active on self transport report
    Then user click show on self transport report

    Examples: 
      | class | section | transport |
      |     1 | A       | Public    |

  @scenario2
  Scenario Outline: To test self transport report when inactive is selected
    Then self transport report page is opened
    Then user select class "<class>" on self transport report
    Then user select section "<section>" on self transport report
    Then user click inactive on self transport report
    Then user click show on self transport report

    Examples: 
      | class | section |
      |     1 | A       |

  @scenario3
  Scenario Outline: To test self transport report when all is selected
    Then self transport report page is opened
    Then user select class "<class>" on self transport report
    Then user select section "<section>" on self transport report
    Then user click all on self transport report
    Then user click show on self transport report

    Examples: 
      | class | section |
      |     1 | A       |

  #with no filter
  @scenario4
  Scenario: To test when active is selected with no filters
    Then self transport report page is opened
    Then user click active on self transport report
    Then user click show on self transport report

  @scenario5
  Scenario: To test when inactive is selected with no filters
    Then self transport report page is opened
    Then user click inactive on self transport report
    Then user click show on self transport report

  @scenario6
  Scenario: To test when all is selected with no filters
    Then self transport report page is opened
    Then user click all on self transport report
    Then user click show on self transport report
