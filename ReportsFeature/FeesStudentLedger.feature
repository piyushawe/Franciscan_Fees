Feature: Fees Student Ledger
      As a user I would like to open fees student ledger
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fees student ledger without head
    Then fees student ledger page is opened
    Then user select class"<class>" on fees student ledger page
    Then user select section "<section>" on fees student ledger page
    Then user enter student "<name>" to search on fees student ledger page
    Then user select fee type"<fee type>" on fees student ledger page
    Then user select till date as month"April" year "2017" and day "30" on fees student ledger page
    Then user click without head on fees student ledger page
    Then user click show on fees student ledger page

    Examples: 
      | class | section | name   | fee type |
      | 1     | A       | aarohi | SCHOOL   |

  @scenario2
  Scenario Outline: To test fees student ledger with head
    Then fees student ledger page is opened
    Then user select class"<class>" on fees student ledger page
    Then user select section "<section>" on fees student ledger page
    Then user enter student "<name>" to search on fees student ledger page
    Then user select fee type"<fee type>" on fees student ledger page
    Then user click with head on fees student ledger page
    Then user click show on fees student ledger page

    Examples: 
      | class | section | name   | fee type |
      | 1     | A       | aarohi | SCHOOL   |

  #with no filter
  @scenario3
  Scenario Outline: To test without head when no filter is selected
    Then fees student ledger page is opened
    Then user enter student "<name>" to search on fees student ledger page
    Then user click without head on fees student ledger page
    Then user click show on fees student ledger page

    Examples: 
      | name   |
      | aarohi |

  @scenario4
  Scenario Outline: To test with head when no filter is selected
    Then fees student ledger page is opened
    Then user enter student "<name>" to search on fees student ledger page
    Then user click with head on fees student ledger page
    Then user click show on fees student ledger page

    Examples: 
      | name   |
      | aarohi |
