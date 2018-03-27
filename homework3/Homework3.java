/**
 * Shyla Clark
 * CSCI 1583
 * Homework 3: Student Grade Calculator
 * Feb 14, 2014
 **/

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		String studentName = "";
		int menu = 0;
		int menu2 = 0;
		
        // Homeworks
		int hwGrade = 0;
		int hwCounter = 0;
		int hwTotal = 0;
		
        // Quizzes
		int qGrade = 0;
		int qCounter = 0;
		int qTotal = 0;
		
        // Tests
		int tGrade = 0;
		int tCounter = 0;
		int tTotal = 0;
		
        double average;

		System.out.println("Enter student name: ");
      	studentName = input.next();
        
		if (studentName != null) {
			System.out.println("Type 1 to enter homework grades, 2 to enter quiz grades, 3 to enter test grades or -1 to quit.");
			menu = input.nextInt();
			
            // Enter homework grades
			if (menu == 1) {
				do { 
					System.out.println("Type 1 to enter homework grade or -1 to quit.");
					menu2 = input.nextInt();
                    
					if (menu2 == 1) {
						System.out.println("Enter homework grade: ");
			        	hwGrade = input.nextInt();
						hwTotal = hwTotal + hwGrade;
			        	hwCounter = hwCounter + 1;
					}
                    else if (menu2 == -1) {
						average = (double) hwTotal / hwCounter;
	            		System.out.printf("\nTotal of the %d grades entered is %d\n", hwCounter, hwTotal);
	            		System.out.printf("Average for homework is %.2f\n", average);
					}
				}
                while (menu2 != -1); // Exit-condition
			}
            
            // Calculate quiz grades
            else if (menu == 2) {
				do {
					System.out.println("Type 1 to enter quiz grade or -1 to quit.");
					menu2 = input.nextInt();
				
					if (menu2 == 1) {
						System.out.println("Enter quiz grade: ");
		        		qGrade = input.nextInt();
						qTotal = qTotal + qGrade;
		        		qCounter = qCounter + 1;
					}
                    else if (menu2 == -1) {
						average = (double) qTotal / qCounter;
            			System.out.printf("\nTotal of the %d grades entered is %d\n", qCounter, qTotal);
            			System.out.printf("Average for quizzes is %.2f\n", average);
					}
				}
                while (menu2 != -1);
			}
				
			else if (menu == 3) {
				do {
					System.out.println("Type 1 to enter test grade or -1 to quit.");
					menu2 = input.nextInt();
				
					if (menu2 == 1) {
						System.out.print("Enter test grade: ");
		        		tGrade = input.nextInt();
						tTotal = tTotal + tGrade;
		        		tCounter = tCounter + 1;
					}
			 		else if (menu2 == -1) {
						average = (double) tTotal / tCounter;
            			System.out.printf("\nTotal of the %d grades entered is %d\n", tCounter, tTotal);
            			System.out.printf("Average for tests is %.2f\n", average);
					}
				}
                while (menu2 != -1);
			}
		}
    }
}
