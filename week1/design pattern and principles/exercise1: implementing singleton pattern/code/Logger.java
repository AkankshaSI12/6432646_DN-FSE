public class Logger {

    // Step 1: Private static variable to hold the single instance
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation from other classes
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // A sample logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
