Feature: Franciscan Fee
  As a user I would like to verify that
  There are no errors on clicking save or view buttons

  Background:
    Given user enter url "http://qaerp.franciscanecare.net"
    When user enter username "admin" and password "Admin#franciscan"
    And passes school name "qaerp"
    And click signin
    Then fee manager home page is opened

   #define language
   @scenario1
   Scenario: To verify the save button on define language
     When user open define language page
     And enter language as "French"
     Then click save on define language page

   @scenario2
   Scenario: To verify the view button on define language
    When user open define language page
    Then click view on define language page

   #define mother tongue
   @scenario3
   Scenario: To verify the save button on define mother tongue
    When user open define mother tongue page
    And enter mother tongue as "Hindi"
    Then click save on define mother tongue page

   @scenario4
   Scenario: To verify the view button on define mother tongue
    When user open define mother tongue page
    Then click view on define mother tongue page

   #define category
   @scenario5
   Scenario: To verify the save button on define category
    When user open define category page
    And enter category as "General"
    Then click save on define category page

   @scenario6
   Scenario: To verify the view button on define category
    When user open define category page
    Then click view on define category page

   #define religion
   @scenario7
   Scenario: To verify the save button on define religion
    When user open define religion page
    And enter religion as "Hindu"
    Then click save on define religion page

   @scenario8
   Scenario: To verify the view button on define religion
    When user open define religion page
    Then click view on define religion page

   #define wing
   @scenario9
   Scenario: To verify the save button on define wing
    When user open define wing page
    And enter wing as "Secondary"
    Then click save on define wing page

   @scenario10
   Scenario: To verify the view button on define wing
    When user open define wing page
    Then click view on define wing page

   #define class
   @scenario11
    Scenario: To verify the save button on define class
     When user open define class page
     And enter class as "1" on define class page
     And select wing on define class page
     And select school on define class page
     Then click save on define class page

   @scenario12
   Scenario: To verify the view button on define class
    When user open define class page
    Then click view on define class page

   #define section
   @scenario13
   Scenario: To verify the save button on define section
    When user open define section page
    And enter section as "A" on define section page
    And enter order no as "1" on define section page
    Then click save on define section page

   @scenario14
   Scenario: To verify the view button on define wing
    When user open define section page
    Then click view on define section page

   #define caste
   @scenario15
    Scenario: To verify the save button on define caste
     When user open define caste page
     And enter caste as "General"
     Then click save on define caste page

   @scenario16
   Scenario: To verify the view button on define caste
     When user open define caste page
     Then click view on define caste page

   #define last result
   @scenario17
    Scenario: To verify the save button on define last result
     When user open define last result page
     And enter last result as "Pass"
     Then click save on define last result

   @scenario18
    Scenario: To verify the view button on define last result
     When user open define last result page
     Then click view on define last result page

   #define promotion master
   @scenario19
    Scenario: To verify the save button on define promotion master
     When user open define promotion master page
     And enter promotion name as "Promoted"
     Then click save on define promotion master

   @scenario20
   Scenario: To verify the view button on define promotion master
     When user open define promotion master page
     Then click view on define promotion master page

   #define character
   @scenario21
    Scenario: To verify the save button on define character
     When user open define character page
     And enter character as "Good"
     Then click save on define character

   @scenario22
   Scenario: To verify the view button on define character
    When user open define character page
    Then click view on define character page

   #define other remark
   @scenario23
   Scenario: To verify the save button on define other remark
    When user open define other remark page
    And enter other remark as "Excellent"
    Then click save on define other remark

   @scenario24
   Scenario: To verify the view button on define other remark
    When user open define other remark page
    Then click view on define other remark page

   #define extra activity
   @scenario25
   Scenario: To verify the save button on define extra activity
    When user open define extra activity page
    And enter extra activity as "Sports"
    Then click save on define extra activity

   @scenario26
   Scenario: To verify the view button on define extra activity
    When user open define extra activity page
    Then click view on define extra activity page

   #define tc caste
   @scenario27
   Scenario: To verify the save button on define tc caste
    When user open define tc caste page
    And enter tc caste as "General"
    Then click save on define tc caste

   @scenario28
   Scenario: To verify the view button on define tc caste
    When user open define tc caste page
    Then click view on define tc caste page

   #define bank
   @scenario29
   Scenario: To verify the save button on define bank
    When user open define bank page
    And enter bank as "HDFC" on define bank page
    And enter account no as "1234" on define bank page
    And enter contact detail as "7589756864" on define bank page
    And click is school on define bank page
    Then click save on define bank

   @scenario30
   Scenario: To verify the view button on define bank
    When user open define bank page
    Then click view on define bank page

   #health unit master
   @scenario31
   Scenario: To verify the save button on health unit master
    When user open health unit master page
    And enter unit name as "Kg" on health unit master page
    And select unit type as "Numeric" on health unit master page
    Then click save on health unit master

   @scenario32
   Scenario: To verify the view button on health unit master
    When user open health unit master page
    Then click view on health unit master page

   #term master
   @scenario33
   Scenario: To verify the save button on term master
    When user open term master page
    And enter term name as "SA1" on term master
    Then click save on term master

   @scenario34
   Scenario: To verify the view button on term master
    When user open term master page
    Then click view on term master page

   #health master
   @scenario35
   Scenario: To verify the save button on health master
    When user open health master page
    And enter health status as "weight" on health master
    And select unit "Kg" on health master
    Then click save on health master

   @scenario36
   Scenario: To verify the view button on health master
    When user open health master page
    Then click view on health master page

   #define academic year
   @scenario37
   Scenario: To verify the view button on define academic year
    When user open define academic year page
    Then click view on define academic year page

   #define financial year
   @scenario38
   Scenario: To verify the view button on define financial year
    When user open define financial year page
    Then click view on define financial year page

   #define school board
   @scenario39
   Scenario: To verify the save button on define school board
    When user open define school board page
    And enter school board as "cbse" on define school board
    Then click save on define school board

   @scenario40
   Scenario: To verify the view button on define school board
    When user open define school board page
    Then click view on define school board page

   #travel agency master
   @scenario41
   Scenario: To verify the save button on travel agency master
    When user open travel agency master page
    And enter travel agency name as "ryan" on travel agency master
    And enter mobile no "1234564345" on travel agency master
    And mail id "abc@gmail.com" on travel agency master
    Then click save on travel agency master

   @scenario42
   Scenario: To verify the view button on travel agency master
    When user open travel agency master page
    Then click view on travel agency master page

   #define vehicle type
   @scenario43
   Scenario: To verify the save button on define vehicle type
    When user open define vehicle type page
    And enter vehicle name as "bus" on define vehicle type
    Then click save on define vehicle type

   @scenario44
   Scenario: To verify the view button on define vehicle type
    When user open define vehicle type page
    Then click view on define vehicle type page

   #define vehicle details
   @scenario45
   Scenario: To verify the save button on define vehicle details when school is selected
    When user open define vehicle details page
    And select vehicle owner as "school" on define vehicle details page
    And enter vehicle type as "Bus" on define vehicle details page
    And enter vehicle name as "bus" on define vehicle details page
    And enter vehicle registration no as "DL01 1234" on define vehicle details page
    And enter driver name as "raju" on define vehicle details page
    And enter driver mobile no as "1234567890" on define vehicle details page
    And enter GPS no as "a1" on define vehicle details page
    Then click save on define vehicle details

   @scenario46
   Scenario: To verify the save button on define vehicle details when vendor is selected
    When user open define vehicle details page
    And select vehicle owner as "vendor" on define vehicle details page
    And enter vehicle type as "Bus" on define vehicle details page
    And enter vehicle name as "bus" on define vehicle details page
    And enter vehicle registration no as "DL01 1234" on define vehicle details page
    And enter driver name as "raju" on define vehicle details page
    And enter driver mobile no as "1234567890" on define vehicle details page
    And enter GPS no as "a1" on define vehicle details page
    And select vendor as "ryan" on define vehicle details page
    Then click save on define vehicle details

   @scenario47
   Scenario: To verify the view button on define vehicle details
    When user open define vehicle details page
    Then click view on define vehicle details page

   #define vehicle route
   @scenario48
   Scenario: To verify the save button on define vehicle route
    When user open define vehicle route page
    And enter route no as "SR01" on define vehicle route page
    And enter route description "Route1" on define vehicle route page
    And enter route incharge name "Anju" on define vehicle route page
    And enter route incharge mobile no as "1234567890" on define vehicle route page
    Then click save on define vehicle route page

   @scenario49
   Scenario: To verify the view button on define vehicle route
    When user open define vehicle route page
    Then click view on define vehicle route page

   #define transport group
   @scenario50
   Scenario: To verify the save button on define transport group
    When user open define transport group page
    And enter distance name as "15-25 km" on define transport group page
    And enter distance amount "1000" on define transport group page
    And enter distance from "15" on define transport group page
    And enter distance to "25" on define transport group page
    Then click save on define transport group page

   @scenario51
   Scenario: To verify the view button on define transport group
    When user open define transport group page
    Then click view on define transport group page

   #define transport medium
   @scenario52
   Scenario: To verify the save button on define transport medium
    When user open define transport medium page
    And enter transport medium as "abc" on define transport medium page
    Then click save on define transport medium page

   @scenario53
   Scenario: To verify the view button on define transport medium
    When user open define transport medium page
    Then click view on define transport medium page

   #define vehicle route relation
   @scenario54
   Scenario: To verify the save button on define vehicle route relation
    When user open define vehicle route relation page
    And select vehicle name "Bus" on define vehicle route relation page
    And select route on define vehicle route relation page
    Then click save on define vehicle route relation page

   @scenario55
   Scenario: To verify the view button on define vehicle route relation
    When user open define vehicle route relation page
    Then click view on define vehicle route relation page

   #define route stop
   @scenario56
   Scenario: To verify the save button on define route stop
    When user open define route stop page
    And select route no "SR01" on define route stop page
    And enter stop no "1" on define route stop page
    And enter stop name "abc" on define route stop page
    And select transport group on define route stop page
    Then click save on define route stop page

   @scenario57
   Scenario: To verify the view button on define route stop
    When user open define route stop page
    Then click view on define route stop page

   #relate class section
   @scenario58
   Scenario: To verify the save button on relate class section
    When user open relate class section page
    And select class on relate class section page
    And select section on relate class section page
    Then click save on relate class section page

   #school global details with type
   @scenario59
   Scenario: To verify the save button on school global details with type
    When user open school global details with type page
    And select fee type on school global details with type page
    And enter school name "Delhi Public School, Delhi" on school global details with type
    And enter school address "Gamma 2" on school global details with type
    And enter school addresss "Gamma 2" on school global details with type
    And enter school short name "DPS" on school global details with type
    And enter contact no "4568658" on school global details with type
    And enter mobile no "5679547968" on school global details with type
    And enter email id "dps@dps.com" on school global details with type
    And enter support email id "support@dps.com" on school global details with type
    And enter website "dps.com" on school global details with type
    And enter prefix "dps" on school global details with type
    And select receipt settings on school global details with type
    And enter school no "1234" on school global details with type
    And enter affiliation to "cbse" on school global details with type
    And enter affiliation no "56543" on school global details with type
    And enter associates "abc" on school global details with type
    And enter renew upto "March 2018" on school global details with type
    And enter school status "senior secondary" on school global details with type
    And enter city "Gr Noida" on school global details with type
    And enter ecare mobile no "5689975646" on school global details with type
    And enter working days "5" on school global details with type
    And enter recess "4" on school global details with type
    And enter total periods "8" on school global details with type
    Then click save on school global details with type page

   @scenario60
   Scenario: To verify the view button on school global details with type
    When user open school global details with type page
    Then click view on school global details with type page

   #school global details
   @scenario61
   Scenario: To verify the save button on school global details
    When user open school global details page
    And enter school name "Delhi Public School, Delhi" on school global details
    And enter school address "Gamma 2" on school global details
    And enter school addresss "Gamma 2" on school global details
    And enter school short name "DPS" on school global details
    And enter contact no "4568658" on school global details
    And enter mobile no "5679547968" on school global details
    And enter email id "dps@dps.com" on school global details
    And enter support email id "support@dps.com" on school global details
    And enter website "dps.com" on school global details
    And enter prefix "dps" on school global details
    And enter iso details "N/A" on school global details
    And enter school no "1234" on school global details
    And enter affiliation to "cbse" on school global details
    And enter affiliation no "56543" on school global details
    And enter associates "abc" on school global details
    And enter renew upto "March 2018" on school global details
    And enter school status "senior secondary" on school global details
    And enter city "Gr Noida" on school global details
    And enter ecare mobile no "5689975646" on school global details
    And enter working days "5" on school global details
    And enter recess "4" on school global details
    And enter total periods "8" on school global details
    Then click save on school global details page

   @scenario62
   Scenario: To verify the view button on school global details
    When user open school global details page
    Then click view on school global details page

   #student health entry
   @scenario63
   Scenario: To verify the save button on student health entry
    When user open student health entry page
    And select class on student health entry
    And select section on student health entry
    And select term on student health entry
    Then click save on student health entry page

   #fee opening balance setting
   @scenario64
   Scenario: To verify the save button on fee opening balance setting
    When user open fee opening balance setting page
    And select advance amount setting as "Auto" on fee opening balance setting
    And select opening balance setting as "Manual" on fee opening balance setting
    And select fee type on fee opening balance setting
    Then click save on fee opening balance setting page

   @scenario65
   Scenario: To verify the save button on fee opening balance setting
    When user open fee opening balance setting page
    And select advance amount setting as "Manual" on fee opening balance setting
    And select opening balance setting as "Manual" on fee opening balance setting
    And select fee type on fee opening balance setting
    Then click save on fee opening balance setting page

   #set due limit
   @scenario66
   Scenario: To verify the save button on set due limit
    When user open set due limit page
    And select fine waive off setting as "Do not show waive off" on set due limit page
    Then click save on set due limit page

   @scenario67
   Scenario: To verify the save button on set due limit
    When user open set due limit page
    And select fine waive off setting as "waive off without reason" on set due limit page
    Then click save on set due limit page

   @scenario68
   Scenario: To verify the save button on set due limit
    When user open set due limit page
    And select fine waive off setting as "waive off with reason" on set due limit page
    Then click save on set due limit page

   @scenario69
   Scenario: To verify the view button on set due limit
    When user open set due limit page
    Then click view on set due limit page

   #fee entry setting
   @scenario70
   Scenario: To verify the update button on fee entry setting
    When user open fee entry setting page
    Then click update on fee entry setting page

   #bus id setting
   @scenario71
   Scenario: To verify the save button on bus id setting
    When user open bus id setting page
    And select setting type "Auto" on bus id setting page
    And enter prefix "BID" on bus id setting page
    And enter start from "1" on bus id setting page
    And enter lead zero "000" on bus id setting page
    And enter suffix "bb" on bus id setting page
    Then click save on bus id setting page

   #bill book setting
   @scenario72
   Scenario: To verify the save button on bill book setting
    When user open bill book setting page
    And select setting type "Auto" on bill book setting page
    And enter prefix "BID" on bill book setting page
    And enter start from "1" on bill book setting page
    And enter lead zero "000" on bill book setting page
    And enter suffix "bb" on bill book setting page
    Then click save on bill book setting page

   @scenario73
   Scenario: To verify the save button on bill book setting
    When user open bill book setting page
    And select setting type "Manual" on bill book setting page
    Then click save on bill book setting page

   #fee entry setting others
   @scenario74
   Scenario: To verify the save button on fee entry setting others
    When user open fee entry setting others page
    And select allow user to select bank in fee entry on fee entry setting others page
    And enter cheque bounce fine "1000" on fee entry setting others page
    And select pay mode on fee entry setting others page
    And select allow user to reuse fee receipt no on fee entry setting others page
    And select discount option in fees on fee entry setting others page
    And select enable evening transport on fee entry setting others page
    And select block back date receipt entry on fee entry setting others page
    And select late fine waive off option on fee entry setting others page
    And select late fine with cheque date on fee entry setting others page
    And select do not show cancelled receipt amount on fee entry setting others page
    And select entry time concession reason on fee entry setting others page
    And select enable manual late fee on fee entry setting others page
    And select manual late fee type "single" on fee entry setting others page
    And select enable manual cheque bounce on fee entry setting others page
    And select enable waive off with cheque bounce on fee entry setting others page
    And select enable sms on fee entry setting others page
    And select print receipt on fee entry setting others page
    And select modify transport on fee entry setting others page
    And select modify cheque details on fee entry setting others page
    Then click save on fee entry setting others page

   #global search option setting
   @scenario75
   Scenario: To verify the save button with search options for students on global search option setting
    When user open global search option settings page
    And select admission no on global search option setting page
    And select name on global search option setting
    And select father name on global search option setting
    And select mother name on global search option setting
    And select roll no on global search option setting
    And select mobile no on global search option setting
    And select address on global search option setting
    And select barcode on global search option setting
    And select computer no on global search option setting
    And select bus id on global search option setting
    Then click set globally on global search option setting

   @scenario76
   Scenario: To verify the save button with search by admission no on global search option setting
    When user open global search option settings page
    And select registration form settings as "search by admission no"
    Then click set globally on global search option setting

   @scenario77
   Scenario: To verify the save button with search by computer no on global search option setting
    When user open global search option settings page
    And select registration form settings as "search by computer no"
    Then click set globally on global search option setting

   @scenario78
   Scenario: To verify the save button with show admission no on global search option setting
    When user open global search option settings page
    And select display on report as "show admission no"
    Then click set globally on global search option setting

   @scenario79
   Scenario: To verify the save button with show bill on global search option setting
    When user open global search option settings page
    And select display on report as "show bill"
    Then click set globally on global search option setting

   @scenario80
   Scenario: To verify the save button with show bus id on global search option setting
    When user open global search option settings page
    And select display on report as "show bus id"
    Then click set globally on global search option setting

   #define fee installment
   @scenario81
   Scenario: To verify the save button on define fee installment
    When user open define fee installment page
    And enter installment name  "apr" on define fee installment page
    And enter installment print name "apr" on define fee installment page
    And enter installment preference no "1" on define fee installment page
    And enter due on date as year "2017" month "April" day "1" on define fee installment page
    And enter due date as year "2017" month "April" day "1" on define fee installment page
    And select month "Apr" on define fee installment page
    Then click save on define fee installment page

   @scenario82
   Scenario: To verify the view button on define fee installment
    When user open define fee installment page
    Then click view on define fee installment page

   #define fee head
   @scenario83
   Scenario: To verify the save button on define fee head
    When user open define fee head page
    And enter head name  "language" on define fee head page
    And enter head print name "language" on define fee head page
    And select pay schedule "Installment" on define fee head page
    And select type as "Regular" on define fee head page
    And select show in certificate on define fee head page
    And select fee refundable on define fee head page
    Then click save on define fee head page

   @scenario84
   Scenario: To verify the view button on define fee head
    When user open define fee head page
    Then click view on define fee head page

   #define fee type
   @scenario85
   Scenario: To verify the save button on define fee type
    When user open define fee type page
    And enter fee type name "FT" on define fee type page
    And enter fee type preference no "5" on define fee type page
    And select head details on define fee type page
    Then click save on define fee type page

   @scenario86
   Scenario: To verify the view button on define fee type
    When user open define fee type page
    Then click view on define fee type page

   #define fee group
   @scenario87
   Scenario: To verify the save button on define fee group
    When user open define fee group page
    And enter group name "I" on define fee group page
    And select is special on define fee group page
    Then click save on define fee group page

   @scenario88
   Scenario: To verify the view button on define fee group
    When user open define fee group page
    Then click view on define fee group page

   #define concession type
   @scenario89
   Scenario: To verify the save button on define concession type
    When user open define concession type page
    And enter concession type as "sibling" on define concession type page
    Then click save on define concession type page

   @scenario90
   Scenario: To verify the view button on define concession type
    When user open define concession type page
    Then click view on define concession type page

   #define concession
   @scenario91
   Scenario: To verify the save button on define concession
    When user open define concession page
    And enter concession name as "10% on Adm Fee" on define concession page
    Then click save on define concession page

   @scenario92
   Scenario: To verify the view button on define concession
    When user open define concession page
    Then click view on define concession page

   #late fee setting
   @scenario93
   Scenario: To verify the save button on late fee setting
    When user open late fee setting page
    And select fee group on late fee setting page
    And select fee type on late fee setting page
    And select installment on late fee setting page
    And select late fee type on late fee setting page
    And enter amount "100" on late fee setting page
    Then click save on late fee setting page

   @scenario94
   Scenario: To verify the view button on late fee setting
    When user open late fee setting page
    Then click view on late fee setting page

   #late fee setting head wise
   @scenario95
   Scenario: To verify the save button on late fee setting head wise
    When user open late fee setting head wise page
    And select fee group on late fee setting page head wise
    And select fee type on late fee setting page head wise
    And select installment on late fee setting page head wise
    And select head on late fee setting page head wise
    And select late fee type on late fee setting page head wise
    And enter amount "100" on late fee setting page head wise
    Then click save on late fee setting page head wise

   @scenario96
   Scenario: To verify the view button on late fee setting head wise
    When user open late fee setting head wise page
    Then click view on late fee setting page head wise

   #student fee details
   @scenario97
   Scenario: To verify the view button on student fee details
    When user open student fee details page
    Then click view on student fee details page