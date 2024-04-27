import java.util.Scanner;

public class TP1_2_H071231042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n> ");
        String judul = input.nextLine();
        String[] kata = judul.toLowerCase().split(" ");
        String arrString = "";
        for (int i = 0; i < kata.length; i++){ //menghitung panjng
            arrString += kata[i].substring(0,1).toUpperCase() + kata[i].substring(1) + " ";
        }
     System.out.println(arrString.trim());
     input.close();
}
}