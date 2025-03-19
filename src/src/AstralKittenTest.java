import org.junit.Test;
import static org.junit.Assert.*;

public class AstralKittenTest {

    @Test
    public void testConstructor() {
        AstralKitten kitten = new AstralKitten("Medium", 5);
        String feedResult = kitten.feed();
        assertTrue(feedResult.contains("Power=High"));
        assertTrue(feedResult.contains("starAffinity=3"));
    }

    @Test
    public void testFeed() {
        AstralKitten kitten = new AstralKitten("Low", 1);
        String result = kitten.feed();
        assertEquals("AstralKitten purrs, absorbing cosmic rays! Power=High, starAffinity=3", result);
        result = kitten.feed();
        assertEquals("AstralKitten purrs, absorbing cosmic rays! Power=High, starAffinity=5", result);
    }

    @Test
    public void testPlayToy() {
        AstralKitten kitten = new AstralKitten("Low", 1);
        String result = kitten.playToy("cosmic ball");
        assertEquals("AstralKitten purrs, absorbing cosmic rays! Power=Low, starAffinity=1", result);
    }

    @Test
    public void testTelekinesis() {
        AstralKitten kitten = new AstralKitten("Low", 1);
        String result = kitten.telekinesis();
        assertEquals("AstralKitten focuses cosmic energy, levitating nearby objects!", result);
    }

    @Test
    public void testToString() {
        AstralKitten kitten = new AstralKitten("Low", 1);
        String result = kitten.toString();
        assertEquals("AstralKitten", result);
    }
}