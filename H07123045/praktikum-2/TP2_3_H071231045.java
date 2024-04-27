class Cuboid{
    int height; //tinggi
    int width; //lebar
    int length; //panjang
    
   float cariKubus(){
        return height * width * length;
    }
}

public class TP2_3_H071231045{
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.height = 3;
        cuboid.width = 30;
        cuboid.length = 50;
        System.out.printf("Volume  = %.2f", cuboid.cariKubus());
    }
}