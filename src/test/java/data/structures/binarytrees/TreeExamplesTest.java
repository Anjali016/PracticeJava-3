package data.structures.binarytrees;

import org.junit.Test;
import utilities.TreeNode;

import static org.junit.Assert.assertEquals;

public class TreeExamplesTest {

    @Test
    public void traversalTest() {

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;

        TreeExamples traversals = new TreeExamples();
        traversals.inorder(root);
        System.out.println("");
        traversals.preorder(root);
        System.out.println("");
        traversals.postorder(root);

    }

    @Test
    public void sumOfRootToLeafTest(){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(5);
//        root.left.right.right = new TreeNode(4);
//        root.left.right.left = new TreeNode(7);
//        root.right.right.right = new TreeNode(4);
        assertEquals(122, new TreeExamples().sumOfRootToLeafPath(root, 0));
    }

    @Test
    public void sizeTest() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;

        assertEquals(3, new TreeExamples().size(root));
    }

    @Test
    public void heightTest() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;

        assertEquals(2,new TreeExamples().height(root));
    }

    @Test
    public void isIdenticalTest() {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;

        assertEquals(true,new TreeExamples().isIdentical(root,root));
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
        assertEquals(3,root.left.data);
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
        assertEquals(3,new TreeExamples().countLeaves(root));
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
        assertEquals(true,new TreeExamples().hasChildSum(root));
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
        assertEquals(12,root.data);
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
        assertEquals(4,new TreeExamples().diameter(root));
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
        assertEquals(1,new TreeExamples().LCA(root,4,5).data);
    }

}
