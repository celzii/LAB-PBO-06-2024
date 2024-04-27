import java.util.Scanner;

public class TP1_2_H071231045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n> ");
        String judul = input.nextLine();
        judul = judul.toLowerCase();
        System.out.println(hurufJudul(judul));
        input.close();
    }
    static String hurufJudul(String judul){
        String[] arrString = judul.split(" ");
        for (int i = 0; i < arrString.length; i++){
            arrString[i] = Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1);
        }
        String hasil = String.join(" ", arrString);
        return hasil;
    }
}