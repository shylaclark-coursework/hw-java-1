/**
 * Shyla Clark
 * CSCI 1583
 * Homework 2: General Calculator
 * Feb 4, 2014
 **/

import java.util.Scanner;

public class Homework2 {

    public static void main( String[] args ) {
    
        // Initialize a scanner object for getting input
        Scanner input = new Scanner( System.in ); 

        // Create variables of type double to hold the first and second numbers
        double firstNumber, secondNumber; 

        // Create a variable of type int to hold the choice of operation
        int operation;

        // Print operations menu ( +, -, *, /, % )
        System.out.println( "Choose: +...1");
        System.out.println( "        -...2");
        System.out.println( "        /...3");
        System.out.println( "        *...4");
        System.out.println( "     or %...5");
        
        // Read the user's menu choice into the choice variable 
        operation = input.nextInt(); 

        // Read first number from user
        System.out.print( "Enter first number: " );
        firstNumber = input.nextDouble();

        // Read second number from user
        System.out.print( "Enter second number: " );
        secondNumber = input.nextDouble();

        // Check user's choice using series of if statements
        if ( operation == 1 ) {
            System.out.println( "Answer:" + (firstNumber + secondNumber) );
        }

        if ( operation == 2 ) {
            System.out.println( "Answer:" + (firstNumber - secondNumber) );
        }
        
        if ( operation == 3 ) {
            System.out.println( "Answer:" + (firstNumber / secondNumber) );
        }

        if ( operation == 4 ) {
            System.out.println( "Answer:" + (firstNumber * secondNumber) );
        }

        if ( operation == 5 ) {
            System.out.println( "Answer:" + (firstNumber % secondNumber) );
        }
    }
}
