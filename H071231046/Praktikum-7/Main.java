import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawanList = new ArrayList<>();
        
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Data Karyawan: ");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String opt = scan.nextLine().toLowerCase();
            switch (opt) {
                case "a":
                    String jabatan = "karyawan";
                    System.out.print("Masukkan nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scan.nextInt();
                    Keluarga keluarga = new Keluarga();
                    keluarga.cekStatus();
                    scan.nextLine();
                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan();
                    pengalaman.Organisasi();
                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesPendidikan();
                    String inputPendidikan = pendidikan.getJenjangPendidikan();
                    Projek projek = new Projek();
                    projek.tampilkanProjek();
                    int jumlahProjek = projek.getJumlahProjek();
                    
                    //Pengecekan data
                    if (!inputPendidikan.equals("SD") && !inputPendidikan.equals("SMP") && jumlahProjek>4 && umur>=18 && !pengalaman.getOrganisasi().equals("tidak")){
                        System.out.println("Pengalaman sedang diproses...");
                        System.out.println("Pendidikan terakhir: " + inputPendidikan);
                        System.out.println("Jumlah Projek IT: " + jumlahProjek);
                        System.out.println("==========");
                        System.out.println("Selamat, karyawan diterima!");
                        System.out.println("==========");
                        pengalaman.gaji += 1000000; //Penambahan gaji setelah diterima
                        Karyawan karyawanbaru = new Karyawan(nama, umur, jabatan, pengalaman.gaji);
                        karyawanList.add(karyawanbaru);
                        karyawanbaru.soundDiterima();
                    } else {
                        Karyawan karyawanbaru = new Karyawan();
                        System.out.println("Karyawan tidak diterima");
                        karyawanbaru.soundDitolak();
                    }
                    break;
                case "b":
                    if (karyawanList.isEmpty()){
                        System.out.println("Belum ada data karyawan");
                    } else {
                        for (Karyawan karyawan : karyawanList){
                            karyawan.tampilkanDataKaryawan();
                        }
                    }
                    break;
                case "c":
                    System.out.println("Selamat tinggal ");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Inputan tidak valid!");
                    
            }
        
        }
    }


}
