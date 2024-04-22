package TP3_1_H071231045;

public class Skill {
    String type;
    int power = 50; // Default Power

    public Skill() {
    }

    public Skill(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
