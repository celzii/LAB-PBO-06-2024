public class Karyawan extends PlayAudio{
    String nama;
    String jabatan = "karyawan";
    int umur;
    double gaji;
    Pengalaman pengalaman = new Pengalaman();

    //Constructor
    public Karyawan(){

    }

    public Karyawan(String nama, int umur, String jabatan, double gaji){
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    //Method
    public void soundDiterima(){
        playAudio("D:\\Kuliah Semester 2 UNHAS\\PBO PRATIKUM\\Tugas\\LAB-PBO-06-2024\\H071231046\\Praktikum-7\\audioFile\\soundDiterima.wav");
    }

    public void soundDitolak(){
        playAudio("D:\\Kuliah Semester 2 UNHAS\\PBO PRATIKUM\\Tugas\\LAB-PBO-06-2024\\H071231046\\Praktikum-7\\audioFile\\soundDitolak.wav");
    }

    //Behavior
    void tampilkanDataKaryawan(){
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Gaji: " + getGaji());
    }

    //Setter Getter
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}