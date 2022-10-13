import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("hi mom"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("iviviv"), 16);

        assertNotEquals(RomanToDecimal.romanToDecimal("your mom"), 100);
    }
}