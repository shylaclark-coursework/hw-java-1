package StudentExample;

import java.util.ArrayList;

public class Course {
    int courseNumber;
    String courseName;
    Instructor instructor;
    ArrayList<Student> students;
    
    public Course(int courseNumber,
                  String courseName,
                  Instructor instructor,
                  ArrayList<Student> students) {
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
  
    public void changeCourseNumber( int newCourseNumber ) {
        courseNumber = newCourseNumber;
    }
  
    public void changeCourseName( String newCourseName ) {
        courseName = newCourseName;
    }
  
    public void changeInstructor( Instructor newInstructor ) {
        instructor = newInstructor;
    }
  
    public void addStudent( Student newStudent ) {
        students.add( newStudent );
    }
  
    public void dropStudent( Student droppedStudent ) {
        students.remove( droppedStudent );
    }
}
