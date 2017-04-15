Feature: Franciscan ERP

  Scenario: Cancelled Fees Receipt Report
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin@987"
    Then signin
    Then home page is opened
    Then user opens cancelled fees receipt report page
    Then user selects from date as month"April" year"2016" and day"1"
    Then user selects to date as month"April" year"2016" and day"30"
    Then user clicks on show
    