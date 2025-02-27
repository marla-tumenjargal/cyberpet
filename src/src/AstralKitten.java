/**
 * an astral kitten pet in the cyber pet system.
 */
public class AstralKitten implements PetAction {
    private String cosmicPower;
    private int starAffinity;

    /**
     * Constructs an AstralKitten with cosmic power and star affinity.
     *
     * @param cosmicPower The cosmic power of the kitten
     * @param starAffinity The star affinity of the kitten
     */
    public AstralKitten(String cosmicPower, int starAffinity) {
        this.cosmicPower = "Low";
        this.starAffinity = 1;
    }

    /**
     * Feeds the astral kitten
     * return string
     */
    @Override
    public String feed() {
        cosmicPower = "High";
        starAffinity += 2;
        return "AstralKitten purrs, absorbing cosmic rays! Power=" + cosmicPower + ", starAffinity=" + starAffinity;
    }

    /**
     * Plays with the astral kitten using the specified toy.
     *
     * @param toy The toy to play with
     * @return String
     */
    @Override
    public String playToy(String toy) {
        return "AstralKitten purrs, absorbing cosmic rays! Power=" + cosmicPower + ", starAffinity=" + starAffinity;
    }

    /**
     * Triggers telekinesis.
     *
     * @return String
     */
    public String telekinesis() {
        return "AstralKitten focuses cosmic energy, levitating nearby objects!";
    }

    /**
     * Returns a string representation of the astral kitten pet.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "AstralKitten";
    }
}
