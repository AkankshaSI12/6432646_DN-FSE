public class LoggerTest {
    public static void main(String[] args) {
        // Get two instances
        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();

        // Test 1: Check if both references point to the same object
        if (loggerA == loggerB) {
            System.out.println("Test Passed: Only one instance of Logger exists.");
        } else {
            System.out.println("Test Failed: Different instances detected.");
        }

        // Test 2: Use logger from different references and check logs
        loggerA.log("Log from loggerA");
        loggerB.log("Log from loggerB");
    }
}
