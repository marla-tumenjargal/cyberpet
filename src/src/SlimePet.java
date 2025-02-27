/**
 * Represents a slime pet in the cyber pet system.
 */
public class SlimePet implements PetAction {
    private String color;
    private double size;
    private int squishiness;

    /**
     * Constructs a SlimePet with the specified color.
     * @param color The color of the slime
     */
    public SlimePet(String color) {
        this.color = color;
        this.size = 1.0;
        this.squishiness = 3;
    }

    /**
     * Feeds the slime, increasing its size.
     * @return String describing slime's reaction to being fed
     */
    @Override
    public String feed() {
        size = size + 0.5;
        return "Slime of color " + color + " grows bigger after meal! Now size = " + size;
    }

    /**
     * Plays with the slime using the specified toy.
     * @param toy The toy to play with
     * @return fixed string
     */
    @Override
    public String playToy(String toy) {
        return "Slime of color " + color + " wiggles around the " + toy + ". Squishy sounds echo...";
    }

    /**
     * Triggers the slime's unique ability to divide.
     * @return the slime dividing
     */
    public String divide() {
        size = size / 2;
        squishiness++;
        return "Slime divides! Two smaller slimes appear. Squishiness is now " + squishiness;
    }

    /**
     * Returns a string representation of the slime pet.
     * @return String representing the slime pet
     */
    @Override
    public String toString() {
        return "SlimePet";
    }
}
