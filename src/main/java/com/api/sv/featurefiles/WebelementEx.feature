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

Feature: WebElement functions
  I want to use this template for my feature file
  
 Background:common step for web element functions
 Given open the facebook page "https://www.facebook.com"

#Scenario:
 #When i use locators to find a webelement and pass a text "nimmy"
  # Then Webelement is identified and text is displayed
   # Then clear the text field
    #When call the quit method the browser will close
    
    #Scenario: finding multiple  webelements
    # When i use locator for finding multiple elements
     #Then it should return a list of multiple elements
      # When call the quit method the browser will close
      
    Scenario: working with buuton, checkbox, hyperlink and radio button  
		When i click on radio button it should select the radio button
		When i click on hyperlink it should take me to new page
    When call the quit method the browser will close
    

    


 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
