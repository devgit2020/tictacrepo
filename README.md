# Project Title

Tic-tac-toe Game application. 

## Getting Started


The game can play by two player.

The game is played on a grid that's 3 squares by 3 squares.

The first player is “X” and second one is “O”. 

Players take turns putting their marks in empty squares.

The player to get 3 of his marks in a row (up, down, across, or diagonally) is the winner.

When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.

### Prerequisites

To run the application on the desktop or laptop, need to have JRE version 1.8 and above. 

### Installing

Below are the steps download the application to your local desktop.

1.	Enter the below URL in the browser and then clone or download the application.

2.	Import the application as maven Project on your local IDE (Eclipse, IntelliJ) etc.

Note: - The IDE should support Java 1.8 and above complier.

3.	Run the maven install in the project workspace.
   
4.	It will compile all the java classes, run all the test classes and 

will create a execute jar file in the workspace..\target directory.

5.	The executable jar file can copy to any location and run as below command to play the game.

Ex: - java -jar tictacgame-X.X.X-SNAPSHOT.jar
   
6.	To execute the test classes related to the application, run below command in the CMD from the root project directory of workspace.

Ex: - if my workspace is in...\test directory, then I will run the command as...\test> mvn test

7.	Test classes can execute through the IDE as well, like maven test.

8.	The GameBoard class in the application as the main class and can execute it through as run as application through ID. 
    This class open the game board frame.

9.	 Execute the main class in the application,
	

## ## Built With technology stack 

The application has been developed using TDD based approach. TDD helps to create better modularized, extensible and flexible code.

Test Driven Development (TDD) is a programming practice that instructs developers to write new code only if an  test code
has failed first. This avoids duplication of code. Test-Driven Development starts with designing and developing tests for every 
small functionality of an application. 

This is Java based application and developed using Javax Swing API.

The reason behind choosing swing as client interface because this is the most popular frame work from the java to develop desktop based application.
The Swing API has numerous UI Component to develop the UI and it has the platform independent nature which will more flexibility.

The application is using Java 8 as core technology to use all the advance feature as like Stream, Lambda etc. 


## Versioning

The initial release version is 0.0.1.  


