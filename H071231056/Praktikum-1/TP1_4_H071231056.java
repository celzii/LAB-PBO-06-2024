package Praktikum_1;

import java.util.Scanner;

public class TP1_4_H071231056 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double radius = scanner.nextDouble();
            
            double area = Math.PI * radius * radius;
            System.out.format("Luas lingkaran: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Input tidak valid ");
        } finally {
            scanner.close();
        }
    }
}
