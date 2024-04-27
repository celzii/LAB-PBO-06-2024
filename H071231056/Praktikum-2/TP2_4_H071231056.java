// package Praktikum_2;
class Alamat {
    String jalan;
    String kota;

    }

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    String getNama(){
        return nama;
    }
    String getNim(){
        return nim;
    }
    String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;
    }
}

public class TP2_4_H071231056{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalandre";
        alamat.kota = "Kta Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Aldi";
        mahasiswa.nim = "12345";

        System.out.println("Nama    : " + mahasiswa.getNama());
        System.out.println("Nim     : " + mahasiswa.getNim());
        System.out.println("Alamat  : " + mahasiswa.getAlamat());
    }
}

