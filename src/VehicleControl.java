public interface VehicleControl {
    void start(String vehicleType);

    void accelerate(String vehicleType);

    void brake(String vehicleType);

    void stop(String vehicleType);
}
