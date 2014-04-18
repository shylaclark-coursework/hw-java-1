package StudentExample;

public class Instructor extends Associate {
	
  private int coursesPerSemester;

  public Instructor(int id, String name, String defaultPassword) {
    super.id = id;
    super.name = name;
    super.defaultPassword = defaultPassword;
    coursesPerSemester = 0;
  }
  
  // ensures: this.coursesPerSemester() >= 0 && coursesPerSemester() <= 4     
  public int coursesPerSemester() {
    return coursesPerSemester;
  }
  
  /**
   * Update courses per semester for this instructor.
   * 
   * requires: hours >= 0
   * 
   * ensures: new.coursesPerSemester() == old.coursesPerSemester() + courses
   * 
   */
  public void addCourses(int courses) {
    coursesPerSemester = coursesPerSemester + courses;
  }

}