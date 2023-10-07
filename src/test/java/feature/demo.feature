Feature:  Open a URL

  Scenario: Open Google homepage
    Given I am on the homepage
    When I open the URL "https://www.google.com"
    Then I should see the Google logo
