public class Main {
    public static void main(String[] args) {
        VehicleControl manualControl = new ManualControl();
        VehicleControl autonomousControl = new AutonomousControl();

        Car car = new Car("City", manualControl);
        System.out.println("=== Car with manual control ===");
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
        car.openTrunk();

        Motorcycle motorcycle = new Motorcycle("Touring", autonomousControl);
        System.out.println("\n=== Motorcycle with autonomous control ===");
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stop();
        motorcycle.raiseKickstand();

        System.out.println("\n=== Switch the existing car to autonomous control ===");
        car.setControl(autonomousControl);
        car.start();
        car.accelerate();
        car.stop();

        System.out.println("\n=== Switch the existing motorcycle to manual control ===");
        motorcycle.setControl(manualControl);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        System.out.println("\n=== Same implementation used by both vehicle types ===");
        car.setControl(manualControl);
        motorcycle.setControl(manualControl);
        car.brake();
        motorcycle.brake();
    }
}
