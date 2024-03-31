import java.util.Scanner;

public class Jwbn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        try {
            int n = scanner.nextInt();
            double[] numbers = new double[n];
            int countInt = 0, countDecimal = 0;

            System.out.print(" ");
            for (int i = 0; i < n; i++) {
                try {
                    numbers[i] = scanner.nextDouble();
                    if (numbers[i] == (int) numbers[i]) {
                        countInt++;
                    } else {
                        countDecimal++;
                    }
                } catch (Exception e) {
                    System.out.println("Input bukan angka, silahkan coba lagi.");
                    i--;
                    scanner.next();
                }
            }

            System.out.println(countInt + " Bilangan Bulat");
            System.out.println(countDecimal + " Bilangan Desimal");
        } catch (Exception e) {
            System.out.println("Inputan bukan berupa angka!");
        }
    }
}
