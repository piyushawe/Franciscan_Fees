Feature: Student House Wise Report
      As a user I would like to open student house wise report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test student house wise report when active is selected
    Then student house wise report page is opened
    Then user select class"<class>" on student house wise report page
    Then user select house "<house>" on student house wise report page
    Then user click active on student house wise report page
    Then user click show on student house wise report page

    Examples: 
      | class | house      |
      |     1 | All Houses |

  @scenario2
  Scenario Outline: To test student house wise report when inactive is selected
    Then student house wise report page is opened
    Then user select class"<class>" on student house wise report page
    Then user click section wise on student house wise report page
    Then user select section"<section>" on student house wise report page
    Then user select house "<house>" on student house wise report page
    Then user click inactive on student house wise report page
    Then user click show on student house wise report page

    Examples: 
      | class | section | house      |
      |     1 | A       | All Houses |

  @scenario3
  Scenario Outline: To test student house wise report when all is selected
    Then student house wise report page is opened
    Then user select class"<class>" on student house wise report page
    Then user select house "<house>" on student house wise report page
    Then user select range"Less Than or Equal To <=" on student house wise report page
    Then user select age "9" on student house wise report page
    Then user click all on student house wise report page
    Then user click show on student house wise report page

    Examples: 
      | class | section | house      |
      |     1 | A       | All Houses |

  #with no filter
  @scenario4
  Scenario: To test when active is selected
    Then student house wise report page is opened
    Then user click active on student house wise report page
    Then user click show on student house wise report page

  @scenario5
  Scenario: To test when inactive is selected
    Then student house wise report page is opened
    Then user click inactive on student house wise report page
    Then user click show on student house wise report page

  @scenario6
  Scenario: To test when all is selected
    Then student house wise report page is opened
    Then user click all on student house wise report page
    Then user click show on student house wise report page

  @scenario7
  Scenario: To test sectionwise when active is selected
    Then student house wise report page is opened
    Then user click section wise on student house wise report page
    Then user click active on student house wise report page
    Then user click show on student house wise report page

  @scenario8
  Scenario: To test sectionwise when inactive is selected
    Then student house wise report page is opened
    Then user click section wise on student house wise report page
    Then user click inactive on student house wise report page
    Then user click show on student house wise report page

  @scenario9
  Scenario: To test sectionwise when all is selected
    Then student house wise report page is opened
    Then user click section wise on student house wise report page
    Then user click all on student house wise report page
    Then user click show on student house wise report page
