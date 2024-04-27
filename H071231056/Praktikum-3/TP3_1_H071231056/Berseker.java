package Try_Games;


public class Berseker extends Senjata{
    private String nama;
    private int rage;
    private Lawan lawan;

    public Berseker(String nama, String senjata, int kekuatanSerangan, int rage, Lawan lawan) {
        super(senjata, kekuatanSerangan);
        this.nama = nama;
        this.rage = rage;
        this.lawan = lawan;
    }

    

    @Override
    public void serang(Lawan lawan) {
        System.out.println(nama + " (" + this.getClass().getSimpleName() + ") menyerang " + lawan.getNama() + " dengan " + getNama() + " (rage: " + rage + ")");
        int totalSerangan = getKekuatanSerangan() * rage;
        

        lawan.diserang(totalSerangan);
        while (lawan.getDarah() > 0) {
            System.out.println(lawan.getNama() + " masih hidup dengan " + lawan.getDarah() + " HP tersisa.");
            serang(lawan);
        }
    }

    public static void main(String[] args) {

        Berseker berseker = new Berseker("Rokan", "Kapak", 0, 1, new Lawan("Monster", 100));
        berseker.serang(new Lawan("Goblin", 1));
    }



    public String getNama() {
        return nama;
    }


    public int getRage() {
        return rage;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }



    public void setRage(int rage) {
        this.rage = rage;
    }



    public void setLawan(Lawan lawan) {
        this.lawan = lawan;
    }
}
