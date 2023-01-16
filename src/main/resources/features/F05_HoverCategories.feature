@smoke
Feature: F05_HoverCategories | User can hover to different categories and select sub categories

  Scenario: User can hover to computer category and select Desktops sub-category

Given   User Navigates to Home Page
When    User Hovers to Computer Category
And     User Selects Desktops sub-category
Then    User should be directed to sub-category page "https://demo.nopcommerce.com/desktops"