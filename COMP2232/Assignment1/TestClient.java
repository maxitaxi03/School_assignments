import java.util.ArrayList;

public class TestClient {
    public static void main(String[] args) throws Exception {
        // start of animal.java testing
        Animal animal1 = new Animal();

        // animal1.setName("Xade");
        // animal1.setAge(20);
        // animal1.setSpecies("Clown");

        // System.out.println("The hunger status: " + animal1.getHungerStatus());
        // System.out.println("The health status: " + animal1.getHealthStatus());

        // animal1.eatFood(2);
        // animal1.takeMedicine(8);

        // System.out.println("The hunger status: " + animal1.getHungerStatus());
        // System.out.println("The health status: " + animal1.getHealthStatus());
        // System.out.println("--------------------------------------------------");
        // end of animal.java testing

        // start of zoo.java testing
        Zoo zoo = new Zoo();

        // Animal animal2 = new Animal();
        // Animal animal3 = new Animal();
        // Animal animal4 = new Animal();

        // animal2.setName("George");
        // animal2.setAge(34);
        // animal2.setSpecies("Monkey");

        // animal3.setName("James");
        // animal3.setAge(24);
        // animal3.setSpecies("Bird");
        // animal3.setCageID("A-71");

        // animal4.setName("Tom");
        // animal4.setAge(19);
        // animal4.setSpecies("Fish");
        // animal4.setCageID("A-73");


       
        // zoo.addAnimal(animal2);
        // zoo.addAnimal(animal3);
        // zoo.addAnimal(animal4);

        
        // zoo.removeAnimal("A-73");
        // zoo.readFile();
        zoo.showAnimals();

     

        // for (int i = 1; i <= zoo.getCages().size(); i++) {
        //     System.out.println("Animal is " + zoo.getAnimal(i).getName());
        // }
        // System.out.println("Size is: " + zoo.getCages().size());
    
    }
}
