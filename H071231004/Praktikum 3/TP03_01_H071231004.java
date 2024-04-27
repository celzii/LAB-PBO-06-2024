class Fish {
    String name;
    String varian;
    int speed;
    Turbo turbo;

    // Constructor 
    public Fish(String name, String varian, int speed) {
        this.name = name;
        this.varian = varian;
        this.speed = speed;
    }
    
    public Fish(String name){
      this.name = name;
    }
    
    public void Challenge(Fish enemy){
       if(this.speed > enemy.speed) {
            System.out.print("selamat " + this.name + " memenangkan pertandingan");
            System.out.println("\nName\t: " + name);
            System.out.println("Varian\t: " + varian);
            System.out.print("Speed\t: " + speed);
            if (this.turbo != null)
                this.turbo.display();
        } else if (this.speed < enemy.speed) {
            System.out.print("selamat " + enemy.name + " memenangkan pertandingan");
            System.out.println("\nName\t: " + name);
            System.out.println("Varian\t: " + varian);
            System.out.print("Speed\t: " + speed);
            if (this.turbo != null)
                this.turbo.display();
        } else {
            System.out.println("Kedua ikan memiliki speed yang sama");
        }
    }
    
    // Method untuk menampilkan informasi ikan
    public void displayInfo() {
        System.out.print("============= WELCOME TO BLUBUP BLUBUP ============");
        System.out.println("\nName\t: " + name);
        System.out.println("Varian\t: " + varian);
        System.out.print("Speed\t: " + speed);
        if (this.turbo != null)
            this.turbo.display();
        System.out.println("=====================================================");
    }
    
    public void takeTurbo(Turbo turbo){
      this.turbo = turbo;
      this.speed += this.turbo.speed;
    }

    public void setVarian(String varian){
      this.varian = varian;
    }
    
    public String getVarian(){
      return varian;
    }
    
    public void setSpeed(int speed){
      this.speed = speed;
    }
    
    public int getSpeed(){
      return speed;
    }
}

class Turbo{
  String name;
  double speed;
  
  public Turbo(){
  }
  
  public Turbo(String name, double speed){
    this.name = name;
    this.speed = speed;
  }
  
  public void setNama(String name){
    this.name = name;
  }
  
  public String getNama(){
    return name;
  }
  
  public void setSpeed(double speed){
    this.speed = speed;
  }
  
  public double getSpeed(){
    return speed;
  }
  
  public void display(){
    System.out.println("\nJenis Turbo\t: " + getNama() + " dengan kecepatan\t: " + getSpeed());
  }
}

public class TP03_01_H071231004{
  public static void main(String[] args){
    Fish fish1 = new Fish("Dory", "Clownfish", 50);
    Turbo turbo1 = new Turbo("Stutu", 100);
    
    Fish fish2 = new Fish("Nemo");
    fish2.setVarian("Blue Tang");
    fish2.setSpeed(95);
    Turbo turbo2 = new Turbo();
    turbo2.setNama("apalah");
    turbo2.setSpeed(300);
    
    fish1.takeTurbo(turbo1);
    fish2.takeTurbo(turbo2);
    
    fish1.displayInfo();
    fish2.displayInfo();
    
    fish1.Challenge(fish2);
  }
}