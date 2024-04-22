package myZooKeeperChallenge;

import java.time.LocalDate;

public class Bear extends myZooKeeperChallenge.Animal
{

    private String growlSound;
    private static int numOfBears = 0;

    public Bear(String name, String sex, String color, String id, String origin, int weight,
                LocalDate birthDate, LocalDate arrivalDate, String growlSound) {
        super(name, sex, color, id, origin, weight, birthDate, arrivalDate);
        this.growlSound = growlSound;
        numOfBears++;
        System.out.println("A new Bear has been added to the zoo.");
    }

    public Bear() {
        super();
        this.growlSound = "Grrr";
        numOfBears++;
        System.out.println("A new Bear has been added to the zoo.");
    }

    public String getGrowlSound() {
        return growlSound;
    }

    public void setGrowlSound(String growlSound) {
        this.growlSound = growlSound;
    }

    public void growl() {
        System.out.println(getName() + " says " + growlSound + "!");
    }

    public static int getNumOfBears() {
        return numOfBears;
    }
}