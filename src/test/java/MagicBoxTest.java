import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicBoxTest {
    @Test
    public void testAdd_notEmptyBox() {
        MagicBox<String> magicBox = new MagicBox<>(5);
        Assertions.assertTrue(magicBox.add("test"));
    }

    @Test
    public void testAdd_EmptyBox() {
        MagicBox<String> magicBox = new MagicBox<>(0);
        Assertions.assertFalse(magicBox.add("test"));
    }

    @Test
    public void testPeak() {
        MagicBox<String> magicBox = new MagicBox<>(1);
        magicBox.add("test");
        Assertions.assertEquals("test", magicBox.pick());
    }

    @Test
    public void testPeak_throwsException() {
        MagicBox<String> magicBox = new MagicBox<>(2);
        Assertions.assertThrows(RuntimeException.class, () -> magicBox.pick());
    }
}
