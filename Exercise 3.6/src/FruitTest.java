import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    private Fruit test = new Fruit("fruit");
    @Test
    void getName() {
        String name = test.getName();
        assertEquals("fruit", name, "getName() returning different name");
    }

    @Test
    void setName() {
        test.setName("apple");
        assertEquals("apple", test.name, "getName() is setting a different name than the one established");
    }

    @Test
    void setEmptyName() {
        test.setName("");
        assertFalse(test.getName().isEmpty(), "setName() set an empty string to the object");
    }
}