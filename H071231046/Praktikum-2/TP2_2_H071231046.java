import java.util.Scanner;

class Produk {
    String nama;
    int ID;
    int harga;
    int stok;

    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }

    public void infoProduk() {
        System.out.println("Nama\t: " + nama);
        System.out.println("ID\t: " + ID);
        System.out.println("Harga\t: " + harga);
        System.out.println("Stok\t: " + stok);
    }
    
    public boolean cekStok() {
        return stok > 0;
    }
}

public class TP2_2_H071231046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produk produk = new Produk();

        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        produk.setNama(nama);

        System.out.print("Masukkan ID produk: ");
        int id = scanner.nextInt();
        produk.setID(id);

        System.out.print("Masukkan harga produk: ");
        int harga = scanner.nextInt();
        produk.setHarga(harga);

        System.out.print("Masukkan stok produk: ");
        int stok = scanner.nextInt();
        produk.setStok(stok);

        produk.infoProduk();

        if (produk.cekStok()) {
            System.out.println("Produk tersedia di stok.");
        } else {
            System.out.println("Produk tidak tersedia di stok.");
        }

        scanner.close();
    }
}
