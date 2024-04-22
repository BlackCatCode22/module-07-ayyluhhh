package myZooKeeperChallenge;

import java.time.LocalDate;

public class Hyena extends myZooKeeperChallenge.Animal
{

    private String laughSound;
    private static int numOfHyenas = 0;


    public Hyena(String name, String sex, String color, String id, String origin, int weight,
                 LocalDate birthDate, LocalDate arrivalDate, String laughSound) {
        super(name, sex, color, id, origin, weight, birthDate, arrivalDate);
        this.laughSound = laughSound;
        numOfHyenas++;
        System.out.println("A new Hyena has been added to the zoo.");
    }

    public Hyena() {
        super();
        this.laughSound = "Haha";
        numOfHyenas++;
        System.out.println("A new Hyena has been added to the zoo.");
    }

    public String getLaughSound() {
        return laughSound;
    }

    public void setLaughSound(String laughSound) {
        this.laughSound = laughSound;
    }
    public void laugh() {
        System.out.println(getName() + " says " + laughSound + "!");
    }
    public static int getNumOfHyenas() {
        return numOfHyenas;
    }
}
