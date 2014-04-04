package StudentExample;

public class Instructor {

  private int id;
  private String defaultPassword;
  private String name;
  private int coursesPerSemester;
  
  /**
   * requires: id >= 2000000 && id <= 2999999
   *           name ~= /Last, First/
   *           defaultPassword.length() >= 15
   * 
   * ensures: this.coursesPerSemester() >= 0 && coursesPerSemester() <= 4     
   * 
   */
  public Instructor(int id, String name, String defaultPassword) {
    this.id = id;
    this.name = name;
    this.defaultPassword = defaultPassword;
    coursesPerSemester = 0;
  }
  
  public int id() {
    return id;
  }
  
  public String name() {
    return name;
  }
  
  public int coursesPerSemester() {
    return coursesPerSemester;
  }
  
  public void changeName(String newName) {
    name = newName;
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
  
  /**
   * Update password for this instructor.
   *
   * requires: newPassword.length() >= 15
   *
  */
  public void changePassword(String newPassword) {
    defaultPassword = newPassword;
  }

}