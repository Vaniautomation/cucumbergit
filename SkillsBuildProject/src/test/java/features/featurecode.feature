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
@Featurecode
Feature: Check featurecode
 

  #@Featurecodepass
  #Scenario: Test Featurecode Pass
    #Given User on the home Page
    #Then Login as faculty with id "a2mtsecured@mailinator.com"and pwd "Welcome2ibm1234"
    #And Click on Topics IBM cloud page
    #And Click on software featurecode card
    #Then Check featurecode
   

  @Featurecodefail
  Scenario: Test Featurecode Pass
    Given User on the home Page
    Then Click Register and Enter "a2mtfaculty@mailinator.com"
    When Login as faculty with password "Welcome3ibm"
    And Click on Topics IBM cloud page
    And Click on software featurecode card
    Then Check featurecodefail