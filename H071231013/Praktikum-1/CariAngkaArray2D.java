// nomor 5

import java.util.Scanner;
public class CariAngkaArray2D {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan yang ingin dicari: ");
            int target = scanner.nextInt();

            boolean found = false;
            outer:
            for (int i = 0; i < nums.length; i++) { 
                                                
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at " + i + "," + j);
                        found = true;
                        break outer;
                    }
                }
            }

            if (!found) {
                System.out.println("Bilangan tidak ditemukan dalam array.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan masukkan bilangan yang benar.");
        }

        scanner.close(); 
    }
}