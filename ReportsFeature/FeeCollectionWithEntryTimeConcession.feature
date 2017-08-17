Feature: Fee Collection With Entry Time Concession
      As a user I would like to open fee collection with entry time concession report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fee collection with entry time concession report without head
    Then fee collection with entry time concession report is opened
    Then user select entry mode"School" on fee collection with entry time concession report
    Then user select collection date as month"April" year "2017" and day"15" on fee collection with entry time concession report
    Then user select school "<school>" on fee collection with entry time concession report
    Then user select fee type "<fee type>" on fee collection with entry time concession report
    Then user select pay mode "Cash" and "Cheque" on fee collection with entry time concession report
    Then user click without head on fee collection with entry time concession report
    Then user click show on fee collection with entry time concession report

    Examples: 
      | school                         | fee type |
      | Convent of Jesus & Mary School | SCHOOL   |

  @scenario2
  Scenario Outline: To test fee collection with entry time concession report head wise
    Then fee collection with entry time concession report is opened
    Then user select entry mode"School" on fee collection with entry time concession report
    Then user select collection date as month"April" year "2017" and day"15" on fee collection with entry time concession report
    Then user select school "<school>" on fee collection with entry time concession report
    Then user select fee type "<fee type>" on fee collection with entry time concession report
    Then user select pay mode "Cheque" on fee collection with entry time concession report
    Then user click receipt no range on fee collection with entry time concession report
    And enter from receipt no "9658" to receipt no "9700" on fee collection with entry time concession report
    Then user click with head on fee collection with entry time concession report
    Then user click show on fee collection with entry time concession report

    Examples: 
      | school                         | fee type |
      | Convent of Jesus & Mary School | SCHOOL   |

  #with no filter
  @scenario3
  Scenario: To test without head when no filter is selected
    Then fee collection with entry time concession report is opened
    Then user click without head on fee collection with entry time concession report
    Then user click show on fee collection with entry time concession report

  @scenario4
  Scenario: To test headwise when no filter is selected
    Then fee collection with entry time concession report is opened
    Then user click with head on fee collection with entry time concession report
    Then user click show on fee collection with entry time concession report
