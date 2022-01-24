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


Feature: Testing Tricentis forms
	
	@generalized_scenario
  Scenario: Validate pages from Tricentis
    Given I am at Tricentis page
    When I enter the vehicle data 
    And I enter the insurant data
    And I enter the product data
    And I select the price option
    And I send quote
    Then I see the success feedback
    