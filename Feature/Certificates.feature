Feature: Franciscan ERP

  @scenario1
  Scenario: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin@987"
    Then signin
    Then home page is opened
    Then certificates page is opened
    Then user select class "1" on cerfificates page
    Then user select section "A" on certificates page
    Then user search student by admission no "11373" on certificates page
    Then user select the certificate "Birth" to print on certificates page
    Then user click show on certificates page

  @scenario2
  Scenario: To verify all cerficates 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin@987"
    Then signin
    Then home page is opened
    Then certificates page is opened
    Then user select class "1" on cerfificates page
    Then user select section "A" on certificates page
    Then user search student by admission no "11373" on certificates page
    Then user verify certificates to print on certificates page
