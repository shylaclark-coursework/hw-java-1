package StudentExample;

// Subclass of Associate
public class Instructor extends Associate {
    
    // Instructor class adds one field
    private int coursesPerSemester;
    
    // Instructor class inherits three fields from superclass
    public Instructor(int coursesPerSemester, int id, String name, String defaultPassword) {
        super(id, name, defaultPassword);
        coursesPerSemester = 0;
    }
  
    public int coursesPerSemester() {
        return coursesPerSemester;
    }
  
    public void addCourses(int courses) {
        coursesPerSemester = coursesPerSemester + courses;
    }
}
