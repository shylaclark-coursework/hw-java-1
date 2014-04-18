package StudentExample;

public class Associate {
	int id;
	String defaultPassword;
	String name;
	
  
    /**
     * requires: id >= 2000000 && id <= 2999999
     *           name ~= /Last, First/
     *           defaultPassword.length() >= 15
     *
     */
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
	
    /**
     * Update password.
     *
     * requires: newPassword.length() >= 15
     *
    */
    public void changePassword(String newPassword) {
      defaultPassword = newPassword;
    }
  
}