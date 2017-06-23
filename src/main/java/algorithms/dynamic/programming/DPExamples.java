package algorithms.dynamic.programming;

import java.util.Arrays;

class DPExamples {

  /**
   * GeeksForGeeks Problems
   */

  /**
   * 1.
   * Problem: Largest Sum Contiguous Subarray.
   * Write an efficient C program to find the sum of contiguous sub array within a one-dimensional array of numbers
   * which has the largest sum.
   * Solution: Kadane’s Algorithm:
   * Initialize:
   * maxSoFar = 0, currMax = 0;
   * for each element
   * currMax = currMax + arr[i]
   * if (currMax < 0) currMax = 0;
   * if (maxSoFar < currMax) maxSoFar = currMax
   * return maxSoFar
   */
  int maxContinousSubArray(int[] array) {
    int maxSoFar = array[0], currMax = array[0];
    for (int i = 1; i < array.length; i++) {
      currMax = Math.max(array[i], currMax + array[i]);
      maxSoFar = Math.max(maxSoFar, currMax);
    }
    return maxSoFar;
  }

  /**
  * To print the subarray with the maximum sum, we maintain indices
  * whenever we get the maximum sum.
  */
  int printContinousSubArray(int[] array) {
    int maxSoFar = array[0], currMax = array[0], start = 0, end = 0, currStart = 0;
    for (int i = 1; i < array.length; i++) {
      if (currMax + array[i] < array[i]) {
        currStart = i;
        currMax = Math.max(currMax + array[i], array[i]);
      }
      if (maxSoFar < currMax) {
        maxSoFar = currMax;
        start = currStart;
        end = i;
      }
      printArray(array, start, end);
    }
    return maxSoFar;
  }

  private void printArray(int[] array, int start, int end) {
    for (int j = start; j <= end; j++) {
      System.out.println(array[j]);
    }
  }

  /**
   * 2.
   * Problem: Ugly Numbers
   * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
   * shows the first 11 ugly numbers. By convention, 1 is included.
   * Given a number n, the task is to find n’th Ugly number.
   * Input  : n = 7
   * Output : 8
   * Input  : n = 10
   * Output : 12
   * Input  : n = 15
   * Output : 24
   * Input  : n = 150
   * Output : 5832
   * Solution:
   */

  /**
   * 3.
   * Problem: Maximum size square sub-matrix with all 1s
   * Given a binary matrix, find out the maximum size square sub-matrix with all 1s.
   * Solution:
   */
   int[][] maxSizeSquareMat(int[][] mat, int[][] dp) {
     for (int i = 0; i < mat.length; i++){
       for (int j = 0; j < mat[0].length; j++) {
         if (i == 0 || j == 0) dp[i][j] = mat[i][j];
         else if (mat[i][j] == 0) dp[i][j] = 0;
         else dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
       }
     }
     return dp;
   }

  /**
   * 4.
   * Problem: Program for Fibonacci numbers
   * The Fibonacci numbers are the numbers in the following integer sequence.
   * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
   * Solution:
   */
   int fibonacci(int n) {
     if (n == 0 || n == 1) return n;
     else return fibonacci(n - 1) + fibonacci(n - 2);
   }

   int fibonnaciDP(int n) {
     int[] dp = new int[n + 1];
     for (int i = 0; i < dp.length; i++) {
       if (i == 0 || i == 1) dp[i] = i;
       else dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
   }

  /**
   *  Space Optimized Method
   *  We can optimize the space used in above method by storing the previous two numbers
   *  only because that is all we need to get the next Fibonacci number in series.
   */
   int fibonnaciSpaceOpt(int n, int first, int second, int sumOfLastTerms) {
     if (n == 0) return first;
     else if (n == 1) return second;
     else return fibonnaciSpaceOpt(n - 1, second, sumOfLastTerms,  first + second);
   }

  /**
   * 5.
   * Problem: Dynamic Programming | Set 1 (Overlapping Subproblems Property)
   * Solution:
   * 1) Overlapping Subproblems:
   * Like Divide and Conquer, Dynamic Programming combines solutions to sub-problems.
   * Dynamic Programming is mainly used when solutions of same subproblems are needed
   * again and again.In dynamic programming, computed solutions to subproblems are
   * stored in a table so that these don’t have to recomputed. So Dynamic Programming
   * is not useful when there are no common (overlapping) subproblems because there is
   * no point storing the solutions if they are not needed again. For example, Binary
   * Search doesn’t have common subproblems. If we take example of following recursive
   * program for Fibonacci Numbers, there are many subproblems which are solved again
   * and again.
   *  There are following two different ways to store the values so that these values
   *  can be reused:
   *  a) Memoization (Top Down)
   *  b) Tabulation (Bottom Up)

   */

  /**
   * 6.
   * Problem: Dynamic Programming | Set 2 (Optimal Substructure Property)
   * Solution:
   *
   * 2) Optimal Substructure: A given problems has Optimal Substructure Property if
   * optimal solution of the given problem can be obtained by using optimal solutions
   * of its subproblems.
   */

  /**
   * 7.
   * Problem: Dynamic Programming | Set 3 (Longest Increasing Subsequence)
   * Input  : arr[] = {3, 10, 2, 1, 20}
   * Output : Length of LIS = 3
   * The longest increasing subsequence is 3, 10, 20
   * Solution:Then, L(i) can be recursively written as:
   * L(i) = 1 + max( L(j) ) where 0 < j < i and arr[j] < arr[i]; or
   * L(i) = 1, if no such j exists.
   */
  int findLISBottomUp(int[] array) {
    int[] dp = new int[array.length];
    Arrays.fill(dp, 1);
    for (int i = 1; i < dp.length; i++) {
      for (int j = 0; j < i; j++) {
        if (array[i] > array[j] && dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
      }
    }
    int max = 0;
    for (int i = 0; i < dp.length; i++) max = Math.max(max, dp[i]);
    return max;
  }

  /**
   * 8.
   * Problem: Dynamic Programming | Set 4 (Longest Common Subsequence)
   * Given two sequences, find the length of longest subsequence present in both of
   * them. A subsequence is a sequence that appears in the same relative order, but
   * not necessarily contiguous.
   * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
   * Solution: Recursive Complexity = O(2^n).
   */
  int LIS(String str1, String str2, int str1Len, int str2Len) {
    if (str1Len == 0 || str2Len == 0) return 0;
    else if (str1.charAt(str1Len - 1) == str2.charAt(str2Len - 1))
      return 1 + LIS(str1, str2, str1Len - 1 , str2Len - 1);
    else
      return Math.max(LIS(str1, str2, str1Len - 1, str2Len), LIS(str1, str2, str1Len, str2Len - 1));
  }

  int LISBottomUp(String str1, String str2) {
    int[][] dp = new int[str1.length() + 1][str2.length() + 1];
    for (int str1Len = 0; str1Len <= str1.length(); str1Len++) {
      for (int str2Len= 0; str2Len <= str2.length(); str2Len++) {
        if (str1Len == 0 || str2Len == 0 ) dp[str1Len][str2Len] = 0;
        else if (str1.charAt(str1Len - 1) == str2.charAt(str2Len - 1)) dp[str1Len][str2Len] = 1 + dp[str1Len - 1][str2Len - 1];
        else dp[str1Len][str2Len] = Math.max(dp[str1Len][str2Len - 1], dp[str1Len - 1][str2Len]);
      }
    }
    return dp[str1.length()][str2.length()];
  }

  /**
   * 9.
   * Problem: Dynamic Programming | Set 5 (Edit Distance)
   * Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to
   * convert ‘str1’ into ‘str2’.
   * Insert
   * Remove
   * Replace
   * Solution:
   */
  int editDistance(String str1, String str2, int str1Len, int str2Len) {
    if (str1Len == 0) return str2Len;
    else if (str2Len == 0) return str1Len;
    else if (str1.charAt(str1Len - 1) == str2.charAt(str2Len - 1)) return editDistance(str1, str2, str1Len - 1,
            str2Len - 1);
    else return 1 + Math.min(editDistance(str1, str2, str1Len, str2Len - 1), Math.min(editDistance(str1, str2,
              str1Len - 1, str2Len), editDistance(str1, str2, str1Len - 1, str2Len - 1)));
  }



  /**
   * 10.
   * Problem: Dynamic Programming | Set 6 (Min Cost Path)
   * Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that returns cost of minimum cost path to reach (m, n)
   * from (0, 0).
   * Solution:
   */
  int minCost(int[][] mat, int i, int j) {
    if (i < 0 || j > 0) return Integer.MAX_VALUE;
    if (i == 0 && j == 0) return mat[i][j];
    else return mat[i][j] + Math.min(minCost(mat, i - 1, j), Math.min(minCost(mat, i, j - 1), minCost(mat, i - 1,
            j - 1)));
  }

  int minCostBotUP(int[][] mat) {
    int[][] dp = new int[mat.length][mat[0].length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (i == 0 && j == 0) dp[i][j] = mat[0][0];
        else if (i == 0) dp[i][j] = dp[i - 1][j] + mat[i][j];
        else if (j == 0) dp[i][j] = dp[i][j - 1] + mat[i][j];
        else dp[i][j] = mat[i][j] + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
      }
    }
    return dp[mat.length][mat[0].length];
  }

  /**
   * 11.
   * Problem: Length of the longest substring without repeating characters
   * Given a string, find the length of the longest substring without repeating characters. For example, the longest
   * substrings without repeating characters for “ABDEFGABEF” are “BDEFGA” and “DEFGAB”, with length 6.
   * For “BBBB” the longest substring is “B”, with length 1.
   * Solution:
   * Method 1 (Simple)
   * We can consider all substrings one by one and check for each substring whether it contains all unique characters or not.
   * There will be n*(n+1)/2 substrings. Whether a substirng contains all unique characters or not can be checked in
   * linear time by scanning it from left to right and keeping a map of visited characters. Time complexity of this
   * solution would be O(n^3).
   *
   *
   */


  /**
   * 12.
   * Problem: Minimum number of jumps to reach end
   * Solution:
   */

  /**
   * 13.
   * Problem: Dynamic Programming | Set 7 (Coin Change)
   * iven a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm}
   * valued coins, how many ways can we make the change? The order of coins doesn’t matter.
   * For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.
   * Solution:
   */
  int coinChange(int coins[], int numOfCoins, int sum) {
    if (sum == 0) return 1;
    else if (sum < 0) return 0;
    else if (numOfCoins <= 0 && sum > 0) return 0;
    else return coinChange(coins, numOfCoins, sum - coins[numOfCoins - 1]) +
              coinChange(coins, numOfCoins - 1, sum);
  }


  /**
   * 14.
   * Problem: Dynamic Programming | Set 8 (Matrix Chain Multiplication)
   * Solution:
   */

  /**
   * 15.
   * Problem: Dynamic Programming | Set 9 (Binomial Coefficient)
   * Solution:
   */


  /**
   * 16.
   * Problem: Dynamic Programming | Set 10 ( 0-1 Knapsack Problem)
   * Solution:
   */

  /**
   * 17.
   * Problem: Dynamic Programming | Set 11 (Egg Dropping Puzzle)
   * Solution:
   */


  /**
   * 18.
   * Problem: Dynamic Programming | Set 12 (Longest Palindromic Subsequence)
   * Solution:
   */

  /**
   * 19.
   * Problem: Dynamic Programming | Set 13 (Cutting a Rod)
   * Solution:
   */

  /**
   * 20.
   * Problem: Dynamic Programming | Set 14 (Maximum Sum Increasing Subsequence)
   * Solution:
   */

  /**
   * 21.
   * Problem: Dynamic Programming | Set 15 (Longest Bitonic Subsequence)
   * Solution:
   */

  /**
   * 22.
   * Problem: Dynamic Programming | Set 16 (Floyd Warshall Algorithm)
   * Solution:
   */

  /**
   * 23.
   * Problem: Dynamic Programming | Set 17 (Palindrome Partitioning)
   * Solution:
   */

  /**
   * 24.
   * Problem: Dynamic Programming | Set 18 (Partition problem)
   * Solution:
   */

  /**
   * 25.
   * Problem: Dynamic Programming | Set 19 (Word Wrap Problem)
   * Solution:
   */


  /**
   * 26.
   * Problem: Dynamic Programming | Set 20 (Maximum Length Chain of Pairs)
   * Solution:
   */

  /**
   * 27.
   * Problem: Dynamic Programming | Set 21 (Variations of LIS)
   * Solution:
   */

  /**
   * 28.
   * Problem: Dynamic Programming | Set 22 (Box Stacking Problem)
   * Solution:
   */

  /**
   * 29.
   * Problem: Longest Palindromic Substring | Set 1
   * Solution:
   */

  /**
   * 30.
   * Problem: Dynamic Programming | Set 23 (Bellman–Ford Algorithm)
   * Solution:
   */

  /**
   * 31.
   * Problem: Dynamic Programming | Set 24 (Optimal Binary Search Tree)
   * Solution:
   */
  /**
   * 32.
   * Problem: Dynamic Programming | Set 25 (Subset Sum Problem)
   * Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
   * Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
   * Output:  True  //There is a subset (4, 5) with sum 9.
   * Solution:
   */
  boolean isSubsetSum(int[] set, int setLen, int sum) {
    if (sum == 0) return true;
    else if (setLen == 0 && sum > 0) return false;
    else if (sum < set[setLen - 1]) return isSubsetSum(set, setLen - 1, sum);
    else return isSubsetSum(set,setLen - 1, sum - set[setLen - 1]) ||
              isSubsetSum(set, setLen - 1, sum);
  }

  /**
   * 33.
   * Problem: Dynamic Programming | Set 26 (Largest Independent Set Problem)
   * Solution:
   */

  /**
   * 34.
   * Problem: Dynamic Programming | Set 27 (Maximum sum rectangle in a 2D matrix)
   * Given a 2D array, find the maximum sum subarray in it. For example, in the following 2D array, the maximum sum
   * subarray is highlighted with blue rectangle and sum of this subarray is 29
   * Solution:
   * Kadane’s algorithm for 1D array can be used to reduce the time complexity to O(n^3). The idea is to fix the left
   * and right columns one by one and find the maximum sum contiguous rows for every left and right column pair.
   * We basically find top and bottom row numbers (which have maximum sum) for every fixed left and right column pair.
   * To find the top and bottom row numbers, calculate sun of elements in every row from left to right and store these
   * sums in an array say temp[]. So temp[i] indicates sum of elements from left to right in row i. If we apply Kadane’s
   * 1D algorithm on temp[], and get the maximum sum subarray of temp, this maximum sum would be the maximum possible
   * sum with left and right as boundary columns. To get the overall maximum sum, we compare this sum with the maximum
   * sum so far.
   */

  /**
   * 35.
   * Problem: Dynamic Programming | Set 28 (Minimum insertions to form a palindrome)
   * Given a string, find the minimum number of characters to be inserted to convert it to palindrome.
   * Before we go further, let us understand with few examples:
   * ab: Number of insertions required is 1. bab
   * aa: Number of insertions required is 0. aa
   * abcd: Number of insertions required is 3. dcbabcd
   * abcda: Number of insertions required is 2. adcbcda which is same as number of insertions in the substring bcd(Why?).
   * abcde: Number of insertions required is 4. edcbabcde
   * Solution:
   * Let the input string be str[l……h]. The problem can be broken down into three parts:
   * 1. Find the minimum number of insertions in the substring str[l+1,…….h].
   * 2. Find the minimum number of insertions in the substring str[l…….h-1].
   * 3. Find the minimum number of insertions in the substring str[l+1……h-1].
   * Recursive Solution
   * The minimum number of insertions in the string str[l…..h] can be given as:
   * minInsertions(str[l+1…..h-1]) if str[l] is equal to str[h]
   * min(minInsertions(str[l…..h-1]), minInsertions(str[l+1…..h])) + 1 otherwise
   */
  int minInsertion(String str, int left, int right) {
    if (left > right) return Integer.MAX_VALUE;
    else if (left == right) return 0;
    else if (left + 1 == right) return (str.charAt(left) == str.charAt(right)) ? 0 : 1;
    else if (str.charAt(left) == str.charAt(right)) return minInsertion(str, left + 1, right - 1);
    else return 1 + Math.min(minInsertion(str, left + 1, right), minInsertion(str, left, right - 1));
  }
  /**
   * 36.
   * Problem: Dynamic Programming | Set 29 (Longest Common Substring)
   * Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.
   * Input : X = "GeeksforGeeks", y = "GeeksQuiz"
   * Output : 5
   * The longest common substring is "Geeks" and is of length 5.
   * Input : X = "abcdxyz", y = "xyzabcd"
   * Output : 4
   * The longest common substring is "abcd" and is of length 4.
   * Solution:
   */



  /**
   * 37.
   * Problem: Dynamic Programming | Set 30 (Dice Throw)
   * Given n dice each with m faces, numbered from 1 to m, find the number of ways to get sum X. X is the summation of
   * values on each face when all the dice are thrown.
   * Solution:
   */
  int findWays(int dices, int faces, int sum, int totalWays) {
    if (sum < 1) return 0;
    else if (dices == 1) return sum <= faces ? 1 : 0;
    else {
      for (int i = 1; i <= faces; i++) totalWays += findWays(dices - 1, faces, sum - i, 0);
      return totalWays;
    }
  }


  /**
   * 38.
   * Problem: Dynamic Programming | Set 31 (Optimal Strategy for a Game)
   * Solution:
   */


  /**
   * 39.
   * Problem: Dynamic Programming | Set 32 (Word Break Problem)
   * Solution:
   */

  /**
   * 40.
   * Problem: Dynamic Programming | Set 33 (Find if a string is interleaved of two other strings)
   * Solution:
   */


  /**
   * 41.
   * Problem: Dynamic Programming | Set 34 (Assembly Line Scheduling)
   * Solution:
   */


  /**
   * 42.
   * Problem: Dynamic Programming | Set 35 (Longest Arithmetic Progression)
   * Solution:
   */

  /**
   * 43.
   * Problem: Dynamic Programming | Set 36 (Maximum Product Cutting)
   * Solution:
   */

  /**
   * 44.
   * Problem: Travelling Salesman Problem | Set 1 (Naive and Dynamic Programming)
   * Solution:
   */

  /**
   * 45.
   * Problem: Count all possible paths from top left to bottom right of a mXn matrix
   * The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints
   * that from each cell you can either move only to right or down
   * Solution:
   */
  int countPaths(int x, int y) {
    if (x == 1 || y == 1) return 1;
    else return 1 + countPaths(x - 1, y) + countPaths(x, y - 1);
  }


  /**
   * 46.
   * Problem: Remove minimum elements from either side such that 2*min becomes more than max
   * Solution:
   */



  /**
   * 47.
   * Problem: Program for nth Catalan Number
   * Solution:
   */

  /**
   * 48.
   * Problem: Dynamic Programming | Set 37 (Boolean Parenthesization Problem)
   * Solution:
   */

  /**
   * 49.
   * Problem: Count number of binary strings without consecutive 1’s
   * Solution:
   */

  /**
   * 50.
   * Problem: Count Possible Decodings of a given Digit Sequence
   * Solution:
   */

  /**
   * 51.
   * Problem: Count all possible walks from a source to a destination with exactly k edges
   * Solution:
   */


  /**
   * 52.
   * Problem: Shortest path with exactly k edges in a directed and weighted graph
   * Solution:
   */

  /**
   * 53.
   * Problem: Mobile Numeric Keypad Problem
   * Solution:
   */

  /**
   * 54.
   * Problem: Minimum Cost Polygon Triangulation
   * Solution:
   */

  /**
   * 55.
   * Problem: Longest Even Length Substring such that Sum of First and Second Half is same
   * Solution:
   */

  /**
   * 56.
   * Problem: Weighted Job Scheduling
   * Solution:
   */


  /**
   * 57.
   * Problem: Count number of ways to reach a given score in a game
   * Solution:
   */

  /**
   * 58.
   * Problem: Vertex Cover Problem | Set 2 (Dynamic Programming Solution for Tree)
   * Solution:
   */

  /**
   * 59.
   * Problem: Find the minimum cost to reach destination using a train
   * Solution:
   */

  /**
   * 60.
   * Problem: How to print maximum number of A’s using given four keys
   * Solution:
   */

  /**
   * 61.
   * Problem: Maximum profit by buying and selling a share at most twice
   * Solution:
   */


  /**
   * 62.
   * Problem: Count possible ways to construct buildings
   * Solution:
   */

  /**
   * 63.
   * Problem: Compute sum of digits in all numbers from 1 to n
   * Solution:
   */

  /**
   * 64.
   * Problem: Shortest Common Supersequence
   * Solution:
   */

  /**
   * 65.
   * Problem: Collect maximum points in a grid using two traversals
   * Solution:
   */

  /**
   * 66.
   * Problem: Find minimum number of coins that make a given value
   * Solution:
   */


  /**
   * 67.
   * Problem: Minimum number of squares whose sum equals to given number n
   * Solution:
   */

  /**
   * 68.
   * Problem: Tiling Problem
   * Solution:
   */

  /**
   * 69.
   * Problem: Find length of the longest consecutive path from a given starting character
   * Solution:
   */

  /**
   * 70.
   * Problem: Total number of non-decreasing numbers with n digits
   * Solution:
   */

  /**
   * 71.
   * Problem: Minimum Initial Points to Reach Destination
   * Solution:
   */


  /**
   * 72.
   * Problem: Count of n digit numbers whose sum of digits equals to given sum
   * Solution:
   */

  /**
   * 73.
   * Problem: Count total number of N digit numbers such that the difference between sum of even and odd digits is 1
   * Solution:
   */

  /**
   * 74.
   * Problem: Maximum weight transformation of a given string
   * Solution:
   */

  /**
   * 75.
   * Problem: Bitmasking and Dynamic Programming | Set 1 (Count ways to assign unique cap to every person)
   * Solution:
   */

  /**
   * 76.
   * Problem: Longest Repeating Subsequence
   * Solution:
   */


  /**
   * 77.
   * Problem: Count even length binary sequences with same sum of first and second half bits
   * Solution:
   */

  /**
   * 78.
   * Problem: Count number of ways to cover a distance
   * Solution:
   */

  /**
   * 79.
   * Problem: Find the longest path in a matrix with given constraints
   * Solution:
   */

  /**
   * 80.
   * Problem: Find number of solutions of a linear equation of n variables
   * Solution:
   */

  /**
   * 81.
   * Problem: Find minimum possible size of array with given rules for removing elements
   * Solution:
   */


  /**
   * 82.
   * Problem: Number of paths with exactly k coins
   * Solution:
   */

  /**
   * 83.
   * Problem: Collect maximum coins before hitting a dead end
   * Solution:
   */

  /**
   * 84.
   * Problem: Bell Numbers (Number of ways to Partition a Set)
   * Solution:
   */

  /**
   * 85.
   * Problem: Count number of ways to partition a set into k subsets
   * Solution:
   */

  /**
   * 86.
   * Problem: Count number of paths with at-most k turns
   * Solution:
   */


  /**
   * 87.
   * Problem: Count Derangements (Permutation such that no element appears in its original position)
   * Solution:
   */

  /**
   * 88.
   * Problem: Partition a set into two subsets such that the difference of subset sums is minimum
   * Solution:
   */

  /**
   * 89.
   * Problem: Compute nCr % p | Set 1 (Introduction and Dynamic Programming Solution)
   * Solution:
   */

  /**
   * 90.
   * Problem: Longest Zig-Zag Subsequence
   * Solution:
   */

  /**
   * 91.
   * Problem: Permutation Coefficient
   * Solution:
   */


  /**
   * 92.
   * Problem: Count number of subsets having a particular XOR value
   * Solution:
   */

  /**
   * 93.
   * Problem: Weighted Job Scheduling in O(n Log n) time
   * Solution:
   */

  /**
   * 94.
   * Problem: Count number of ways to fill a “n x 4” grid using “1 x 4” tiles
   * Solution:
   */

  /**
   * 95.
   * Problem: Ways to arrange Balls such that adjacent balls are of different types
   * Solution:
   */

  /**
   * 96.
   * Problem: A Space Optimized Solution of LCS
   * Solution:
   */


  /**
   * 97.
   * Problem: Maximum profit by buying and selling a share at most k times
   * Solution:
   */

  /**
   * 98.
   * Problem: Minimum time to finish tasks without skipping two consecutive
   * Solution:
   */

  /**
   * 99.
   * Problem: Find maximum length Snake sequence
   * Solution:
   */

  /**
   * 100.
   * Problem: Find if string is K-Palindrome or not | Set 1
   * Solution:
   */

  /**
   * 101.
   * Problem: Wildcard Pattern Matching
   * Solution:
   */


  /**
   * 102.
   * Problem: Longest Common Increasing Subsequence (LCS + LIS)
   * Solution:
   */

  /**
   * 103.
   * Problem: Printing Longest Common Subsequence | Set 2 (Printing All)
   * Solution:
   */

  /**
   * 104.
   * Problem: Printing Shortest Common Supersequence
   * Solution:
   */

  /**
   * 105.
   * Problem: Find if string is K-Palindrome or not | Set 2
   * Solution:
   */

  /**
   * 106.
   * Problem: Construction of Longest Increasing Subsequence using Dynamic Programming
   * Solution:
   */


  /**
   * 107.
   * Problem: Maximize arr[j] – arr[i] + arr[l] – arr[k], such that i < j < k < l
   * Solution:
   */

  /**
   * 108.
   * Problem: Dynamic Programming | High-effort vs. Low-effort Tasks Problem
   * Solution:
   */

  /**
   * 109.
   * Problem: Find minimum adjustment cost of an array
   * Solution:
   */

  /**
   * 110.
   * Problem: Printing Maximum Sum Increasing Subsequence
   * Solution:
   */

  /**
   * 111.
   * Problem: Printing Longest Bitonic Subsequence
   * Solution:
   */


  /**
   * 112.
   * Problem: Find Jobs involved in Weighted Job Scheduling
   * Solution:
   */

  /**
   * 113.
   * Problem: Print Maximum Length Chain of Pairs
   * Solution:
   */

  /**
   * 114.
   * Problem: Weighted Job Scheduling | Set 2 (Using LIS)
   * Solution:
   */

  /**
   * 115.
   * Problem: Longest Geometric Progression
   * Solution:
   */

  /**
   * 116.
   * Problem: Find all combinations of k-bit numbers with n bits set where 1 <= n <= k in sorted order
   * Solution:
   */


  /**
   * 117.
   * Problem: Minimum Cost To Make Two Strings Identical
   * Solution:
   */

  /**
   * 118.
   * Problem: Find number of times a string occurs as a subsequence in given string
   * Solution:
   */

  /**
   * 119.
   * Problem: A Space Optimized DP solution for 0-1 Knapsack Problem
   * Solution:
   */

  /**
   * 120.
   * Problem: Minimum cost to fill given weight in a bag
   * Solution:
   */

  /**
   * 121.
   * Problem: Count digit groupings of a number with given constraints
   * Solution:
   */


  /**
   * 122.
   * Problem: Non-crossing lines to connect points in a circle
   * Solution:
   */

  /**
   * 123.
   * Problem: Count Distinct Subsequences
   * Solution:
   */

  /**
   * 124.
   * Problem: Find minimum sum such that one of every three consecutive elements is taken
   * Solution:
   */

  /**
   * 125.
   * Problem: Longest repeating and non-overlapping substring
   * Solution:
   */

  /**
   * 126.
   * Problem: Count distinct occurrences as a subsequence
   * Solution:
   */


  /**
   * 127.
   * Problem: Count all increasing subsequences
   * Solution:
   */

  /**
   * 128.
   * Problem: All ways to add parenthesis for evaluation
   * Solution:
   */

  /**
   * 129.
   * Problem: Choice of Area
   * Solution:
   */

  /**
   * 130.
   * Problem: Number of permutation with K inversions
   * Solution:
   */

  /**
   * 131.
   * Problem: Maximum weight path ending at any element of last row in a matrix
   * Solution:
   */


  /**
   * 132.
   * Problem: Print all longest common sub-sequences in lexicographical order
   * Solution:
   */

  /**
   * 133.
   * Problem: Count All Palindromic Subsequence in a given String
   * Solution:
   */

  /**
   * 134.
   * Problem: Recursively break a number in 3 parts to get maximum sum
   * Solution:
   */

  /**
   * 135.
   * Problem: Path with maximum average value
   * Solution:
   */

  /**
   * 136.
   * Problem: Maximum sum of pairs with specific difference
   * Solution:
   */


  /**
   * 137.
   * Problem: Maximum sum alternating subsequence
   * Solution:
   */

  /**
   * 138.
   * Problem: Maximum subsequence sum such that no three are consecutive
   * Solution:
   */

  /**
   * 139.
   * Problem: Count All Palindrome Sub-Strings in a String
   * Solution:
   */

  /**
   * 140.
   * Problem: Sum of average of all subsets
   * Solution:
   */

  /**
   * 141.
   * Problem: Longest subsequence such that difference between adjacents is one
   * Solution:
   */


  /**
   * 142.
   * Problem: Maximum decimal value path in a binary matrix
   * Solution:
   */

  /**
   * 143.
   * Problem: Maximum sum subarray removing at most one element
   * Solution:
   */

  /**
   * 144.
   * Problem: Number of palindromic paths in a matrix
   * Solution:
   */

  /**
   * 145.
   * Problem: Minimum and Maximum values of an expression with * and +
   * Solution:
   */

  /**
   * 146.
   * Problem: Minimum cost to sort strings using reversal operations of different costs
   * Solution:
   */


  /**
   * 147.
   * Problem: Minimum sum subsequence such that at least one of every four consecutive elements is picked
   * Solution:
   */

  /**
   * 148.
   * Problem: Count number of ways to reach destination in a Maze
   * Solution:
   */

  /**
   * 149.
   * Problem: Maximum path sum for each position with jumps under divisibility condition
   * Solution:
   */

  /**
   * 150.
   * Problem: Super Ugly Number (Number whose prime factors are in given set)
   * Solution:
   */

  /**
   * 151.
   * Problem: Maximum sum Bi-tonic Sub-sequence
   * Solution:
   */


  /**
   * 152.
   * Problem: Find all distinct subset (or subsequence) sums of an array
   * Solution:
   */

  /**
   * 153.
   * Problem: Ways to write n as sum of two or more positive integers
   * Solution:
   */

  /**
   * 154.
   * Problem: Unbounded Knapsack (Repetition of items allowed)
   * Solution:
   */

  /**
   * 155.
   * Problem: Minimum number of elements which are not part of Increasing or decreasing subsequence in array
   * Solution:
   */

  /**
   * 156.
   * Problem: LCS (Longest Common Subsequence) of three strings
   * Solution:
   */


  /**
   * 157.
   * Problem: Probability of Knight to remain in the chessboard
   * Solution:
   */

  /**
   * 158.
   * Problem: Find Maximum dot product of two arrays with insertion of 0’s
   * Solution:
   */

  /**
   * 159.
   * Problem: Check whether row or column swaps produce maximum size binary sub-matrix with all 1s
   * Solution:
   */

  /**
   * 160.
   * Problem: Count of AP (Arithmetic Progression) Subsequences in an array
   * Solution:
   */

  /**
   * 161.
   * Problem: Maximum points collected by two persons allowed to meet once
   * Solution:
   */


  /**
   * 162.
   * Problem: Maximum path sum in a triangle.
   * We have given numbers in form of triangle, by starting at the top of the triangle and moving to adjacent numbers
   * on the row below, find the maximum total from top to bottom.
   * Input :
   *      3
   *    7   4
   *  2    4   6
   *  8  5  9  3
   Output : 23
   Explanation : 3 + 7 + 4 + 9 = 23
   * Solution:
   */

  /**
   * 162.
   * Problem: Printing brackets in Matrix Chain Multiplication Problem
   * Solution:
   */

  /**
   * 163.
   * Problem: Minimum Sum Path In 3-D Array
   * Solution:
   */

  /**
   * 164.
   * Problem: Friends Pairing Problem
   * Solution:
   */

  /**
   * 165.
   * Problem: Check if all people can vote on two machines
   * Solution:
   */


  /**
   * 166.
   * Problem: Count binary strings with k times appearing adjacent two set bits
   * Solution:
   */

  /**
   * 167.
   * Problem: Probability of getting at least K heads in N tosses of Coins
   * Solution:
   */

  /**
   * 168.
   * Problem: Size of array after repeated deletion of LIS
   * Solution:
   */

  /**
   * 169.
   * Problem: Maximum path sum that starting with any cell of 0-th row and ending with any cell of (N-1)-th row
   * Solution:
   */

  /**
   * 170.
   * Problem: Number of subsequences in a string divisible by n
   * Solution:
   */


  /**
   * 171.
   * Problem: Finding the maximum square sub-matrix with all equal elements.
   * Given a N x N matrix, determine the maximum K such that K x K is a submatrix with all equal elements i.e., all
   * the elements in this submatrix must be same.
   * Solution:
   */
  int largestKSqSubMat(int[][] mat) {
    int[][] dp = new int[mat.length][mat[0].length];
    int result = 0;
    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp.length; j++) {
        if (i == 0 || j == 0) dp[i][j] = 1;
        else if (sameNeighbours(mat[i - 1][j], mat[i][j - 1], mat[i - 1][j - 1])) dp[i][j] = Math.min(dp[i - 1][j],
                Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
        else dp[i][j] = 1;
        result = Math.max(result, dp[i][j]);
      }
    }
    return result;
  }
  boolean sameNeighbours(int x, int y, int z){
    return x == y && y == z;
  }

  /**
   * 172.
   * Problem: Gold Mine Problem.
   * Solution:
   */

  /**
   * 173.
   * Problem: Highway Billboard Problem.
   * Solution:
   */

  /**
   * 174.
   * Problem: Count of strings that can be formed using a, b and c under given constraints
   * Solution:
   */

  /**
   * 175.
   * Problem: Modify array to maximize sum of adjacent differences
   * Solution:
   */


  /**
   * 176.
   * Problem: Sum of all substrings of a string representing a number | Set 1
   * Solution:
   */

  /**
   * 177.
   * Problem: Number of subsequences of the form a^i b^j c^k
   * Solution:
   */

  /**
   * 178.
   * Problem: Count ways to increase LCS length of two strings by one
   * Solution:
   */

  /**
   * 179.
   * Problem: Find number of endless points
   * Solution:
   */

  /**
   * 180.
   * Problem: How to solve a Dynamic Programming Problem ?
   * Solution:
   */


  /**
   * 181.
   * Problem: Tabulation vs Memoizatation
   * Solution:
   */

  /**
   * 182.
   * Problem: Perfect Sum Problem (Print all subsets with given sum)
   * Solution:
   */

  /**
   * 183.
   * Problem: Largest sum Zigzag sequence in a matrix
   * Solution:
   */

  /**
   * 184.
   * Problem: Maximum sum of a path in a Right Number Triangle
   * Solution:
   */

  /**
   * 185.
   * Problem: Subset with sum divisible by m
   * Given a set of non-negative distinct integers, and a value m, determine if there is a subset of the given set with
   * sum divisible by m.
   * Input Constraints
   * Size of set i.e., n <= 1000000, m <= 1000
   * Examples:
   * Input : arr[] = {3, 1, 7, 5};
   * m = 6;
   * Output : YES
   * Input : arr[] = {1, 6};
   * m = 5;
   * Output : NO
   * Solution:
   */



  /**
   * 186.
   * Problem: Digit DP | Introduction
   * Solution:
   */

  /**
   * 187.
   * Problem: Smallest length string with repeated replacement of two distinct adjacent
   * Solution:
   */

  /**
   * 188.
   * Problem: Temple Offerings
   * Solution:
   */

  /**
   * 189.
   * Problem: Count of arrays in which all adjacent elements are such that one of them divide the another
   * Solution:
   */

  /**
   * 190.
   * Problem: Minimum number of deletions to make a string palindrome
   * Given a string of size ‘n’. The task is to remove or delete minimum number of characters from the string so that the
   * resultant string is palindrome.
   * Note: The order of characters should be maintained.
   * Examples:
   * Input : aebcbda
   * Output : 2
   * Remove characters 'e' and 'd'
   * Resultant string will be 'abcba'which is a palindromic string
   * Solution:
   */
  int minDeletion(String str, int left, int right) {
    if (left > right) return Integer.MAX_VALUE;
    else if (left == right) return 0;
    else if (left + 1 == right) return (str.charAt(left) == str.charAt(right)) ? 0 : 1;
    else if (str.charAt(left) == str.charAt(right)) return minDeletion(str, left + 1, right - 1);
    else return  Math.min(2 + minDeletion(str, left + 1, right - 1), 1 + Math.min(minDeletion(str, left + 1, right), minDeletion(str, left, right - 1)));
  }


  /**
   * 191.
   * Problem: Minimum steps to minimize n as per given condition
   * Solution:
   */

  /**
   * 192.
   * Problem: Clustering/Partitioning an array such that sum of square differences is minimum
   * Solution:
   */

  /**
   * 193.
   * Problem: Longest alternating subsequence
   * Solution:
   */

  /**
   * 194.
   * Problem: Minimum steps to delete a string after repeated deletion of palindrome substrings
   * Solution:
   */

  /**
   * 195.
   * Problem: Minimum number of deletions to make a sorted sequence
   * Solution:
   */


  /**
   * 196.
   * Problem: Count number of ways to jump to reach end
   * Given an array of numbers where each element represents the max number of jumps that can be made forward from that element.
   * For each array element, count number of ways jumps can be made from that element to reach the end of the array.
   * If an element is 0, then move cannot be made through that element. The element that cannot reach to the end should have a count “-1”.
   * Solution:
   */


  /**
   * 197.
   * Problem: Minimum number of deletions and insertions to transform one string into another
   * Solution:
   */

  /**
   * 198.
   * Problem: Shortest Uncommon Subsequence
   * Solution:
   */

  /**
   * 199.
   * Problem: Minimum insertions to sort an array
   * Solution:
   */

  /**
   * 200.
   * Problem: Dynamic Programming | Building Bridges
   * Solution:
   */


  /**
   * 201.
   * Problem: Number of substrings divisible by 8 but not by 3
   * Solution:
   */

  /**
   * 202.
   * Problem: Sequences of given length where every element is more than or equal to twice of previous
   * Solution:
   */

  /**
   * 203.
   * Problem: Ways to sum to N using array elements with repetition allowed
   * Solution:
   */

  /**
   * 204.
   * Problem: Maximum sum in a 2 x n grid such that no two elements are adjacent
   * Solution:
   */

  /**
   * 205.
   * Problem: Count the number of ways to tile the floor of size n x m using 1 x m size tiles
   * Solution:
   */


  /**
   * 206.
   * Problem: Pyramid form (increasing then decreasing) consecutive array using reduce operations
   * Solution:
   */

  /**
   * 207.
   * Problem: Counts paths from a point to reach Origin
   *You are standing on a point (n, m) and you want to go to origin (0, 0) by taking steps either left or down i.e.
   * from each point you are allowed to move either in (n-1, m) or (n, m-1). Find the number of paths from point to origin.
   * Input : 3 6
   * Output : Number of Paths 84
   *
   * Input : 3 0
   * Output : Number of Paths 1
   * Solution:
   */
  int countPathsToOri(int x, int y) {
    if (x == 0 || y == 0) return 1;
    else return countPathsToOri(x - 1, y) + countPathsToOri(x, y - 1);
  }

  /**
   * 208.
   * Problem: Minimum time to write characters using insert, delete and copy operation
   * Solution:
   */

  /**
   * 209.
   * Problem: Count Balanced Binary Trees of Height h
   * Solution:
   */

  /**
   * 210.
   * Problem: Choose maximum weight with given weight and value ratio
   * Solution:
   */































}
