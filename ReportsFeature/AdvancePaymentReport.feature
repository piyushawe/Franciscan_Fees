Feature: Advance Payment Report
     As a user I would like to open advance payment report
     So that I don't have to open myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test advance payment report based on different filters
    Then advance payment report is opened
    Then user select installment"<installment>" on advance payment report
    Then user select class"<class>" on advance payment report
    Then user select section"<section>" on advance payment report
    Then user select fee type"<fee type>" on advance payment report
    Then user select school"<school>" on advance payment report
    Then user select month"May" year"2017" and day"15" on advance payment report
    Then user click on show on advance payment report

    Examples: 
      | class | section | school                         | installment | fee type |
      |     1 | A       | Convent of Jesus & Mary School | APRIL       | SCHOOL   |

  @scenario2
  Scenario Outline: To test advance payment report based on different filters
    Then advance payment report is opened
    Then user select installment"<installment>" on advance payment report
    Then user select class"<class>" on advance payment report
    Then user select section"<section>" on advance payment report
    Then user select fee type"<fee type>" on advance payment report
    Then user click on show on advance payment report

    Examples: 
      | class | section | installment | fee type |
      |     1 | A       | APRIL       | SCHOOL   |

  @scenario3
  Scenario Outline: To test advance payment report based on different filters
    Then advance payment report is opened
    Then user select installment"<installment>" on advance payment report
    Then user select class"<class>" on advance payment report
    Then user select section"<section>" on advance payment report
    Then user click on show on advance payment report

    Examples: 
      | class | section | installment |
      |     1 | A       | APRIL       |

  #with no filter
  @scenario4
  Scenario Outline: To test advance payment report when no filter is selected
    Then advance payment report is opened
    Then user select installment"<installment>" on advance payment report
    Then user select month"April" year"2017" and day"15" on advance payment report
    Then user click on show on advance payment report

    Examples: 
      | installment |
      | APRIL       |
