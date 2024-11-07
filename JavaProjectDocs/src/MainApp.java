// MainApp.java
/**
 * Main application class to demonstrate calculator operations.
 */
public class MainApp {
    /**
     * Main method to run the application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
    }
}
