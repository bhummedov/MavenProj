#Recognized step keyword :Given, When, Then, And, But, *
Feature: JQuery homepage
  Test the homepage of http://jqueryui.com/webiste

  Background: Prints for all pages & Can have several pages
    Given I am on the jquery homepage

  @controlgroup @regression
  Scenario: Test controlgroup button
  This scenario is to test control bouttons
    When I click on controlgroup
    Then I land on the controlgroup page
  @datepicker @smoke
  Scenario: datepicker button test
  This scenario is to test date picker bouttons
    When I click on datepicker
    Then I land on the datepicker page
  @jguery @smoke
  Scenario: checkboxradio button test
  This scenario is to test date picker bouttons
    When I click on checkboxradio
    Then I land on the checkboxradio page

