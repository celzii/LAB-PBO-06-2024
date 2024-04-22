package TP3_1_H071231045;

public class Player {
    String name;
    Skill skill = new Skill();
    int health = 100; // Default Health
    double position;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String skillType) {
        this.name = name;
        this.skill.type = skillType;
    }

    public Player(String name, String skillType, int skillPower) {
        this.name = name;
        this.skill.type = skillType;
        this.skill.power = skillPower;
    }

    public Player(String name, double position) {
        this.name = name;
        this.position = position;
    }

    public Player(String name, String skillType, int skillPower, double position) {
        this.name = name;
        this.skill.type = skillType;
        this.skill.power = skillPower;
        this.position = position;
    }

    public Player(String name, String skillType, int skillPower, int health, double position) {
        this.name = name;
        this.skill.type = skillType;
        this.skill.power = skillPower;
        this.health = health;
        this.position = position;
    }

    public void checkStatus() {
        System.out.println("===== Player's Status =====");
        System.out.println("Name            : " + this.getName());
        System.out.println("Skill Type      : " + this.getSkill().getType());
        System.out.println("Skill Power     : " + this.getSkill().getPower());
        System.out.println("Health          : " + this.getHealth());
        System.out.println("Position        : " + this.getPosition());
    }

    public void moveToPosition(double position) {
        this.setPosition(position);
        System.out.printf("%s is moving to position: %.1f \n", this.getName(), position);
    }

    public void upgradeSkill(String type, int power) {
        this.skill.type = type;
        this.skill.power = power;
        System.out.printf("%s has upgraded the skill to %s with %d power \n", this.getName(), type, power);
    }

    public void challengeOpponent(Player opponent) {
        // Simulasi pertandingan
        if ((this.getPosition() - opponent.getPosition()) < 10) {
            opponent.health -= this.skill.getPower();
            this.health -= opponent.skill.getPower();

            if (opponent.getHealth() <= 0) {
                System.out.printf("%s has won the match! \n", this.getName());
            }

            System.out.printf("%s challenges %s ... \n", this.getName(), opponent.getName());
        } else {
            System.out.printf("%s and %s are too far apart to challenge. \n", this.getName(), opponent.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}
