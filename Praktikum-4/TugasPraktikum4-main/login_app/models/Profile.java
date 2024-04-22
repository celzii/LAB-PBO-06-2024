
package login_app.models;

public class Profile {
    //attributes
    String fullName, nickName, hobby;
    int age;

    //Constructor
    public Profile(){

    }
    
    public Profile(String fullName, String hobby, String nickName, int age) {
        this.fullName = fullName;
        this.hobby = hobby;
        this.nickName = nickName;
        this.age = age;
    }
    
    //behavior
    public void showProfile(){
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap    : " + fullName);
        System.out.println("Nama Panggilan  : " + nickName);
        System.out.println("Umur            : " + age  + " Tahun");
        System.out.println("Hobi            : " + hobby);
    }
    // Getter and Setters                                   
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName(){
        return this.nickName;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

}
