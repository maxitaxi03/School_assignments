/**
 * @author      Maximus Boxill
 * @author      400008300
 * @author      Asha Cumberbatch
 */
import java.lang.IllegalArgumentException;
import java.util.Random;

public class Animal {
    private Random gen = new Random();
    final public int MIN_HUNGER_STATUS = 0, MAX_HUNGER_STATUS = 5;
    final public int MIN_HEALTH_STATUS = 0, MAX_HEALTH_STATUS = 10;

    protected String species, name, category, cageID;
    protected int age, hungerStatus, healthStatus;
    protected boolean isAliveStatus;

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
        this.cageID = "";
        this.category = "";
        // this.isAliveStatus = false;
    }

    public void setCageID(String cageID) {
        this.cageID = cageID;
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
     * @return the cageID where the animal is residing
     */
    public String getCageID() {
        return cageID;
    }

    public String getCategory() {
        return category;
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
     * 
     * @param aliveStatus determines if the animal is alive or not
     */
    public void setAliveStatus(boolean aliveStatus) {
        this.isAliveStatus = aliveStatus;
    }

    /**
     * 
     * @param category determines whether the animal is herbivore, carnivore or omnivore
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Allows the animal to eat a set amount of food
     * while food is within the bounds (1, 5)
     * if the food is more than the MAX_HUNGER_STATUS
     * alert the user
     * While food is within bounds, and if the food and hungerStatus
     * surpasses the MAX_HUNGER_STATUS, find the difference and add
     * the difference to hungerStatus to ensure hungerStatus of the monkey
     * isn't more than what it should be
     * @param food determines how much food the animal eats
     */
    public void eatFood(int food) {
        this.hungerStatus += food;    
    }

    public int getMAX_HUNGER_STATUS() {
        return MAX_HUNGER_STATUS;
    }
    /**
     * Allows the animal to take a set amount of medicine
     * while the medicine is withing the bounds(1, 10)
     * if the medicine is more than the MAX_HEALTH_STATUS
     * alert the user
     * While the medicine is within the bounds, and if the medicine and healthStatus 
     * surpasses the maxHealthSatus, find the difference and add 
     * difference to healthStatus to ensure healthStatus of the monkey 
     * isn't more than what it shouold be
     * @param medicine determines how much medicine the monkey takes
     */
    public void takeMedicine(int medicine) {
        if (medicine <= this.MIN_HEALTH_STATUS || medicine > this.MAX_HEALTH_STATUS) {
            throw new IllegalArgumentException("Shouldn't give the animal too much medication nor give the animal nothing!");
        }
        this.healthStatus += medicine;
        
    }
    /**
     * Displays a message to the user
     */
    public void speak() {
        System.out.println("Make noise");
    }
} // Animal
