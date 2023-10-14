import org.junit.Test;
import static org.junit.Assert.*;

public class LongestSubstringTest {
    @Test
    public void testFindLongestSubstringScenario1() {
        String string1 = "CHECKITWHEREISTHELONGESTSUBSTRING24";
        String string2 = "SUBSTINGWHERECHECKITANTCHECK24ISCHECKWHERE";
        String expected = "CHECKIT";
        assertEquals(expected, LongestSubstring.findLongestSubstring(string1, string2));
    }

    @Test
    public void testFindLongestSubstringScenario2() {
        String string1 = "247WECODEONLINEONENTWICKLERHELDDECHECKITOUT";
        String string2 = "CHECKITOUTWECODEONLINEON24ENTWICKLERHELDOUT";
        String expected = "WECODEONLINEON ENTWICKLERHELD";
        assertEquals(expected, LongestSubstring.findLongestSubstring(string1, string2));
    }

    @Test
    public void testFindLongestSubstringScenario3() {
        String string1 = "DONUTSAREDELICIOUSBUTIALSOLOVECHECK24PIZZA";
        String string2 = "PIZZASAREYUMMYBUTIDOALSOLOVEDONUTSFROMCHECK24";
        String expected = "ALSOLOVE";
        assertEquals(expected, LongestSubstring.findLongestSubstring(string1, string2));
    }
}
