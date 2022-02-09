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
            if (zoo.getAnimal(i).aliveStatus() == false) {
                System.out.println(zoo.getAnimal(i).getName() + " is dead. Can't feed a dead animal!");
                System.out.println("----------------------------------------------------------------");
                continue;
            }

            if (zoo.getAnimal(i).getHungerStatus() == maxHungerStatus) {
                System.out.println(zoo.getAnimal(i).getName() + " This animal is already full. Can't feed the animal!");
                System.out.println("----------------------------------------------------------------");
                continue;
            }

            System.out.println("Please feed the animal with the correct amount of food otherwise it will die");
            System.out.println("The current animal is: " + zoo.getAnimal(i).getName() + " and the hungerStatus is: " +zoo.getAnimal(i).getHungerStatus() + ".");
            
            int difference = maxHungerStatus - zoo.getAnimal(i).getHungerStatus();

            if (difference == 0) {
                System.out.println("The animal is full already! You can't feed this animal!");
                System.out.println("--------------------------------------------------------");
                continue;
            }

            if (difference < 0) {
                continue;
            }

            System.out.println("Feed the animal: " + difference);
            System.out.print("Type here please -> ");
            int food = scan.nextInt();

            
            zoo.getAnimal(i).eatFood(food);
            // String newline = scan.nextLine();

            if (food > difference) {
                System.out.println("You've killed the animal because you fed it too much food!!");
                System.out.println("----------------------------------------------------------------");
                continue;
            }

            if (food < difference) {
                System.out.println("You are starving the animal because you gave it less than the required amount!");
                System.out.println("------------------------------------------------------------------------------");
                continue;
            }

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
     * if the animal is overdoses, then the code for now alters the user that the animal is dead
     * but waiting on confirmatioon on what to do
     * @param zoo
     */
    public void healAnimals(Zoo zoo) {
        Scanner scan = new Scanner(System.in);
        boolean aliveStatus;
        final int sickAnimalStatus = 8;
        final int maxHealthSatus = 10;

        for (int i = 1; i <= zoo.getCage().size(); i++) {
            if (zoo.getAnimal(i).aliveStatus() == true) { 
                System.out.println("Please give " + zoo.getAnimal(i).getName() + " the correct amount of medicine. Overdosing kills the animal. \n");
    
                if (zoo.getAnimal(i).getHealthStatus() < sickAnimalStatus) {
                    System.out.println("The current sick animal is: " + zoo.getAnimal(i).getName() + " and the health status is: " + zoo.getAnimal(i).getHealthStatus() + ".");
                    int difference = maxHealthSatus - zoo.getAnimal(i).getHealthStatus();
                    System.out.println("Give the animal this amount of medicine: " + difference);
                    System.out.print("Type here please -> ");
                    int medicine = scan.nextInt();
                    System.out.println("---------------------------------------------------------------");

                    zoo.getAnimal(i).takeMedicine(medicine);
                    aliveStatus = (zoo.getAnimal(i).getHealthStatus() > maxHealthSatus) ? false : true;
                    zoo.getAnimal(i).setAliveStatus(aliveStatus);
                }
            } 
            if (zoo.getAnimal(i).getHealthStatus() >= sickAnimalStatus && zoo.getAnimal(i).getHealthStatus() <= maxHealthSatus) {
                System.out.println(zoo.getAnimal(i).getName() + "'s health is all good!\n");
                System.out.println("---------------------------------------------------");
                continue;
            }
                System.out.println(zoo.getAnimal(i).getName() + " is dead. Can't give medicine to a dead animal!");
                System.out.println("---------------------------------------------------------------");
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
    
