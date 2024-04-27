// nomor 1
import java.util.Scanner;

public class BilanganInput {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        int decimalCount = 0;
        int integerCount = 0;
        
        System.out.println("Masukkan bilangan-bilangan:");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            try {
                double num = Double.parseDouble(input);
                if (input.contains(".")) {
                    decimalCount++;
                } else {
                    integerCount++;
                }   
            } catch (NumberFormatException e) {
                                                
                System.out.println("Input '" + input + "' bukan angka, diabaikan.");
            }
        }
        
        System.out.println("\n" + integerCount + " Bilangan Bulat");
        System.out.println(decimalCount + " Bilangan Desimal");     // 
        scanner.close();
    }
}