final class ControlOutput {
    private ControlOutput() {
    }

    static void print(String controlName, String vehicleType, String action, String operation) {
        System.out.println("[" + controlName + "] " + vehicleType + ": " + action + " (" + operation + ").");
    }
}
