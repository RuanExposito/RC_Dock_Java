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
    