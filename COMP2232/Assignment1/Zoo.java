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
    public void showAnimal() {
        for (Animal animal: cage) {
            System.out.println(animal.getName() + " " + animal.getSpecies() + " " + animal.getAge()
            + " " + animal.getHungerStatus() + " " + animal.getHealthStatus());
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
            throw new NoSuchElementException("The list is empty");
        }
        if (position > cage.size()) {
            throw new IllegalArgumentException();
        }
        return cage.get(position - 1);
    }
    public ArrayList<Animal> getCage() {
        return cage;
    }
}
