public interface Technology {
    void move();
}

class Smartphone  implements Technology{
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move(){
        System.out.println("Smartphone berpindah");
    }

    //TAMBAHAN BEHAVIOR
    void showSmartphone(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: $" + getPrice());
    }

    //GETTER AND SETTER
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Car implements Technology{
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }

    //TAMBAHAN BEHAVIOR
    void showCar(){
        System.out.println("Total gear forward: " + getTotalForwardGear());
        System.out.println("Color:  " + getColor());
        System.out.println("Max speed: " + getMaxSpeed() + " km/jam");
    }

    //GETTER AND SETTER
    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}