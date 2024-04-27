package TP01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TP01_01_H071231004{
public static void main(String[] args) {
    Scanner jumlah = new Scanner(System.in);
    System.out.println("Masukkan jumlah bilangan");
    try {

        int n = jumlah.nextInt();
        int bilBulat = 0;
        int bilDesimal = 0;

    Scanner angka = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        double bilangan = angka.nextDouble();

    if (bilangan % 1 == 0) {
        bilBulat++;
    } else {
        bilDesimal++;
    }
}

    System.out.println(bilBulat + " Bilangan Bulat");
    System.out.println(bilDesimal + " Bilangan Desimal");

} catch (InputMismatchException e) {
    System.out.println("Inputan bukan angka");
}
}
}

