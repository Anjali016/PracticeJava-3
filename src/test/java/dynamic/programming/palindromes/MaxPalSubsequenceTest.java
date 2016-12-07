package dynamic.programming.palindromes;

import algorithms.dynamic.programming.palindromes.MaxPalSubSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxPalSubsequenceTest {

    @Test
    public void maxPalTest() {
        String s = "GEEKSFORGEEKS";
        assertEquals(5,new MaxPalSubSequence().maxPal(s));

    }
}
