package nomor2;

public class Main {
    public static void main(String[] args) {
        SelfUtils.displaySelfData();
        System.out.println("------------------------");
        AcaraOlahraga acara = new AcaraOlahraga("Kak Ghazy", "One TV", "Badmintoon", "Kejuaraan Dunia", 20);
        acara.displayInfo();
        AcaraOlahraga acara1 = new AcaraOlahraga();
        System.out.println("------------------------");
        acara1.setNama("Kak Resky");
        acara1.setPenyiar("Metro TV");
        acara1.setJenisOlahraga("Sepak Bola");
        acara1.setDeskripsi("Di lapangan UNHAS");
        acara1.setDurasi(40);
        System.out.println(acara1.getNama());
        System.out.println(acara1.getPenyiar());
        System.out.println(acara1.getJenisOlahraga());
        System.out.println(acara1.getDeskripsi());
        System.out.println(acara1.getDurasi());


    }
}

class SelfUtils {
    public static void displaySelfData() {
        System.out.println("Nama : Chelsea Shelin Purnaria");
        System.out.println("NIM : H071231046");
    }
}
