import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * Write a program that prints numbers within specified range lets say 1 to 100. If number is odd print 'Odd'
 * instead of the number. If number is even print 'Even' instead of number. Else print number [hint - if number is Prime].
 */
public class OddEvenKataTest {
    static OddEvenKata res;

    @BeforeClass
    public static void onlyOnce() {
        res = new OddEvenKata();
    }

    @Test
    public void testOdd() {
        Assert.assertEquals(Arrays.asList("Odd","Prime"), res.showOutputOf(2));
        Assert.assertEquals(Arrays.asList("Odd","Prime","Prime"), res.showOutputOf(3));
        Assert.assertEquals(Arrays.asList("Odd","Prime","Prime","Even"), res.showOutputOf(4));
        Assert.assertEquals(Arrays.asList("Odd","Prime","Prime","Even","Prime"), res.showOutputOf(5));
        Assert.assertEquals(Arrays.asList("Odd","Prime","Prime","Even","Prime","Even"), res.showOutputOf(6));
        Assert.assertEquals(Arrays.asList("Odd","Prime","Prime","Even","Prime","Even","Prime"), res.showOutputOf(7));
    }
}
