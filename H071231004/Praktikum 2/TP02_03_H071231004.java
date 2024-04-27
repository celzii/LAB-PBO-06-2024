package TP02;

    class Cuboid{
        double height;
        double widht;
        double length;

        double getVolume(){
            return height * widht * length; 
        }
    }

public class TP02_03_H071231004{
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.length = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
