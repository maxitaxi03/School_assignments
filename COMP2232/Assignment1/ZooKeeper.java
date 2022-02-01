import java.util.Scanner;
public class ZooKeeper {
    private String name;

    public ZooKeeper() {
        name = "";
    }

    public void feedAnimal(Zoo zoo) {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < zoo.getCage().size(); i++) {
            System.out.println("Please enter the amount of food you wish to feed each animal");
            int food = scan.nextInt();

        }



    }


}
    
