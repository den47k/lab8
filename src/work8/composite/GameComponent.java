package work8.composite;

/**
 * Interface representing a component in the game.
 * Supports cloning for both shallow and deep copies.
 */
public interface GameComponent extends Cloneable {

    /**
     * Creates a shallow copy of the component.
     *
     * @return a shallow copy of the component.
     */
    GameComponent shallowClone();

    /**
     * Creates a deep copy of the component.
     *
     * @return a deep copy of the component.
     */
    GameComponent deepClone();
}
