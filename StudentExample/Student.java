package StudentExample;

public class Student extends Associate {
    // Adds three fields
    private int creditHours;
    private int qualityPoints;
    private double gpa;
    
    public Student(int creditHours,
                   int qualityPoints,
                   double gpa,
                   int id,
                   String name,
                   String defaultPassword) {
        super(id, name, defaultPassword);
        creditHours = 0;
        qualityPoints = 0;
        gpa = 0.0;
    }
 
  public int creditHours() {
      return creditHours;
  }
  
  public int qualityPoints() {
      return qualityPoints;
  }
  
  public double gpa() {
      return gpa;
  }

  public void addCreditHours(int hours) {
      creditHours = creditHours + hours;
  }
  
  public void addQualityPoints(int points) {
      if ((qualityPoints + points) <= 4 * creditHours) {
          qualityPoints = qualityPoints + points;
      }
  }
  
  public void computeGPA() {
    if (creditHours > 0) {
      gpa = (double)(qualityPoints) / creditHours;
    }
  }

}
