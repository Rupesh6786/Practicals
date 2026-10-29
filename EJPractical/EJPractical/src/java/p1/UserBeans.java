package p1;

public class UserBeans {
    private String name;
    private String age;
    private String email;
    private String gender;
    private String[] hobbies;
    private String error;
    
    public UserBeans(){
        error="";
    }

    // Getters and setters for each field
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String[] getHobbies() { return hobbies; }
    public void setHobbies(String[] hobbies) { this.hobbies = hobbies; }

    public String getError() { return error; }

    // Validation method
    public boolean validate() {
        if (name == null || name.equals("")) {
            error = "Name cannot be empty";
            return false;
        }
        if (age == null || !age.matches("\\d+") || Integer.parseInt(age) <= 0) {
            error = "Invalid age";
            return false;
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            error = "Invalid email";
            return false;
        }
        if (gender == null || gender.equals("")) {
            error = "Please select your gender";
            return false;
        }
        return true;
    }
}
