class Alamat {
    String jalan, kota;

    String getAlamat2() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama, nim;

    Alamat alamat = new Alamat();

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.getAlamat2();
    }
}

public class TP2_4_H071231045 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "BTP blok F";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Aipun";
        mahasiswa.nim = "H071231045";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
