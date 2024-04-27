package Praktikum_1;

import java.util.Scanner;

public class TP1_5_H071231056 {
    public static void main(String[] args) {
        int[][] array_angka = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner nilai = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = nilai.nextInt();
            
            boolean found = false;
            for (int i = 0; i < array_angka.length; i++) {
                for (int j = 0; j < array_angka[i].length; j++) {
                    if (array_angka[i][j] == target) {
                        System.out.format("Found %d at [%d][%d]\n", target, i, j);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                System.out.println("Angka " + target + " tidak ditemukan dalam array.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid");
        } finally {
            nilai.close();
        }
    }
}
