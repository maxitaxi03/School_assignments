
/**
 * @author      Maximus Boxill
 * @author      400008300
 */
import java.lang.IllegalArgumentException;
// animal class seems to work as expected: Tuesday 1st Feb, 2022
public class Animal {

    final private int minHungerStatus = 0, maxHungerStatus = 5;
    final private int minHealthStatus = 0, maxHealthStatus = 10;

    private String species, name;
    private int age, hungerStatus, healthStatus;

    /**
     * Animal constructor initialises the datamembers
     * species, name and age to default values
     * hungerStatus and healthStatus will be initialised with random values
     * between 0-5 and 0-10 respectively
     */
    public Animal() {
        this.species = "";
        this.name = "";
        this.age = 0;
        this.hungerStatus = (int) Math
                .floor(Math.random() * (this.maxHungerStatus - this.minHungerStatus - 1) + this.minHungerStatus);
        this.healthStatus = (int) Math
                .floor(Math.random() * (this.maxHealthStatus - this.minHealthStatus - 1) + this.minHealthStatus);
    }

    /**
     * 
     * @return the species of the animal
     */
    public String getSpecies() {
        return species;
    }

    /**
     * 
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return the age of the animal
     */
    public int getAge() {
        return age;
    }

    /**
     * 
     * @return the hungerStatus of the animal
     */
    public int getHungerStatus() {
        return hungerStatus;
    }

    /**
     * 
     * @return the healthStatus of the animal
     */
    public int getHealthStatus() {
        return healthStatus;
    }

    /**
     * Registers the specied entered to the animal
     * 
     * @param species determines the species of the animal
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Registers the name entered to the animal
     * 
     * @param name determines the name of the animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Registers the age entered to the animal
     * 
     * @param age determines the age of the animal
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Registers the hungerStatus to the animal
     * 
     * @param hungerStatus determines the hungerStatus of the animal
     */
    public void setHungerStatus(int hungerStatus) {
        this.hungerStatus = hungerStatus;
    }

    /**
     * Registers the healthStatus to the animal
     * 
     * @param healthStatus determines the health of the animal
     */
    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * Allows the animal to eat a set amount of food
     * while food is within the bounds (1, 5)
     * if the food is more than the maxHungerStatus
     * alert the user
     * While food is within bounds, and if the food and hungerStatus
     * surpasses the maxHungerStatus, find the difference and add
     * the difference to hungerStatus to ensure hungerStatus of the monkey
     * isn't more than what it should be
     * @param food determines how much food the animal eats
     */
    public void eatFood(int food) {
        if (food <= minHungerStatus || food > maxHungerStatus) {
            throw new IllegalArgumentException("The animal can't eat food that doesn't exist!");
        }
        if (this.hungerStatus == maxHungerStatus) {
            return;
        }
        // 3 + 5 > 5
        // 3 + 2 = 5
        if (this.hungerStatus + food > maxHungerStatus) {
            int difference = this.maxHungerStatus - this.hungerStatus;
            this.hungerStatus += difference;
        }  
        else {
            this.hungerStatus += food;
        }      
    }
    /**
     * Allows the animal to take a set amount of medicine
     * while the medicine is withing the bounds(1, 10)
     * if the medicine is more than the maxHealthStatus
     * alert the user
     * While the medicine is within the bounds, and if the medicine and healthStatus 
     * surpasses the maxHealthSatus, find the difference and add 
     * difference to healthStatus to ensure healthStatus of the monkey 
     * isn't more than what it shouold be
     * @param medicine determines how much medicine the monkey takes
     */
    public void takeMedicine(int medicine) {
        if (medicine <= this.minHealthStatus || medicine > this.maxHealthStatus) {
            throw new IllegalArgumentException("The animal can't take medicine that doesn't exist");
        }
        if (this.healthStatus == this.maxHealthStatus) {
            return;
        }
        if (this.healthStatus + medicine > this.maxHealthStatus) {
            int difference = this.maxHealthStatus - this.healthStatus;
            this.healthStatus += difference;
        }
        else {
            this.healthStatus += medicine;
        }
    }
    /**
     * Displays a message to the user
     */
    public void speak() {
        System.out.println("Make noise");
    }
}