package data.structures.arrays;

import data.structures.arrays.sliding.window.SlidingWindowExamples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExamplesTest {

  @Test
  public void getOddOccurrence() throws Exception {
    int[] array = {1,2,3,1,2};
    assertEquals(3, new ArrayExamples().getOddOccurrence(array));
    assertEquals(3, new ArrayExamples().getOddOccurrenceWithLambda(array));
  }

  @Test
  public void maxSumContigous() throws Exception {
    int[] a = {3,2,7,10};
    int[] b = {-3,-22,-7,-10};
    int result = new ArrayExamples().maxSumContigous(a);
    assertEquals(22, result);
    assertEquals(-3, new ArrayExamples().maxSumContigous(b));
  }

  @Test
  public void maxSumNonContigousTest() {
    int[] a = {-3,2,7,10};
    int[] b = {-30,-22,-7,-10};
    int result = new ArrayExamples().maxSumNonContigous(a);
    assertEquals(19,result);
    assertEquals(-7, new ArrayExamples().maxSumNonContigous(b));
  }

  @Test
  public void findMissingNumber() throws Exception {
    int[] list = {1,2,3,5};
    assertEquals(4, new ArrayExamples().findMissingNumber(list, 5));
    int[] list2 = {1,2,3,5,6};
    assertEquals(4, new ArrayExamples().findMissingNumber(list2, 6));
  }

  @Test
  public void binarySearchRotated() throws Exception {
    int[] array = {5,6,1,2,3,4};
    assertEquals(0, new ArrayExamples().binarySearchRotated(array,5, 0, array.length - 1));
    assertEquals(1, new ArrayExamples().binarySearchRotated(array,6, 0, array.length - 1));
    assertEquals(2, new ArrayExamples().binarySearchRotated(array,1, 0, array.length - 1));
    assertEquals(3, new ArrayExamples().binarySearchRotated(array,2, 0, array.length - 1));
  }

  @Test
  public void reverseArray() throws Exception {
    int[] array = {5,6,1,2,3,4};
    new ArrayExamples().reverseArray(array, 0);
    assertEquals(4, array[0]);
    assertEquals(5, array[5]);
  }


  @Test
  public void maxSumNonAdjacent() throws Exception {
    int[] array = {5,4,1,3};
    assertEquals(8, new ArrayExamples().maxSumNonAdjacent(array));
  }


  @Test
  public void maxSumContigousLenthTest() {
    int[] arr = {0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1};
    int result = new SlidingWindowExamples().maxLength(arr, 3);
    assertEquals(10, result);
  }

  @Test
  public void minDiffTest() {
    int arr[] = {1, 10, 14, 14, 14, 15};
    assertEquals(5, new ArrayExamples().minDiff(arr,6));
  }

  @Test
  public void minPalOpTest() {
    int arr[] = {11, 14, 15, 99};
    int[] arr2 = {1, 4, 5, 1};
    assertEquals(3, new ArrayExamples().minPalindromeOperations(arr,0,arr.length - 1));
    assertEquals(1, new ArrayExamples().minPalindromeOperations(arr2,0,arr2.length - 1));
  }

  @Test
  public void maxDiffTest() {
    int[] arr = {2, 3, 10, 6, 4, 8, 1};
    assertEquals(8, new ArrayExamples().maxDiff(arr));
  }

}

