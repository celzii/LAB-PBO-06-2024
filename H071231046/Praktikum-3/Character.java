public class Character {
    String name;
    int damage, health;
    Coordinate coordinate;

    //konstruktor
    public Character(){
    }
    
    public Character(String name, int damage, int health, Coordinate coordinate) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.coordinate  = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }


}






// public class Zombie {
//     String type;
//     int health;
//     int damage = 100;



//     public Zombie(){
//     }

//     public Zombie(String type, int health, int damage) {
//         this.type = type;
//         this.health = health;
//         this.damage = damage;
//     }

//     //setter and getter
//     public String getType(){
//         return type;
//     }

//     public void setType(String type){
//         this.type = type;
//     }

//     public int getHealth() {
//         return health;
//     }

//     public void setHealth(int health){
//         this.health = health;
//     }

//     public int getDamage(){
//         return damage;
//     }

//     public void setDamage(int damage){
//         this.damage = damage;
//     }

//     //behavior    
//     public void attack(){
//         System.out.println("Zombie " + type + " is attacking with damage: " + damage);
//     }

//     public void takeDamage(int damage){
//         this.health -= damage;
//         System.out.println("Zombie " + type + " took damage, remaining health: " + health);
//     }
// }
