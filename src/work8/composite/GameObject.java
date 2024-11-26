package work8.composite;

/**
 * Represents a basic game object with a name.
 * Implements the GameComponent interface for cloning purposes.
 */
public class GameObject implements GameComponent {
    private final String name;

    /**
     * Constructs a GameObject with the given name.
     *
     * @param name the name of the game object.
     */
    public GameObject(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the game object.
     *
     * @return the name of the game object.
     */
    public String getName() {
        return name;
    }

    /**
     * Creates a shallow copy of the game object.
     *
     * @return a shallow copy of the game object.
     */
    @Override
    public GameComponent shallowClone() {
        try {
            return (GameObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Shallow cloning failed for GameObject");
        }
    }

    /**
     * Creates a deep copy of the game object.
     *
     * @return a deep copy of the game object.
     */
    @Override
    public GameComponent deepClone() {
        return new GameObject(new String(name)); // Deep copy
    }

    /**
     * Returns a string representation of the game object.
     *
     * @return a string representation of the game object.
     */
    @Override
    public String toString() {
        return "GameObject{name='" + name + "'}";
    }
}
