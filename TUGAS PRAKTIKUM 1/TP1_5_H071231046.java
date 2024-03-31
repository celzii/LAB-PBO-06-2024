import java.util.Scanner;

public class Jwbn5 {
    public static void main(String[] args) {
        int[][] numes = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang dicari:");
        try {
            int number = scanner.nextInt();
            // outerloop:
            for (int i = 0; i < numes.length; i++) {
                for (int j = 0; j < numes[i].length; j++) {
                    if (numes[i][j] == number) {
                        System.out.println("Ditemukan " + number + " di [" + i + "][" + j + "]");
                        break;
                    } else {
                        System.out.println("Angka tidak ditemukan");
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Input bukan angka, silahkan coba lagi.");
        }
    }
}
