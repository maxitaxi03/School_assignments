import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;
public class Zoo {
    private ArrayList<Animal> cage;

    public Zoo() {
        cage = new ArrayList<>();
    }
    /**
     * Appending animals to the arraylist
     * @param animal is the object being passed into the arraylist
     */
    public void addAnimal(Animal animal) {
        cage.add(animal);
    }

    /**
     * Displays the animals' details that are in the array list
     */
    public void showAnimals() {
        for (Animal animal: cage) {
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
        for (Animal animal: cage) {
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
        for (Animal animal: cage) {
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
        if (cage.size() == 0) {
            throw new NoSuchElementException("There are no animals in the zoo!");
        }
        if (position > cage.size()) {
            throw new IllegalArgumentException();
        }
        return cage.get(position - 1);
    }
    /**
     * 
     * @return the arraylist containing all the animals in the zoo
     */
    public ArrayList<Animal> getCage() {
        return cage;
    }

    
}
