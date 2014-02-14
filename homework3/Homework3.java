/**
* CSCI 1583 
* Homework Three
* Shyla Clark
* Feb 14
**/

import java.util.Scanner; // create and initialize scanner

public class Homework3 {

    public static void main( String[] args ) {

		// initialize a scanner object for getting input
        Scanner input = new Scanner(System.in);	
		int secondaryMenu = -1; // secondary menu	

		do {
			
			System.out.println( "Type 1 to enter homework grades, 2 to enter quiz grades, 3 to enter test grades and -1 to quit." ); // prompt
			secondaryMenu = input.nextInt(); // read menu choice
			
			String studentName = "";
			
			if (secondaryMenu != -1){
			  System.out.println( "Enter student name: " ); // prompt
        	  studentName = input.next(); // read first name from user
		    }
			
			if ( secondaryMenu == 1 ) {

        		int hwCounter = 0; // set counter to 0
        		int hwTotal = 0; // set total to 0
        		int hwGrade = 0; // set grade to 0
				double average;

        		while (hwGrade != -1 ) {
            		System.out.print( "Enter homework grade: " ); // homework prompt
            		hwGrade = input.nextInt(); // read homework grade
            		hwTotal = hwTotal + hwGrade;
            		hwCounter = hwCounter + 1;
        		} // end while

        		if ( hwCounter != 0 ) {
            		average = (double) hwTotal / hwCounter; // get average
            		System.out.printf( "\nTotal of the %d grades entered is %d\n", 
            		hwCounter, hwTotal );
            		System.out.printf( "Average for homework is %.2f\n", average );
        		} // end if
			}

			else if ( secondaryMenu == 2 ) {
        
        		int qzCounter = 0; // set counter to 0
        		int qzTotal = 0; // set total to 0
        		int qzGrade = 0; // set grade to 0
				double average;
        
        		while (qzGrade != -1 ) {
            		System.out.print( "Enter quiz grade: "); // quiz prompt
            		qzGrade = input.nextInt(); // read quiz grade
            		qzTotal = qzTotal + qzGrade;
            		qzCounter = qzCounter + 1;
        		} // end while

        		if ( qzCounter != 0 ) {
            		average = (double) qzTotal / qzCounter; // get average
            		System.out.printf( "\nTotal of the %d grades entered is %d\n", 
            		qzCounter, qzTotal );
            		System.out.printf( "Average for quizzes is %.2f\n", average );
        		} // end if
			} // end else if
			
			else if ( secondaryMenu == 3 ) {
        
        		int tsCounter = 0; // set counter to 0
        		int tsTotal = 0; // set total to 0
        		int tsGrade = 0; // user input grade
				double average;
        
        		while (tsGrade != -1 ) {
            		System.out.print( "Enter test grades: "); // tests prompt
            		tsGrade = input.nextInt(); // read test grades
            		tsTotal = tsTotal + tsGrade;
            		tsCounter = tsCounter + 1;
        		} // end while
                
        		if ( tsCounter != 0 ) {
            		average = (double) tsTotal / tsCounter; // get average
            		System.out.printf( "\nTotal of the %d grades entered is %d\n", 
            		tsCounter, tsTotal );
            		System.out.printf( "Average for tests is %.2f\n", average );
        		} // end if
			} // end else if
			
		} while ( secondaryMenu != -1 ); // end do while
			
    } // end main
} // end public class Homework3
