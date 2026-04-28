package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testAdd() {
        Addition obj = new Addition();
        assertEquals(8, obj.add(5, 3));
    }
}
