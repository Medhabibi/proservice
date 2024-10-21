#Author: MED
Feature: OrangeHRM login page
Background:
Given admin is in login page 

Scenario: login with valid credentiels

When amdin enter correct username "Admin" and correct password "admin123"
Then admin is directed to the home page 

Scenario: login with invalid credentiels

When admin enter incorrect username "med" and incorrect  password "dmin123"
Then admin is in login page  that containes message "Invalid credentials"
