// package Praktikum_2;
import java.util.Scanner;
class Product{
    int id;
    String name;
    int stock;
    double price;

    Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getStock() {
        return stock;
    }

    double getPrice() {
        return price;
    }

    boolean stock_saat_ini;
    
    boolean stocAda() {
        if (stock <= 0){
            stock_saat_ini = false;
        }else{
            stock_saat_ini = true;
        }
        return stock_saat_ini;
    }


    public void infoBarang() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Stock: " + stock);
        System.out.println("Harga: " + price);
        System.out.println("Apakh tersedia: " + (stocAda() ? "Tersedia" : "Tidak ada"));
    }

}
public class TP2_2_H071231056 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Id produk : ");
        int id = input.nextInt();
        System.out.print("Masukan nama produk : ");
        String nama = input.next();
        System.out.print("Masukan stock produk : ");
        int stock = input.nextInt();
        System.out.print("Masukan harga produk : ");
        int harga = input.nextInt();

        Product product1 = new Product(id, nama, stock, harga);
        
        input.close();

        System.out.println("Info Product :");
        product1.infoBarang();
        System.out.println("Terima kasih");
       
    }
}

