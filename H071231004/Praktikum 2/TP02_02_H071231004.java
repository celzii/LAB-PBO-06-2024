package TP02;

import java.util.Scanner;

public class TP02_02_H071231004 {
    String nama;
    String id;
    int stok;
    double harga;

    public void produk (String nama, String id, int stok, int harga){
        this.nama = nama;
        this.id = id;
        this.stok = stok;
        this.harga= harga;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nama Barang: ");
        String nama = ip.nextLine();

        System.out.print("ID:");
        String id = ip.nextLine();

        System.out.print("Harga Brang: ");
        double harga = ip.nextDouble();
        
        System.out.print("Stok barang: ");
        int stok = ip.nextInt();
        
        System.out.println("-------------------------------");
        System.out.println("Nama Barang: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Stok Barang: " + stok);
        
        if (stok == 0){
            System.out.println("Stok barang Habis");  
        }else if (stok >1 && stok <=10) {
            System.out.println("Stok Sedikit, Silahkan tambah stok gudang");
        }else if (stok >10){
            System.out.println("Stok barang banyak");
        }else{
            System.out.println("JUMLAH TIDAK TERSEDIA, KEMUNGKINAN ANDA RUGI");
        }

        ip.close();
        
    }
}