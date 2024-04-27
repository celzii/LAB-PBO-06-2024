package TP02;

public class TP02_04_H071231004 {
    public static void main(String[] args){
        Alamat alamat = new Alamat();
        alamat.jalan = "Abdesir";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nancy";
        mahasiswa.nim = "H071231004";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}

class Alamat{
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
        String x = "";
        x += alamat.jalan + ", " + alamat.kota;
        return x;
    }
}