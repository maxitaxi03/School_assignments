
/**
 * @author      Maximus Boxill
 * @author      400008300
 */
import java.lang.IllegalArgumentException;
import java.util.Random;
// animal class seems to work as expected: Tuesday 1st Feb, 2022
public class Animal {
    private Random gen = new Random();
    final public int minHungerStatus = 0, maxHungerStatus = 5;
    final public int minHealthStatus = 0, maxHealthStatus = 10;

    private String species, name;
    private int age, hungerStatus, healthStatus;
    private boolean isAliveStatus;

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
        this.hungerStatus = gen.nextInt(5) + 1;
        this.healthStatus = gen.nextInt(10) + 1;
        this.isAliveStatus = true;
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
     * 
     * @return the status of the animal when dead
     */
    public boolean aliveStatus() {
        return isAliveStatus;
    }

    /**
     * 
     * @return the status of the animal when alive
     */
    

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

    public void setAliveStatus(boolean aliveStatus) {
        this.isAliveStatus = aliveStatus;
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
            throw new IllegalArgumentException("You can't overfeed the animal or give the animal nothing to eat.");
        }
        this.hungerStatus += food;
             
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
            throw new IllegalArgumentException("Shouldn't give the animal too much medication nor give the animal nothing!");
        }
        
    }
    /**
     * Displays a message to the user
     */
    public void speak() {
        System.out.println("Make noise");
    }
}
