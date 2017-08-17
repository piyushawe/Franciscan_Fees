Feature: Franciscan Fee
      As a user I would like to verify that 
      The page is loaded successfully

  Background: 
    Given user enter url "http://192.168.10.47:8099"
    When user enter username "admin" and password "fspl@12345"
    And passes school name "build_17_aug_17"
    And click signin
    Then fee manager home page is opened

  #change academic
  @scenario1
  Scenario: To verify change academic page
    When user open change academic page
    Then verify change academic page

  #set due limit
  @scenario2
  Scenario: To verify set due limit page
    When user open set due limit page
    Then verify set due limit page

  #fee entry setting
  @scenario3
  Scenario: To verify fee entry setting page
    When user open fee entry setting page
    Then verify fee entry setting page

  #fee entry setting others
  @scenario4
  Scenario: To verify fee entry setting others page
    When user open fee entry setting others page
    Then verify fee entry setting others page

  #fee opening balance setting
  @scenario5
  Scenario: To verify fee opening balance setting page
    When user open fee opening balance setting page
    Then verify fee opening balance setting page

  #global search option settings
  @scenario6
  Scenario: To verify global search option settings page
    When user open global search option settings page
    Then verify global search option settings page

  #receipt certificate setting
  @scenario7
  Scenario: To verify receipt certificate setting page
    When user open receipt certificate setting page
    Then verify receipt certificate setting page

  #bus id setting
  @scenario8
  Scenario: To verify bus id setting page
    When user open bus id setting page
    Then verify bus id setting page

  #bill book setting
  @scenario9
  Scenario: To verify bill book setting page
    When user open bill book setting page
    Then verify bill book setting page

  #generate bill book details
  @scenario10
  Scenario Outline: To verify generate bill book details page
    When user open generate bill book details page
    And select installment "<installment>" on generate bill book details
    Then verify generate bill book details page

    Examples: 
      | installment |
      | APRIL       |

  #school global details with type
  @scenario11
  Scenario: To verify school global details with type page
    When user open school global details with type page
    Then verify school global details with type page

  #school global details
  @scenario12
  Scenario: To verify school global details page
    When user open school global details page
    Then verify school global details type page

  #define school board
  @scenario13
  Scenario: To verify define school board page
    When user open define school board page
    Then verify define school board page

  #define language
  @scenario14
  Scenario: To verify define language page
    When user open define language page
    Then verify define language page

  #session transfer
  @scenario15
  Scenario: To verify session transfer page
    When user open session transfer page
    Then verify session transfer page

  #define mother tongue
  @scenario16
  Scenario: To verify define mother tongue page
    When user open define mother tongue page
    Then verify define mother tongue page

  #student health entry
  @scenario17
  Scenario: To verify student health entry page
    When user open student health entry page
    Then verify student health entry page

  #define academic year
  @scenario18
  Scenario: To verify define academic year page
    When user open define academic year page
    Then verify define academic year page

  #define financial year
  @scenario19
  Scenario: To verify define financial year page
    When user open define financial year page
    Then verify define financial year page

  #define category
  @scenario20
  Scenario: To verify define category page
    When user open define category page
    Then verify define category page

  #define religion
  @scenario21
  Scenario: To verify define religion page
    When user open define religion page
    Then verify define religion page

  #define wing
  @scenario22
  Scenario: To verify define wing page
    When user open define wing page
    Then verify define wing page

  #define class
  @scenario23
  Scenario: To verify define class page
    When user open define class page
    Then verify define class page

  #relate class section
  @scenario24
  Scenario: To verify relate class section page
    When user open relate class section page
    Then verify relate class section page

  #define section
  @scenario25
  Scenario: To verify define section page
    When user open define section page
    Then verify define section page

  #define caste
  @scenario26
  Scenario: To verify define caste page
    When user open define caste page
    Then verify define caste page

  #define last result
  @scenario27
  Scenario: To verify define last result page
    When user open define last result page
    Then verify define last result page

  #define promotion master
  @scenario28
  Scenario: To verify define promotion master page
    When user open define promotion master page
    Then verify define promotion master page

  #define character
  @scenario29
  Scenario: To verify define charater page
    When user open define character page
    Then verify define character page

  #define other remark
  @scenario30
  Scenario: To verify define other remark page
    When user open define other remark page
    Then verify define other remark page

  #define extra activity
  @scenario31
  Scenario: To verify define extra activity page
    When user open define extra activity page
    Then verify define extra activity page

  #define tc caste
  @scenario32
  Scenario: To verify define tc caste page
    When user open define tc caste page
    Then verify define tc caste page

  #define bank
  @scenario33
  Scenario: To verify define bank page
    When user open define bank page
    Then verify define bank page

  #health unit master
  @scenario34
  Scenario: To verify health unit master page
    When user open health unit master page
    Then verify health unit master page

  #health master
  @scenario35
  Scenario: To verify health master page
    When user open health master page
    Then verify health master page

  #term master
  @scenario36
  Scenario: To verify term master page
    When user open term master page
    Then verify term master page

  #define fee installment
  @scenario37
  Scenario: To verify define fee installment page
    When user open define fee installment page
    Then verify define fee installment page

  #define fee head
  @scenario38
  Scenario: To verify define fee head page
    When user open define fee head page
    Then verify define fee head page

  #define fee type
  @scenario39
  Scenario: To verify define fee type page
    When user open define fee type page
    Then verify define fee type page

  #define fee group
  @scenario40
  Scenario: To verify define fee group page
    When user open define fee group page
    Then verify define fee group page

  #fee group to fee head
  @scenario41
  Scenario: To verify fee group to fee head page
    When user open fee group to fee head page
    Then verify fee group to fee head page

  #assign amount group
  @scenario42
  Scenario: To verify assign amount group page
    When user open assign amount group page
    Then verify assign amount group page

  #define concession type
  @scenario43
  Scenario: To verify define concession type page
    When user open define concession type page
    Then verify define concession type page

  #define concession
  @scenario44
  Scenario: To verify define concession page
    When user open define concession page
    Then verify define concession page

  #define fee head concession
  @scenario45
  Scenario: To verify define fee head concession page
    When user open define fee head concession page
    Then verify define fee head concession page

  #assign concession to student
  @scenario46
  Scenario: To verify assign concession to student page
    When user open assign concession to student page
    Then verify assign concession to student page

  #assign concession
  @scenario47
  Scenario: To verify assign concession page
    When user open assign concession page
    Then verify assign concession page

  #assign concession to single student
  @scenario48
  Scenario: To verify assign concession to single student page
    When user open assign concession to single student page
    Then verify assign concession to single student page

  #assign multiple group to student
  @scenario49
  Scenario: To verify assign multiple group to student page
    When user open assign multiple group to student page
    Then verify assign multiple group to student page

  #student fee details
  @scenario50
  Scenario: To verify student fee details page
    When user open student fee details page
    Then verify student fee details page

  #create students fee structure
  @scenario51
  Scenario: To verify create students fee structure page
    When user open create students fee structure page
    Then verify create students fee structure page

  #assign opening balance
  @scenario52
  Scenario: To verify assign opening balance page
    When user open assign opening balance page
    Then verify assign opening balance page

  #set student status
  @scenario53
  Scenario: To verify set student status page
    When user open set student status page
    Then verify set student status page

  #late fee setting
  @scenario54
  Scenario: To verify late fee setting page
    When user open late fee setting page
    Then verify late fee setting page

  #late fee setting head wise
  @scenario55
  Scenario: To verify late fee setting head wise page
    When user open late fee setting head wise page
    Then verify late fee setting head wise page

  #assign computer no to student
  @scenario56
  Scenario: To verify assign computer no to student page
    When user open assign computer no to student page
    Then verify assign computer no to student page

  #assign roll no to student
  @scenario57
  Scenario: To verify assign roll no to student page
    When user open assign roll no to student page
    Then verify assign roll no to student page

  #fee entry
  @scenario58
  Scenario: To verify fee entry page
    When user open fee entry page
    Then verify fee entry page

  #cancel fee receipt
  @scenario59
  Scenario: To verify cancel fee receipt page
    When user open cancel fee receipt page
    Then verify cancel fee receipt page

  #delete fee receipt
  @scenario60
  Scenario: To verify delete fee receipt page
    When user open delete fee receipt page
    Then verify delete fee receipt page

  #print fee receipt and certificate
  @scenario61
  Scenario: To verify print fee receipt and certificate page
    When user open print fee receipt and certificate page
    Then verify print fee receipt and certificate page

  #modify fee receipt
  @scenario62
  Scenario: To verify modify fee receipt page
    When user open modify fee receipt page
    Then verify modify fee receipt page

  #manual fee modification
  @scenario63
  Scenario: To verify manual fee modification page
    When user open manual fee modification page
    Then verify manual fee modification page

  #refund head amount
  @scenario64
  Scenario: To verify refund head amount page
    When user open refund head amount page
    Then verify refund head amount page

  #fee cheque clearing
  @scenario65
  Scenario: To verify fee cheque clearing page
    When user open fee cheque clearing page
    Then verify fee cheque clearing page

  #pay amount without structure
  @scenario66
  Scenario: To verify pay amount without structure page
    When user open pay amount without structure page
    Then verify pay amount without structure page

  #fees excel upload
  @scenario67
  Scenario: To verify fee excel upload page
    When user open fee excel upload page
    Then verify fee excel upload page

  #reconciliation fee receipt
  @scenario68
  Scenario: To verify reconciliation fee receipt page
    When user open reconciliation fee receipt page
    Then verify reconciliation fee receipt page

  #fees upload
  @scenario69
  Scenario: To verify fees upload page
    When user open fees upload page
    Then verify fees upload page

  #multiple remark
  @scenario70
  Scenario: To verify multiple remark page
    When user open multiple remark page
    Then verify multiple remark page

  #online fees settlement
  @scenario71
  Scenario: To verify online fees settlement page
    When user open online fees settlement page
    Then verify online fees settlement page

  #transfer concession
  @scenario72
  Scenario: To verify transfer concession page
    When user open transfer concession page
    Then verify transfer concession page

  #travel agency master
  @scenario73
  Scenario: To verify travel agency master page
    When user open travel agency master page
    Then verify travel agency master page

  #vehicle reminder
  @scenario74
  Scenario: To verify vehicle reminder page
    When user open vehicle reminder page
    Then verify vehicle reminder page

  #define vehicle type
  @scenario75
  Scenario: To verify define vehicle type page
    When user open define vehicle type page
    Then verify define vehicle type page

  #define vehicle details
  @scenario76
  Scenario: To verify define vehicle details page
    When user open define vehicle details page
    Then verify define vehicle details page

  #define vehicle route
  @scenario77
  Scenario: To verify define vehicle route page
    When user open define vehicle route page
    Then verify define vehicle route page

  #define vehicle route relation
  @scenario78
  Scenario: To verify define vehicle route relation page
    When user open define vehicle route relation page
    Then verify define vehicle route relation page

  #define transport group
  @scenario79
  Scenario: To verify define transport group page
    When user open define transport group page
    Then verify define transport group page

  #define transport medium
  @scenario80
  Scenario: To verify define transport medium page
    When user open define transport medium page
    Then verify define transport medium page

  #define route stop
  @scenario81
  Scenario: To verify define route stop page
    When user open define route stop page
    Then verify define route stop page

  #assign transport to students
  @scenario82
  Scenario: To verify assign transport to students page
    When user open assign transport to students page
    Then verify assign transport to students page

  #assign self transport to students
  @scenario83
  Scenario: To verify assign self transport to students page
    When user open assign self transport to students page
    Then verify assign self transport to students page

  #character certificate with combo box
  @scenario84
  Scenario: To verify character certificate with combo box page
    When user open character certificate with combo box page
    Then verify character certificate with combo box page

  #tc form class wise
  @scenario85
  Scenario: To verify tc form class wise page
    When user open tc form class wise page
    Then verify tc form class wise page

  #tc form
  @scenario86
  Scenario: To verify tc form page
    When user open tc form page
    Then verify tc form page

  #generate tc
  @scenario87
  Scenario: To verify generate tc page
    When user open generate tc page
    Then verify generate tc page

  #certificates
  @scenario88
  Scenario: To verify certificates page
    When user open certificates page
    Then verify certificates page
