package language.scanning.examples;

import java.math.BigInteger;
import java.util.*;

public class Example1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int noTestCases = in.nextInt();
    Integer[] array = new Integer[noTestCases];
//        for (int i = 0; i < noTestCases; i++ ) {
//            array[i] = in.nextInt();
//        }
    Arrays.fill(array,in.nextInt());
//        for (int i = 0; i < noTestCases; i++ ) {
//            System.out.println(array[i]);
//        }
//        int res = findMinDiff(array);
    int res = findMaxElement(array);
    System.out.println(res);
  }

  static int findMinDiff(int[] array) {
    Arrays.sort(array);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length - 1; i++ ) {
      int diff = array[i+1] - array[i];
      if (diff < min) min = diff;
    }
    return min;
  }

  static int findMaxElement(Integer[] array){
    Arrays.sort(array);
    Set<String> mySet = new HashSet<String>();
    for (int i = 0; i < array.length; i++ ) {
      mySet.add((Integer.toString(array[i])));
    }
    HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(array));
    int max = -1;
    for (int i = 0; i < array.length; i++ ) {
      int current = array[i];
      for (int j = i+1; j < array.length; j++ ) {
        int number = array[j];
        if (current * number <= array[array.length-1]) {
          BigInteger product = new BigInteger("1");
          product = product.multiply(BigInteger.valueOf(current));
          product = product.multiply(BigInteger.valueOf(number));
          if (mySet.contains((product.toString()))) {
            if (max < current * number)
              max = current * number;
          }
        }

      }
    }
    return max;
  }

  public static int find(int[] arr) {
    Arrays.sort(arr);
    for (int i = arr.length - 1; i >= 2; i--) {
      int target = arr[i];
      int l = 0, r = i - 1;
      while (l < r) {
        int product = arr[l] * arr[r];
        if (product == target) return target;
        if (product < target) l++;
        else r--;
      }
    }
    return -1;
  }

}
