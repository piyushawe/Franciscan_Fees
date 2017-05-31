Feature: Cancel fee receipt
   As a user I would like to cancel/ bounce the fee receipt
   So that I don't need to cancel myself

  @scenario1
  Scenario Outline: To cancel fee receipt
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then cancel fee receipt page is opened
    Then user searches a student on cancel fee receipt form by receipt no"9498"
    Then user enters the reason"Test" to cancel
    Then user cancels the receipt"9498"

    Examples: 
      | url                              | uname | password   |
      | http://qaerp.franciscanecare.net | admin | fspl@12345 |

  @scenario2
  Scenario Outline: To bounce fee cheque
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then cancel fee receipt page is opened
    Then user searches a student on cancel fee receipt form by receipt no"9446"
    Then user enters the reason"Test" to bounce the cheque
    Then user bounce the cheque with receipt no "9446"

    Examples: 
      | url                              | uname | password   |
      | http://qaerp.franciscanecare.net | admin | fspl@12345 |
