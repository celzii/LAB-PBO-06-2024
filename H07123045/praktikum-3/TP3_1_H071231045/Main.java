package TP3_1_H071231045;

public class Main {
    public static void main(String[] args) {
        Skill skill1 = new Skill();
        skill1.setType("Dribbling");
        skill1.setPower(90);

        Player player1 = new Player("Lionel Messi", skill1.getType(), skill1.getPower(), 10.0);

        Skill skill2 = new Skill("Shooting", 85);

        Player player2 = new Player();
        player2.setName("Cristiano Ronaldo");
        player2.setSkill(skill2);
        player2.setHealth(100);
        player2.setPosition(15.0);

        printBarriers();
        player1.checkStatus();
        printBarriers();
        player2.checkStatus();

        printBarriers();
        player1.challengeOpponent(player2);

        printBarriers();
        player1.moveToPosition(15.0);

        printBarriers();
        player1.challengeOpponent(player2);

        printBarriers();
        player1.checkStatus();
        printBarriers();
        player2.checkStatus();

        printBarriers();
        player2.upgradeSkill("Heading", 95);

        printBarriers();
        player2.challengeOpponent(player1);

        printBarriers();
        player1.checkStatus();
        printBarriers();
        player2.checkStatus();

        printBarriers();
        player2.moveToPosition(5.0);

        printBarriers();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}


