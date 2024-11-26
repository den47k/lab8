package work8.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a space in the game, holding components of various types.
 * Implements the GameComponent interface to allow for component-based composition.
 */
public class GameSpace implements GameComponent {
    private final String name;
    private List<GameComponent> components;

    /**
     * Constructs a GameSpace with the given name.
     *
     * @param name the name of the game space.
     */
    public GameSpace(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    /**
     * Adds a component to the game space.
     *
     * @param component the component to be added.
     */
    public void addComponent(GameComponent component) {
        components.add(component);
    }

    /**
     * Removes a component from the game space.
     *
     * @param component the component to be removed.
     */
    public void removeComponent(GameComponent component) {
        components.remove(component);
    }

    /**
     * Retrieves the list of components in the game space.
     *
     * @return the list of components.
     */
    public List<GameComponent> getComponents() {
        return components;
    }

    /**
     * Creates a shallow copy of the game space. The components are not cloned, only their references are copied.
     *
     * @return a shallow copy of the game space.
     */
    @Override
    public GameComponent shallowClone() {
        try {
            GameSpace copy = (GameSpace) super.clone();
            copy.components = this.components; // Shallow copy: same references
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Shallow cloning failed for GameSpace");
        }
    }

    /**
     * Creates a deep copy of the game space. The components are recursively cloned.
     *
     * @return a deep copy of the game space.
     */
    @Override
    public GameComponent deepClone() {
        GameSpace copy = new GameSpace(new String(name));
        for (GameComponent component : components) {
            copy.addComponent(component.deepClone()); // Recursively deep copy
        }
        return copy;
    }

    /**
     * Returns a string representation of the game space.
     *
     * @return a string representation of the game space, including its components.
     */
    @Override
    public String toString() {
        return "GameSpace{name='" + name + "', components=" + components + "}";
    }
}
