import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    public boolean getGender(){
        return this.isMale;
    }

}


public class TP2_1_H071231046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person1 = new Person();

        System.out.print("Masukkan Nama : ");
        String name = scan.nextLine();
        person1.setName(name);

        System.out.print("Masukkan Umur : ");
        int age = scan.nextInt();
        scan.nextLine(); //ditambahkan karena akan beralih ke inputan boolean
        person1.setAge(age);

        System.out.print("Masukkan gender (true laki-laki, false perempuan) : ");
        boolean isMale = scan.nextBoolean();
        scan.nextLine();
        person1.setGender(isMale);

        scan.close();
        
        System.out.println("Nama anda adalah " + person1.getName());
        System.out.println("Umur anda adalah " + person1.getAge());
        System.out.println("Gender : " + (person1.getGender() ? "Laki-laki" : "Perempuan"));

    }
}
