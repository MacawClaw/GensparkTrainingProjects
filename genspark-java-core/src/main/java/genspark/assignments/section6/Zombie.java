package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Zombie extends Humanoid implements Assignment{


    private int brainLust, strength, intelligence, health, compassion;
    public int getBrainLust() {
        return brainLust;
    }

    public void setBrainLust(int brainLust) {
        this.brainLust = brainLust;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCompassion() {
        return compassion;
    }

    public void setCompassion(int compassion) {
        this.compassion = compassion;
    }

    // Default Constructor
    public Zombie() {
    }

    public Zombie(int brainLust, int strength, int intelligence, int health, int compassion) {
        this.brainLust = brainLust;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = health;
        this.compassion = compassion;
    }

    @Override
    public String attack(Object o) {
        Human h = Human.class.cast(o);
        h.setHealth(h.getHealth() - strength);
        String message;
        if (h.getHealth() <= 3) {
            message = "The zombie bites the human for " +
                    this.getStrength() +
                    " damage, the human has died...";
        } else {
            message = "The zombie bites the human for " +
                    this.getStrength() +
                    " damage, the human survives but will be turning soon...";
        }
        return message;
    }

    public Class whoIsTheParent() {
        return super.getClass().getSuperclass();
    }

}
