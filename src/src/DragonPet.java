/**
 * a dragon pet in the cyber pet system.=
 */
public class DragonPet implements PetAction {
    private String name;
    private int hungerLevel;
    private int mood;

    /**
     * Constructs a DragonPet
     *
     * @param name The name of the dragon
     */
    public DragonPet(String name) {
        this.name = name;
        this.hungerLevel = 5;
        this.mood = 5;
    }

    /**
     * Feeds the dragon
     *
     * @return fixed string
     */
    @Override
    public String feed() {
        hungerLevel--;
        mood++;
        return "Dragon " + name + " devours a pile of gold coins. Hunger=" + hungerLevel + ", Mood =" + mood;
    }

    /**
     * Plays with the dragon using the specified toy
     *
     * @param toy The toy to play with
     * @return String
     */
    @Override
    public String playToy(String toy) {
        mood += 2;
        return "Dragon " + name + " roars happily, scorching the " + toy + "! Mood =" + mood;
    }

    /**
     * Triggers the fire ability haha
     *
     * @return String describing the dragon breathing fire
     */
    public String breatheFire() {
        return "Dragon " + name + " breathes fire! Everything is ablaze!";
    }

    /**
     * Returns a string representation of the dragon pet.
     *
     * @return String representing the dragon pet
     */
    @Override
    public String toString() {
        return "DragonPet";
    }
}
