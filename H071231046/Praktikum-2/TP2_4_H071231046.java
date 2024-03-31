
class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;
   
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public Alamat getAlamat(){
        return alamat;
    }
}
class Alamat {
  String jalan;
  String kota;

    public String alamatFull(){
        return jalan+", " +kota;
    }
}
   
public class TP2_4_H071231046{
    public static void main(String[] args) {
      Alamat alamatt = new Alamat();
      alamatt.jalan = "Tidung 10";
      alamatt.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Chelsea";
        mahasiswa.nim = "H071231046";
        mahasiswa.alamat = alamatt;


        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().alamatFull());

    }
}