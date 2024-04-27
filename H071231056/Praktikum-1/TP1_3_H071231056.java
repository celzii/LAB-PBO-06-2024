package Praktikum_1;

import java.util.Scanner;

public class TP1_3_H071231056 {
    public static void main(String[] args) {
        Scanner tanggal = new Scanner(System.in);

        System.out.print("Masukan tanggal : ");
        String input = tanggal.nextLine();

        String output = convertStringToDate(input);
        System.out.println("Output for input \"" + input + "\": " + output);

        tanggal.close();
    }

    public static String convertStringToDate(String input) {
        String[] parts = input.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        String[] monthNames = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
            "Agustus", "September", "Oktober", "November", "Desember"
        };

        
        String monthName = monthNames[month - 1];

        
        if (year < 100) {
            if (year >= 30) { 
                year += 1900;
            } else {
                year += 2000;
            }
        }


        String formattedDate = day + " " + monthName + " " + year;
        return formattedDate;
    }
}
