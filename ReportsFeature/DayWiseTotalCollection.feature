Feature: Day Wise Total Collection
     As a user I would like to open day wise total collection report
     So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: Day Wise Total Collection
    Then day wise total collection report is opened
    Then user select school "<school>" on day wise total collection report
    Then user select fee type "<fee type>" on day wise total collection report
    Then user select till date as month "April" year "2017" and day "1" on day wise total collection report
    Then user click show on day wise total collection report

    Examples: 
       | school                         | fee type  |
       | Convent of Jesus & Mary School | SCHOOL    |

  @scenario2
  Scenario Outline: Day Wise Total Collection
    Then day wise total collection report is opened
    Then user select school "<school>" on day wise total collection report
    Then user select fee type "<fee type>" on day wise total collection report
    Then user select user "eCare Admin" on day wise total collection report
    Then user select till date as month "April" year "2017" and day "30" on day wise total collection report
    Then user click show on day wise total collection report

    Examples: 
      | school                         | fee type |
      | Convent of Jesus & Mary School | SCHOOL   |

  @scenario3
  Scenario Outline: Day Wise Total Collection
    Then day wise total collection report is opened
    Then user select entry mode "School" on day wise total collection report
    Then user select fee type "<fee type>" on day wise total collection report
    Then user select month "Apr" on day wise total collection report
    Then user select installment "<installment>" on day wise total collection report
    Then user select pay mode "Cash" and "Cheque" on day wise total collection report
    Then user select till date as month "June" year "2017" and day "30" on day wise total collection report
    Then user click show on day wise total collection report

    Examples: 
      | school                         | fee type | installment |
      | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  #with no filter
  @scenario4
  Scenario: To test when no filter is selected
    Then day wise total collection report is opened
    Then user select till date as month "May" year "2017" and day "31" on day wise total collection report
    Then user click show on day wise total collection report
