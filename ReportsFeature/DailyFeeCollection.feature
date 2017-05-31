Feature: Daily Fee Collection Report
     As a user I would like to open daily fee collection report with different options
     So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test daily fee collection report when head wise is clicked
    Then daily fee collection report is opened
    Then user select entry mode "School" on daily fee collection
    Then user select from date as month "April" year "2017" and day"1" on daily fee collection
    Then user select to date as month "April" year "2017" and day"28" on daily fee collection
    Then selects class"<class-sec>" on daily fee collection
    Then user select fee type "<fee type>" on daily fee collection
    Then user select paymode as "Cash" and "Cheque" on daily fee collection
    Then user click head wise on daily fee collection
    Then clicks on show button of daily fee collection

    Examples: 
      | class-sec | fee type |
      | 1-A       | SCHOOL   |

  @scenario2
  Scenario Outline: To test daily fee collection report when without head is clicked
    Then daily fee collection report is opened
    Then selects class"<class-sec>" on daily fee collection
    Then select school"<school>" on daily fee collection
    Then user select fee type "<fee type>" on daily fee collection
    Then click without head on daily fee collection
    Then clicks on show button of daily fee collection

    Examples: 
      | class-sec | school                         | fee type |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   |

  @scenario3
  Scenario Outline: To test daily fee collection report when with head one line data is clicked
    Then daily fee collection report is opened
    Then user select entry mode "School" on daily fee collection
    Then user select from date as month "April" year "2017" and day"1" on daily fee collection
    Then user select to date as month "April" year "2017" and day"28" on daily fee collection
    Then selects class"<class-sec>" on daily fee collection
    Then user select fee type "<fee type>" on daily fee collection
    Then user select paymode as "Cash" and "Cheque" on daily fee collection
    Then user click with head one line on daily fee collection
    Then clicks on show button of daily fee collection

    Examples: 
      | class-sec | fee type |
      | 1-A       | SCHOOL   |

  @scenario4
  Scenario Outline: To test daily fee collection report when without head one line data is clicked
    Then daily fee collection report is opened
    Then selects class"<class-sec>" on daily fee collection
    Then user select fee type "<fee type>" on daily fee collection
    Then click without head one line data on daily fee collection
    Then user select user name "eCare Admin" on daily fee collection
    Then clicks on show button of daily fee collection

    Examples: 
      | class-sec | fee type |
      | 1-A       | SCHOOL   |

  #with no filter
  @scenario5
  Scenario: To test head wise when no filter is selected
    Then daily fee collection report is opened
    Then user select from date as month "April" year "2017" and day"1" on daily fee collection
    Then user select to date as month "March" year "2018" and day"31" on daily fee collection
    Then user click head wise on daily fee collection
    Then clicks on show button of daily fee collection

  @scenario6
  Scenario: To test without head total amount when no filter is selected
    Then daily fee collection report is opened
    Then user select from date as month "April" year "2017" and day"1" on daily fee collection
    Then user select to date as month "March" year "2018" and day"31" on daily fee collection
    Then click without head on daily fee collection
    Then clicks on show button of daily fee collection

  @scenario7
  Scenario: To test with head one line data when no filter is selected
    Then daily fee collection report is opened
    Then user select from date as month "April" year "2017" and day"1" on daily fee collection
    Then user select to date as month "March" year "2018" and day"31" on daily fee collection
    Then user click with head one line on daily fee collection
    Then clicks on show button of daily fee collection

  @scenario8
  Scenario: To test without head one line data when no filter is selected
    Then daily fee collection report is opened
    Then user select from date as month "April" year "2017" and day"1" on daily fee collection
    Then user select to date as month "March" year "2018" and day"31" on daily fee collection
    Then click without head one line data on daily fee collection
    Then clicks on show button of daily fee collection
