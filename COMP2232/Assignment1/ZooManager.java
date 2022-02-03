import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class ZooManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = "start";
        String finished = "finished";

        System.out.println("Welcome to the Zoo! Please enter your zoo keeper name.");
        System.out.print("Enter your name here --> ");;
        String zooKeeperName = scan.nextLine();

        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.setName(zooKeeperName);

        Zoo zoo = new Zoo();

        System.out.println("If you wish to monitor the animals, enter 'start'");
        System.out.println("------------------------------------------------------------");

        String decision = scan.nextLine();
        System.out.println("When you're finished, please indicate by entering 'finished'");
        System.out.println("------------------------------------------------------------");

        System.out.println("\n");

        while (decision.equalsIgnoreCase(start) || decision.equalsIgnoreCase(finished)) {
            if (decision.equalsIgnoreCase(start)) {
                System.out.println("Choose one of the following options by indicating the number.");
                System.out.println("------------------------------------------------------------");
                System.out.println("1)| Add animals to the zoo.");
                System.out.println("------------------------------------------------------------");
                System.out.println("2)| View all the animals in the zoo.");
                System.out.println("------------------------------------------------------------");
                System.out.println("3)| Feed all the animals in the zoo.");
                System.out.println("------------------------------------------------------------");
                System.out.println("4)| Heal all the sick animals in the zoo.");
                System.out.println("------------------------------------------------------------");
                System.out.println("5)| View all the animals that have passed away.");
                System.out.println("------------------------------------------------------------");
                System.out.println("6)| View all the animals that are alive.");
                System.out.println("------------------------------------------------------------");

                System.out.print("Enter your choice here please -> ");
                int choice = scan.nextInt();
                System.out.println("____________________________________________________________\n");

                if (choice == 1) {
                    System.out.print("Please indicate how many animals you would like to add: ");
                    int numberOfAnimals = scan.nextInt();
                    String changeLine = scan.nextLine();

                    for (int i = 0; i < numberOfAnimals; i++) {
                        Animal animal = new Animal();
                        System.out.println("-----------------------------------------");
                        System.out.print("Please enter the name of the animal: ");
                        String name = scan.nextLine();
                        
                        System.out.println("\n");

                        System.out.print("Please enter the species of the animal: ");
                        String species = scan.nextLine();

                        System.out.println("\n");

                        System.out.print("Please enter the age of the animal: ");
                        int age = scan.nextInt();
                        System.out.println("-----------------------------------------");
                        System.out.println("\n");
                        changeLine = scan.nextLine();

                        animal.setName(name);
                        animal.setSpecies(species);
                        animal.setAge(age);

                        zoo.addAnimal(animal);
                    }
                    

                    System.out.println("Would you like to restart? If so, indicate by entering 'start'. If not, indicate by saying 'finished.'");
                    System.out.print("Type here please -> ");
                    decision = scan.nextLine();
                    System.out.println("\n");
                }
                else if (choice == 2) {
                    String changeLine = scan.nextLine();
                    if (zoo.getCage().size() == 0) {
                        System.out.println("There is no animal in the zoo.");
                    }
                    zoo.showAnimals();
                    System.out.println("Would you like to 2 restart? If so, indicate by entering 'start'. If not, indicate by saying 'finished.'");
                    System.out.print("Type here please -> ");
                    decision = scan.nextLine();
                    System.out.println("\n");

                }
                else if (choice == 3) {
                    String changeLine = scan.nextLine();
                    if (zoo.getCage().size() == 0) {
                        System.out.println("There is no animal in the zoo.");
                        
                    }
                    zooKeeper.feedAnimals(zoo);
                    System.out.println("Would you like to restart? If so, indicate by entering 'start'. If not, indicate by saying 'finished.'");
                    System.out.print("Type here please -> ");
                    decision = scan.nextLine();
                    System.out.println("\n");
                }
                else if (choice == 4) {
                    String changeLine = scan.nextLine();
                    if (zoo.getCage().size() == 0) {
                        System.out.println("There is no animal in the zoo.");
                    }

                    zooKeeper.healAnimals(zoo);
                    System.out.println("Would you like to restart? If so, indicate by entering 'start'. If not, indicate by saying 'finished.'");
                    System.out.print("Type here please -> ");
                    decision = scan.nextLine();
                    System.out.println("\n");
                }
                else if (choice == 5) {
                    String changeLine = scan.nextLine();
                    if (zoo.getCage().size() == 0) {
                        System.out.println("There is no animal in the zoo.");
                    }

                    zoo.showDeadAnimals();
                    System.out.println("Would you like to restart? If so, indicate by entering 'start'. If not, indicate by saying 'finished.'");
                    System.out.print("Type here please -> ");
                    System.out.println("\n");
                    decision = scan.nextLine();
                }
                else if (choice == 6) {
                    String changeLine = scan.nextLine();
                    if (zoo.getCage().size() == 0) {
                        System.out.println("There is no animal in the zoo.");
                    }
                    
                    zoo.showAliveAnimals();
                    System.out.println("Would you like to restart? If so, indicate by entering 'start'. If not, indicate by saying 'finished.'");
                    System.out.print("Type here please -> ");
                    System.out.println("\n");
                    decision = scan.nextLine();
                }
                else {
                    throw new IllegalArgumentException();
                }
                    
            }
            else {
                System.out.println("Thank you for taking the time to check on the animals. Have a good day!");
                break;
            }
        }
    }
}
