#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Authentication
Feature: Bukalapak Authenticate

  @Registration
  Scenario: Register to Bukalapak
    Given Navigate to Bukalapak
    When I click button register
    Then Page will direct to page register
    And I input phone number or email
    And I click button Register step one
    Then Page will direct to registration form
    And I input fullname in fullname text box
    And I choose gender
    Then Suggestion username will be display on username text box
    And I input password in password text box
    Then Warning message confirmation password will be display
    And I input confirmation password in confirmation password box
    And I click checkbox agreement
    And I click button Register step two
    Then Page will direct to dashboard user
    