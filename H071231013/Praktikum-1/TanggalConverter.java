// nomor 3

import java.util.Scanner;
public class TanggalConverter { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        cekTanggal(tanggal);
    }

    public static void cekTanggal(String tanggal){
        String hasil = "";
        String[] x = tanggal.split("-"); 
        hasil += x[0].replace("0", "");
        String daftarBulan[] =  new String[]{" Januari ", " Februari ", " Maret ", " April ", " Mei ", " Juni ", " Juli ", " Agustus ", " September ", " Oktober ", " November ", " Desember "};
        int bulan = Integer.parseInt(x[1]);
        hasil += daftarBulan[bulan-1];
        int tahun = Integer.parseInt(x[2]);
        
        if (tahun > 24) {
            hasil += ("19" + tahun) ;
        }
        else if (tahun <= 24 && tahun >= 00) {
            if (tahun < 10) {
                hasil += ("20" + "0"+tahun) ;
            }
            else{
                hasil += ("20" + tahun) ;
            }                             
        }

        System.out.println(hasil);
    }
}