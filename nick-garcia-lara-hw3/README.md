#Nick Garcia Lara - CS 445-HW3 -Version 1.0 10/15/2016

The makefile for my program is located in this folder along with all the source and test packages that contian the program and test files themselves.

##Configuration Instructions
openjdk version "1.8.0_131"
JUNIT-4.12.jdk

##Build and deploy instructions
Below are the instructions on how to compile and run my code, including the test cases.
 
###To Compile the program:
1. Run the command "make"

###To Run the program:
1. Run the command "make run"
  1. This will run the main class of the program (TableLamp)

####This will automatically print out the results for:
1. Parts 1 and 2 
  1. Creating a button and switching it on then off
2. Part 3 
  1. Creating a pushdown button and setting it to on then off.

###To run the JUnit tests 
1. Run "make test" in the command line

This will run the class testRunner which runs the tests:
1. ButtonTest
2. PushDownButtonTest
3. LightBulbTest

This displays whether or not the tests passed or not. This will be useful if you would like to alter my code in any way as it will let you know if the new code broke the current code.

###To clean the code
1. Run the command "make clean"

###Known Bugs
There are currently no known bugs

###Credits and acknowledgements
Coded by Nick Garcia Lara


