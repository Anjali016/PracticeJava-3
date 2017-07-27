package data.structures.binarytrees;

import org.junit.Test;
import utilities.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TreeExamplesTest {
  @Test
  public void printBoundary() throws Exception {
  }

  @Test
  public void maxDiffAncestors() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(3);
    assertEquals(-1, new TreeExamples().maxDifferenceAncestor(root));
  }

  @Test
  public void hasRootToLeafSumPath() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(3);
    assertTrue(new TreeExamples().hasRootToLeafSumPath(root, 8));
  }

  @Test
  public void sumOfLeftLeaves() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(23);
    root.right.right = new TreeNode(52);
    root.right.right.left = new TreeNode(50);
    assertEquals(78, new TreeExamples().sumOfLeftLeaves(root, null));
  }

  @Test
  public void closetLeafFromKey() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.left.left = new TreeNode(5);
    root.right.left.left.left = new TreeNode(6);
    root.right.left.left.right = new TreeNode(7);
    root.right.right = new TreeNode(8);
    root.right.right.right = new TreeNode(9);
    root.right.right.right.left = new TreeNode(10);
    assertEquals(0, new TreeExamples().closetLeafFromKey(root, root.left));
    assertEquals(1, new TreeExamples().closetLeafFromKey(root, root.right.right.right));
    assertEquals(2, new TreeExamples().closetLeafFromKey(root, root.right));
    assertEquals(2, new TreeExamples().closetLeafFromKey(root, root.right.left));

  }

  @Test
  public void ancestors() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(8);
    root.right.left.right = new TreeNode(9);
    ArrayList<TreeNode> arrayList = new TreeExamples().ancestors(root, root.left.left.right, new ArrayList<>());
    for (TreeNode treeNode : arrayList) System.out.println(treeNode.data);
  }

  @Test
  public void findMirrorNode() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(8);
    root.right.left.right = new TreeNode(9);
    assertEquals(6, new TreeExamples().findMirrorNode(root, 4, root));
    assertEquals(1, new TreeExamples().findMirrorNode(root, 1, root));

  }

  @Test
  public void pathFromRoot() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    assertEquals("1 2 5", new TreeExamples().pathFromRoot(root, 5, ""));
  }

  @Test
  public void findDistanceFromRoot() throws Exception {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    assertEquals(1, new TreeExamples().findDistanceFromRoot1(root, root.left, 0));
  }

  @Test
  public void subTreesOfOddCount() throws Exception {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
//    root.left.left = new TreeNode(4);
//    root.left.right = new TreeNode(10);
//    root.left.right.left = new TreeNode(6);
//    root.right.left = new TreeNode(8);
//    root.right.right = new TreeNode(5);
    int[] count = {0};
    new TreeExamples().subTreesOfOddCount(root, count);
//    assertEquals(6, count[0]);
    assertEquals(1, count[0]);
  }

  @Test
  public void areMirror() throws Exception {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(3);
    root.right = new TreeNode(1);
    assertTrue(new TreeExamples().areMirror(root, createTree()));
  }


  @Test
  public void findLCA() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(7);
    TreeNode lca = new TreeExamples().findLCA(root, 7, 11);
    if (lca == null) System.out.println("No LCA Found");
    else System.out.println(lca.data);
  }

  @Test
  public void printCommonAncestors() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(7);
    new TreeExamples().printCommonAncestors(root, root.left.left.left, root.left.right);

  }

  @Test
  public void treeSize() throws Exception {
    assertEquals(3, new TreeExamples().treeSize(createTree()));
  }

  private TreeNode createTree() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
    return root;
  }

  @Test
  public void inOrder() throws Exception {
    TreeExamples traversals = new TreeExamples();
    traversals.inOrder(createTree());
  }

  @Test
  public void preOrder() throws Exception {
    TreeExamples traversals = new TreeExamples();
    traversals.preOrder(createTree());
  }

  @Test
  public void postOrder() throws Exception {
    TreeExamples traversals = new TreeExamples();
    traversals.postOrder(createTree());
  }


  @Test
  public void areIdentical() throws Exception {
    assertTrue(new TreeExamples().areIdentical(createTree(), createTree()));
  }

  @Test
  public void height() throws Exception {
    assertEquals(2, new TreeExamples().height(createTree()));
  }

  @Test
  public void deleteTree() throws Exception {
    TreeNode root = createTree();
    new TreeExamples().deleteTree(root);
    assertEquals(null, root.left);
  }

  @Test
  public void mirror() throws Exception {

  }

  @Test
  public void rootToLeafPath() throws Exception {
    new TreeExamples().rootToLeafPath(createTree(), "");
  }

  @Test
  public void LCA() throws Exception {

  }

  @Test
  public void treeToList() throws Exception {

  }

  @Test
  public void levelOrder() throws Exception {
    new TreeExamples().levelOrder(createTree());
  }

  @Test
  public void countLeaves() throws Exception {

  }

  @Test
  public void levelOrderSpiral() throws Exception {

  }

  @Test
  public void hasChildSum() throws Exception {

  }

  @Test
  public void getChildSum() throws Exception {

  }

  @Test
  public void convertToChildSum() throws Exception {

  }

  @Test
  public void diameter() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(23);
//    assertEquals(4, new TreeExamples().diameter(root));
    assertEquals(4, new TreeExamples().diameterOpt(root, new int[1]));

  }

  @Test
  public void isBalanced() throws Exception {

  }

  @Test
  public void isBalancedS() throws Exception {

  }

  @Test
  public void isBalancedOpt() throws Exception {

  }

  @Test
  public void morrisTraversal() throws Exception {

  }

  @Test
  public void existsPathSum() throws Exception {

  }

  @Test
  public void constructTree() throws Exception {

  }

  @Test
  public void getInorderIndex() throws Exception {

  }

  @Test
  public void doubleTree() throws Exception {

  }

  @Test
  public void maxWidth() throws Exception {

  }

  @Test
  public void findMaxWidth() throws Exception {

  }

  @Test
  public void isFoldable() throws Exception {

  }

  @Test
  public void isFoldable1() throws Exception {

  }

  @Test
  public void printNodesAtKdistance() throws Exception {

  }

  @Test
  public void getLevel() throws Exception {

  }

  @Test
  public void printAncestors() throws Exception {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(7);

//    System.out.println(    new TreeExamples().printAncestors(root, root.right, ""));

//    System.out.println(    new TreeExamples().printAncestors(root, root.left.right, ""));
//    new TreeExamples().printAncestors(root, root.left.left.left, "");
//
  }


  @Test
  public void maxWidthTest() {
    TreeNode root = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
    TreeExamples maxWidth = new TreeExamples();
    assertEquals(2, maxWidth.maxWidth(root));

  }

  @Test
  public void printAncestorsTest() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(7);

    TreeExamples treeExamples = new TreeExamples();
    treeExamples.printAncestors(root, root.left.left.left, "");

  }

  @Test
  public void isSumTreeTest() {
    TreeNode root = new TreeNode(26);
    root.left = new TreeNode(10);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(6);
    root.right.right = new TreeNode(3);

    TreeExamples treeExamples = new TreeExamples();
    assertEquals(true, treeExamples.isSumTree(root));

  }


  @Test
  public void isFoldableTest() {
    TreeNode root = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(4);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
    TreeExamples treeExamples = new TreeExamples();
    assertEquals(true, treeExamples.isFoldable(root));

  }

  @Test
  public void doubleTreeTest() {
    TreeNode root = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
    TreeExamples doubleTree = new TreeExamples();
    TreeNode newRoot = doubleTree.doubleTree(root);
    doubleTree.preOrder(newRoot);

  }

  @Test
  public void constructTreeTest() {
    int[] pre = {1, 2, 3};
    int[] in = {2, 1, 3};
    TreeNode root = new TreeExamples().constructTree(pre, in, 0, in.length - 1);
    new TreeExamples().preOrder(root);
  }

  @Test
  public void sumOfRootToLeafTest() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(3);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(4);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    assertEquals(13997, new TreeExamples().sumOfRootToLeafPath(root, 0));
  }

  @Test
  public void printWithNoSiblingTest() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
//        root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.left.left = new TreeNode(6);
//        root.left.right.right = new TreeNode(4);
    new TreeExamples().printWithNoSibling(root, null);
  }

  @Test
  public void printKDistanceLeafTest() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    Set<TreeNode> set = new HashSet<>();
    new TreeExamples().printKNodeFromLeaf(root, 2, set);
    for (TreeNode node : set) System.out.print(node.data + " ");
  }

  @Test
  public void areCousinsTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(8);
    root.right.right = new TreeNode(9);

    assertEquals(true, new TreeExamples().areCousins(root, root.left.left, root.right.right));
  }

  @Test
  public void sizeTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(8);
    root.right.right = new TreeNode(9);


//        assertEquals(3, new TreeExamples().size(root));
  }

  @Test
  public void heightTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;

    assertEquals(2, new TreeExamples().height(root));
  }

  @Test
  public void isIdenticalTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    root.left = node1;
    root.right = node2;

    assertEquals(true, new TreeExamples().areIdentical(root, root));
  }

  @Test
  public void mirrorTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    new TreeExamples().mirror(root);
    assertEquals(3, root.left.data);
  }

  @Test
  public void pathToLeafTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    //  new TreeExamples().rootToLeafPath("",root);
  }

  @Test
  public void levelOrderTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    new TreeExamples().levelOrder(root);
  }

  @Test
  public void levelOrderSpiralTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    new TreeExamples().levelOrderSpiral(root);
  }

  @Test
  public void countLeavesTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    assertEquals(3, new TreeExamples().countLeaves(root));
  }

  @Test
  public void hasChildSumTest() {
    TreeNode root = new TreeNode(10);
    TreeNode node1 = new TreeNode(4);
    TreeNode node2 = new TreeNode(6);
    TreeNode node4 = new TreeNode(1);
    TreeNode node5 = new TreeNode(3);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    assertEquals(true, new TreeExamples().hasChildSum(root));
  }

  @Test
  public void convertToChildSumTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    new TreeExamples().convertToChildSum(root);
    assertEquals(12, root.data);
  }

  @Test
  public void diameterTest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    assertEquals(4, new TreeExamples().diameter(root));
  }

  @Test
  public void LCATest() {
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    node1.left = node4;
    node1.right = node5;
    assertEquals(1, new TreeExamples().findLCA(root, 4, 5).data);
  }

}
