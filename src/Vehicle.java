import java.util.Objects;

public abstract class Vehicle {
    private VehicleControl control;

    protected Vehicle(VehicleControl control) {
        setControl(control);
    }

    public final void setControl(VehicleControl control) {
        this.control = Objects.requireNonNull(control, "control must not be null");
    }

    public final void start() {
        control.start(getVehicleType());
    }

    public final void accelerate() {
        control.accelerate(getVehicleType());
    }

    public final void brake() {
        control.brake(getVehicleType());
    }

    public final void stop() {
        control.stop(getVehicleType());
    }

    protected abstract String getVehicleType();
}
