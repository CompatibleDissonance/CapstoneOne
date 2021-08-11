###### **Music purchase App**

A command line application that allows the selection of a song to purchase using command line.

---------------------------------------------------------------

**Statement of Purpose**

What does the application do?
the goal of my command line application is to simply allow a user to choose one of a preset list of songs then proceed to a checkout which will take a mock payment via email and card input.

---------------------------------------------------------------

**What business problem does this address?**

With the ease of access to music production software a lot of musicians can have trouble earning an income from distributors who take a portion of the income or from online streaming services who pay a few dollars per thousand plays. This application will allow the selling of ones music without the distributors tax and allow fans to support this with purchases directly from the artist(s).

---------------------------------------------------------------

**Features:**
1. User is greeted and shown a display of songs.

2. User can input into command line for the song they want and decide if they want to proceed to checkout or choose a different song.

3. User is greeted with the checkout screen that requires the input of their email for delivery of product and a mock card payment input for payment. 

-------------------------------------------------------------

**Implementation**
The initial step of creating this application was brainstorming the general structure, as referenced in the PlanOfAction.txt

the next portion was building the main which initially contained most of the code. From there i took into consideration
the best way to approach the final product pivotal points being the use of an ArrayList and a switch statement.
The Products and Products Template are created. 
A for each loop is created to print items from the Products, and a printInfo method placed in the ProductTemplate that would show in the main.
A branch is created from the main for the switch statement implementation/use which i decided to stay with for the final product.


Next was the need for the checkout display and input which is in the CheckOut under paymentUI.
From there I created a while loop in order to loop order inputs with an option to proceed to checkout.
Two tests are created to check user input for the product order displaying correctly.
Contained in the while loop is a boolean trigger that stops the loop if the user decides to check out. 
At the end of creation the display messages, input names and redundant files are removed. 

Towards the end there were a few more tests added specifically for the user input, which wrapped up the time i was able to spend on this project. 




