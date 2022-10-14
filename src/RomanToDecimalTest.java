/**
 * Testing RomanToDecimal class
 * @version 10.13.2022
 * @author 23sukhija
 */
import static org.junit.Assert.*;

public class RomanToDecimalTest {
    /**
     * 30 test cases of 10 valid, 4 invalid, 4 logically incorrect
     */
    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14); //valid
        assertEquals(RomanToDecimal.romanToDecimal("hi mom"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("iviviv"), 16); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("CC"), 200); //valid
        assertEquals(RomanToDecimal.romanToDecimal("vvvvvvvv"), 40); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("livil"), 105); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("IXILVC"), 165); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("CMMC"), 2000); //valid
        assertEquals(RomanToDecimal.romanToDecimal("macbook"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("fortnite"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("soccer"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("MCXLIX"), 1149); //valid
        assertEquals(RomanToDecimal.romanToDecimal("DXVI"), 516); //valid
        assertEquals(RomanToDecimal.romanToDecimal("MDCIX"), 1609); //valid
        assertEquals(RomanToDecimal.romanToDecimal("civix"), 113); //valid
        assertEquals(RomanToDecimal.romanToDecimal("MXI"), 1011); //valid
        assertEquals(RomanToDecimal.romanToDecimal("CDMI"), 1401); //valid
        assertEquals(RomanToDecimal.romanToDecimal("mcd"), 1400); //valid


        assertNotEquals(RomanToDecimal.romanToDecimal("your mom"), 100);
        assertNotEquals(RomanToDecimal.romanToDecimal("seventeen"), 17);
    }
}