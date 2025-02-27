import java.util.ArrayList;

/**
 * Manages a collection of pets in the cyber pet system.
 */
public class PetManager {
    private ArrayList<PetAction> pets;

    /**
     * Constructs a PetManager and initializes "pets array" list.
     */
    public PetManager() {
        pets = new ArrayList<>();
    }

    /**
     * Adds a pet to the collection.
     *
     * @param pet The pet to add
     * @return "pet was added"
     */
    public String addPet(PetAction pet) {
        pets.add(pet);
        return "Pet added: " + pet.toString();
    }

    /**
     * Feeds the pet at the specified index.
     *
     * @param index The index of the pet to feed
     * @return describes pet's reaction
     */
    public String feedPet(int index) {
        if (index >= 0 && index < pets.size()) {
            return pets.get(index).feed();
        } else {
            return "Invalid pet index.";
        }
    }

    /**
     * Plays with the pet at the specified index using the specified toy.
     *
     * @param index The index of the pet to play with
     * @param toy The toy to play with
     * @return String describing the pet's reaction to playing with the toy or an error message
     */
    public String playPet(int index, String toy) {
        if (index >= 0 && index < pets.size()) {
            return pets.get(index).playToy(toy);
        } else {
            return "Invalid pet index.";
        }
    }

    /**
     * Lists all pets in the collection.
     *
     * @return String containing a list of all pets
     */
    public String listPets() {
        StringBuilder result = new StringBuilder("Current Pet List:\n");
        for (int i = 0; i < pets.size(); i++) {
            result.append(i).append(": ").append(pets.get(i).toString()).append("\n");
        }
        return result.toString();
    }

    /**
     * Triggers the unique behavior of each pet based on its type.
     *
     * @return String describing the unique behaviors of all pets
     */
    public String triggerUniqueBehavior() {
        StringBuilder result = new StringBuilder("Triggering Unique Behaviors...\n");

        for (PetAction pet : pets) {
            if (pet instanceof DragonPet) {
                result.append(((DragonPet) pet).breatheFire()).append("\n");
            } else if (pet instanceof SlimePet) {
                result.append(((SlimePet) pet).divide()).append("\n");
            } else if (pet instanceof AstralKitten) {
                result.append(((AstralKitten) pet).telekinesis()).append("\n");
            }
        }

        return result.toString();
    }
}