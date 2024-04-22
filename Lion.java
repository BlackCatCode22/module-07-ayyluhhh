package myZooKeeperChallenge;

import java.time.LocalDate;

public class Lion extends myZooKeeperChallenge.Animal
{

    private String roarSound;
    private static int numOfLions = 0;


    public Lion(String name, String sex, String color, String id, String origin, int weight,
                LocalDate birthDate, LocalDate arrivalDate, String roarSound) {
        super(name, sex, color, id, origin, weight, birthDate, arrivalDate);
        this.roarSound = roarSound;
        numOfLions++;
        System.out.println("A new Lion has been added to the zoo.");
    }
    public Lion() {
        super();
        this.roarSound = "Roar";
        numOfLions++;
        System.out.println("A new Lion has been added to the zoo.");
    }

    public String getRoarSound() {
        return roarSound;
    }

    public void setRoarSound(String roarSound) {
        this.roarSound = roarSound;
    }

    public void roar() {
        System.out.println(getName() + " says " + roarSound + "!");
    }
    public static int getNumOfLions() {
        return numOfLions;
    }
}