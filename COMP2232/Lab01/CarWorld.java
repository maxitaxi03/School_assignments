import java.util.Scanner;
public class CarWorld {
    public static void main(String[] args) {
        WorkShop myShop = new WorkShop();
        Scanner scan = new Scanner(System.in);
        final String yes = "yes";
        final String no = "no";
        final int UPPER_LIMIT = 5;

        for (int i = 0; i < UPPER_LIMIT; i++) {
            System.out.println("Please enter the model and engine size of the vehicle");
            String model = scan.nextLine();
            float engine_size = scan.nextFloat();

            Vehicle vehicle = new Vehicle();
            vehicle.setModel(model);
            vehicle.setEngineSize(engine_size);

            myShop.addVehicle(vehicle, i);
        }
        System.out.print("Please enter a number between 0 and 4 inclusively: ");
        int position = scan.nextInt();
        // String smthn = myShop.getVehicle(position).getModel();
        System.out.println("The car at position " + position + " is a " + myShop.getVehicle(position).getModel() + 
        " has an engine size of: " + myShop.getVehicle(position).getEngineSize());

        System.out.println("What speed do you want to accelerate to?");
        int speed = scan.nextInt();

        String decision = scan.nextLine();

        System.out.println("Do you want to specify the rate of acceleration? Indicate with yes or no please.");
        decision = scan.nextLine();

        if (decision.equalsIgnoreCase(yes)) {
            System.out.println("Please enter the rate of acceleration.");
            int rate = scan.nextInt();
            myShop.getVehicle(position).accelerate(speed, rate);
        }
         if (decision.equalsIgnoreCase(no)) {
             myShop.getVehicle(position).accelerate(speed);
         }
         decision = scan.nextLine();

         System.out.println("Do you want to come to a full stop? Indicate with yes or no");
         decision = scan.nextLine();

         if (decision.equalsIgnoreCase(yes)) {
             myShop.getVehicle(position).brake();
         }
         if (decision.equalsIgnoreCase(no)) {
             System.out.println("Please indicate the speed you want to stop at");
             int newSpeed = scan.nextInt();
             myShop.getVehicle(position).brake(newSpeed);
         }

         // that line would produce an error because the property
         // is declared at the private access specifier.
        scan.close();
    }
}
