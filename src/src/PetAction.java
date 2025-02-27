/**
 * an interface that has the actions that all cyber pets must implement.
 */
public interface PetAction {
    /**
     * Feeds the pet
     *
     * @return pet's reaction to being fed
     */
    String feed();

    /**
     * Plays with the pet
     *
     * @param toy The toy to play with
     * @return pet's reaction to playing with the toy
     */
    String playToy(String toy);
}