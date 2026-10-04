import java.util.Objects;

public class Motorcycle extends Vehicle {
    private final String model;

    public Motorcycle(String model, VehicleControl control) {
        super(control);
        this.model = Objects.requireNonNull(model, "model must not be null");
    }

    @Override
    protected String getVehicleType() {
        return "Motorcycle " + model;
    }

    public void raiseKickstand() {
        System.out.println("[Motorcycle " + model + "] The kickstand is raised.");
    }
}
