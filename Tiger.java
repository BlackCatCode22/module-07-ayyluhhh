package myZooKeeperChallenge;

import java.time.LocalDate;

public class Tiger extends myZooKeeperChallenge.Animal
{

    private String mewSound;
    private static int numOfTigers = 0;

    public Tiger(String name, String sex, String color, String id, String origin, int weight,
                 LocalDate birthDate, LocalDate arrivalDate, String mewSound) {
        super(name, sex, color, id, origin, weight, birthDate, arrivalDate);
        this.mewSound = mewSound;
        numOfTigers++;
        System.out.println("A new Tiger has been added to the zoo.");
    }
    public Tiger() {
        super();
        this.mewSound = "Mew";
        numOfTigers++;
        System.out.println("A new Tiger has been added to the zoo.");
    }
    public String getMewSound() {
        return mewSound;
    }
    public void setMewSound(String mewSound) {
        this.mewSound = mewSound;
    }
    public void mew() {
        System.out.println(getName() + " says " + mewSound + "!");
    }
    public static int getNumOfTigers() {
        return numOfTigers;
    }
}