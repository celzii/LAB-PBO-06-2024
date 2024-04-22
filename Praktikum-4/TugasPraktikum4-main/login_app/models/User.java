package login_app.models;

public class User extends Profile{
    String username, password;
    Profile profile;

    //constructor
    public User(String username, String password){
        super("Default fullName", "Default hobby", "Default name", 0);
        this.username = username;
        this.password = password;
    }
    
    public User(String fullName, String hobby, String name, int age, String username, String password) {
        super(fullName, hobby, name,age);
        this.username = username;
        this.password = password;
    }

    public void showDataUser(){
        super.showProfile();
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
    //method
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
}
