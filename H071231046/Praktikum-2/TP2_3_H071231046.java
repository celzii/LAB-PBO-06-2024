

class Cuboid { //Cuboid = balok
    double height; //Tinggi
    double widht; //Lebar
    double lenght; //Panjang

    double getVolume(){
        //lengkapi
        return height * widht * lenght;
    }
}


public class TP2_3_H071231046 {
    public static void main(String[] args) {
        Cuboid sc = new Cuboid();
        sc.height = 100;
        sc.lenght = 9;
        sc.widht = 5;

        System.out.printf("Volume = %.2f", sc.getVolume());;
    }
}
