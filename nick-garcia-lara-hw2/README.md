# Nick Garcia Lara - CS 445-HW2 - Version 1.0 10/15/2016
The makefile for my program is located in this folder along with all the source and test packages that contian the program and test files themselves.

## Configuration Instructions
1. openjdk version "1.8.0_131"
2. JUNIT-4.12.jdk

## Build and deploy instructions
Below are the instructions on how to compile and run my code, including the test cases.

### To Compile the program:
1. Run the command "make"

### To Run the program:
1. Run the command "make run"
	1. This will run the main class of the program (ImprovedClasses)

#### This will automatically print out the results for:
1. Problem 4
	1. Picks a random integer ranging from 3 - 11 prints it. It does this 10 times. 
2. Part 5 
	1. Takes the phrase "This class is easy" and puts each word into its own element of an array and then prints that array via each element.
	
	### To run the JUnit tests 
1. Run "make test" in the command line

This will run the class testRunner which runs the tests:
1. ImprovedStringTokenizerTest

This displays whether or not the tests passed or not. This will be useful if you would like to alter my code in any way as it will let you know if the new code broke the current code.

### To clean the code
1. Run the command "make clean"

### Known Bugs
There are currently no known bugs

### Credits and acknowledgements
Coded by Nick Garcia Lara