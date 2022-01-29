import java.util.Scanner;
// import java.lang.IllegalArgumentException;
public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vehicle myCar = new Vehicle();
        String yes = "Y";
        String no = "N";

        System.out.println("Please enter the model and engine size of the car.");
        String model = scan.nextLine();
        Double engineSize = scan.nextDouble();

        myCar.setModel(model);
        myCar.setEngineSize(engineSize);
        
        System.out.println("Please enter the speed for the car");
        int speed = scan.nextInt();

        myCar.accelerate(speed);
        scan.nextLine();
        
        System.out.println("Do you wish to stop? Indicate with yes or no.");
        String response = scan.nextLine();
        
        while (response.equalsIgnoreCase(no) || response.equalsIgnoreCase(yes)) {
            if (response.equalsIgnoreCase(no)) {
                myCar.accelerate(speed, 3);
                System.out.println("Do you wish to stop now?");
                response = scan.nextLine();
            }
            else {
                myCar.brake(15);
                break;
            }   
        }
        scan.close();
    }
}
