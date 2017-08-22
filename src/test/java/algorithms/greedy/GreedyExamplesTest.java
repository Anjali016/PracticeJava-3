package algorithms.greedy;

import algorithms.dynamic.programming.DPExamples;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by abhay on 08/07/17.
 */
public class GreedyExamplesTest {
  @Test
  public void connectRopes() throws Exception {
    int[] ropes = {4, 3, 2, 6};
    assertEquals(29, new GreedyExamples().connectRopes(ropes));
  }

  @Test
  public void minCoin() throws Exception {
    int[] denomination = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
    assertEquals(2, new GreedyExamples().minCoin(denomination, 70));
    assertEquals(5, new GreedyExamples().minCoin(denomination, 93));
    assertEquals(3, new GreedyExamples().minCoin(denomination, 121));
    int[] den = {1, 5, 6, 9};
    assertEquals(3, new GreedyExamples().minCoin(den, 11));
  }

  @Test
  public void fittingShelves() throws Exception {
   int[] minValues = new int[3];
   int wall = 7;
   minValues[2] = wall;
  assertEquals(2, new GreedyExamples().fittingShelves(wall, 5, 3, minValues)[0]);
  int wall1 = 24;
  minValues[2] = wall1;
  assertEquals(3, new GreedyExamples().fittingShelves(wall1, 5, 3, minValues)[0]);
    int wall2 = 29;
    minValues[2] = wall2;
    assertEquals(2, new GreedyExamples().fittingShelves(wall2, 9, 3, minValues)[2]);
  }


}