package algorithms.bit;

public class BitExamples {

  /**
   * 1.
   * Problem: Smallest power of 2 greater than or equal to n.
   */
  int getNextPowerOf2(int n) {
    int power = 1;
    if (isPowerOf2(n)) return n;
    else while (power < n) power <<= 1;
    return power;
  }

  /**
   * 2.
   * Problem: Write an Efficient Method to Check if a Number is Multiple of 3.
   * Solution:
   * 1) Get count of all set bits at odd positions (For 23 it’s 3).
   * 2) Get count of all set bits at even positions (For 23 it’s 1).
   * 3) If difference of above two counts is a multiple of 3 then number is also a multiple of 3.
   */


  /**
   * 3.
   * Problem: Write a C program to find the parity of an unsigned integer.
   * Solution:
   */

  /**
   * 4.
   * Problem: Efficient way to multiply with 7.
   * Solution:
   */

  /**
   * 5.
   * Problem: Program to find whether a no is power of two.
   */
  boolean isPowerOf2(int n) {
    return n != 0 && (n & (n - 1)) == 0;
  }


  /**
   * 1.
   * Problem:
   * Solution:
   */

  /**
   * 1.
   * Problem:
   * Solution:
   */

  /**
   * 1.
   * Problem:
   * Solution:
   */

  /**
   * 1.
   * Problem:
   * Solution:
   */

  /**
   * 1.
   * Problem:
   * Solution:
   */

  /**
   * 1.
   * Problem:
   * Solution:
   */


}
