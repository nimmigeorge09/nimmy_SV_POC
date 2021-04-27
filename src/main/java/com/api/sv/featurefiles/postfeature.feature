Feature: Post feature of the facebook
	This will test the post functionality at the user wall

Background: step is commonly used
Given user should be logged in
And  should be present at its own wall
		
	
Scenario: Post a text at the user wall
	When i type the text as "This is a sample post" in the textbox
	And click on post button
	Then the message should get posted
	
Scenario: post a vedio on the user wall
	When user supply youtube link as "https://www.google .com" in the textbox
	And click on post button
	Then video should get posted on the user wall
	And the video should have proper thumpnail