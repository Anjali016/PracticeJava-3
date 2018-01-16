package algorithms.sorting;

class SortingExamples {

  /**
   * 1.
   * Problem: Sort elements by frequency | Set 1.
   * Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which
   * came first.

   * Solution:
   */

  /**
   * 2.
   * Problem: Count Inversions in an array | Set 1 (Using Merge Sort).
   * Solution:
   */

  /**
   * 3.
   * Problem: Merge Sort for Linked Lists.
   * Solution:
   */

  /**
   * 4.
   * Problem: Sort an array of 0s, 1s and 2s.
   * Solution:
   */

  /**
   * 5.
   * Problem: Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted.
   * Solution:
   */

  /**
   * 6.
   * Problem: When does the worst case of Quicksort occur?.
   * Solution: The answer depends on strategy for choosing pivot. In early versions of Quick Sort where leftmost (or rightmost)
   * element is chosen as pivot, the worst occurs in following cases.
   * 1) Array is already sorted in same order.
   * 2) Array is already sorted in reverse order.
   * 3) All elements are same (special case of case 1 and 2)
   *
   * Since these cases are very common use cases, the problem was easily solved by choosing either a random index for the pivot,
   * choosing the middle index of the partition
   *
   */

  /**
   * 7.
   * Problem: Stability in sorting algorithms.
   * Solution: A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted
   * output as they appear in the input array to be sorted.
   *
   *
   * If we sort this data according to name only, then it is highly unlikely that the resulting dataset will be grouped
   * according to sections as well.
   * \\ (Alice, B)\\ (Carol, A)\\ (Dave, A)\\ (Eric, B)\\ (Ken, A)
   * So we might have to sort again to obtain list of students section wise too. But in doing so, if the sorting algorithm
   * is not stable, we might get a result like this-
   \\ (Carol, A)\\ (Dave, A)\\ (Ken, A)\\(Eric, B)\\(Alice, B)
   *
   * In the name-sorted dataset, the tuple (Alice, B) was before (Eric, B),but since the sorting algorithm is not stable,
   * the relative order is lost.
   * Which sorting algorithms are stable?
   * Some Sorting Algorithms are stable by nature, such as Insertion Sort, Merge Sort, Count Sort etc.
   *
   *
   * Which sorting algorithms are unstable?
   * Quick Sort, Heap Sort etc., can be made stable by also taking the position of the elements into consideration.
   *
   * Can we make any sorting algorithm stable?
   * Any given sorting algo which is not stable can be modified to be stable.
   */

  /**
   * 8.
   * Problem: Which sorting algorithm makes minimum number of memory writes?.
   * Solution:
   */

  /**
   * 9.
   * Problem: Lower bound for comparison based sorting algorithms.
   * Solution:
   */

  /**
   * 10.
   * Problem: Find whether an array is subset of another array | Added Method 3.
   * Solution:
   */

  /**
   * 11.
   * Problem: Sort a nearly sorted (or K sorted) array.
   * Solution:
   */

  /**
   * 12.
   * Problem: Sort numbers stored on different machines.
   * Solution:
   */

  /**
   * 13.
   * Problem: Iterative Quick Sort.
   * Solution:
   */

  /**
   * 14.
   * Problem: Sort a linked list of 0s, 1s and 2s.
   * Solution:
   */

  /**
   * 15.
   * Problem: Pancake sorting.
   * Solution:
   */

  /**
   * 16.
   * Problem: A Pancake Sorting Problem.
   * Solution:
   */

  /**
   * 17.
   * Problem: Insertion Sort.
   * Solution:
   */

  /**
   * 18.
   * Problem: Merge Sort.
   * Solution:
   */

  /**
   * 19.
   * Problem: Heap Sort.
   * Solution:
   */

  /**
   * 20.
   * Problem: Counting Sort.
   * Solution:
   */

  /**
   * 21.
   * Problem: Comparator function of qsort() in C.
   * Solution:
   */

  /**
   * 22.
   * Problem: QuickSort on Doubly Linked List.
   * Solution:
   */

  /**
   * 23.
   * Problem: Sort elements by frequency | Set 2.
   * Solution:
   */

  /**
   * 24.
   * Problem: QuickSort on Singly Linked List.
   * Solution:
   */

  /**
   * 25.
   * Problem: Radix Sort.
   * Solution:
   */

  /**
   * 26.
   * Problem: Find number of pairs (x, y) in an array such that x^y > y^x.
   * Solution:
   */

  /**
   * 27.
   * Problem: Count all distinct pairs with difference equal to k.
   * Solution:
   */

  /**
   * 28.
   * Problem: QuickSort.
   * Solution:
   */

  /**
   * 29.
   * Problem: Selection Sort.
   * Solution:
   */

  /**
   * 30.
   * Problem: C Program for Bubble Sort on Linked List.
   * Solution:
   */

  /**
   * 31.
   * Problem: Bubble Sort.
   * Solution:
   */

  /**
   * 32.
   * Problem: Sort n numbers in range from 0 to n^2 &#8211; 1 in linear time.
   * Solution:
   */

  /**
   * 33.
   * Problem: Bucket Sort.
   * Solution:
   */

  /**
   * 34.
   * Problem: C Program to Sort an array of names or strings.
   * Solution:
   */

  /**
   * 35.
   * Problem: ShellSort.
   * Solution:
   */

  /**
   * 36.
   * Problem: Sorting Terminology.
   * Solution:
   */

  /**
   * 37.
   * Problem: Binary Insertion Sort.
   * Solution:
   */

  /**
   * 38.
   * Problem: Sort an array according to the order defined by another array.
   * Solution:
   */

  /**
   * 39.
   * Problem: Given a sorted array and a number x, find the pair in array whose sum is closest to x.
   * Solution:
   */

  /**
   * 40.
   * Problem: Time complexity of insertion sort when there are O(n) inversions?.
   * Solution:
   */

  /**
   * 41.
   * Problem: Sort an array in wave form.
   * Solution:
   */

  /**
   * 42.
   * Problem: Can QuickSort be implemented in O(nLogn) worst case time complexity?.
   * Solution:
   */

  /**
   * 43.
   * Problem: Iterative Merge Sort.
   * Solution:
   */

  /**
   * 44.
   * Problem: Check if any two intervals overlap among a given set of intervals.
   * Solution:
   */

  /**
   * 45.
   * Problem: Merge Sort for Doubly Linked List.
   * Solution:
   */

  /**
   * 46.
   * Problem: Why Quick Sort preferred for Arrays and Merge Sort for Linked Lists?.
   * Solution:
   */

  /**
   * 47.
   * Problem: How to efficiently sort a big list dates in 20&#8217;s.
   * Solution:
   */

  /**
   * 48.
   * Problem: Sort an almost sorted array where only two elements are swapped.
   * Solution:
   */

  /**
   * 49.
   * Problem: Where is Heap Sort used practically?.
   * Solution:
   */

  /**
   * 50.
   * Problem: Find memory conflicts among multiple threads.
   * Solution:
   */

  /**
   * 51.
   * Problem: Find the point where maximum intervals overlap.
   * Solution:
   */

  /**
   * 52.
   * Problem: How to sort a big array with many repetitions?.
   * Solution:
   */

  /**
   * 53.
   * Problem: Sort a linked list that is sorted alternating ascending and descending orders?.
   * Solution:
   */

  /**
   * 54.
   * Problem: 3-Way QuickSort (Dutch National Flag).
   * Solution:
   */

  /**
   * 55.
   * Problem: C++ program for Sorting Dates using Selection Sort.
   * Solution:
   */

  /**
   * 56.
   * Problem: How to sort an array of dates in C/C++?.
   * Solution:
   */

  /**
   * 57.
   * Problem: Sorting Strings using Bubble Sort.
   * Solution:
   */

  /**
   * 58.
   * Problem: Comb Sort.
   * Solution:
   */

  /**
   * 59.
   * Problem: Pigeonhole Sort.
   * Solution:
   */

  /**
   * 60.
   * Problem: QuickSort Tail Call Optimization (Reducing worst case space to Log n ).
   * Solution:
   */

  /**
   * 61.
   * Problem: std::sort() in C++ STL.
   * Solution:
   */

  /**
   * 62.
   * Problem: Find minimum difference between any two elements.
   * Solution:
   */

  /**
   * 63.
   * Problem: Convert an array to reduced form | Set 1 (Simple and Hashing).
   * Solution:
   */

  /**
   * 64.
   * Problem: External Sorting.
   * Solution: External sorting is a term for a class of sorting algorithms that can handle massive amounts of data.
   * External sorting is required when the data being sorted do not fit into the main memory of a computing device (usually RAM)
   * and instead they must reside in the slower external memory (usually a hard drive). External sorting typically uses
   * a hybrid sort-merge strategy.
   * 1. In the sorting phase, chunks of data small enough to fit in main memory are read, sorted, and written out to a temporary file.
   * 2. In the merge phase, the sorted sub-files are combined into a single larger file.
   *
   * One example of external sorting is the external merge sort algorithm, which sorts chunks that each fit in RAM, then
   * merges the sorted chunks together. We first divide the file into runs such that the size of a run is small enough to
   * fit into main memory. Then sort each run in main memory using merge sort sorting algorithm. Finally merge the resulting
   * runs together into successively bigger runs, until the file is sorted.
   */

  /**
   * 65.
   * Problem: Cartesian Tree Sorting.
   * Solution:
   */

  /**
   * 66.
   * Problem: Maximum product of a triplet (subsequnece of size 3) in array.
   * Solution:
   */

  /**
   * 67.
   * Problem: Find missing elements of a range.
   * Solution:
   */

  /**
   * 68.
   * Problem: Find a permutation that causes worst case of Merge Sort.
   * Solution:
   */

  /**
   * 69.
   * Problem: C qsort() vs C++ sort().
   * Solution:
   */

  /**
   * 70.
   * Problem: Bitonic Sort.
   * Solution:
   */

  /**
   * 71.
   * Problem: Minimum sum of two numbers formed from digits of an array.
   * Solution:
   */

  /**
   * 72.
   * Problem: Cocktail Sort.
   * Solution:
   */

  /**
   * 73.
   * Problem: Know Your Sorting Algorithm | Set 1 (Sorting Weapons used by Programming Languages).
   * Solution:
   */

  /**
   * 74.
   * Problem: Know Your Sorting Algorithm | Set 2  (Introsort- C++’s Sorting Weapon).
   * Solution:
   */

  /**
   * 75.
   * Problem: Sleep Sort – The King of Laziness / Sorting while Sleeping.
   * Solution:
   */

  /**
   * 76.
   * Problem: Gnome Sort.
   * Solution:
   */

  /**
   * 77.
   * Problem: Sorting Vector of Pairs in C++ | Set 1 (Sort by first and second).
   * Solution:
   */

  /**
   * 78.
   * Problem: Sorting Vector of Pairs in C++ | Set 2 (Sort in descending order by first and second).
   * Solution:
   */

  /**
   * 79.
   * Problem: Odd-Even Sort / Brick Sort.
   * Solution:
   */

  /**
   * 80.
   * Problem: BogoSort or Permutation Sort.
   * Solution:
   */

  /**
   * 81.
   * Problem: Sorting 2D Vector in C++ | Set 2 (In descending order by row and column).
   * Solution:
   */

  /**
   * 82.
   * Problem: Sorting 2D Vector in C++ | Set 3 (By number of columns).
   * Solution:
   */

  /**
   * 83.
   * Problem: Find Surpasser Count of each element in array.
   * Solution:
   */

  /**
   * 84.
   * Problem: Rearrange positive and negative numbers with constant extra space.
   * Solution:
   */

  /**
   * 85.
   * Problem: Sort an array according to count of set bits.
   * Solution:
   */

  /**
   * 86.
   * Problem: Structure Sorting (By Multiple Rules) in C++.
   * Solution:
   */

  /**
   * 87.
   * Problem: Time Complexities of all Sorting Algorithms.
   * Solution:
   */

  /**
   * 88.
   * Problem: Count distinct occurrences as a subsequence.
   * Solution:
   */

  /**
   * 89.
   * Problem: Tree Sort.
   * Solution:
   */

  /**
   * 90.
   * Problem: Minimum number of swaps required to sort an array.
   * Solution:
   */

  /**
   * 91.
   * Problem: Number of swaps to sort when only adjacent swapping allowed.
   * Solution:
   */

  /**
   * 92.
   * Problem: Minimum swaps to make two arrays identical.
   * Solution:
   */

  /**
   * 93.
   * Problem: Find elements larger than half of the elements in an array.
   * Solution:
   */

  /**
   * 94.
   * Problem: Count minimum number of subsets (or subsequences) with consecutive numbers.
   * Solution:
   */

  /**
   * 95.
   * Problem: Sum of all elements between k1&#8217;th and k2&#8217;th smallest elements.
   * Solution:
   */

  /**
   * 96.
   * Problem: Number of sextuplets (or six values) that satisfy an equation.
   * Solution:
   */

  /**
   * 97.
   * Problem: Sort an array according to absolute difference with given value.
   * Solution:
   */

  /**
   * 98.
   * Problem: Minimize the sum of product of two arrays with permutations allowed.
   * Solution:
   */

  /**
   * 99.
   * Problem: Position of an element after stable sort.
   * Solution:
   */

  /**
   * 100.
   * Problem: Asymptotic Analysis and comparison of sorting algorithms.
   * Solution:
   */

  /**
   * 101.
   * Problem: Chocolate Distribution Problem.
   * Solution:
   */

  /**
   * 102.
   * Problem: Sort even-placed elements in increasing and odd-placed in decreasing order.
   * Solution:
   */

  /**
   * 103.
   * Problem: Permute two arrays such that sum of every pair is greater or equal to K.
   * Solution:
   */

  /**
   * 104.
   * Problem: Chose k array elements such that difference of maximum and minimum is minimized.
   * Solution:
   */

  /**
   * 105.
   * Problem: Sort an array when two halves are sorted.
   * Solution:
   */

  /**
   * 106.
   * Problem: Find pair with greatest product in array.
   * Solution:
   */

  /**
   * 107.
   * Problem: Minimum swap required to convert binary tree to binary search tree.
   * Solution:
   */

  /**
   * 108.
   * Problem: K-th smallest element after removing some integers from natural numbers.
   * Solution:
   */

  /**
   * 109.
   * Problem: Check whether Arithmetic Progression can be formed from the given array.
   * Solution:
   */

  /**
   * 110.
   * Problem: Cycle Sort.
   * Solution:
   */

  /**
   * 111.
   * Problem: Hoare&#8217;s vs Lomuto partition scheme in QuickSort.
   * Solution:
   */

  /**
   * 112.
   * Problem: Bucket Sort To Sort an Array with Negative Numbers.
   * Solution:
   */

  /**
   * 113.
   * Problem: Tag Sort (To get both sorted and original).
   * Solution:
   */

  /**
   * 114.
   * Problem: Possible to form a triangle from array values.
   * Solution:
   */

  /**
   * 115.
   * Problem: Maximum difference between frequency of two elements such that element having greater frequency is also greater.
   * Solution:
   */

  /**
   * 116.
   * Problem: Recursive Bubble Sort.
   * Solution:
   */

  /**
   * 117.
   * Problem: Check if reversing a sub array make the array sorted.
   * Solution:
   */

  /**
   * 118.
   * Problem: Find all triplets with zero sum.
   * Solution:
   */

  /**
   * 119.
   * Problem: An Insertion Sort time complexity question.
   * Solution:
   */

  /**
   * 120.
   * Problem: Sort a Matrix in all way increasing order.
   * Solution:
   */

  /**
   * 121.
   * Problem: Sort array after converting elements to their squares.
   * Solution:
   */

  /**
   * 122.
   * Problem: Sort all even numbers in ascending order and then sort all odd numbers in descending order.
   * Solution:
   */

  /**
   * 123.
   * Problem: Recursive Insertion Sort.
   * Solution:
   */

  /**
   * 124.
   * Problem: Sorting Big Integers.
   * Solution:
   */

  /**
   * 125.
   * Problem: Sort an array of large numbers.
   * Solution:
   */

  /**
   * 126.
   * Problem: Sort 3 Integers without using if condition or using only max() function.
   * Solution:
   */

  /**
   * 127.
   * Problem: Minimum difference between max and min of all K-size subsets.
   * Solution:
   */

  /**
   * 128.
   * Problem: Minimum swaps to reach permuted array with at most 2 positions left swaps allowed.
   * Solution:
   */

  /**
   * 129.
   * Problem: Convert an array to reduced form | Set 2 (Using vector of pairs).
   * Solution:
   */

  /**
   * 130.
   * Problem: Find sum of non-repeating (distinct) elements in an array.
   * Solution:
   */

  /**
   * 131.
   * Problem: Minimum sum of absolute difference of pairs of two arrays.
   * Solution:
   */

  /**
   * 132.
   * Problem: Find the largest multiple of 3 from array of digits | Set 2 (In O(n) time and O(1) space).
   * Solution:
   */

  /**
   * 133.
   * Problem: Stooge Sort.
   * Solution:
   */

  /**
   * 134.
   * Problem: Serial Sort v/s Parallel Sort in Java.
   * Solution:
   */

  /**
   * 135.
   * Problem: 3-way Merge Sort.
   * Solution:
   */

  /**
   * 136.
   * Problem: Noble integers in an array (count of greater elements is equal to value).
   * Solution:
   */

  /**
   * 137.
   * Problem: Find maximum height pyramid from the given array of objects.
   * Solution:
   */

  /**
   * 138.
   * Problem: Program to check if an array is sorted or not (Iterative and Recursive).
   * Solution:
   */

  /**
   * 139.
   * Problem: Smallest Difference Triplet from Three arrays.
   * Solution:
   */

  /**
   * 140.
   * Problem: Program to print an array in Pendulum Arrangement.
   * Solution:
   */

  /**
   * 141.
   * Problem: Smallest Difference pair of values between two unsorted Arrays.
   * Solution:
   */

  /**
   * 142.
   * Problem: Find whether it is possible to make array elements same using one external number.
   * Solution:
   */

  /**
   * 143.
   * Problem: Sort an array of strings  according to string lengths.
   * Solution:
   */

  /**
   * 144.
   * Problem: Check if it is possible to sort an array with conditional swapping of adjacent allowed.
   * Solution:
   */

  /**
   * 145.
   * Problem: TimSort.
   * Solution:
   */

  /**
   * 146.
   * Problem: Sort an array after applying the given equation.
   * Solution:
   */

  /**
   * 147.
   * Problem: Print array of strings in sorted order without copying one string into another.
   * Solution:
   */

  /**
   * 148.
   * Problem: Sort elements on the basis of number of factors.
   * Solution:
   */

  /**
   * 149.
   * Problem: Delete consecutive same words in a sequence.
   * Solution:
   */

  /**
   * 150.
   * Problem: Bead Sort | A Natural Sorting Algorithm.
   * Solution:
   */

  /**
   * 151.
   * Problem: C program to sort an array of strings using Selection Sort.
   * Solution:
   */

  /**
   * 152.
   * Problem: Sum of minimum absolute difference of each array element.
   * Solution:
   */

  /**
   * 153.
   * Problem: Longest Common Prefix | Set 6 (Sorting).
   * Solution:
   */

  /**
   * 154.
   * Problem: Find shortest unique prefix for every word in a given list | Set 2 (Using Sorting).
   * Solution:
   */

  /**
   * 155.
   * Problem: Maximizing Unique Pairs from two arrays.
   * Solution:
   */

  /**
   * 156.
   * Problem: Check whether a given array is a k sorted array or not.
   * Solution:
   */

  /**
   * 157.
   * Problem: Bubble sort using two Stacks.
   * Solution:
   */

  /**
   * 158.
   * Problem: Count pairs from two sorted arrays whose sum is equal to a given value x.
   * Solution:
   */

  /**
   * 159.
   * Problem: Recursive Selection Sort.
   * Solution:
   */

  /**
   * 160.
   * Problem: Alternative Sorting.
   * Solution:
   */

  /**
   * 161.
   * Problem: Find a pair of elements swapping which makes sum of two arrays same.
   * Solution:
   */

  /**
   * 162.
   * Problem: Sort a stack using a temporary stack.
   * Solution:
   */

  /**
   * 163.
   * Problem: Count pairs from two linked lists whose sum is equal to a given value.
   * Solution:
   */

  /**
   * 164.
   * Problem: Find the Sub-array with sum closest to 0.
   * Solution:
   */

  /**
   * 165.
   * Problem: Maximum product of subsequence of size k.
   * Solution:
   */

  /**
   * 166.
   * Problem: Count quadruples from four sorted arrays whose sum is equal to a given value x.
   * Solution:
   */

  /**
   * 167.
   * Problem: Insertion Sort for Doubly Linked List.
   * Solution:
   */

  /**
   * 168.
   * Problem: Sort the biotonic doubly linked list.
   * Solution:
   */

  /**
   * 169.
   * Problem: Why is it faster to process sorted array than an unsorted array ?.
   * Solution: Branch Prediction.
   * https://stackoverflow.com/questions/11227809/why-is-it-faster-to-process-a-sorted-array-than-an-unsorted-array
   */

  /**
   * 170.
   * Problem: Recursive selection sort for singly linked list | Swapping node links.
   * Solution:
   */


  /**
   * 171.
   * Problem: Why quicksort is better than mergesort ?

   * Solution:
   */

  /**
   * 172.
   * Problem: Sorting Array Elements By Frequency | Set 3 (Using STL)

   * Solution:
   */


  /**
   * 173.
   * Problem: Find first k natural numbers missing in given array

   * Solution:
   */


  /**
   * 174.
   * Problem: Merging two unsorted arrays in sorted order

   * Solution:
   */

  /**
   * 175.
   * Problem: Ways to sort list of dictionaries by values in Python – Using itemgetter

   * Solution:
   */


  /**
   * 176.
   * Problem: Minimum number of distinct elements after removing m items

   * Solution:
   */






  /**
   * 177.
   * Problem: Smallest element in an array that is repeated exactly ‘k’ times.

   * Solution:
   */

  /**
   * 178.
   * Problem: Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..

   * Solution:
   */


  /**
   * 179.
   * Problem: Sort first half in ascending and second half in descending order

   * Solution:
   */








  /**
   * 180.
   * Problem: Insertion sort using C++ STL

   * Solution:
   */

  /**
   * 181.
   * Problem: Check if a grid can become row-wise and column-wise sorted after adjacent swaps

   * Solution:
   */


  /**
   * 182.
   * Problem: Sort a linked list of 0s, 1s and 2s by changing links

   * Solution:
   */











  /**
   * 183.
   * Problem: Sorting array of strings (or words) using Trie

   * Solution:
   */

  /**
   * 184.
   * Problem: Sort an array according to absolute difference with a given value “using constant extra space”

   * Solution:
   */


  /**
   * 185.
   * Problem: A sorting algorithm that slightly improves on selection sort

   * Solution:
   */










  /**
   * 186.
   * Problem: How to make Mergesort to perform O(n) comparisons in best case?

   * Solution:
   */

  /**
   * 187.
   * Problem: Dual pivot Quicksort

   * Solution:
   */


  /**
   * 188.
   * Problem: Sort elements by frequency | Set 4 (Efficient approach using hash)

   * Solution:
   */



  /**
   * 189.
   * Problem: Maximum area rectangle by picking four sides from array

   * Solution:
   */

  /**
   * 190.
   * Problem: Check if given array is almost sorted (elements are at-most one position away)

   * Solution:
   */


  /**
   * 191.
   * Problem: Sort a binary array using one traversal

   * Solution:
   */


  /**
   * 192.
   * Problem: Count points covered by given intervals

   * Solution:
   */

  /**
   * 193.
   * Problem: Difference between highest and least frequencies in an array

   * Solution:
   */


  /**
   * 194.
   * Problem: Sort string of characters

   * Solution:
   */






  /**
   * 195.
   * Problem: Minimum product pair an array of positive Integers

   * Solution:
   */

  /**
   * 196.
   * Problem: Stable Selection Sort

   * Solution:
   */


  /**
   * 197.
   * Problem: Circle Sort

   * Solution:
   */

  /**
   * 198.
   * Problem: Sort a Rotated Sorted Array

   * Solution:
   */

  /**
   * 199.
   * Problem: Pairs with Difference less than K

   * Solution:
   */


  /**
   * 200.
   * Problem: Maximize the sum of arr[i]*i

   * Solution:
   */


  /**
   * 201.
   * Problem: Sorting an array according to another array using pair in STL

   * Solution:
   */

  /**
   * 202.
   * Problem: Median after K additional integers

   * Solution:
   */


  /**
   * 203.
   * Problem: Rearrange positive and negative numbers using inbuilt sort function

   * Solution:
   */






  /**
   * 204.
   * Problem: Minimum cost to sort a matrix of numbers from 0 to n^2 – 1
   * Solution:
   */

  /**
   * 205.
   * Problem: Program to sort string in descending order

   * Solution:
   */


  /**
   * 206.
   * Problem: Job Sequencing Problem – Loss Minimization

   * Solution:
   */

  /**
   * 207.
   * Problem: Quickselect Algorithm

   * Solution:
   */

  /**
   * 208.
   * Problem: Minimum number of elements to add to make median equals x

   * Solution:
   */


  /**
   * 209.
   * Problem: Counting cross lines in an array

   * Solution:
   */


  /**
   * 210.
   * Problem: Elements to be added so that all elements of a range are present in array

   * Solution:
   */

  /**
   * 211.
   * Problem: Find array with k number of merge sort calls

   * Solution:
   */


  /**
   * 212.
   * Problem: Sort an array with swapping only with a special element is allowed

   * Solution:
   */






  /**
   * 213.
   * Problem: Sorting using trivial hash function

   * Solution:
   */

  /**
   * 214.
   * Problem: Number of visible boxes after putting one inside another

   * Solution:
   */


  /**
   * 215.
   * Problem: stable_sort() in C++ STL

   * Solution:
   */

  /**
   * 216.
   * Problem: Maximum array from two given arrays keeping order same

   * Solution:
   */

  /**
   * 217.
   * Problem: No of pairs (a[j] >= a[i]) with k numbers in range (a[i], a[j]) that are divisible by x

   * Solution:
   */


  /**
   * 218.
   * Problem: Minimum De-arrangements present in array of AP (Arithmetic Progression)

   * Solution:
   */


  /**
   * 219.
   * Problem: Python | Sort a List according to the Length of the Elements

   * Solution:
   */

  /**
   * 220.
   * Problem: Alternate sorting of Linked list

   * Solution:
   */


  /**
   * 221.
   * Problem: Print n smallest elements from given array in their original order

   * Solution:
   */



  /**
   * 222.
   * Problem: De-arrangements for minimum product sum of two arrays

   * Solution:
   */


  /**
   * 223.
   * Problem: Sort the words in lexicographical order in Python

   * Solution:
   */

  /**
   * 224.
   * Problem: Maximum sum of pairwise product in an array with negative allowed


   * Solution:
   */
  /**
   * 225.
   * Problem: Rearrange array such that even positioned are greater than odd

   * Solution:
   */






  /**
   * 226.
   * Problem: Maximum triplet sum in array

   * Solution:
   */


  /**
   * 227.
   * Problem: Sum of Manhattan distances between all pairs of points

   * Solution:
   */


  /**
   * 228.
   * Problem: Python | Sort Tuples in Increasing Order by any key

   * Solution:
   */

  /**
   * 229.
   * Problem: Sorting array of strings (or words) using Trie | Set-2 (Handling Duplicates)

   * Solution:
   */


  /**
   * 230.
   * Problem: Minimum number of subsets with distinct elements

   * Solution:
   */






  /**
   * 231.
   * Problem: k smallest elements in same order using O(1) extra space

   * Solution:
   */

  /**
   * 232.
   * Problem: Job Selection Problem – Loss Minimization Strategy | Set 2

   * Solution:
   */


  /**
   * 233.
   * Problem: Smallest subset with sum greater than all other elements

   * Solution:
   */

  /**
   * 234.
   * Problem: Minimum number of subtract operation to make an array decreasing


   * Solution:
   */

  /**
   * 235.
   * Problem: Alternate Lower Upper String Sort



   * Solution:
   */

  /**
   * 236.
   * Problem: Merge Sort using Multi-threading


   * Solution:
   */

  /**
   * 237.
   * Problem: QuickSort using Random Pivoting



   * Solution:
   */


  /**
   * 238.
   * Problem: Python | Sort a list according to the second element in sublist

   * Solution:
   */


  /**
   * 239.
   * Problem: Python | Sort words of sentence in ascending order

   * Solution:
   */


  /**
   * 240.
   * Problem: sort() in Python

   * Solution:
   */


  /**
   * 241.
   * Problem: Merge 3 Sorted Arrays

   * Solution:
   */


  /**
   * 242.
   * Problem: Sort an array of 0s, 1s and 2s (Simple Counting)

   * Solution:
   */


  /**
   * 243.
   * Problem: Rank of all elements in an array

   * Solution:
   */


  /**
   * 244.
   * Problem: Insertion Sort by Swapping Elements


   * Solution:
   */


  /**
   * 245.
   * Problem:    Closest numbers from a list of unsorted integers
   * Solution:
   */


  /**
   * 246.
   * Problem: Check if both halves of the string have at least one different character

   * Solution:
   */





  /**
   * 247.
   * Problem: Find k maximum elements of array in original order

   * Solution:
   */



  /**
   * 248.
   * Problem: Median and Mode using Counting Sort

   * Solution:
   */



  /**
   * 249.
   * Problem: Find number of pairs in an array such that their XOR is 0

   * Solution:
   */

















  /**
   * Bubble sort
   * Complexity: O(n^2)
   */
  void bubbleSort(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < array.length - 1 - i; j++)
        if(array[j] > array[j + 1]) swap(array, j, j + 1);
    }
  }

  void recursiveBSort(int[] array, int length) {
    if (length == 1) return;
    for (int i = 0; i < length - 1; i++) if (array[i] > array[i + 1]) swap(array, i, i + 1);
    recursiveBSort(array, length - 1);
  }

  private void swap(int[] a, int i, int j) {
    if (i != j) {
      a[i] = a[i] ^ a[j];
      a[j] = a[i] ^ a[j];
      a[i] = a[i] ^ a[j];
    }
  }

  /**
   * Insertion sort
   * Complexity: O(n^2)
   */
  int[] insertionSort(int[] array) {
    for(int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = key;
    }
    return array;
  }

  /**
   * Counting sort
   * It is an algorithm for sorting a collection of objects according to keys that are small integers;
   * that is, it is an integer sorting algorithm. It operates by counting the number of objects that have each
   * distinct key value, and using arithmetic on those counts to determine the positions of each key value in the
   * output sequence. Its running time is linear in the number of items and the difference between the maximum and
   * minimum key values, so it is only suitable for direct use in situations where the variation in keys is not
   * significantly greater than the number of items.
   * Because counting sort uses key values as indexes into an array, it is not a comparison sort, and the Ω(n log n)
   * lower bound for comparison sorting does not apply to it.
   * Time Complexity: O(n+k)
   */
  void countingSort(int[] array, int k) {
    int[] hash = new int[k+1];
    for(int elem : array) hash[elem]++;
    for (int i = 0; i < hash.length; i++)
      if (hash[i] > 0)
        for (int j = 0; j < hash[i]; j++)
          System.out.print(i + " ");
  }

  void countingSort2(int[] array, int k) {
    int[] hash = new int[k + 1];
    for (int elem : array) hash[elem]++;
    for (int i = 1; i < hash.length; i++) hash[i] += hash[i - 1];
    int[] output = new int[array.length];
    for (int elem : array) {
      output[hash[elem] - 1] = elem;
      hash[elem]--;
    }
    System.arraycopy(output, 0, array, 0, array.length);
  }

  /**
   * Selection sort
   * Step 1 − Set MIN to location 0
   * Step 2 − Search the minimum element in the list
   * Step 3 − Swap with value at location MIN
   * Step 4 − Increment MIN to point to next element
   * Step 5 − Repeat until list is sorted
   * Complexity: O(n^2)
   */
  void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++)
        if (array[minIndex] > array[j]) minIndex = j;
      swap(array, i, minIndex);
    }
  }

  void recursiveSelectionSort(int[] array, int startIndex) {
    if (startIndex < array.length - 1) {
      swap(array, startIndex, getMinIndex(array, startIndex));
      recursiveSelectionSort(array, startIndex + 1);
    }
  }

  private int getMinIndex(int[] array, int startIndex) {
    int minIndex = startIndex;
    for (int j = startIndex + 1; j < array.length; j++)
      if (array[minIndex] > array[j]) minIndex = j;
    return minIndex;
  }

  /**
   * Pancake sorting.
   * Given an an unsorted array, sort the given array. You are allowed to do only following operation on array.
   * flip(arr, i): Reverse array from 0 to i
   * Unlike a traditional sorting algorithm, which attempts to sort with the fewest comparisons possible, the goal
   * is to sort the sequence in as few reversals as possible.
   * Solution: Start from current size equal to n and reduce current size by one while it’s greater than 1.
   * Let the current size be curr_size. Do following for every curr_size
   * 1) Find index of the maximum element in arr[0..curr_size-1]. Let the index be ‘mi’
   * b) Call flip(arr, mi)
   * c) Call flip(arr, curr_size-1)
   */
  void panCakeSort(int[] array, int endIndex) {
    if (endIndex > 0) {
      int maxIndex = getMaxIndex(array, endIndex);
      flip(array, 0, maxIndex);
      flip(array, 0, endIndex);
      panCakeSort(array, endIndex - 1);
    }
  }

  private int getMaxIndex(int[] array, int length) {
    int maxIndex = 0;
    for (int i = 1; i <= length; i++)
      if (array[maxIndex] < array[i]) maxIndex = i;
    return maxIndex;
  }

  private void flip(int[] array, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      swap(array, startIndex, endIndex);
      flip(array, startIndex + 1, endIndex - 1);
    }
  }

  /**
   * Merge sort
   * Complexity: O(nlog(n))
   */
  void mergeSort(int[] array, int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(array, start, mid);
      mergeSort(array,mid + 1, end);
      merge(array, start, mid, end);
    }
  }

  private void merge(int[] array, int start, int mid, int end) {
    int leftCount = mid - start + 1;
    int rightCount = end - mid;
    int[] leftArray = new int[leftCount + 1];
    int[] rightArray = new int[rightCount + 1];
    System.arraycopy(array, start, leftArray, 0, leftCount);
    System.arraycopy(array, mid + 1, rightArray, 0, rightCount);
    leftArray[leftCount] = Integer.MAX_VALUE;
    rightArray[rightCount] = Integer.MAX_VALUE;
    int leftPointer = 0;
    int rightPointer = 0;
    for (int i = start; i <= end; i++) {
      if (leftArray[leftPointer] <= rightArray[rightPointer]) {
        array[i] = leftArray[leftPointer];
        leftPointer++;
      } else {
        array[i] = rightArray[rightPointer];
        rightPointer++;
      }
    }
  }

  /**
   * Heap sort
   * Complexity: O(nlog(n))
   */
  void heapSort(int[] array) {
    int heapSize = array.length;
    buildMaxHeap(array, heapSize);
    for (int i = 0; i < array.length; i++) {
      extractMax(array, heapSize);
      heapSize--;
      heapify(array,0, heapSize);
    }
  }

  /**
   * An n-element heap has height floor(logn) and at most ceiling(n/(2^(h+1))) nodes of any height h.
   * So summation of no of nodes from 0 to height x O(h) reduces to linear time O(n).
   */
  private void buildMaxHeap(int[] array, int heapSize) {
    for (int i = heapSize/2 - 1; i >= 0 ; i--) heapify(array, i, heapSize);
  }

  private void heapify(int[] array, int i, int heapSize) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int max = i;
    if (left < heapSize && array[left] > array[max]) max = left;
    if (right < heapSize && array[right] > array[max]) max = right;
    if (array[i] < array[max]) {
      swap(array, i, max);
      heapify(array, max, heapSize);
    }
  }

  private void extractMax(int[] array, int heapSize) {
    swap(array, 0, heapSize - 1);
  }

  /**
   * Quick sort
   * Complexity: O(nlog(n))
   */
  void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end);
      quickSort(array, start, pivot - 1);
      quickSort(array, pivot + 1, end);
    }
  }

  private int partition(int[] array, int start, int end) {
    int pivot = array[end];
    int soFar = start - 1;
    for (int j = start; j < end; j++) {
      if (array[j] <= pivot) {
        soFar++;
        swap(array, soFar, j);
      }
    }
    swap(array, soFar + 1, end);
    return soFar + 1;
  }

}
