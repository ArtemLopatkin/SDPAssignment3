import java.util.Objects;

public class Car extends Vehicle {
    private final String model;

    public Car(String model, VehicleControl control) {
        super(control);
        this.model = Objects.requireNonNull(model, "model must not be null");
    }

    @Override
    protected String getVehicleType() {
        return "Car " + model;
    }

    public void openTrunk() {
        System.out.println("[Car " + model + "] The trunk opens.");
    }
}
