public class TestClient {
    public static void main(String[] args) {
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
        
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        animal2.setName("George");
        animal2.setAge(34);
        animal2.setSpecies("Monkey");
        
        animal3.setName("James");
        animal3.setAge(24);
        animal3.setSpecies("Bird");

        animal4.setName("Tom");
        animal4.setAge(19);
        animal4.setSpecies("Fish");

        // zoo.addAnimal(animal1);
        // zoo.addAnimal(animal2);
        // zoo.addAnimal(animal3);
        // zoo.addAnimal(animal4);
        System.out.println("The hunger status is: " + animal2.getHungerStatus());
        // zoo.showAnimals();
        // System.out.println("--------------------------------------------------");
        // Animal animal5 = zoo.getAnimal(4);
        // zoo.addAnimal(animal5);
        // zoo.showAnimals();
        // System.out.println("--------------------------------------------------");
        // // end of zoo.java testing

        // // start of zookeeper.java testing
        // System.out.println("--------------------------------------------------");
        // System.out.println("Size of the cage: " + zoo.getCage().size());
        // ZooKeeper zooKeeper = new ZooKeeper();
        // zooKeeper.feedAnimals(zoo);
        
    }
}
