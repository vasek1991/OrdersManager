import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by  on .
 */
public class fgg {
    @Test
    public void ggg() {
        String s = "a";
        assertEquals(s, "a");
    }

    @Test(expected = NullPointerException.class)
    public void ggg1() {
        String s = null;
        s.length();
    }
}