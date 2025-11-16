package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words) {
        String[] separateWords = StringUtils.split(words, ' ');

        return (separateWords == null) ? 0 : separateWords.length;
    }
    
    public void greet() {

        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hola");
        greetings.add("Bonjour");

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

        // Demo Apache String Utils
        System.out.println("Demo Adding Dependencies");
        int count = app.countWords("I have five little words");
        System.out.println("Word count = " + count);
    }
}