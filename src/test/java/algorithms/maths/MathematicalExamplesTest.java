package algorithms.maths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by abhay on 13/07/17.
 */
public class MathematicalExamplesTest {
  @Test
  public void isMutipleOf5() throws Exception {
    assertTrue(new MathematicalExamples().isMultipleOf5(15));
  }

  @Test
  public void reverseNumber() throws Exception {
    assertEquals(3, new MathematicalExamples().reverseNumber(3, 0));
    assertEquals(678, new MathematicalExamples().reverseNumber(876, 0));
    assertEquals(54321, new MathematicalExamples().reverseNumber(12345, 0));
  }

  @Test
  public void printPermutations() throws Exception {
    new MathematicalExamples().printPermutations("", "abc");
  }

  @Test
  public void printAllCombinations() throws Exception {
    int[] points = { 1, 2, 3};
    new MathematicalExamples().printAllCombinations(4, points, "");
  }


  @Test
  public void printBalParentheses() throws Exception {
//    new MathematicalExamples().printBalParentheses(2, 0, 0, "");
    new MathematicalExamples().printBalParentheses(3, 0, 0, "");
  }

  @Test
  public void printSeq() throws Exception {
    new MathematicalExamples().printSeq(3, 2, "");
  }

  @Test
  public void printPowerSet() throws Exception {
    new MathematicalExamples().printPowerSet("abc", "");
  }

}