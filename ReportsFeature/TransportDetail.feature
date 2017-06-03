Feature: Transport Detail Report
      As a user I would like to open transport detail report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test transport detail report with filters
    Then assigned transport detail report page is opened
    Then user select route"<route>" on transport detail report page
    Then user select stop"<stop>" on transport detail report page
    Then user select class "<class>" on transport detail report page
    Then user select vendor "<vendor>" on transport detail report page
    Then user click show on transport detail report page

    Examples: 
      | class | route | stop | vendor         |
      | 1     | R01   | A1   | Mayoor Travels |

  @scenario2
  Scenario Outline: To test transport detail report with filters
    Then assigned transport detail report page is opened
    Then user select route"<route>" on transport detail report page
    Then user select stop"<stop>" on transport detail report page
    Then user select vehicle "<vehicle>" on transport detail report page
    Then user select class "<class>" on transport detail report page
    Then user select section "<section>" on transport detail report page
    Then user select installment"<installment>" on transport detail report page
    Then user click show on transport detail report page

    Examples: 
      | installment | route | stop | vehicle | class | section |
      | APRIL-JUNE  | R01   | A1   | Bus     | 1     | A       |

  #with no filter
  @scenario3
  Scenario: To test transport detail report with no filters selected
    Then assigned transport detail report page is opened
    Then user click show on transport detail report page
