Feature: Browser Function

Background:
Given BrowserFunction_1 I have a chrome driver instance


	Scenario: Browser Function		
		When BrowserFunction_1 call the quit method the browser will close
		
		
	Scenario: Browser function open web page
		And BrowserFunction_1 call the get with url "https://beginnersbook.com/java-collections-tutorials/" and it should open the page
		When BrowserFunction_1 call the quit method the browser will close
		
		
		Scenario: Browser function Back, Forward and Refresh
		And BrowserFunction_1 call the get with url "https://beginnersbook.com/java-collections-tutorials/" and it should open the page
		And BrowserFunction_1 call the get with url "https://www.google.com" and it should open the page
		Then BrowserFunction_1 call the back api which makes the brower to navigate backwards
		Then BrowserFunction_1 call the forward api which makes the browser to move forward
		Then BrowserFunction_1 call the refresh api which refreshes the current page in browser
		
		

		