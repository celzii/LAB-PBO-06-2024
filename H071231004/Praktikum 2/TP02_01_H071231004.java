package TP02;
import java.util.Scanner;

public class TP02_01_H071231004 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Person orang = new Person();

    System.out.print("Masukkan nama: ");
    orang.setName(input.nextLine());

    System.out.print("Masukkan usia: ");
    orang.setAge(input.nextInt());

    System.out.print("Apakah laki laki? (true/false): ");
    orang.setGender(input.nextBoolean());

    System.out.println("-----------------------------------------");
    System.out.println("Nama: " + orang.getname());
    System.out.println("Usia: " + orang.getAge());
    System.out.println("Jenis kelamin: " + orang.setGender());
    input.close();
   }
}

class Person{
    private String name;
    private int age;
    private boolean isMale;

    void setName(String name){
        this.name = name;
    }

    String getname(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setGender(boolean gender){
        this.isMale = gender;
    }

    String setGender(){
        if(isMale == true){
            return "laki laki";
        } else{
            return "perempuan";
        }
    }
}