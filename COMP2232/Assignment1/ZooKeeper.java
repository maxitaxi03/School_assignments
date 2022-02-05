import java.util.Scanner;
// import java.lang.IllegalArgumentException;
public class ZooKeeper {
    private String zooKeeperName;

    /**
     * Initalises attribute to the default value
     */
    public ZooKeeper() {
        this.zooKeeperName = "";
    }

    /**
     * Feeds each animal in the zoo 
     * if the food amount entered is less than or equal 0
     * then alert the user, indicating you can't feed the animal nothing
     * if the animal is overfed, for now this code alters the user that the animal is dead
     * but waiting on confirmation on what to do
     * @param zoo this is the place where all animals are located
     */
    public void feedAnimals(Zoo zoo) {
        Scanner scan = new Scanner(System.in);
        boolean aliveStatus;
        final int maxHungerStatus = 5;
        // size is 3
        // xade[1]
        for (int i = 1; i <= zoo.getCage().size(); i++) {
            System.out.println("Please feed the animal with the correct amount of food otherwise it will die");
            System.out.println("The current animal is: " + zoo.getAnimal(i).getName() + " and the hungerStatus is: " +zoo.getAnimal(i).getHungerStatus());
            
            int difference = maxHungerStatus - zoo.getAnimal(i).getHungerStatus();

            System.out.println("Feed the animal: " + difference);
            System.out.print("Type here please -> ");
            int food = scan.nextInt();
            // String newline = scan.nextLine();

            System.out.println("\n");

            zoo.getAnimal(i).eatFood(food);
            aliveStatus = (zoo.getAnimal(i).getHungerStatus() > maxHungerStatus) ? false : true;
            zoo.getAnimal(i).setAliveStatus(aliveStatus);
            
            
        }
        
    }
    /**
     * Gives each animal in the zoo medicine
     * if the medicine is 0 or less
     * alert the user, indicating you can't administer medcine that doesn't exist
     * if the animal is overdoes, then the code for now alters the user that the animal is dead
     * but waiting on confirmatioon on what to do
     * @param zoo
     */
    public void healAnimals(Zoo zoo) {
        Scanner scan = new Scanner(System.in);
        boolean aliveStatus;
        final int sickAnimalStatus = 8;
        final int maxHealthSatus = 10;

        for (int i = 0; i < zoo.getCage().size(); i++) {
            if (zoo.getAnimal(i).aliveStatus() == true) { 
                System.out.println("Please give each animal the correct amount of medicine. Overdosing kills the animal.");
    
                if (zoo.getAnimal(i).getHealthStatus() < sickAnimalStatus) {
                    System.out.println("The current sick animal is: " + zoo.getAnimal(i).getName() + " and the health status is: " + zoo.getAnimal(i).getHealthStatus());
                    int difference = maxHealthSatus - zoo.getAnimal(i).getHealthStatus();
                    System.out.println("Give the animal this amount of medicine: " + difference);
                    int medicine = scan.nextInt();

                    zoo.getAnimal(i).takeMedicine(medicine);
                    aliveStatus = (zoo.getAnimal(i).getHealthStatus() > maxHealthSatus) ? false : true;
                    zoo.getAnimal(i).setAliveStatus(aliveStatus);
                }
            }
            else 
                continue;
            // scan.close();
        }
    }

    /**
     * 
     * @return the name of the ZooKeeper
     */
    public String getName() {
        return this.zooKeeperName;
    }
    /**
     * Registers the name entered to the zookeeper
     * 
     * @param name determines the name of the zookeeper
     */
    public void setName(String name) {
        this.zooKeeperName = name;
    }

}
    
