/**
 * @author      Maximus Boxill
 * @author      400008300
 */

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;

public class Zoo extends ZooManager {
    private ArrayList<Animal> cages;

    public Zoo() {
        cages = new ArrayList<>();
    }
    /**
     * Appending animals to the arraylist
     * @param animal is the object being passed into the arraylist
     */
    public void addAnimal(Animal animal) {
        cages.add(animal);
    }

    /**
     * Displays the animals' details that are in the array list
     */
    public void showAnimals() {
        for (Animal animal: cages) {
           System.out.println("-----------------------------------------");
           System.out.println("Animal Name: " + animal.getName());
           System.out.println("Animal Age: " + animal.getAge());
           System.out.println("Animal Species: " + animal.getSpecies());
           String isAlive = (animal.aliveStatus() == true) ? "Alive" : "Dead";
           System.out.println("Animal Status: " + isAlive);
           System.out.println("-----------------------------------------");
        }
    }
    /**
     * Displays only animals that are alive
     */
    public void showAliveAnimals() {
        for (Animal animal: cages) {
            if (animal.aliveStatus() == true) {
                System.out.println("-----------------------------------------");
                System.out.println("Animal Name: " + animal.getName());
                System.out.println("Animal Age: " + animal.getAge());
                System.out.println("Animal Species: " + animal.getSpecies());
                System.out.println("-----------------------------------------");
            }
            else {
                System.out.println(animal.getName() + " is dead :( Click option '5' next time!");
                System.out.println("---------------------------------------------------------");
            }

        }
    }
    /**
     * Diplays only animals that are dead
     */
    public void showDeadAnimals() {
        for (Animal animal: cages) {
            if (animal.aliveStatus() == false) {
                System.out.println("-----------------------------------------");
                System.out.println("Animal Name: " + animal.getName());
                System.out.println("Animal Age: " + animal.getAge());
                System.out.println("Animal Species: " + animal.getSpecies());
                System.out.println("-----------------------------------------");
            }
            else {
                System.out.println(animal.getName() + " is Alive :) Click option 6 next time!");
                System.out.println("---------------------------------------------------------");
            }
        }
          
        
    }
    /**
     * Retrieve the animal from the array list 
     * once there are animals in the list
     * if the list is empty, then promot the user that the list is empty
     * @param position is the location of the object, not the index position
     * @return the animal object that is at position - 1, or the index
     */
    public Animal getAnimal(int position) {
        if (cages.size() == 0) {
            // use exceptions properly so the program doesn't crash
            throw new NoSuchElementException("There are no animals in the zoo!");
        }
        if (position > cages.size()) {
            throw new IllegalArgumentException();
        }
        return cages.get(position - 1);
    }
    /**
     * 
     * @return the arraylist containing all the animals in the zoo
     */
    public ArrayList<Animal> getCages() {
        return cages;
    }   
    
    /**
     * 
     * @param cageID is the ID of the cage where the animal is staying, and is used for searching for animals
     */
    public void removeAnimal(String cageID) {
        if (cages.size() == 0) {
            // use some exception to get this done properly so the program doesn't crash
            System.out.println("There are no animals in the zoo!");
        }

        Animal animal = getAnimal(cageID);
        cages.remove(animal);
        
    }

    /**
     * 
     * @param cageID is the ID of the cage where the animal is staying, and is used for searching for animals
     * @return the animal that is found by use of the cageID
     */
    public Animal getAnimal(String cageID) {
        Animal animall = new Animal();
        if (cages.size() == 0) {
            // proper use of exception here
            System.out.println("No animals in the zoo");
        }

        for (Animal animal : cages) {
            if (animal.getCageID().equals(cageID)) {
                animall = animal;
            }
        }

        return animall;
    }

    public void printHungerReport() {
        for (Animal animal : cages) {
            if (animal.aliveStatus() == true) {
                System.out.println("Animal name: " + animal.getName());
                System.out.println("Species of animal: " + animal.getSpecies());
                System.out.println("Hunger status is: " + animal.getHungerStatus());
            }
        }
    }

    public void printHealthStatus() {
        for (Animal animal : cages) {
            if (animal.aliveStatus() == true) {
                System.out.println("Animal name: " + animal.getName());
                System.out.println("Species of animal: " + animal.getSpecies());
                System.out.println("Health status is " + animal.getHealthStatus());
            }
        }
    }
} // Zoo
