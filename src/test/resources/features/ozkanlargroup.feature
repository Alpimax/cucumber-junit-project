
Feature:  As a user, I should be able to see 6 different services


  Background: For the scenarios in the feature file, user is expected to be on homepage
    Given user should see dashboard 6 diffrent servies

    Scenario: user on homepage
      When user goes homepage
      And user should see homepage
      And user should see importExport
      And user should see clearance
      And user should see storage
      And user should see logistics
      And user should see realEstate
