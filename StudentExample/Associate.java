package StudentExample;

// Superclass of Instructor and Student classes
public class Associate {

    // Associate class has three fields
	int id;
    String name;
	String defaultPassword;


    public Associate (int id, String name, String defaultPassword) {
        this.id = id;
        this.name = name;
        this.defaultPassword = defaultPassword;
    }
  
    public int id() {
        return id;
    }
  
    public String name() {
        return name;
    }
  
    public void changeName(String newName) {
        name = newName;
    }
	
    public void changePassword(String newPassword) {
        defaultPassword = newPassword;
    }
}
