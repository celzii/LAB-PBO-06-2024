import java.util.Scanner;
public class TP2_1_H071231045 {
    String name ;
    int age ;
    boolean gender ;
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    
    void setGander(boolean gander){
        this.gender = gander;
    }
    String getGander(){
        return gender ? "Male": "FaMale";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TP2 x = new TP2();
        System.out.println("name: ");
        x.setName(scanner.nextLine());
        System.out.println("age: ");
        x.setAge(scanner.nextInt());
        System.out.println("gander: ");
        x.setGander(scanner.nextBoolean());

        System.out.println("\n-- info --");
        System.out.println("name: "+ x.getName());
        System.out.println("Age: " + x.getAge());
        System.out.println("gander:"+ x.getGander());
        scanner.close();

        
      

    }




    
}
