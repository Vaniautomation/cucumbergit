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
Feature: Register users

  @RegisterFaculty
  Scenario: Registering as faculty
    Given I'm on the home Page
    Then Click Register and Enter "a2mtfan17@mailinator.com"
    When I select role as "Faculty"
    Then Enter Title,Current degree,Department,agreeTerms,agreePrivacyconsent and register
  # And Register id in urx "a2mtfan13@mailinator.com"
  
  
    @RegisterStudent
  	Scenario: Registering as student
    Given I'm on the home Page
    Then Click Register and Enter "a2mtfan15@mailinator.com"
    When I select role as "Student"
    Then Enter currentdegree,soughtdegree,expectedgradutationdate,month and department
    
    @RegisterStaff
  Scenario: Registering as staff
    Given I'm on the home Page
    Then Click Register and Enter "a2mtfan16@mailinator.com"
    When I select role as "Staff"
    Then Enter Title,Current degree,Department,agreeTerms,agreePrivacyconsent and register
    
    
    
    
    
