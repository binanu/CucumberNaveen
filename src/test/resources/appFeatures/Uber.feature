@Epic-100
Feature: Uber Booking Feature

@Regression @US-1001
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When User select car "sedan" and pick up point "Alexandria" and dropoff location "Arlington"
Then Driver starts the journey 
And Driver ends the journey
Then User pays 10 USD

@Smoke 
Scenario: Booking Cab SUV
Given User wants to select a car type "suv" from uber app
When User select car "sedan" and pick up point "Alexandria" and dropoff location "Fairfax"
Then Driver starts the journey 
And Driver ends the journey
Then User pays 5 USD

@Smoke @Prod
Scenario: Booking Cab Mini
Given User wants to select a car type "mini" from uber app
When User select car "sedan" and pick up point "DC" and dropoff location "Bethesda"
Then Driver starts the journey 
And Driver ends the journey
Then User pays 15 USD
