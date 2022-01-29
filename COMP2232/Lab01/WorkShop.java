import java.lang.IllegalArgumentException;
public class WorkShop {
    private Vehicle[] vehicleBays;

    public WorkShop() {
        vehicleBays = new Vehicle[5];
    }

    public void addVehicle(Vehicle v, int position) {
        if (position > vehicleBays.length) { throw new IllegalArgumentException(); }
        vehicleBays[position] = v;
    }
    public Vehicle getVehicle(int position) {
        if (position > vehicleBays.length) { throw new IllegalArgumentException(); }
        Vehicle vehicle = vehicleBays[position];

        return vehicle;
    }
    
}
