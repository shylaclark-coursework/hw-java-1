package StudentExample;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class StudentTest {

 public static void main (String[] args) throws Exception {
   
   ArrayList<Student> students = new ArrayList<Student>();
   File input = new File("/Users/NewMac/csci1583/StudentExample/Students.txt");
   Scanner reader = new Scanner(input);
  
   while(reader.hasNextLine()) {
     String[] studentData = reader.nextLine().split(" ");
     String name = studentData[0] + " " + studentData[1];
     int id = Integer.parseInt(studentData[2]);
     Student student = new Student(id, name, studentData[3]);
     students.add(student);
   }
 }

}