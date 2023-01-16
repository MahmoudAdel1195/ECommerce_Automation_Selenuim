@Smoke

Feature: User could navigate between sliders

Scenario Outline: User could select a slider and navigate to the product page in the slider

Given   User Navigates to Home Page
When    User Select Slider "<number>"

And     User Clicks on the product Link in the Slider "<number>"

# Expected Result
Then User should be directed to the product page "<link>"

Examples:
|number|link|
|0     |https://demo.nopcommerce.com/nokia-lumia-1020|
|1     |https://demo.nopcommerce.com/iphone-6|

