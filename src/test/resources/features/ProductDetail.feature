Feature: Product Detail Features

  Background:
    Given open the homepage

  @regression
  Scenario: Verify that the comment is approved on product detail page
    Then verify that home page is visible successfully
    When click accept cookie button on homepage
    And click search bar on homepage
    Then verify at least 2 characters text
    When fill search bar with "iphone" on homepage
    Then verify suggested search results on homepage
    When click search button on homepage
    Then verify that the successfully search
    When click first product on search page
    And click reviews tab on product detail page
    Then verify thank you message on the number of comments on product detail page