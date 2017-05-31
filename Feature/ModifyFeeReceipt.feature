Feature: Modify Fee Receipt
    As a user I would like to verify modify fee receipt
    So that I don't have to do it myself

  @scenario1
  Scenario: To test modify fee receipt
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin@987"
    Then signin
    Then home page is opened
    Then modify fee receipt form is opened
    Then user search student by fee receipt no "9868" on modify fee receipt form
