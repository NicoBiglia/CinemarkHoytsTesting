# bootcamp_tae_selenium_java

Here is the exercise 3 : 

Exercise 1
  
  Test Steps
    1. Go to https://www.us.despegar.com
    2. Click on Accommodations header link
    3. Type Miami Beach in the Destination input field
    4. Choose a valid check-in date
    5. Choose a valid check-out date
    6. Select the number of adults - Adults: 2
    7. Select the number of children - Childs: 1
    i. Select the child’s age - Age: 7 years old
    8. Click on the Search button
    9. Type Faena Hotel Miami Beach in the Search By Property input
    10. Click on the Search button

  Expected Results
     After Step 8
      ● The number of total results must be greater than 0.
      ● The Hotel Search result page must be opened, displaying a set of valid result
      cards, all cards related to Miami Beach.
    After Step 10
      ● Only one a result card must be displayed for the “Faena Hotel Miami Beach”
      hotel with the following information
        ○ Image is visible
        ○ Hotel Name is enabled and equals to “Faena Hotel Miami Beach”
        ○ City / Area is visible
        ○ Nightly Price is visible - If not price then “Sold Out”
        
  Exercise 2
    Test Steps
      1. Go to
      2. Click on Hotels header link
      3. Type Miami Beach in the Going to input field
      4. Choose a valid check-in date
      5. Choose a valid check-out date
      6. Select the number of adults - Adults: 1
      7. Click on the Search button
      8. Select the first result, clicking on the Hotel Name’s link
      9. Reserve the first room, the cheapest one
      
   Expected Results
       After Step 8
         ● A new window must be opened, displaying the information for the selected
          hotel - Just switch to the new window.
       After Step 9
         ● A lot of expected results, however, the goal is to validate that the form to enter
          the credit card information is displayed and all inputs enabled.

Exercise 3
  Test Steps
    1. Go to
    2. Click on the Flights header link
    3. Type LAS on Flying from the input field
    4. Type LAX on Flying to the input field
    5. Choose a valid departure date
    6. Choose a valid arrival date
    7. Select the number of adults - Adults: 1
    8. Click on the Search button (Clarification: As the default is a round trip flight)
    9. Select the first flight for departure
    10. Select the first flight for arrival
  
  Expected Results
   After Step 10
      ● A new modal window is displayed - You must check that the ‘No thanks’ link is
      displayed and clickable.
