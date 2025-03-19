import org.junit.Test;
import static org.junit.Assert.*;

public class PetManagerTest {

    @Test
    public void testConstructor() {
        PetManager manager = new PetManager();
        String listResult = manager.listPets();
        assertEquals("Current Pet List:\n", listResult);
    }

    @Test
    public void testAddPet() {
        PetManager manager = new PetManager();
        DragonPet dragon = new DragonPet("Falkor");
        String result = manager.addPet(dragon);
        assertEquals("Pet added: DragonPet", result);
        SlimePet slime = new SlimePet("Red");
        result = manager.addPet(slime);
        assertEquals("Pet added: SlimePet", result);
        AstralKitten kitten = new AstralKitten("High", 3);
        result = manager.addPet(kitten);
        assertEquals("Pet added: AstralKitten", result);
        String listResult = manager.listPets();
        assertTrue(listResult.contains("0: DragonPet"));
        assertTrue(listResult.contains("1: SlimePet"));
        assertTrue(listResult.contains("2: AstralKitten"));
    }

    @Test
    public void testFeedPet() {
        PetManager manager = new PetManager();
        manager.addPet(new DragonPet("Viserion"));
        manager.addPet(new SlimePet("Blue"));


        String result = manager.feedPet(0);
        assertTrue(result.contains("Dragon Viserion devours"));


        result = manager.feedPet(1);
        assertTrue(result.contains("Slime of color Blue grows bigger"));


        result = manager.feedPet(2);
        assertEquals("Invalid pet index.", result);


        result = manager.feedPet(-1);
        assertEquals("Invalid pet index.", result);
    }

    @Test
    public void testPlayPet() {
        PetManager manager = new PetManager();

        manager.addPet(new DragonPet("Spyro"));
        manager.addPet(new AstralKitten("Medium", 2));

        String result = manager.playPet(0, "treasure chest");
        assertTrue(result.contains("Dragon Spyro roars happily"));
        assertTrue(result.contains("treasure chest"));

        result = manager.playPet(1, "cosmic yarn");
        assertTrue(result.contains("AstralKitten purrs"));

        result = manager.playPet(2, "toy");
        assertEquals("Invalid pet index.", result);
    }

    @Test
    public void testListPets() {
        PetManager manager = new PetManager();

        String result = manager.listPets();
        assertEquals("Current Pet List:\n", result);

        manager.addPet(new DragonPet("Ember"));
        manager.addPet(new SlimePet("Green"));

        result = manager.listPets();
        assertEquals("Current Pet List:\n0: DragonPet\n1: SlimePet\n", result);
    }

    @Test
    public void testTriggerUniqueBehavior() {
        PetManager manager = new PetManager();

        manager.addPet(new DragonPet("Saphira"));
        manager.addPet(new SlimePet("Purple"));
        manager.addPet(new AstralKitten("High", 5));

        String result = manager.triggerUniqueBehavior();

        assertTrue(result.contains("Triggering Unique Behaviors..."));
        assertTrue(result.contains("Dragon Saphira breathes fire!"));
        assertTrue(result.contains("Slime divides!"));
        assertTrue(result.contains("AstralKitten focuses cosmic energy"));
    }
}