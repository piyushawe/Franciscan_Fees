Feature: Paid Transport
      As a user I would like to open paid transport report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test paid transport report based on different filters
    Then paid transport report is opened
    Then user select route "<route>" on paid transport report
    Then user select vehicle "<vehicle>" on paid transport report
    Then user select date from as month "April" year "2017" and day "1" on paid transport report
    Then user select date to as month "April" year "2017" and day "30" on paid transport report
    Then user select user "eCare Admin" on paid transport report
    Then user click show on paid transport report

    Examples: 
      | route | vehicle |
      | R01   | Bus     |

  @scenario2
  Scenario Outline: To test paid transport report based on different filters
    Then paid transport report is opened
    Then user select school "<school>" on paid transport report
    Then user select class "<class-sec>" on paid transport report
    Then user select route "<route>" on paid transport report
    Then user select vehicle "<vehicle>" on paid transport report
    Then user select paymode "Cash" and "Cheque" on paid transport report
    Then user select installment "<installment>" on paid transport report
    Then user select date from as month "April" year "2017" and day "1" on paid transport report
    Then user select date to as month "April" year "2017" and day "1" on paid transport report
    Then user select user "eCare Admin" on paid transport report
    Then user click show on paid transport report

    Examples: 
      | school              | installment | class-sec | route | vehicle |
      | Delhi Public School | APRIL-JUNE  | 1-A       | R01   | Bus     |

  #with no filter
  @scenario3
  Scenario: To test paid transport report with no filter
    Then paid transport report is opened
    Then user select date from as month "April" year "2017" and day "1" on paid transport report
    Then user select date to as month "March" year "2018" and day "31" on paid transport report
    Then user click show on paid transport report
