Feature: automate flight ticket booking

Scenario: customer booking a flight ticket
Given user in mercury tours page
When user enteres username and password and click signin button
Then user in flight finder page
And enter Flight details
And enter Preferences details and click continue
Then user in Select flight page
And select flight departs and click continue
Then user on Book a flight page
And enter passengers all details
And enter Credit card details
And enter Billing Address
And enter delivery Address and click Secure purchase
Then user on Flight confirmation page
And click logout button 

Scenario: customer booking a flight ticket
Given user in mercury tours page
When user enteres "admin" and "mercury" and click signin button
And enter following Flight details
| 2 | London | March | 14 | New York | February | 5 |
And enter following passengers all details
| chippi | akula | Low Cholesterol |
And enter Credit card details
| Visa | 123456789 | chippi | akula | venky |
And enter Billing Address
| akulavaristreet | nuzvid | andhra pradesh | 123456 | AUSTRIA | 










