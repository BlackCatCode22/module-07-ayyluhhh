package myZooKeeperChallenge;

import java.time.LocalDate;
import java.time.Period;

public class Animal {

    private String name;
    private String sex;
    private String color;
    private String id;
    private String origin;
    private int weight;
    private LocalDate birthDate;
    private LocalDate arrivalDate;

    private static int numOfAnimals = 0;

    public Animal(String name, String sex, String color, String id, String origin, int weight,
                  LocalDate birthDate, LocalDate arrivalDate) {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.id = id;
        this.origin = origin;
        this.weight = weight;
        this.birthDate = birthDate;
        this.arrivalDate = arrivalDate;
        numOfAnimals++;
        System.out.println("\n A new Animal object was created.\n");
    }
    public Animal() {
        numOfAnimals++;
        System.out.println("\n A new Animal object was created.\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Origin
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }
}
