package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application's constructor");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Maven Demo Application");
        System.out.println("Java is cool.");
	Application app = new Application();
    }
}