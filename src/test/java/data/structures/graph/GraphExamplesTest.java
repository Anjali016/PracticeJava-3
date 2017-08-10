package data.structures.graph;

import org.junit.Test;
import utilities.Stack;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GraphExamplesTest {
  @Test
  public void hamiltonionCycle() throws Exception {
    int graph1[][] = {{0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0},
    };
    ArrayList<Integer> path = new GraphExamples().hamiltonianCycle(graph1);
    for (Integer integer : path) System.out.print(integer + " ");
  }

  @Test
  public void bfs() throws Exception {
    int[][] graph = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
    new GraphExamples().bfs(graph);

  }

  @Test
  public void topologicalSort() throws Exception {
    int[][] mat = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 0, 1, 0, 0, 0}};
    java.util.Stack<Integer> stack= new GraphExamples().topologicalSort(mat);
    while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
  }


  @Test
  public void hasPath() throws Exception {
    int u = 1, v = 3;
    int[][] mat = {{0, 1, 1, 0}, {0, 0, 1, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}};
    assertTrue(new GraphExamples().hasPath(mat, u, v));
    assertTrue(new GraphExamples().bfsHasPath(mat, u, v));
  }

  @Test
  public void findMinSteps() throws Exception {
    int[] source = {5, 7}, dest = {15, 20};
    assertEquals(3, new GraphExamples().findMinSteps( source, dest, 20));
  }

  @Test
  public void depthFS() throws Exception {
    int[][] mat = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
    new GraphExamples().depthFS(mat);
  }

  @Test
    public void maxConnectedCellTest() {
        int[][] graph = {{1,0},{0,0}};
        assertEquals(1,new GraphExamples().maxConnectedCell(graph));
    }



}
