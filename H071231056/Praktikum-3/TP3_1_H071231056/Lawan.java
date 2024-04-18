package Try_Games;


public class Lawan {
    private String nama;
    private int darah;

    public Lawan(String nama, int darah) {
        this.nama = nama;
        this.darah = darah;
    }

    public String getNama() {
        return nama;
    }

    public int getDarah() {
        return darah;
    }

    public void diserang(int kekuatanSerangan) {
        this.darah -= kekuatanSerangan;
        if (this.darah <= 0) {
            this.darah = 0;
            System.out.println(nama + " diserang dan darahnya tersisa " + darah);
            System.out.println(nama + " sudah mati!");
        }else{
            System.out.println(nama + " diserang dan darahnya tersisa " + darah);
        }
        
    }
}
