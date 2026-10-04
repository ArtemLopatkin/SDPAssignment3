public class ManualControl implements VehicleControl {
    @Override
    public void start(String vehicleType) {
        ControlOutput.print("Manual control", vehicleType, "The driver starts", "start");
    }

    @Override
    public void accelerate(String vehicleType) {
        ControlOutput.print("Manual control", vehicleType, "The driver accelerates", "accelerate");
    }

    @Override
    public void brake(String vehicleType) {
        ControlOutput.print("Manual control", vehicleType, "The driver brakes", "brake");
    }

    @Override
    public void stop(String vehicleType) {
        ControlOutput.print("Manual control", vehicleType, "The driver stops", "stop");
    }
}
