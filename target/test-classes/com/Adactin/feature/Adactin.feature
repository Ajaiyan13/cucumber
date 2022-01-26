Feature: Booking hotel in adactin application 

Background:
    Given the user is logged in
    And goes to landing page

@smoketest 
Scenario Outline: verify the user login the application 

	Given user launch the application 
	When user enter the "<username>" in the username field 
	And user enter the "<password>" in the password field 
	And user click the login button 
	Then user verify the login page navigate to search hotel 
	
	Examples: 
		|username|password|
		|aaa|111|
		|bbb|222|
		|ajaykrishnan|ajay@123|
		
		
		Scenario: verify the user able to search hotel 
		
			When user select the location 
			And user able to search hotel 
			And user able to select room type 
			And user able to select number of rooms 
			And user able to select number of adults in a room 
			And user able to select number of children 
			Then user verify the search page navigate to confirmation 
			
			
		Scenario: verify the user got the select hotel 
			When user confirm the given details 
			Then user verify the continue page navigate to book a hotel 
			
		Scenario: verify the user able to book the hotel 
		
			When user enter the first name 
			And user enter the last name 
			And user enter the billing address 
			And user enter the credit card details 
			And user able to select credit card type 
			And user able to select expiry month in credit card 
			And user able to selct expiry year 
			And user enters the cvv number 
			Then verify the details and book the hotel 
			
			
			
			
			
			
			
