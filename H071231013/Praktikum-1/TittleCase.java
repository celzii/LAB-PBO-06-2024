// nomor 2

import java.util.Scanner;
public class TittleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String input = scanner.nextLine();
        String result = toTitleCase(input);
        System.out.println("Output: " + result);
        scanner.close();
    }

    public static String toTitleCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean nextUpperCase = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                sb.append(c);
                nextUpperCase = true;
            } else if (nextUpperCase) {
                sb.append(Character.toUpperCase(c));
                nextUpperCase = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }                                     
        }

        return sb.toString();
    }
}