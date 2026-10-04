public class AutonomousControl implements VehicleControl {
    @Override
    public void start(String vehicleType) {
        ControlOutput.print("Autonomous control", vehicleType, "The autonomous system starts", "start");
    }

    @Override
    public void accelerate(String vehicleType) {
        ControlOutput.print("Autonomous control", vehicleType, "The autonomous system accelerates", "accelerate");
    }

    @Override
    public void brake(String vehicleType) {
        ControlOutput.print("Autonomous control", vehicleType, "The autonomous system brakes", "brake");
    }

    @Override
    public void stop(String vehicleType) {
        ControlOutput.print("Autonomous control", vehicleType, "The autonomous system stops", "stop");
    }
}
