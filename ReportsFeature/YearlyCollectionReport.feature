Feature: Yearly Collection Report
      As a user I would like to open yearly collection report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test yearly collection report with filters
    Then user opens yearly collection report page
    Then user select session"<session>" on yearly collection report
    Then user select class"<class>" on yearly collection report
    Then user select section "<section>" on yearly collection report
    Then user click on show on yearly collection report

    Examples: 
      | class | section | session   |
      | 1     | A       | 2017-2018 |

  @scenario2
  Scenario Outline: To test yearly collection report when filter with clearing date is selected
    Then user opens yearly collection report page
    Then user select entry mode "School" on yearly collection report
    Then user select session"<session>" on yearly collection report
    Then user select class"<class>" on yearly collection report
    Then user select section "<section>" on yearly collection report
    Then user select fee type"<fee type>" on yearly collection report
    Then user select school"<school>" on yearly collection report
    Then user select pay mode as "Cash" and "Cheque" on yearly collection report
    #Then user select bank name "<bank name>" on yearly collection report
    Then user checks on filter with clearing date
    Then user click on show on yearly collection report

    Examples: 
      | class | section | school              | fee type | installment | session   | bank name              |
      | 1     | A       | Delhi Public School | SCHOOL   | APRIL-JUNE  | 2017-2018 | Axsis Bank For Juniors |

  #yearly collection report
  @scenario3
  Scenario Outline: To test with no filters
    Then user opens yearly collection report page
    Then user select session"<session>" on yearly collection report
    Then user click on show on yearly collection report

    Examples: 
      | session   |
      | 2017-2018 |

  @scenario4
  Scenario Outline: To test with cheque clearing date
    Then user opens yearly collection report page
    Then user select session"<session>" on yearly collection report
    Then user checks on filter with clearing date
    Then user click on show on yearly collection report

    Examples: 
      | session   |
      | 2017-2018 |
