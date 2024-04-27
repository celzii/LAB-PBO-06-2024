package Praktikum_1;

import java.util.Scanner;

public class TP1_2_H071231056 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan teks: ");
            String input = scanner.nextLine();

            String kapital = awali_dgn_kapital(input);
            System.out.println("Output: " + kapital);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan ");
        } finally {
            scanner.close();
        }
    }

    public static String awali_dgn_kapital(String text) {

        if (text == null || text.isEmpty()) {
            return text;
        }

        String[] words = text.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}
