Feature: Defaulter List Fee Type Wise
     As a user I would like to open defaulter list fee type wise report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test defaulter list fee type wise report with different filters
    Then defaulter list fee type wise report is opened
    Then user select school"<school>" on defaulter list fee type wise report
    Then user select class"<class-sec>" on defaulter list fee type wise report
    Then user select fee type"<fee type>" on defaulter list fee type wise report
    Then user select installment"<installment>" on defaulter list fee type wise report
    Then user click on show on defaulter list fee type wise report

    Examples: 
      | class-sec | school                         | fee type | installment |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  @scenario2
  Scenario Outline: To test defaulter list fee type wise report with different filters
    Then defaulter list fee type wise report is opened
    Then user select class"<class-sec>" on defaulter list fee type wise report
    Then user select fee type"<fee type>" on defaulter list fee type wise report
    Then user select installment"<installment>" on defaulter list fee type wise report
    Then user select with fine on defaulter list fee type wise report
    Then user click on show on defaulter list fee type wise report

    Examples: 
      | class-sec | school                         | fee type | installment |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  @scenario3
  Scenario Outline: To test defaulter list fee type wise report with different filters
    Then defaulter list fee type wise report is opened
    Then user select class"<class-sec>" on defaulter list fee type wise report
    Then user select installment"<installment>" on defaulter list fee type wise report
    Then user select with fine on defaulter list fee type wise report
    Then user select with late fine bifurcated on defaulter list fee type wise report
    Then user click on show on defaulter list fee type wise report

    Examples: 
      | class-sec | installment |
      | 1-A       | APRIL       |

  #with no filters
  @scenario4
  Scenario: To test when no filter is selected
    Then defaulter list fee type wise report is opened
    Then user click on show on defaulter list fee type wise report

  @scenario5
  Scenario: To test when both checkboxes are selected
    Then defaulter list fee type wise report is opened
    Then user select with fine on defaulter list fee type wise report
    Then user select with late fine bifurcated on defaulter list fee type wise report
    Then user click on show on defaulter list fee type wise report
