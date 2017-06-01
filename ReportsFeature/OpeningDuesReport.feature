Feature: Opening Dues Report
      As a user I would like to open opening dues report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test opening dues report based on different filters
    Then opening dues report page is opened
    Then user select class"<class>" on opening dues report
    Then user select section "<section>" on opening dues report
    Then user select installment"<installment>" on opening dues report
    Then user click on show on opening dues report

    Examples: 
      | class | section | installment |
      | 1     | A       | APRIL-JUNE  |

  @scenario2
  Scenario Outline: To test opening dues report based on different filters
    Then opening dues report page is opened
    Then user select school "<school>" on opening dues report
    Then user select class"<class>" on opening dues report
    Then user select fee type "<fee type>" on opening dues report
    Then user select installment"<installment>" on opening dues report
    Then user select user "eCare Admin" on opening dues report
    Then user click on show on opening dues report

    Examples: 
      | class | school              | fee type | installment |
      | 1     | Delhi Public School | SCHOOL   | APRIL-JUNE  |

  #with no filters
  @scenario3
  Scenario: To test when no filter is selected
    Then opening dues report page is opened
    Then user click on show on opening dues report
