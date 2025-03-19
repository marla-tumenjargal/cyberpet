import org.junit.Test;
import static org.junit.Assert.*;

public class SlimePetTest {

    @Test
    public void testConstructor() {
        SlimePet slime = new SlimePet("Blue");
        String feedResult = slime.feed();
        assertTrue(feedResult.contains("size = 1.5"));
    }

    @Test
    public void testFeed() {
        SlimePet slime = new SlimePet("Green");
        String result = slime.feed();
        assertEquals("Slime of color Green grows bigger after meal! Now size = 1.5", result);
        result = slime.feed();
        assertEquals("Slime of color Green grows bigger after meal! Now size = 2.0", result);
    }

    @Test
    public void testPlayToy() {
        SlimePet slime = new SlimePet("Purple");
        String result = slime.playToy("bubble wand");
        assertEquals("Slime of color Purple wiggles around the bubble wand. Squishy sounds echo...", result);
    }

    @Test
    public void testDivide() {
        SlimePet slime = new SlimePet("Pink");
        slime.feed();
        String result = slime.divide();
        assertEquals("Slime divides! Two smaller slimes appear. Squishiness is now 4", result);
        slime.feed(); // size = 1.25
        result = slime.divide();
        assertEquals("Slime divides! Two smaller slimes appear. Squishiness is now 5", result);
    }

    @Test
    public void testToString() {
        SlimePet slime = new SlimePet("Yellow");
        String result = slime.toString();
        assertEquals("SlimePet", result);
    }
}