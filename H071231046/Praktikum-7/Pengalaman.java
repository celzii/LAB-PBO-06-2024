import java.util.Scanner;
import java.util.InputMismatchException;

public class Pengalaman extends Kehidupan{
    int inputJenis;
    double gaji;
    String organisasi;
    public static Scanner scan = new Scanner(System.in);


    @Override
    public void prosesKehidupan() {
        try {
            System.out.println("Pengalaman sebelumnya: ");
            System.out.println("1. Freelancer\n2. Magang\n3. Pekerja Tetap\n4. Tidak ada");
            System.out.print("Input: ");
            inputJenis = scan.nextInt();
            scan.nextLine();
            if (inputJenis>4 || inputJenis<1){
                System.out.println("Inputan diluar opsi!");
            } else if (inputJenis != 4){
                System.out.print("Gaji sebelumnya: ");
                gaji = scan.nextDouble();
                scan.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Tidak boleh kosong!");
        }
    }

    public void Organisasi(){
        System.out.println("Pengalaman Organisasi sebelumnya (Masukkan tidak jika tidak ada): ");
        organisasi = scan.nextLine();
    }

    //setter getter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getInputJenis() {
        return inputJenis;
    }

    public void setInputJenis(int inputJenis) {
        this.inputJenis = inputJenis;
    }

    public String getOrganisasi() {
        return organisasi;
    }
}
