import static org.junit.Assert.*;

public class LC2063Test {

    @org.junit.Test
    public void findVowels() {

        long actual1 = LC2063.findVowels("aba");
        long actual2 = LC2063.findVowels("abc");
        long actual3 = LC2063.findVowels("ltcd");

        assertEquals(6, actual1);
        assertEquals(3, actual2);
        assertEquals(0, actual3);
    }

    @org.junit.Test
    public void isVowel() {

        boolean actual1 = LC2063.isVowel('f');
        boolean actual2 = LC2063.isVowel('e');

        assertFalse(actual1);
        assertTrue(actual2);
    }
}