/**
* Shyla Clark
* CSCI 1583 Spring 2014
* Homework 2
* Feb 4
**/

import java.util.Scanner;

class HomeworkTwo {

    public static void main( String[] args ) {
    
        // initialize a scanner object for getting input
        Scanner input = new Scanner( System.in ); 

        // create a double type variable for the first number and second number
        double firstNumber, secondNumber; 

        // create an int type variable for the choice of operation
        int operation;

        // print operations menu ( +, -, *, /, % )
        System.out.println( "Choose: +, -, *, /, or %" );
        
        // read into the choice variable the menu choice the user makes
        operation = input.nextInt(); 

        System.out.print( "Enter first number: " ); // prompt
        firstNumber = input.nextDouble(); // read first number from user

        System.out.print( "Enter second number: " ); // prompt
        secondNumber = input.nextDouble(); // read second number from user

        // use if control structure to check user choice
        if ( operation == '+' ) {
            // inside body carry out corresponding operation and print result
            System.out.println( "Answer:" + (firstNumber + secondNumber) );
        }

        if ( operation == '-' ) {
            // inside body carry out corresponding operation and print result
            System.out.println( "Answer:" + (firstNumber - secondNumber) );
        }
        
        if ( operation == '/' ) {
            // inside body carry out corresponding operation and print result
            System.out.println( "Answer:" + (firstNumber / secondNumber) );
        }

        if ( operation == '*' ) {
            // inside body carry out corresponding operation and print result
            System.out.println( "Answer:" + (firstNumber * secondNumber) );
        }

        if ( operation == '%' ) {
            // inside body carry out corresponding operation and print result
            System.out.println( "Answer:" + (firstNumber % secondNumber) );
        }
        
    }
}


