package recursion;

import utilities.Stack;

import java.util.HashSet;

class RecursionExamples {

  /**
   * 1.
   * Problem: Exponent of a number
   * Solution: base*base^(exp - 1)
   */
  int getExponent(int base, int exp) {
    if (exp == 0) return 1;
    else return base * getExponent(base, exp - 1);
  }

  /**
   * More efficient.
   */
  int getExponentEfficient(int base, int exp) {
    if (exp == 0) return 1;
    else {
      int half = getExponentEfficient(base, exp / 2);
      if (exp % 2 == 0) return half * half;
      else return base * half * half;
    }
  }

  /**
   * 2.
   * Problem: Given a string, check whether palindrome or not.
   */
  boolean isPalindrome(String str) {
    return (str.length() <=1) || str.charAt(0) == str.charAt(str.length() - 1)
            && isPalindrome(str.substring(1, str.length() - 1));
  }

  /**
   * 3.
   * Problem: BinarySearch
   */
  int binarySearch(int[] array, int startIndex, int endIndex, int value) {
    if (startIndex <= endIndex) {
      int midIndex = startIndex + (endIndex - startIndex)/ 2;
      if (value == array[midIndex]) return midIndex;
      else if (value < array[midIndex]) return binarySearch(array, startIndex, midIndex - 1, value);
      else return binarySearch(array, midIndex + 1, endIndex, value);
    } else return -1;
  }

  /**
   * 4.
   * Problem: Combination
   */
  int combination(int n, int k) {
    if (n == k || k == 0) return 1;
    else return combination(n - 1, k) + combination(n - 1, k - 1);
  }

  /**
   * 5.
   * Problem: Tower of Hanoi
   */
  void towerOfHanoi(int disk, String source, String dest, String temp){
    if (disk > 0) {
      towerOfHanoi(disk - 1, source, temp, dest);
      System.out.println(source + " -> " + dest);
      towerOfHanoi(disk - 1, temp, dest, source);
    }
  }

  /**
   * 6.
   * Problem: Permutations of a string
   */
  void printPermutations(String sofar, String remaining) {
    if (remaining.isEmpty()) System.out.println(sofar);
    else {
      for (int i = 0; i < remaining.length(); i++)
        printPermutations(sofar + remaining.charAt(i),
                remaining.substring(0, i) + remaining.substring(i + 1));
    }
  }

  /**
   * 7.
   * Problem: Subset of String.
   */
  void printSubsets(String sofar, String remaining) {
    if (remaining.isEmpty()) System.out.println(sofar);
    else {
      printSubsets(sofar + remaining.charAt(0), remaining.substring(1));
      printSubsets(sofar, remaining.substring(1));
    }
  }

  /**
   * 8.
   * Problem: AnagramFinder
   * Solution: Use backtracking
   *  boolean solve(configuration conf) {
   *    // BASE CASE
   *    if (no more choices)
   *      return (conf is in gaol state);
   *    else {
   *      for (choice : choices) {
   *        try one choice c;
   *        // solve from here, if work out, you are done
   *        if (solve(conf with choice c made) return true;
   *        unmake choice c;
   *      }
   *      return false;  // tried all choices, no solution found.
   *    }
   *  }
   */
  boolean isAnagram(String soFar, String remaining, HashSet<String> dictionary) {
    if (remaining.isEmpty()) return dictionary.contains(soFar);
    else {
      for (int i = 0; i < remaining.length(); i++) {
        if (isAnagram(soFar + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), dictionary))
          return true;
      }
    }
    return false;
  }

  /**
   * 9.
   * Problem: N Queens Problems
   * Solution:
   */
  void placeQueen(int[][] board, int row, int column) {
    board[row][column] = 1;
  }

  void removeQueen(int[][] board, int row, int column) {
    board[row][column] = 0;
  }

  boolean isSafe(int[][] board, int row, int column) {
    for (int c = column; c >= 0 ; c--)
      if (board[row][c] == 1) return false;

    for (int r = row,  c = column; r >= 0 && c >=0; r--, c--)
      if (board[r][c] == 1) return false;

    for (int r = row, c = column; r >= 0 && c > board[0].length; r--, c++)
      if(board[r][c] == 1) return false;

    return true;
  }

  boolean solveNQueen(int[][] board, int column) {
    if (column >= board[0].length) return true;
    else {
      for (int row = 0; row < board.length; row++) {
        if (isSafe(board, row, column)) {
          placeQueen(board, row, column);
          if (solveNQueen(board, column + 1)) return true;
          removeQueen(board, row, column);
        }
      }
    }
    return false;
  }

  /**
   * Problems from Geeksforgeeks.
   */

  /**
   * 1.
   * Problem: Reverse a stack using recursion. Or reverse a stack without using any other data structure or
   * auxiliary space.
   */
  void reverseStack(Stack stack) {
    if(!stack.isEmpty()) {
      int top = stack.pop();
      reverseStack(stack);
      insertAtBottom(stack,top);
    }
  }

  private void insertAtBottom(Stack stack, int elem) {
    if (stack.isEmpty())
      stack.push(elem);
    else {
      int top = stack.pop();
      insertAtBottom(stack,elem);
      stack.push(top);
    }
  }

  /**
   * 2.
   * Problem: Check if a number is Palindrome
   * Given an integer, write a function that returns true if the given number is palindrome, else false.
   * For example, 12321 is palindrome, but 1451 is not palindrome.
   */
  boolean isPalindromeNumber(int num, int numCopy, int reverse) {
    if (numCopy == 0) return num == reverse;
    return isPalindromeNumber(num, numCopy/10, reverse * 10  + numCopy % 10);
  }

  /**
   * 3.
   * Problem: Print all possible combinations of r elements in a given array of size n
   * Solution:
   */

  /**
   * 4.
   * Problem: Print all possible strings of length k that can be formed from a set of n characters
   * Solution:
   */

  /**
   * 5.
   * Problem: Tail Recursion
   * Solution:
   */


  /**
   * 6.
   * Problem: Print all increasing sequences of length k from first n natural numbers
   * Solution:
   */


  /**
   * 7.
   * Problem: Generate all possible sorted arrays from alternate elements of two given sorted arrays
   * Solution:
   */


  /**
   * 8.
   * Problem: Minimum steps to reach a destination
   * Solution:
   */


  /**
   * 9.
   * Problem: Given a string, print all possible palindromic partitions
   * Solution:
   */


  /**
   * 10.
   * Problem: Print a pattern without using any loop
   * Solution:
   */


  /**
   * 11.
   * Problem: Print all non-increasing sequences of sum equal to a given number x
   * Solution:
   */


  /**
   * 12.
   * Problem: Sort a stack using recursion
   * Solution:
   */


  /**
   * 13.
   * Problem: Print all n-digit strictly increasing numbers
   * Solution:
   */



  /**
   * 14.
   * Problem: Find all even length binary sequences with same sum of first and second half bits
   * Solution:
   */



  /**
   * 15.
   * Problem: Print all possible expressions that evaluate to a target
   * Solution:
   */


  /**
   * 16.
   * Problem: Print sums of all subsets of a given set
   * Solution:
   */



  /**
   * 17.
   * Problem: String with additive sequence
   * Solution:
   */



  /**
   * 18.
   * Problem: Print all longest common sub-sequences in lexicographical order
   * Solution:
   */


  /**
   * 19.
   * Problem: Program for Chocolate and Wrapper Puzzle
   * Solution:
   */

  /**
   * 20.
   * Problem: Recursion
   * Solution:
   */

  /**
   * 21.
   * Problem:  program to implement Collatz Conjecture
   * Solution:
   */

  /**
   * 22.
   * Problem: Generate all binary strings without consecutive 1’s.
   * Given a integer K. Task is Print All binary string of size K (Given number).
   * Solution:
   */

  /**
   * 23.
   * Problem: Recursive Bubble Sort
   * Solution:
   */
  public void recusiveBSort(int[] array, int lastIndex) {

    if (lastIndex == 1) return;
    for (int i = 0; i < lastIndex - 1; i++) {
      if (array[i] > array[i + 1]) swap(array, i, i + 1);
    }
    recusiveBSort(array, lastIndex - 1);
  }


  public void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }

  /**
   * 24.
   * Problem. A number is called as a stepping number if the adjacent digits
   * are having a difference of 1.
   * For eg. 8,343,545 are stepping numbers. While 890, 098 are not.
   * The difference between a ‘9’ and ‘0’ should not be considered as 1.
   * Solution:
   */

  /**
   * 25.
   * Problem: Recaman’s sequence
   * Solution:
   */

  /**
   *
   */

  /**
   *  Problem.We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
   *  The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
   *  Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
   *  bunnyEars2(0) → 0
   *  bunnyEars2(1) → 2
   *  bunnyEars2(2) → 5
   */
  int bunnyEars2(int bunnies) {
    if (bunnies == 0) return 0;
    else if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);
    else return 2 + bunnyEars2(bunnies - 1);
  }



  /**
   *
   *  Problem.We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
   *  the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks
   *  in such a triangle with the given number of rows.
   *  triangle(0) → 0
   *  triangle(1) → 1
   *  triangle(2) → 3
   */
  int triangle(int rows) {
    if (rows < 2) return rows;
    else return rows + triangle(rows - 1);
  }

  /**
   *
   *  Problem.Given a non-negative int n, return the sum of its digits recursively (no loops).
   *  Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
   *  while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
   *  sumDigits(126) → 9
   *  sumDigits(49) → 13
   *  sumDigits(12) → 3
   */

  int sumDigits(int n) {
    if (n == 0) return 0;
    else return n % 10 + sumDigits(n / 10);
  }



  /**
   *
   *  Problem.Given a non-negative int n, return the count of the occurrences of 7 as a digit,
   *  so for example 717 yields 2. (no loops).
   */

  int count7(int n) {
    if (n == 0) return 0;
    else if (n % 10 == 7) return 1 + count7(n / 10);
    else return count7(n /10);
  }







  /**
   *
   *  Problem. Given a string, compute recursively (no loops) the number of times lowercase
   *  hi" appears in the string.
   *  countHi("xxhixx") → 1
   *  countHi("xhixhix") → 2
   *  countHi("hi") → 1
   */

  int countHi(String str) {
    if (str.length() < 2) return 0;
    else if ("hi".equals(str.substring(0, 2))) return 1 + countHi(str.substring(2));
    else return countHi(str.substring(1));
  }



  /**
   *
   *  Problem.Given a string, compute recursively (no loops) a new string where all
   *  the lowercase 'x' chars have been changed to 'y' chars.
   *  changeXY("codex") → "codey"
   *  changeXY("xxhixx") → "yyhiyy"
   *  changeXY("xhixhix") → "yhiyhiy"
   */

  String changeXY(String str) {
    return changeXY("", str);
  }

  String changeXY(String sofar, String rest) {
    if (rest.length() < 1) return sofar;
    else if (rest.charAt(0) == 'x') return changeXY(sofar + 'y', rest.substring(1));
    else return changeXY(sofar + rest.charAt(0), rest.substring(1));
  }


  /**
   *
   *  Problem.
   */


  /**
   *
   *  Problem.
   */

  /**
   *
   *  Problem.
   */


  /**
   *
   *  Problem.
   */



  /**
   *
   *  Problem.
   */







  /**
   *
   *  Problem.
   */


  /**
   *
   *  Problem.
   */







  /**
   *
   *  Problem.
   */





  /**
   *
   *  Problem.
   */



  /**
   *
   *  Problem.
   */


  /**
   *
   *  Problem.
   */

  /**
   *
   *  Problem.
   */


  /**
   *
   *  Problem.
   */



  /**
   *
   *  Problem.
   */




  int factorial(int num) {
    if (num == 0) return 1;
    else return num * factorial(num - 1);
  }

  /**
   * Tail recursive
   */
  int factTailRecursive(int num, int acc) {
    if (num == 0) return acc;
    else return factTailRecursive(num - 1, acc * num);
  }



  /**
   *
   *  Problem.
   */




}
