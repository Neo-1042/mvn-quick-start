package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public void greet() {

        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hola");

        for(String greeting : greetings) {
            System.out.println("Greeting: " + greeting);
        }
    }

    public Application() {
        System.out.println ("Inside Application's constructor");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Maven Demo Application");
        System.out.println("Java is cool.");
	    Application app = new Application();

        app.greet();
    }
}