package data.structures.graph;

import algorithms.dynamic.programming.DPExamples;
import algorithms.dynamic.programming.DPExamplesTest;
import org.junit.Test;
import utilities.Graph;
import utilities.Stack;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GraphExamplesTest {
  @Test
  public void findDistance() throws Exception {
    char matrix[][] =
    {
      {'O', 'O', 'O', 'O', 'G'},
      {'O', 'W', 'W', 'O', 'O'},
      {'O', 'O', 'O', 'W', 'O'},
      {'G', 'W', 'W', 'W', 'O'},
      {'O', 'O', 'O', 'O', 'G'}
    };

    int[][] output = new GraphExamples().findDistance(matrix);
    for (int i = 0; i < output.length; i++) {
      for (int j = 0; j < output[0].length; j++) System.out.print(output[i][j] + " ");
      System.out.println();
    }
  }

  @Test
  public void findLargestRegion() throws Exception {
   int[][] graph = { {0, 0, 1, 1, 0},
      {1, 0, 1, 1, 0},
      {0, 1, 0, 0, 0},
      {0, 0, 0, 0, 1}};
   assertEquals(6, new GraphExamples().findLargestRegion(graph));
  }

  @Test
  public void sumOfDependencies() throws Exception {
    Graph graph = new Graph(5);
    graph.addEdge(0 , 2);
    graph.addEdge(0 ,  3);
    graph.addEdge(1 , 3);
    graph.addEdge(2 , 3);
    assertEquals(4, new GraphExamples().sumOfDependencies(graph));
  }

  @Test
  public void countPaths() throws Exception {
    int[][] graph = { {0, 1, 1, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 0}
    };

    assertEquals(2, new GraphExamples().countPaths(graph, 0, 3, 2));
  }

  @Test
  public void isBipartite() throws Exception {
    int[][] graph = {{0, 1, 0, 1},
      {1, 0, 1, 0},
      {0, 1, 0, 1},
      {1, 0, 1, 0}
    };

    assertTrue(new GraphExamples().isBipartite(graph));
  }

  @Test
  public void shortestPathDAG() throws Exception {
    int[][] graph = {{0, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0}};
    int[][] weight = {{0, 5, 3, 0, 0, 0}, {0, 0, 2, 6, 0, 0}, {0, 0, 0, 7, 4, 2}, {0, 0, 0, 0, -1, 0}, {0, 0, 0, 0, 0, -2}, {0, 0, 0, 0, 0, 0}};
    int[] res = new GraphExamples().shortestPathDAG(graph, weight, 1);
    for (Integer val : res) System.out.print(val + " ");
  }

  @Test
  public void allPairShortestPath() throws Exception {
    int INF = 9999;
    int[][] graph = { {0,   5,  INF, 10},
            {INF, 0,   3, INF},
            {INF, INF, 0,   1},
            {INF, INF, INF, 0}
    };

    int[][] result = new GraphExamples().allPairShortestPath(graph);
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) System.out.print(result[i][j] + " ");
      System.out.println();
    }

  }

  @Test
  public void printPaths() throws Exception {
    int[][] graph = {{0, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 0, 0}, {0, 0, 0, 0}};
    boolean[] visited = new boolean[graph.length];
    new GraphExamples().printPaths(graph, 2, 3, "", visited);
  }

  @Test
  public void countEdgesUDG() throws Exception {
    Graph graph = new Graph(5);
    graph.addEdge(0 , 1);
    graph.addEdge(0 , 2);
    graph.addEdge(0 ,  3);
    graph.addEdge(0 , 4);
    graph.addEdge(0 , 5);
    graph.addEdge(1 , 2);
    assertEquals(6, new GraphExamples().countEdgesUDG(graph));
  }


  @Test
  public void minEdgeBFS() throws Exception {
    int[][] graph = {{0, 1, 2, 0, 4, 0, 0}, {1, 0, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1, 1},
            {0, 0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
    assertEquals(2, new GraphExamples().minEdgeBFS(graph, 1, 5));
  }

  @Test
  public void hasCycle() throws Exception {
    int[][] mat = {{0, 1, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}, {0, 0, 0, 0}};
    int[][] graph = {{0, 1, 1, 0}, {0, 0, 1, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}};
    assertTrue(new GraphExamples().hasCycle(graph));
    assertFalse(new GraphExamples().hasCycle(mat));
  }

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
