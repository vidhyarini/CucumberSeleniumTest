@SmokeTest
Feature: Sample Feature file
Scenario Outline: Test login with valid credentials
	Given Open facebook and login
	When I enter username as "<username>" and password as "<password>"
	Then login should be successful
	And Close the browser
	
	
Examples:
| username | password |
| Tester   | pass1 	  |
