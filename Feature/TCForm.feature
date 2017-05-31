Feature: TC Form

  @scenario1
  Scenario Outline: TC Form
    Given user enters url"<url>"
    When enter username"<uname>" and password"<password>"
    Then signin
    Then home page is opened
    Then tc form is opened
    Then user select session "<session>" on tc form
    Then user enter student to search "<name>" on tc form
    Then user click get on tc form
    Then user select school board "<board>" on tc form
    Then user select category "<category>" on tc form
    Then user select struck off date as month "March" year "2017" and day "29" on tc form
    Then user select character "<character>" on tc form
    Then user select tc applying date as month "March" year "2017" and day "1" on tc form
    Then user click save on tc form

    Examples: 
      | url                              | uname | password   | session   | name       | board | installment | category | character |
      | http://qaerp.franciscanecare.net | admin | fspl@12345 | 2016-2017 | alok kumar | ICSE  | APRIL       | General  | Good      |
