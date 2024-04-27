package TP01;

import java.util.Scanner;

public class TP01_02_H071231004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n> ");
        String judul = input.nextLine();
        String[] kata = judul.toLowerCase().split(" ");
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++){
         kalimatBaru += kata[i].substring(0, 1 ).toUpperCase()+ kata[i].substring(1)+" ";

        }
        System.out.println(kalimatBaru.trim());
        input.close();
    }
}
