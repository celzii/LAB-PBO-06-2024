// nomor 4

import java.util.Scanner; 
import java.text.DecimalFormat;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();

            if (jariJari < 0) {
                System.out.println("Jari-jari harus bilangan positif.");
            } else {
                double luas = Math.PI * jariJari * jariJari;
                System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + df.format(luas)); // 
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan masukkan angka yang benar.");
        }

        scanner.close();
    }
}