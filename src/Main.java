import work8.composite.*;
import work8.prototype.*;

/**
 * Entry point for the application demonstrating the Composite and Prototype (with Factory) patterns.
 */
public class Main {

    /**
     * Main method to execute the application.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        // Create game objects
        GameObject tree = new GameObject("Tree");
        GameObject rock = new GameObject("Rock");
        GameObject player = new GameObject("Player");

        // Create a game space and add components
        GameSpace playArea = new GameSpace("Play Area");
        playArea.addComponent(tree);
        playArea.addComponent(rock);
        playArea.addComponent(player);

        // Clone using factories
        GameComponent shallowCopy = new GameComponentFactory(playArea).createShallowCopy();
        GameComponent deepCopy = new GameComponentFactory(playArea).createDeepCopy();

        // Print original and copies
        System.out.println("Original: " + playArea);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy: " + deepCopy);

        // Modify the original structure to observe shallow vs deep copy behavior
        playArea.addComponent(new GameObject("River"));
        System.out.println("\nAfter modifying the original:");
        System.out.println("Original: " + playArea);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
