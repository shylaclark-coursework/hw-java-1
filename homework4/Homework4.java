/**
* CSCI 1583 
* Homework Four
* Shyla Clark
* March 21
* Worked with Nick Studer
**/

import java.util.*; // create and initialize scanner

public class Homework4 {
	
    public static void main( String[] args ) {
		
        Scanner input = new Scanner(System.in); 
		
		List<Double> hwGrades = new ArrayList<Double>(); // homework grades
		List<Double> qGrades = new ArrayList<Double>(); // quiz grades
		List<Double> tGrades = new ArrayList<Double>(); // test grades
		
		double avg; // number with decimal for average
		int choice = 0;
			
		do {
			choice = Menu(); 
			
			if ( choice == 1 ) {
			enterGrades( hwGrades ); // call enterGrades method and pass hwGrades
			}
			else if ( choice == 2 ) {
				enterGrades (qGrades); 
			}	
			else if ( choice == 3 ) {	
				enterGrades ( tGrades );
			}	
			/**
				else if ( choice == 4 ) {
				System.out.println( " " ); 
				menu = input.nextInt(); 
				}
				*/
			else if ( choice == 5 ) {
				System.out.println( getAverage ( hwGrades ) );
			}
			else if ( choice == 6 ) {
				System.out.println( getAverage ( qGrades ) );
				
			}
			else if ( choice == 7 ) {
				System.out.println( getAverage ( tGrades ) );
			}
			else if ( choice == 8 ) {
				System.out.println( totalAverage ( hwGrades, qGrades, tGrades ) );
			}
		} while ( choice >= 0); // end do while			
    } // end main method
	
	public static int Menu() { 
		
		Scanner input = new Scanner( System.in );
			int choice = 0;
		
		System.out.println( "Choose\n1. Input grades\n2. Get averages\n3. Quit" );
			choice = input.nextInt();
		
		if ( choice == 1 ) {
			System.out.println( "Choose\n1. Input homework grade\n2. Input quiz grades\n3. Input test grades\n4. Return to main " );
			choice = input.nextInt();
		} // end else if choice == 1
			
		else if ( choice == 2 ) {
			System.out.println( "Choose\n1. Get homework average\n2. Get quiz average\n3. Get test average\n4. Total average\n5. Return to main " );
			choice = input.nextInt();
			
			if ( choice == 1 ) {
				choice = 5;
			}
			else if ( choice == 2 ) {
				choice = 6;
			}
			else if ( choice == 3 ) {
				choice = 7;
			}
			else if ( choice == 4 ) {
				choice = 8;
			}
			else if ( choice == 5 ) {
				choice = 4;
			}
		} // end else if choice == 2
			
		else if ( choice == 3 ) {
			choice = -1;
		} // end else if choice == 3
		
		return choice;
	} // end method Menu
	
	public static void enterGrades( List<Double> grades ) {
        Scanner input = new Scanner(System.in); 
		double grade = 0.0;
		do {
			System.out.println( "Enter grade or type -1 to quit." );
			grade = input.nextDouble();
			if ( grade >= 0.0 ) {
				grades.add( grade );
			} // end if statement
		} while ( grade >= 0.0 );
	} // end method enterGrades
	
	
	public static double getAverage( List<Double> grades ) {
		double average = 0.0;
		for ( int index = 0; index < grades.size(); index++ ) { // use for when you have certain number in mind
			average = average + grades.get(index); // average += grades.get(index);
		} // end for
		average = average / grades.size();
		return average;
	} // end method getAverage
		
	public static double totalAverage( List<Double> hwGrades, List<Double> qGrades, List<Double> tGrades ) {
		double hwAverage = getAverage( hwGrades );
		double qAverage = getAverage( qGrades );
		double tAverage = getAverage( tGrades );
		
		double totalAverage = ( hwAverage + qAverage + tAverage ) / 3.0;
		
		return totalAverage;
		
	} // end method totalAverage

	
} // end public class Homework4
