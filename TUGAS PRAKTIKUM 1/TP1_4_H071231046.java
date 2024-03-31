import java.util.Scanner;

public class Jwbn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran:");
        try {
            double radius = scanner.nextDouble();
            double area = Math.PI * Math.pow(radius, 2); //pow = pangkat
            System.out.printf("Luas lingkaran: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Input salah, Silahkan coba lagi.");
        }
    }
}
