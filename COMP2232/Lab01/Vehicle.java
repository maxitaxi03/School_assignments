import java.lang.IllegalArgumentException;

public class Vehicle {
    private String model;
    private double engineSize;
    private int currSpeed;

    public Vehicle() {
        this.model = "basic";
        this.engineSize = 0.0;
        this.currSpeed = 0;
    }

    // assessors and mutators
    public String getModel() {
        return model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSize(double engineSize) {
        if (engineSize < 0)
            throw new IllegalArgumentException();
        this.engineSize = engineSize;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }
    // this has a bug whereby it'll go over the limit, so fix this
    public void accelerate(int speed) {
        if (this.currSpeed < speed) {
            this.currSpeed += 3;
        }
        if (this.currSpeed <= speed && this.currSpeed % 5 == 0) {
            System.out.println("The current speed of the car after accelerating is: " + this.currSpeed);
        }
    }

    public void accelerate(int speed, int rate) {
        int remainder = speed % rate;

        if (remainder == 0 && this.currSpeed < speed) {
            this.currSpeed += rate;
            System.out.println("speed at second if: " + this.currSpeed);
        }
        if (remainder != 0 && this.currSpeed < speed) {
            this.currSpeed += rate;

            if (speed - this.currSpeed == remainder) {
                this.currSpeed = speed;
                System.out.println("You've reached maximum speed, please brake now.");;
            }
        }
        if (this.currSpeed <= speed && this.currSpeed % 5 == 0) {
            System.out.println("The current speed of the car after accelerating is: " + this.currSpeed);
        }
    }

    public void brake() {
        while (this.currSpeed > 0) {
            this.currSpeed--;
            if (this.currSpeed % 5 == 0)
                System.out.println("The current speed of the car after slowing down is: " + this.currSpeed);
        }
        System.out.println("You have safely come to a stop");
    }

    public void brake(int newSpeed) {
        while (this.currSpeed > newSpeed) {
            this.currSpeed--; 
        }
        System.out.println("You have slowed to your new speed of: " + newSpeed);
    }
}
