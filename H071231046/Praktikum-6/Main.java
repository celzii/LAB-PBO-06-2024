public class Main {
    public static void main(String[] args) {
        printBarries();
        Bulldog buster = new Bulldog(20, 38);
        buster.move();
        buster.describe();
        printBarries();

        Smartphone newSmartphone = new Smartphone(185, "IQOO");
        newSmartphone.move();
        newSmartphone.showSmartphone();
        printBarries();

        Car myCar = new Car(12, "Black", 312);
        myCar.move();
        myCar.showCar();
        printBarries();
        

    }

    static void printBarries(){
        System.out.println("--------------------------------------------------------");
    }
}


