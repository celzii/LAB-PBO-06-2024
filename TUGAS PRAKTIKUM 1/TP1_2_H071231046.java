import java.util.Scanner;

public class Jwbn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = "";

        try {
            System.out.println("Masukkan Judul Film:");
            title = scanner.nextLine();
        } catch (Exception E) {
            System.out.println("Silahkan input ulang!");
        }

        System.out.println(capitalizeFirstLetter(title));
    }
    
    public static String capitalizeFirstLetter(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
