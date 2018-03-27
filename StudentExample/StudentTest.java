package StudentExample;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class StudentTest {
    public static void main (String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<Student>();
        File input = new File("StudentExample/Students.txt");
        Scanner reader = new Scanner(input);
        
        while(reader.hasNextLine()) {
            // Split() returns array of Strings split by whitespace
            String[] studentData = reader.nextLine().split(" ");
            
            String name = studentData[0] + " " + studentData[1];
            int id = Integer.parseInt(studentData[2]);
            String defaultPassword = studentData[3];
            int creditHours = Integer.parseInt(studentData[4]);
            int qualityPoints = Integer.parseInt(studentData[5]);
            double gpa = Double.parseDouble(studentData[6]);
            
            Student student = new Student(creditHours, qualityPoints, gpa, id, name, defaultPassword);
            students.add(student);
            System.out.println(students);
        }
    }
}
