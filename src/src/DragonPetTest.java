import org.junit.Test;
import static org.junit.Assert.*;

public class DragonPetTest {

    @Test
    public void testConstructor() {
        DragonPet dragon = new DragonPet("Smaug");
        String feedResult = dragon.feed();
        assertTrue(feedResult.contains("Hunger=4"));
        assertTrue(feedResult.contains("Mood =6"));
    }

    @Test
    public void testFeed() {
        DragonPet dragon = new DragonPet("Drogon");
        String result = dragon.feed();
        assertEquals("Dragon Drogon devours a pile of gold coins. Hunger=4, Mood =6", result);
        result = dragon.feed();
        assertEquals("Dragon Drogon devours a pile of gold coins. Hunger=3, Mood =7", result);
    }

    @Test
    public void testPlayToy() {
        DragonPet dragon = new DragonPet("Mushu");
        String result = dragon.playToy("knight figurine");
        assertEquals("Dragon Mushu roars happily, scorching the knight figurine! Mood =7", result);
        result = dragon.playToy("castle tower");
        assertEquals("Dragon Mushu roars happily, scorching the castle tower! Mood =9", result);
    }

    @Test
    public void testBreatheFire() {
        DragonPet dragon = new DragonPet("Draco");
        String result = dragon.breatheFire();
        assertEquals("Dragon Draco breathes fire! Everything is ablaze!", result);
    }

    @Test
    public void testToString() {
        DragonPet dragon = new DragonPet("Toothless");
        String result = dragon.toString();
        assertEquals("DragonPet", result);
    }
}