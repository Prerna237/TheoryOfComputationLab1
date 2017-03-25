# Theory of Computation Lab 1 
>Contributer: Prerna (Prerna237) [1410110306]

This repository contains two machines, namely
  -Pattern Matching Machine
  -Softdrink Vending Machine

# Pattern Matching Machine
This machine's terminal asks the user to input a pattern and a string in which the pattern is to be searched in and returns the occurence position of the string.
*Input*: A pattern string and a string in which the pattern's position is to be located.
*Output*: Position of the pattern in the second string with the first character of the string numbered as 1.
# Softdrink Vending Machine
This machine's GUI contains three radiobuttons labeled as Rs 5,10 and 25 which are to be considered the equivalent of inserting coins of the same denomination into the machine. The softdrink is priced at 40 Rs. The GUI also contains a 'Reset' button to reset the state of the machine, i.e., amount inserted into the machine is null.
*Input*: Select the radio button to insert coins of the same denomination.
*Output*: The following is the output in different scenarios:
* If *amountInserted*<40, the output displayed is the amount that has already been inserted into the machine, i.e., the value of *amountInserted*.
* If *amountInserted*>=40, the output displays the amount that is to be returned along with a message saying "Dispensing the Drink"
