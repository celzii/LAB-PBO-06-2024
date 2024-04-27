package Try_Games;


public  class Senjata {
    private String nama;
    private int kekuatanSerangan;

    public Senjata(String nama, int kekuatanSerangan) {
        this.nama = nama;
        this.kekuatanSerangan = kekuatanSerangan;
    }

    public String getNama() {
        return nama;
    }

    public int getKekuatanSerangan() {
        return kekuatanSerangan;
    }

    public void serang(Lawan lawan){
        System.out.println();
    }
}
