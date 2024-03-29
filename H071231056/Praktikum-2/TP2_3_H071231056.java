// package Praktikum_2;
import java.util.Scanner;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}

public class TP2_3_H071231056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuboid cuboid = new Cuboid();

        System.out.println("Masukkan tinggi kuboid:");
        cuboid.height = scanner.nextDouble();

        System.out.println("Masukkan lebar kuboid:");
        cuboid.width = scanner.nextDouble();

        System.out.println("Masukkan panjang kuboid:");
        cuboid.length = scanner.nextDouble();

        System.out.format("Volume = %.2f", cuboid.getVolume());

        scanner.close();
    }
}
