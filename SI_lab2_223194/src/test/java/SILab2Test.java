import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class SILab2Test {


    @Test
    public void testZaNullime() {
        List<Item> allItems = new ArrayList<>();

        allItems.add(new Item(null, "1122", 20, 0));

        assertTrue(SILab2.checkCart(allItems, 100));
        assertEquals("unknown", allItems.get(0).getName());

    }

    @Test
    public void testZaTocno() {
        List<Item> allItems = new ArrayList<>();

        allItems.add(new Item("tocak", "0123", 1000, 0.1f));

        assertTrue(SILab2.checkCart(allItems, 1200));

    }

    @Test
    public void testZaNeTocno() {
        List<Item> allItems = new ArrayList<>();

        allItems.add(new Item("guma", "2314", 50, 0));

        assertFalse(SILab2.checkCart(allItems, 40));
    }
}
