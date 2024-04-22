public class TP3_1_H071231046 {
    public static void main(String[] args) {
        // Membuat objek Character untuk Plant dan Zombie
        Character plant = new Character("Peashooter", 20, 1000, new Coordinate(2, 3));
        Character zombie = new Character("Conehead", 100, 20, new Coordinate(2, 3)); // Misalnya, zombie memiliki 100 health

        // Membuat objek PlantsvsZombies
        PlantsvsZombies game = new PlantsvsZombies(plant, zombie);

        //Check Status
        game.checkStatus();

        //launchbattle
        game.launchBattle();

        // Memprediksi kapan zombie akan mati
        game.predictDeath();
        printBarriers();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}
