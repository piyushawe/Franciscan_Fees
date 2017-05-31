Feature: Fee Cheque Clearing

  @scenario1
  Scenario Outline: To get cheque details by receipt date
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then user opens fee cheque clearing page
    Then user get details by receipt date as month"March" year"2016" and day"10"

    Examples: 
      | url                              | uname | password  |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |

  @scenario2
  Scenario Outline: To get cheque details by cheque date
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then user opens fee cheque clearing page
    Then user get details by cheque date as month"May" year"2016" and day"16"

    Examples: 
      | url                              | uname | password  |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |

  @scenario3
  Scenario Outline: To get cheque details by cheque number
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then user opens fee cheque clearing page
    Then user get details by cheque no"78965"
    Then user enter clearing date as month "March" year "2017" and day "21" on fee cheque clearing page
    Then user click save on fee cheque clearing page

    Examples: 
      | url                              | uname | password  |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |

  @scenario4
  Scenario Outline: To get cheque details by deposit bank
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then user opens fee cheque clearing page
    Then user get details by deposit bank"<bank name>"

    Examples: 
      | url                              | uname | password  | class | section | bank name              |
      | http://qaerp.franciscanecare.net | admin | Admin@987 |     1 | A       | Axsis Bank For Juniors |
