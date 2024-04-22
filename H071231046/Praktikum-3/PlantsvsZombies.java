public class PlantsvsZombies {
    Character plant;
    Character zombie;

    public PlantsvsZombies(Character plant, Character zombie) {
        this.plant = plant;
        this.zombie = zombie;
    }

    public void checkStatus() {
        System.out.println("===== Plants vs Zombie's Status =====");
        System.out.println("\n========== Plant ==========");
        System.out.println("Plant Name      : " + this.plant.getName());
        System.out.println("Plant Health    : " + this.plant.getHealth());
        System.out.println("Plant Damage    : " + this.plant.getDamage());
        System.out.println("Plant Coordinate: (" + this.plant.getCoordinate().getX() + ", " + this.plant.getCoordinate().getY() + ")");
        System.out.println("\n========== Zombie ==========");
        System.out.println("Zombie Name     : " + this.zombie.getName());
        System.out.println("Zombie Damage   : " + this.zombie.getDamage());
        System.out.println("Zombie Coordinate: (" + this.zombie.getCoordinate().getX() + ", " + this.zombie.getCoordinate().getY() + ")");
    }

    public void launchBattle() {
        if (this.plant.getCoordinate().getX() == this.zombie.getCoordinate().getX() && this.plant.getCoordinate().getY() == this.zombie.getCoordinate().getY()){
            // Jika x dan y sama, maka zombie dan plant akan saling menyerang
            plant.setHealth(plant.getHealth() - this.zombie.getDamage());
            // asumsikan zombie tidak memiliki health
            System.out.println("================================");
            System.out.printf("\n" + this.plant.getName() + " and " + this.zombie.getName() +  " are in the same coordinate. Both take damage.\n");
        } else if (this.plant.getCoordinate().getY() == this.zombie.getCoordinate().getY()){
            // Jika hanya x yang sama, maka zombie akan terkena damage dari plant
            System.out.println("================================");
            System.out.printf("\n%s is in the same x coordinate with %s. %s takes damage.\n", this.plant.getName(), this.zombie.getName(), this.zombie.getName());
        } else {
            // Jika x dan y berbeda, maka zombie dan plant tidak terkena damage
            System.out.println("================================");
            System.out.printf("\n %s and %s are in different coordinates. No one takes damage.\n", this.plant.getName(), this.zombie.getName());
        }
    }

    public void predictDeath() {
        int peasPerMinute = 40; // Misalnya, Peashooter menembakkan 40 pea per menit
        int damagePerMinute = plant.getDamage() * peasPerMinute; // Misalnya, tanaman memberikan 10 damage per pea
        int minutesToDeath = (int) Math.ceil((double) zombie.getHealth() / damagePerMinute);
        int speed = 1; // Misalnya, zombie bergerak 1 petak per menit

        int deathX = zombie.getCoordinate().getX() - speed * minutesToDeath;
        deathX = Math.max(deathX, 0);
        int deathY = zombie.getCoordinate().getY();
        
        if (this.plant.getCoordinate().getX() == this.zombie.getCoordinate().getX() && this.plant.getCoordinate().getY() == this.zombie.getCoordinate().getY()){
            int planttakedamage = zombie.getDamage() * 4;
            int plantminutesToDeath = (int) Math.ceil((double) plant.getHealth() / planttakedamage);
            System.out.printf("Plant will die in %d minutes because zombie have strong damage.\n", plantminutesToDeath);
        } else {
            System.out.printf("Zombie will die in approximately %d minutes at coordinate (%d, %d).\n", minutesToDeath, deathX, deathY);
            
        }
    }
}