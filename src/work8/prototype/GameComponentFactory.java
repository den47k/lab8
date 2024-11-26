package work8.prototype;

import work8.composite.GameComponent;

/**
 * Factory class for creating shallow and deep copies of game components.
 */
public class GameComponentFactory {
    private final GameComponent component;

    /**
     * Constructs a factory for creating copies of the given component.
     *
     * @param component the component to be copied.
     */
    public GameComponentFactory(GameComponent component) {
        this.component = component;
    }

    /**
     * Creates a shallow copy of the component.
     *
     * @return a shallow copy of the component.
     */
    public GameComponent createShallowCopy() {
        return component.shallowClone();
    }

    /**
     * Creates a deep copy of the component.
     *
     * @return a deep copy of the component.
     */
    public GameComponent createDeepCopy() {
        return component.deepClone();
    }
}
