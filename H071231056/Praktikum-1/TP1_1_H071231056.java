package Praktikum_1;

import java.util.Scanner;

public class TP1_1_H071231056{
    public static void main(String[] args){

        Scanner value = new Scanner(System.in);


        try{
            System.out.print("Masukan jumlah bilangan : ");
            int n = value.nextInt();
            value.nextLine();

            System.out.print("Masukan " + n + " bilangan : ");
            String[] numbers = value.nextLine().split(" ");

            hitung_angka(numbers);
        } catch (Exception e) {
            System.out.println("Input tidak valid ");
        } finally {
            value.close();
        }

    }

    public static void hitung_angka(String[] numbers){
        int brp_bil_bulat = 0;
        int brp_bil_float = 0;

      for (String number : numbers){
            try{
                double conversi_ke_double = Double.parseDouble(number);
                if (conversi_ke_double == (int) conversi_ke_double) {
                    brp_bil_bulat++;
                } else {
                    brp_bil_float++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid: '" + number + "' bukan angka.");
            }
        }

        System.out.println(brp_bil_bulat + " Bilangan Bulat");
        System.out.println(brp_bil_float + " Bilangan Desimal");
    }
}

