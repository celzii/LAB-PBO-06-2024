package Praktikum_3;

public class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;
    
    HotWheels(String name, double speed, double cash) {
        this.name = name;
        this.speed = speed;
        this.cash = cash;
    }

    public void showSpec() {
        System.out.println("\n========== Specification ==========");
        System.out.println("Name\t\t: " + name);
        System.out.println("Speed\t\t: " + speed + "0");
        System.out.println("Winning Amount\t: " + getWinningAmount());
        System.out.println("Cash\t\t: Rp. " + cash + "0\n");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    double getCash(){
        return cash;
    }

    void setCash(double newCash){
        this.cash = newCash;

    }

    void setSpeed(double speed){
        this.speed = speed;
    }

   
    public void upgrade(int budget) {
        if (budget > this.getCash()) {

            System.out.printf(
                "%s cannot be upgraded, not enough money...\n", 
                this.getName());
        } else {
            int increaseSpeed = budget / 50000;
            speed += increaseSpeed;
        
            this.setCash(this.getCash() - budget + (budget % 50000));
            System.out.printf(
                "Increases the speed of %s by %d...\n", 
                this.getName(), 
                increaseSpeed);
        }
    }
    
    public void raceTo(HotWheels enemy) {
        if (this.speed > enemy.speed) {
            this.setWinningAmount(this.getWinningAmount() + 1);           
            this.setCash(this.getCash() + 40000);
            
            System.out.printf(
                "%s Wins! The number of Wins from %s reaches %d wins...\n", 
                this.getName(), 
                enemy.getName(), 
                this.getWinningAmount());

        } else if (this.getSpeed() == enemy.getSpeed()) { 
            System.out.printf(
                "%s with %s are equally strong! The match ended in a draw...\n", 
                this.getName(),
                enemy.getName());
        } else { 
            enemy.winningAmount++;
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf(
                "%s Wins! The number of Wins from %s reaches %d wins...\n",
                enemy.getName(),
                enemy.getName(), 
                enemy.getWinningAmount());
        }
    }

    void setWinningAmount(int newWinningAmount) {
        this.winningAmount = newWinningAmount;
    }
    
    double getSpeed(){
        return speed;
    }

    int getWinningAmount(){
        return winningAmount;
    }
}
