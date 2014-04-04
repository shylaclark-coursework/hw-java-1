package StudentExample;

import java.util.ArrayList;

public class Course {

  int courseNumber;
  String courseName;
  Instructor instructor;
  ArrayList<Student> students;
  
  public Course( int courseNumber, String courseName, Instructor instructor, ArrayList<Student> students ) {
      this.courseNumber = courseNumber;
      this.courseName = courseName;
      this.instructor = instructor;
      this.students = students;
  }
  
  public int courseNumber() {
	  return courseNumber;
  }
  
  public String courseName() {
	  return courseName;
  }
  
  public Instructor instructor() {
	  return instructor;
  }
  
  public ArrayList<Student> students() {
	  return students;
  }
  
  /**
   * Change number of this course.
   * 
   * requires: courseNumber must be 5 integers long
   * 
   */
  public void changeCourseNumber( int newCourseNumber ) {
	  courseNumber = newCourseNumber;
  }
  
  /**
   * Change name of this course.
   * 
   * requires: courseName must be a string of 12 characters
   * 
   */
  public void changeCourseName( String newCourseName ) {
	  courseName = newCourseName;
  }
  
  /**
   * Change instructor for this course.
   * 
   * requires: instructor must be a string
   * 
   */
  public void changeInstructor( Instructor newInstructor ) {
	  instructor = newInstructor;
  }
  
  /**
   * Add student for this course.
   * 
   * requires: newStudent must be a string
   * 
   */
  public void addStudent( Student newStudent ) {
	  students.add( newStudent );
  }
  
  /**
   * Drop student for this course.
   * 
   * requires: droppedStudent must be a string
   * 
   */
  public void dropStudent( Student droppedStudent ) {
	  students.remove( droppedStudent );
  }
  
}