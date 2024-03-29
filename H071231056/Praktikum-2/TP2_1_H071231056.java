// package Praktikum_2;

import java.util.*;
class Person {
    String name;
    int age;
    boolean isMale;

    
     void setName(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }

    
     void setAge(int age) {
        this.age = age;
    }

    
     int getAge() {
        return age;
    }

    
     void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {
        return isMale ? "Male" : "Female";
    }

    
}


public class TP2_1_H071231056 {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        Person person = new Person();


        System.out.print("Masukan data nama : ");
        person.setName(nm.nextLine());
        System.out.print("Masukan data umur : ");
        person.setAge(nm.nextInt());
        System.out.print("Masukan data gender(true for Male and False for Female) : ");
        person.setGender(nm.nextBoolean());

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        nm.close();
    }
    
}
