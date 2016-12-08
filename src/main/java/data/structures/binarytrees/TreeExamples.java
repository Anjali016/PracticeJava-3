package data.structures.binarytrees;

import utilities.TreeNode;

import java.util.*;

class TreeExamples {

    /**
     * 1.
     * Problem: Tree traversals.
     */
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    /**
     * 2.
     * Problem: Size of a tree
     */
    int size(TreeNode node) {
        if (node == null) return 0;
        else return 1 + size(node.left) + size(node.right);
    }

    /**
     * 3.
     * Problem: Determine if Two Trees are Identical
     */
    boolean isIdentical(TreeNode root1, TreeNode root2) {
        return root1 == null && root2 == null ||
                root1 != null && root2 != null && root1.data == root2.data &&
                isIdentical(root1.left,root2.left) &&
                isIdentical(root1.right,root2.right);
    }

     /**
     * 4.
     * Problem: Maximum Depth or Height of a Tree
     */
    int height(TreeNode node) {
        if (node == null) return 0;
        else return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * 5.
     * Problem: Delete a tree.
     *
     * Solution: Do a post order traversal and make the node as null.
     */

     /**
     * 6.
     * Problem: Convert a Binary Tree into its Mirror Tree
     */
    void mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirror(root.left);
            mirror(root.right);
        }
    }

    /**
     * 7.
     * Problem: If you are given two traversal sequences, can you construct the binary tree?
     *
     * Solution: It depends on what traversals are given. If one of the traversal methods is Inorder then
     * the tree can be constructed, otherwise not.
     */

    /**
     * 8.
     * Problem: Print out all of its root-to-leaf paths one per line.
     */
    void rootToLeafPath(TreeNode root, String path) {
        if (root != null) {
            if (isLeaf(root)) System.out.println(path + root.data);
            else {
                rootToLeafPath(root.left, path + root.data + "->");
                rootToLeafPath(root.right, path + root.data + "->");
            }
        }
    }

    /**
     * 9. Lowest Common Ancestor in a Binary Tree.
     */
    TreeNode LCA(TreeNode root, int k1, int k2) {
        if (root == null || root.data == k1 || root.data == k2) return root;
        else {
            TreeNode left = LCA(root.left,k1,k2);
            TreeNode right = LCA(root.right,k1,k2);
            if (left != null && right != null) return root;
            else return left != null ? left : right;
        }
    }

    /**
     * 10.
     * Problem: The Great Tree-List Recursion Problem.
     */
    TreeNode head2 = null, prev1 = null;
    void treeToList(TreeNode root) {
        if (root != null) {
            treeToList(root.left);
            if (head2 == null) head2 = root;
            else {
                prev1.right = root;
                root.left = prev1;
            }
            prev1 = root;
            treeToList(root.right);
        }
    }

    /**
     * 11. Problem:
     * Level Order Tree Traversal
     */
    void levelOrder(TreeNode root) {
        int height = height(root);
        for(int i = 1; i <= height; i++) {
            level(root,i);
            System.out.println("");
        }
    }

    private void level(TreeNode root, int level) {
        if (root != null) {
            if (level <= 1) System.out.print(root.data + " ");
            else {
                level(root.left, level - 1);
                level(root.right, level - 1);
            }
        }
    }

    /**
     * 12.
     * Problem: Count leaf nodes in a binary tree
     */
    int countLeaves(TreeNode root) {
        if (root == null) return 0;
        else if (isLeaf(root)) return 1;
        else return countLeaves(root.right) + countLeaves(root.left);
    }

    private boolean isLeaf(TreeNode node) { return node.left == null && node.right == null; }

    /**
     * 13.
     * Problem: Level order traversal in spiral form
     */
    void levelOrderSpiral(TreeNode root) {
        int height = height(root);
        for(int i = 1; i <= height; i++) {
            levelSpiral(root, i, i % 2 == 0);
            System.out.println("");
        }
    }

    private void levelSpiral(TreeNode root, int level, boolean odd) {
        if (root != null) {
            if (level < 2) System.out.print(root.data + " ");
            else if (odd){
                level(root.right, level - 1);
                level(root.left, level - 1);
            }
            else {
                level(root.left, level - 1);
                level(root.right, level - 1);
            }
        }
    }

    /**
     * 14.
     * Problem: Check for Children Sum Property in a Binary Tree.
     */
    boolean hasChildSum(TreeNode root) {
        return root == null || isLeaf(root) ||
                root.data == getChildSum(root) &&
                        hasChildSum(root.left) &&
                        hasChildSum(root.right);
    }

    int getChildSum(TreeNode node) {
        int sum = 0;
        if (node.left != null) sum += node.left.data;
        if (node.right != null) sum += node.right.data;
        return sum;
    }

    /**
     * 15.
     * Problem: Convert an arbitrary Binary Tree to a tree that holds Children Sum Property
     */
    TreeNode convertToChildSum(TreeNode root) {
        if (root == null || isLeaf(root)) return root;
        else {
            convertToChildSum(root.left);
            convertToChildSum(root.right);
            root.data = getChildSum(root);
            return root;
        }
    }

    /**
     * 16.
     * Problem: Diameter of a Binary Tree
     */
    int diameter(TreeNode root) {
        if (root == null) return 0;
        else {
            return Math.max(height(root.left) + 1 + height(root.right),
                    Math.max(diameter(root.left), diameter(root.right)));
        }
    }

    /**
     * 17.
     * Problem: How to determine if a binary tree is height-balanced?
     */
    boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.abs(leftHeight - rightHeight) <=1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    /**
     * Short circuited solution
     */
    boolean isBalancedS(TreeNode root) {
        if (root == null) return true;
        else {
            if (!isBalancedS(root.left)) return false;
            else if (!isBalancedS(root.right)) return false;
            else {
                int leftHeight = height(root.left);
                int rightHeight = height(root.right);
                return Math.abs(leftHeight - rightHeight) <=1;
            }
        }
    }

    /**
     * Optimized solution
     */
    boolean isBal = true;
    int isBalancedOpt(TreeNode root) {
        if (root == null) return 0;
        else {
            int leftHeight = isBalancedOpt(root.left);
            int rightHeight = isBalancedOpt(root.right);
            int difference = Math.abs(leftHeight - rightHeight);
            if (difference > 1) isBal = false;
            return 1 + Math.max(leftHeight,rightHeight);
        }
    }

    /**
     * 18.
     * Problem: Inorder Tree Traversal without Recursion
     *
     * Solution:
     * 1) Create an empty stack S.
     * 2) Initialize current node as root
     * 3) Push the current node to S and set current = current->left until current is NULL
     * 4) If current is NULL and stack is not empty then
     *      a) Pop the top item from stack.
     *      b) Print the popped item, set current = popped_item->right
     *      c) Go to step 3.
     * 5) If current is NULL and stack is empty then we are done.
     */

    /**
     * 19.
     * Problem: Inorder Tree Traversal without recursion and without stack!
     *
     * Solution: Use Morris Traversal.
     * 1. Initialize current as root
     * 2. While current is not NULL
     * If current does not have left child
     *      a) Print current’s data
     *      b) Go to the right, i.e., current = current->right
     * Else
     *      a) Make current as right child of the rightmost node in current's left subtree
     *      b) Go to this left child, i.e., current = current->left
     */

    /**
     * 20.
     * Problem: Root to leaf path sum equal to a given number
     */
    boolean existsPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        else if (isLeaf(root)) return sum == root.data;
        else return existsPathSum(root.left, sum - root.data) || existsPathSum(root.right, sum - root.data);
    }

    /**
     * 28.
     * Problem: Get Level of a node in a Binary Tree
     * Given a Binary Tree and a key, write a function that returns level of the key.
     * Solution: The idea is to start from the root and level as 1.
     * If the key matches with root’s data, return level. Else recursively call for left and right subtrees with level as level + 1.
     */
    int getLevel(TreeNode root, TreeNode node, int level) {
        if (root == null) return 0;
        else if (root == node) return level;
        else return getLevel(root.left, node, level + 1) + getLevel(root.right, node, level + 1);
    }






    /**
     * Page 12.
     * 29.
     * Problem: Print Ancestors of a given node in Binary Tree

     * Solution:
     */

    /**
     * 30.
     * Problem: Check if a given Binary Tree is SumTree

     * Solution:
     */


    /**
     * 31.
     * Problem: Check if a binary tree is subtree of another binary tree | Set 1

     * Solution:
     */



    /**
     * 32.
     * Problem: Connect nodes at same level

     * Solution:
     */



    /**
     * 33.
     * Problem: Connect nodes at same level using constant extra space

     * Solution:
     */
    /**
     * 34.
     * Problem: Populate Inorder Successor for all nodes

     * Solution:
     */



    /**
     * 35.
     * Problem: Convert a given tree to its Sum Tree

     * Solution:
     */


    /**
     * 36.
     * Problem: Vertical Sum in a given Binary Tree | Set 1

     * Solution:
     */


    /**
     * 37.
     * Problem: Find the maximum sum leaf to root path in a Binary Tree
     * Given a Binary Tree, find the maximum sum path from a leaf to root.
     * For example, in the following tree, there are three leaf to root paths 8->-2->10, -4->-2->10 and 7->10.
     * The sums of these three paths are 16, 4 and 17 respectively. The maximum of them is 17 and the path for maximum is 7->10.
     * Solution:
     */
    public  int maxRootToLeaOfPath(TreeNode root) {
        if (root == null) return 0;
        else return root.data + Math.max(maxRootToLeaOfPath(root.left), maxRootToLeaOfPath(root.right));

    }



    /**
     * 38.
     * Problem: Construct Special Binary Tree from given Inorder traversal

     * Solution:
     */


    /**
     * 39.
     * Problem: Construct a special tree from given preorder traversal

     * Solution:
     */


    /**
     * Page 11.
     * 40.
     * Problem: Check whether a given Binary Tree is Complete or not | Set 1 (Iterative Solution)

     * Solution:
     */


    /**
     * Page 10.
     * 41.
     * Problem: Boundary Traversal of binary tree

     * Solution:
     */
    public  void printLeaves(TreeNode root) {
        if (root == null) return;
        else if (isLeaf(root)) System.out.print(root.data + " ");
        else {
            printLeaves(root.left);
            printLeaves(root.right);
        }
    }

    public  void printLeftBoundry(TreeNode root) {
        if (root != null) {
            if (!isLeaf(root)) {
                System.out.print(root.data + " ");
                printLeftBoundry(root.left);
            }
            else printLeftBoundry(root.right);
        }
    }

    public  void printRightBounday(TreeNode root) {
        if (root != null) {
            if (!isLeaf(root)) {
                printRightBounday(root.right);
                System.out.print(root.data + " ");
            }
            else printRightBounday(root.left);
        }
    }
    public  void printBoundary(TreeNode root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            printLeftBoundry(root.left);
            printLeaves(root);
            printRightBounday(root.right);
        }
    }

    /**
     * 42.
     * Problem: Construct Full Binary Tree from given preorder and postorder traversals

     * Solution:
     */


    /**
     * 43.
     * Problem: Iterative Preorder Traversal

     * Solution:
     */


    /**
     * 44.
     * Problem: Morris traversal for Preorder

     * Solution:
     */


    /**
     * 45.
     * Problem: Linked complete binary tree & its creation

     * Solution:
     */


    /**
     * 46.
     * Problem: Iterative Postorder Traversal | Set 2 (Using One Stack)

     * Solution:
     */


    /**
     * 47.
     * Problem: Reverse Level Order Traversal

     * Solution:
     */
    public  void printReverseLevel(TreeNode root) {
        for (int i = height(root); i >=0; i--) printReverseLevel(root, i);
    }
    public  void printReverseLevel(TreeNode root, int level) {
        if (level == 0) System.out.print(root.data);
        else {
            printReverseLevel(root.left, level - 1);
            printReverseLevel(root.right, level - 1);
        }

    }


    /**
     * 48.
     * Problem: Construct Complete Binary Tree from its Linked List Representation

     * Solution:
     */

    /**
     * 49.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 1

     * Solution:
     */


    /**
     * Page 10
     * 50.
     * Problem: Tree Isomorphism Problem

     * Solution:
     */


    /**
     * Page 9.
     * 51.
     * Problem: Iterative Method to find Height of Binary Tree

     * Solution:
     */


    /**
     * 52.
     * Problem: Custom Tree Problem

     * Solution:
     */


    /**
     * 53.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 2
     * Solution:
     */


    /**
     * 54.
     * Problem: Difference between sums of odd level and even level nodes of a Binary Tree

     * Solution:
     */


    /**
     * 55.
     * Problem: Print Postorder traversal from given Inorder and Preorder traversals

     * Solution:
     */

    /**
     * 56.
     * Problem: Find depth of the deepest odd level leaf node

     * Solution:
     */


    /**
     * 57.
     * Problem: Check if all leaves are at same level

     * Solution:
     */


    /**
     * 58.
     * Problem: Print Left View of a Binary Tree

     * Solution:
     */


    /**
     * 59.
     * Problem: Remove all nodes which don’t lie in any path with sum>= k

     * Solution:
     */


    /**
     * 60.
     * Problem: Extract Leaves of a Binary Tree in a Doubly Linked List

     * Solution:
     */


    /**
     * Page 9.
     * 61.
     * Problem: Deepest left leaf node in a binary tree

     * Solution:
     */


    /**
     * Page 8.
     *  62.
     * Problem: Find next right node of a given key

     * Solution:
     */

    /**
     * 63.
     * Problem: Sum of all the numbers that are formed from root to leaf paths

     * Solution:
     */


    /**
     * 64.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 3

     * Solution:
     */


    /**
     * 65.
     * Problem: Print all nodes that don’t have sibling

     * Solution:
     */


    /**
     * 66.
     * Problem: Lowest Common Ancestor in a Binary Tree | Set 1

     * Solution:
     */


    /**
     * 67.
     * Problem: Find distance between two given keys of a Binary Tree

     * Solution:
     */


    /**
     * 68.
     * Problem: Print all nodes that are at distance k from a leaf node

     * Solution:
     */

    /**
     * 69.
     * Problem: Check if a given Binary Tree is height balanced like a Red-Black Tree

     * Solution:
     */

    /**
     * 70.
     * Problem: Print a Binary Tree in Vertical Order | Set 1

     * Solution:
     */

    /**
     * 71.
     * Problem: Print all nodes at distance k from a given node

     * Solution:
     */

    /**
     * 72.
     * Problem: Construct a tree from Inorder and Level order traversals

     * Solution:
     */

    /**
     * Page 7.
     * 73.
     * Problem: Print Right View of a Binary Tree

     * Solution:
     */

    /**
     * 74.
     * Problem: Print a Binary Tree in Vertical Order | Set 2 (Hashmap based Method)
     * Solution:
     */

    /**
     * 75.
     * Problem: Reverse alternate levels of a perfect binary tree

     * Solution:
     */

    /**
     * 76.
     * Problem: Find the maximum path sum between two leaves of a binary tree

     * Solution:
     */

    /**
     * 77.
     * Problem: Check if a binary tree is subtree of another binary tree | Set 2

     * Solution:
     */

    /**
     * 78.
     * Problem: Check if two nodes are cousins in a Binary Tree

     * Solution:
     */

    /**
     * Page 7.
     *  79.
     * Problem: Minimum no. of iterations to pass information to all nodes in the tree

     * Solution:
     */

    /**
     * Page 7.
     * 80.
     * Problem: Find Height of Binary Tree represented by Parent array

     * Solution:
     */

    /**
     * Page 7.
     * 81.
     * Problem: Print nodes between two given level numbers of a binary tree

     * Solution:
     */

    /**
     * Page 7.
     * 82.
     * Problem: Serialize and Deserialize a Binary Tree

     * Solution:
     */

    /**
     * Page 7.
     * 83.
     * Problem: Serialize and Deserialize an N-ary Tree

     * Solution:
     */

    /**
     * Page 6.
     * 84.
     * Problem: Convert a Binary Tree to Threaded binary tree

     * Solution:
     */

    /**
     * Page 6.
     * 85.
     * Problem: Print Nodes in Top View of Binary Tree
     * Top view of a binary tree is the set of nodes visible when the tree is viewed from the top.
     * Given a binary tree, print the top view of it. The output nodes can be printed in any order.
     * Expected time complexity is O(n)

     * Solution: Use HasSet, BFS, and mark the position.
     */

    public  void printTopView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        Set<Integer> set = new HashSet<Integer>();
        HashMap<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        map.put(root, 0);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int position = map.get(curr);
            if (set.add(position)) System.out.print(curr.data + " ");
            if (curr.left != null) {
                queue.add(curr.left);
                map.put(curr.left, map.get(curr) - 1);
            }
            if (curr.right != null) {
                queue.add(curr.right);
                map.put(curr.right, map.get(curr) + 1);
            }
        }
    }


    /**
     * Page 6.
     * 86.
     * Problem: Perfect Binary Tree Specific Level Order Traversal

     * Solution:
     */

    /**
     * Page 6.
     * 87.
     * Problem: Bottom View of a Binary Tree

     * Solution: Use BFS and  TreeMap to store pos - > Node and replace every pos with new Node
     */
    public  void bottomView(TreeNode root) {
        if (root == null) return;
        TreeMap<Integer, TreeNode> resultMap = new TreeMap<Integer, TreeNode>();
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        map.put(root, 0);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int position = map.get(curr);
            resultMap.put(position, curr);
            if (curr.left != null) {
                queue.add(curr.left);
                map.put(curr.left, map.get(curr) - 1);
            }
            if (curr.right != null) {
                queue.add(curr.right);
                map.put(curr.right, map.get(curr) + 1);
            }
        }
        for (int key : resultMap.keySet()) System.out.print(resultMap.get(key).data + " ");

    }

    /**
     * Page 6.
     * 88.
     * Problem: Diagonal Sum of a Binary Tree

     * Solution:
     */



    /**
     * Page 6.
     * 89.
     * Problem: Find the closest leaf in a Binary Tree

     * Solution:
     */

    /**
     * Page 6.
     * 90.
     * Problem: Remove nodes on root to leaf paths of length < K

     * Solution:
     */

    /**
     * Page 6.
     * 91.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 3

     * Solution:
     */
     TreeNode head1 = null;
    public  void convertDLL(TreeNode root) {
        if (root == null) return;
        else {
            convertDLL(root.right);
            root.right = head1;
            if (head1 != null) {
                head1.left = root;
            }
            head1 = root;
            convertDLL(root.left);
        }
    }


    /**
     * Page 6.
     * 92.
     * Problem: Find sum of all left leaves in a given Binary Tree
     * Solution: The idea is to traverse the tree return sum of all left leaves.
     */
    public  int sumOfLeftLeaves(TreeNode root, boolean isLeftLeaf) {
        if (root == null) return 0;
        else if (isLeaf(root) && isLeftLeaf) return root.data;
        else return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }

    public  boolean isLeft(TreeNode parent, TreeNode node) {
        if (parent == null) return false;
        else return parent.left == node;
    }

    public  int sumOfLeftLeaves2(TreeNode root, TreeNode parent) {
        if (root == null) return 0;
        else if (isLeaf(root) && parent.left == root) return root.data;
        else return sumOfLeftLeaves2(root.left, root) + sumOfLeftLeaves2(root.right, root);

    }



    /**
     * Page 6.
     * 93.
     * Problem: Check whether a binary tree is a full binary tree or not

     * Solution:
     */


    /**
     * Page 6.
     * 94.
     * Problem: Check whether a binary tree is a complete tree or not | Set 2 (Recursive Solution)

     * Solution:
     */

    /**
     * Page 6.
     * 95. Problem: Given a binary tree, how do you remove all the half nodes?

     * Solution:
     */

    /**
     * Page 5.
     * 96. Problem: Handshaking Lemma and Interesting Tree Properties
     * Solution:
     */



    /**
     * 97
     * Problem: Expression Tree

     * Solution:
     */

    /**
     * 98
     * Problem: Maximum Path Sum in a Binary Tree

     * Solution:
     */

    /**
     * 99
     * Problem: Find Minimum Depth of a Binary Tree

     * Solution:
     */

    /**
     * 100
     * Problem: Symmetric Tree (Mirror Image of itself)

     * Solution:
     */




    /**
     * 101.
     * Problem: Construct Binary Tree from given Parent Array representation

     * Solution:
     */

    /**
     * 102.
     * Problem: Succinct Encoding of Binary Tree

     * Solution:
     */

    /**
     * 103
     * Problem: Mirror of n-ary Tree

     * Solution:
     */

    /**
     * 104.
     * Problem: Check if a given array can represent Preorder Traversal of Binary Search Tree

     * Solution:
     */


    /**
     * 105
     * Problem: Find Count of Single Valued Subtrees

     * Solution:
     */

    /**
     * 106
     * Problem: Find multiplication of sums of data of leaves at same levels

     * Solution:
     */

    /**
     * 107
     * Problem: Find LCA in Binary Tree using RMQ

     * Solution:
     */

    /**
     * 108
     * Problem: Find all possible binary trees with given Inorder Traversal

     * Solution:
     */



    /**
     * 109.
     * Problem: Locking and Unlocking of Resources arranged in the form of n-ary Tree

     * Solution:
     */

    /**
     * 110.
     * Problem: Closest leaf to a given node in Binary Tree

     * Solution:
     */

    /**
     * 111.
     * Problem: Check if leaf traversal of two Binary Trees is same?

     * Solution:
     */

    /**
     * 112.
     * Problem: Inorder Non-threaded Binary Tree Traversal without Recursion or Stack

     * Solution:
     */





























    /**
     * 69. Check if all leaves are at same level.
     */

    /**
     * 112. Expression Tree.
     * Expression tree is a binary tree in which each internal node corresponds to operator and each leaf node
     * corresponds to operand.
     *
     * Solution:
     * If  t is not null then
     *      If t.value is operand then
     *          Return  t.value
     *      A = solve(t.left)
     *      B = solve(t.right)
     *
     *      calculate applies operator 't.value' on A and B, and returns value.
     *      Return calculate(A, B, t.value)
     */

    /**
     * 113.
     * Problem: Maximum difference between node and its ancestor in Binary Tree
     * Given a binary tree, we need to find maximum value we can get by subtracting value of node B from value of node A,
     * where A and B are two nodes of the binary tree and A is an ancestor of B. Expected time complexity is O(n).
     */
    int findAmplitude(TreeNode root, ArrayList<Integer> path) {
        if (isLeaf(root)) {
            path.add(root.data);
            return Collections.max(path) - Collections.min(path);
        } else {
            ArrayList<Integer> newPath = new ArrayList<Integer>();
            newPath.addAll(path);
            newPath.add(root.data);
            return Math.max(findAmplitude(root.left, newPath), findAmplitude(root.right, newPath));
        }
    }

    /**
     * 114. Change a Binary Tree so that every node stores sum of all nodes in left subtree.
     */
    int updateTree(TreeNode root) {
        if (root == null) return 0;
        else if (isLeaf(root)) return root.data;
        else {
            int leftSum  = updateTree(root.left);
            int rightSum = updateTree(root.right);
            root.data += leftSum;
            return root.data + rightSum;
        }
    }

    /**
     * 115. Iterative Search for a key ‘x’ in Binary Tree
     *
     * Solution: Use any traversal.
     */

    /**
     * 116. Find maximum (or minimum) in Binary Tree.
     */
    int findMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        else return Math.max(Math.max(root.data,findMax(root.left)),findMax(root.right));
    }

    /**
     * Page 2.
     * 142. Problem: Print cousins of a given node in Binary Tree
     *
     * Solution: Get the level and stop at penultimate level and check if the either child node is not equal to
     * given node.
     */
    void printCousins(TreeNode root, TreeNode node) {
        if (root != null) {
            int level = getLevel(root, node, 1);
            printCousinsNodes(root, node, level);
        }
    }

    void printCousinsNodes(TreeNode root, TreeNode node, int level) {
        if (root != null && level > 1) {
            if (level == 2 && isValidParent(root, node)) {
               if (root.right != null) System.out.print(root.right.data + " ");
               else if (root.left != null) System.out.print(root.left.data + " ");
            }
        } else {
            printCousinsNodes(root.left, node, level - 1);
            printCousinsNodes(root.right, node, level - 1);
        }
    }

    private boolean isValidParent(TreeNode parent, TreeNode node) {
        if (parent.left == null && parent.right == null) return false;
        else if (parent.left != null && parent.right != null) return parent.left != node && parent.right != node;
        else if (parent.right != null) return parent.right != node;
        else return parent.left != node;
    }

    /**
     * Page 1.
     * 143. Problem: Print extreme nodes of each level of Binary Tree in alternate order
     */
    void printExtremeNodesAlt(TreeNode root) {
        for (int i = 0; i < height(root); i++) printLevelSpiral(root, i, i % 2 == 0);
    }

    boolean printLevelSpiral(TreeNode root, int level, boolean flag) {
        if (root == null) return true;
        else if (level == 0) {
            System.out.print(root.data + " ");
            return true;
        }
        else if (flag) {
            if (printLevelSpiral(root.left, level - 1, flag)) return true;
            else if (printLevelSpiral(root.right, level - 1, flag)) return true;
            else return false;
        }
        else {
            if (printLevelSpiral(root.right, level - 1, flag)) return true;
            else if (printLevelSpiral(root.left, level - 1, flag)) return true;
            else return false;
        }
    }

    /**
     * Page 1.
     * 145. Problem: Find a number in minimum steps.
     * Given an infinite number line from -INFINITY to +INFINITY and we are on zero. We can move n steps either
     * side at each n’th time.
     */
    int minSteps(int source, int dest, int steps) {
        if (Math.abs(source) > dest) return Integer.MAX_VALUE;
        else if (source == dest) return steps;
        else return Math.min(minSteps(source - steps - 1, dest, steps + 1),
                    minSteps(source + steps + 1, dest, steps + 1));
    }

    /**
     * Page 1.
     * 146. Problem: Find height of a special binary tree whose leaf nodes are connected
     * Given a special binary tree whose leaf nodes are connected to form a circular doubly linked list,
     * find its height.
     *
     * Solution: Node is leaf if (node.left.right = node && node.right.left == node)
     */
    int maxDepth(TreeNode node) {
        if (node == null) return 0;
        else if (isLeafModified(node)) return 1;
        else return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }

    boolean isLeafModified(TreeNode node) {
        return node.left != null && node.right != null && node.left.right == node && node.right.left == node;
    }

    /**
     * Page 1.
     * 147. Problem: Convert a Binary Tree to a Circular Doubly Link List
     * Given a Binary Tree, convert it to a Circular Doubly Linked List (In-Place).
     */
    TreeNode head = null;
    TreeNode prev = null;
    void convertToCDLL(TreeNode root) {
        if (root == null) return;
        convertToCDLL(root.left);
        if (head == null) head = root;
        else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertToCDLL(root.right);
    }

    void convertToCircularDLL(TreeNode root) {
        convertToCDLL(root);
        head.left = prev;
        prev.right = head;
    }

    /**
     * Page 1.
     * 151. Problem: Longest consecutive sequence in Binary tree
     * Given a Binary Tree find the length of the longest path which comprises of nodes with consecutive values
     * in increasing order. Every node is considered as a path of length 1.
     */
    int findLCP(TreeNode root, int parent, int pathLength, int maxLength) {
        if (root == null) return maxLength;
        else {
            if (root.data == parent + 1) pathLength++;
            else pathLength = 1;
            maxLength = Math.max(pathLength, maxLength);
            return Math.max(findLCP(root.left, root.data, pathLength, maxLength),
                    findLCP(root.right, root.data, pathLength, maxLength));
        }
    }

    /**
     * Page 1.
     * 153. Problem: Check if there is a root to leaf path with given sequence
     * Given a binary tree and an array, the task is to find if the given array sequence is present as a root to
     * leaf path in given tree.
     */
    boolean existsPath(TreeNode root, int[] array, int start) {
        if (root == null) return start == array.length;
        else return compareNodes(root, array, start) &&
                existsPath(root.left, array, start + 1) ||
                existsPath(root.right, array, start + 1);
    }

    boolean compareNodes(TreeNode root, int[] array, int index) {
        if (index >= array.length) return false;
        else return root.data == array[index];
    }


}
