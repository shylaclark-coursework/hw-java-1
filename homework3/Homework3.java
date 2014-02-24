/**
* CSCI 1583 
* Homework Three
* Shyla Clark
* Feb 14
**/

import java.util.Scanner; // create and initialize scanner

public class Homework3 {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in); 
		String studentName = "";
		int menu = 0;
		int menu2 = 0;
		
		int hwGrade = 0; // grade
		int hwCounter = 0; // increment counter
		int hwTotal = 0; // total
		
		int qGrade = 0; // grade
		int qCounter = 0; // increment counter
		int qTotal = 0; // total
		
		int tGrade = 0; // grade
		int tCounter = 0; // increment counter
		int tTotal = 0; // total
		
		double average; // number with decimal for average
			
		System.out.println( "Enter student name: " ); // prompt
      	studentName = input.next(); // read first name from user
			

		if ( studentName != null ) {
			System.out.println( "Type 1 to enter homework grades, 2 to enter quiz grades, 3 to enter test grades or -1 to quit. " ); // prompt
			menu = input.nextInt(); // read menu choice
			
			if ( menu == 1 ) {
								
				do { 
					System.out.println( "Type 1 to enter homework grade or -1 to quit. " );
					menu2 = input.nextInt(); // read menu choice
				
					if ( menu2 == 1 ) {
						System.out.println( "Enter homework grade: " ); // homework prompt
			        	hwGrade = input.nextInt(); // read homework grade
						
						hwTotal = hwTotal + hwGrade;
			        	hwCounter = hwCounter + 1;
				
					} // end if
					else if ( menu2 == -1 ) {
				
						// termination phase
						average = (double) hwTotal / hwCounter; // get average
			
	            		System.out.printf( "\nTotal of the %d grades entered is %d\n", hwCounter, hwTotal );
	            		System.out.printf( "Average for homework is %.2f\n", average );
				
					} // end else if
					
				} while ( menu2 != -1 ); // end do while
					
			
			} // end if
			
			else if ( menu == 2 ) {
				
				do {
					System.out.println( "Type 1 to enter quiz grade or -1 to quit. " );
					menu2 = input.nextInt(); // read menu choice
				
					if ( menu2 == 1 ) {
						System.out.println( "Enter quiz grade: " ); // quiz prompt
		        		qGrade = input.nextInt(); // read quiz grade

					
						qTotal = qTotal + qGrade;
		        		qCounter = qCounter + 1;
						
					} // end if
					
					else if ( menu2 == -1 ) {
				
						// termination phase
						average = (double) qTotal / qCounter; // get average
			
            			System.out.printf( "\nTotal of the %d grades entered is %d\n", qCounter, qTotal );
            			System.out.printf( "Average for quizzes is %.2f\n", average );
				
					} // end else if
					
				} while ( menu2 != -1 ); // end do while
				
			} // end else if
				
			else if ( menu == 3 ) {
				
				do {
					System.out.println( "Type 1 to enter test grade or -1 to quit. " );
					menu2 = input.nextInt(); // read menu choice
				
					if ( menu2 == 1 ) {
						System.out.print( "Enter test grade: " ); // test prompt
		        		tGrade = input.nextInt(); // read test grade

					
						tTotal = tTotal + tGrade;
		        		tCounter = tCounter + 1;
				
					} // end if
					
			 		else if ( menu2 == -1 ) {
				
						// termination phase
						average = (double) tTotal / tCounter; // get average
			
            			System.out.printf( "\nTotal of the %d grades entered is %d\n", tCounter, tTotal );
            			System.out.printf( "Average for tests is %.2f\n", average );
				
					} // end else if
				} while ( menu2 != -1 ); // end do while
				
			} // end else if
			
		} // end student if
						
    } // end main
} // end public class hw3fix
