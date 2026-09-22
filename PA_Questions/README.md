# Programming & Algorithms (PA) Solutions

Clean, simple Java implementations organized week-wise and topic-wise covering Week 02 through Week 11.

---

## 📑 Curriculum & Directory Structure

### 🔹 [Week 02 - Core Basics & OOP](Week_02_Basics/)
- `OOPPrinciples.java` - Integration of all 4 core OOP principles (Abstraction, Encapsulation, Inheritance, Polymorphism).
- `ExceptionHandlingDemo.java` - Exception handling with `try`, `catch`, and `finally` for `ArithmeticException` and `ArrayIndexOutOfBoundsException`.
- `FixedSlidingWindowSum.java` - Fixed-size sliding window to find maximum sum of contiguous subarray.
- `TwoSumSorted.java` - Two-pointer approach to find pairs matching a target sum in a sorted array.

---

### 🔹 [Week 03 - Sliding Window & Arrays](Week_03_SlidingWindow_Arrays/)
#### General
- `MaxSubarraySumFixed.java` - Fixed-size sliding window maximum subarray sum.
- `MaxVowelsSubstring.java` - Fixed-size sliding window maximum vowels in a substring of length k.
- `VariableSlidingWindow.java` - Variable-sized sliding window for continuous subarray constraints.
- `ArrayListOperations.java` - Core `ArrayList` operations (add, get, set, remove, contains, indexOf, isEmpty).
- `SpiralMatrixTraversal.java` - Spiral matrix traversal using 4-boundary pointers.
- `IndexNegationTechnique.java` - In-place index negation technique to find duplicate and disappeared numbers.
#### LeetCode
- `LC989_AddToArrayFormOfInteger.java` - LeetCode 989: Add to Array-Form of Integer.
- `LC118_PascalsTriangle.java` - LeetCode 118: Pascal's Triangle.

---

### 🔹 [Week 04 - Searching & Sliding Window](Week_04_Searching_SlidingWindow/)
#### General
- `LongestSubstringWithoutRepeating.java` - Sliding window with `HashSet` for longest substring without repeating characters.
- `MinSizeSubarraySum.java` - Sliding window to find minimum length of a subarray meeting a target sum.
- `CountValidSubarrays.java` - Sliding window to count valid subarrays within a specific sum limit.
- `LinearAndBinarySearch.java` - Linear search and Binary search implementations.
- `ElementFrequencyBinarySearch.java` - Modified binary search (first and last occurrences) to compute element frequency.
#### LeetCode
- `LC33_SearchInRotatedSortedArray.java` - LeetCode 33: Search in Rotated Sorted Array.
- `LC34_FindFirstAndLastPosition.java` - LeetCode 34: Find First and Last Position of Element in Sorted Array.

---

### 🔹 [Week 05 - Sorting Algorithms](Week_05_Sorting/)
#### General
- `BubbleSort.java` - Bubble Sort algorithm with early-termination optimization.
- `SelectionSort.java` - Selection Sort algorithm.
- `MergeSort.java` - Divide-and-conquer Merge Sort algorithm.
#### LeetCode
- `LC912_SortAnArray.java` - LeetCode 912: Sort an Array.
- `LC75_SortColors.java` - LeetCode 75: Sort Colors (Dutch National Flag 3-way partition).
- `LC88_MergeSortedArray.java` - LeetCode 88: Merge Sorted Array in-place from the back.
- `LC2418_SortThePeople.java` - LeetCode 2418: Sort the People.

---

### 🔹 [Week 06 - Quick Sort & Recursion / Backtracking / DP](Week_06_QuickSort_Recursion/)
#### General
- `QuickSort.java` - Quick Sort algorithm with partitioning.
#### LeetCode
- `LC78_Subsets.java` - LeetCode 78: Subsets (power set via backtracking).
- `LC198_HouseRobber.java` - LeetCode 198: House Robber (Dynamic Programming).
- `LC17_LetterCombinationsOfAPhoneNumber.java` - LeetCode 17: Letter Combinations of a Phone Number.

---

### 🔹 [Week 07 - Recursion Patterns & LeetCode](Week_07_Recursion_Patterns/)
#### General
- `RecursionPatterns.java` - Recursive patterns: Fibonacci, Substrings vs. Subsequences, and Head vs. Tail recursion.
#### LeetCode
- `LC401_BinaryWatch.java` - LeetCode 401: Binary Watch.

---

### 🔹 [Week 08 - Singly & Doubly Linked Lists](Week_08_LinkedList_Singly_Doubly/)
#### General Singly Linked List
- `SinglyLinkedListOperations.java` - Printing, counting nodes, linear search, finding middle (fast & slow pointers), iterative reversal.
- `NthNodeFromEnd.java` - Find the N-th node from the end of a linked list.
- `RemoveDuplicatesSorted.java` - Remove duplicates from a sorted linked list.
- `DeleteMiddleNode.java` - Delete the middle node of a linked list.
- `PalindromeLinkedList.java` - Check if a linked list is a palindrome.
- `ReverseNodesInKGroup.java` - Reverse nodes in groups of K.
#### General Doubly Linked List
- `DoublyLinkedListOperations.java` - Construction, bidirectional traversal, insertion, and deletion.
- `InsertAfterKeyDLL.java` - Insert a node after a given key in a DLL.
- `DeleteAllOccurrencesDLL.java` - Delete all occurrences of a value in a DLL.
- `ReverseDLL.java` - In-place reversal of a DLL.
- `SecondLargestDLL.java` - Find the second largest element in a DLL without sorting.
- `PalindromeDLL.java` - Check for a palindrome in a DLL using two pointers.
#### LeetCode
- `LC707_DesignLinkedList.java` - LeetCode 707: Design Linked List.

---

### 🔹 [Week 09 - Circular Linked List](Week_09_CircularLinkedList/)
#### General
- `CircularLinkedListOperations.java` - Insertion, reverse printing, and finding the middle element.
- `CountNodesCLL.java` - Count total nodes in a circular linked list.
- `SearchElementCLL.java` - Search for an element in a circular linked list.
- `InsertBeginningCLL.java` - Insert at the beginning of a circular linked list.
- `DeleteNodeCLL.java` - Delete a specific node from a circular linked list.
- `MaxElementCLL.java` - Find the maximum element in a circular linked list.
- `JosephusProblem.java` - Solves the Josephus Problem using a circular linked list.

---

### 🔹 [Week 10 - Linked List LeetCode Challenges](Week_10_LinkedList_LeetCode/)
#### LeetCode
- `LC19_RemoveNthNodeFromEnd.java` - LeetCode 19: Remove Nth Node From End of List.
- `LC24_SwapNodesInPairs.java` - LeetCode 24: Swap Nodes in Pairs.
- `LC1721_SwappingNodesInLinkedList.java` - LeetCode 1721: Swapping Nodes in a Linked List.
- `LC61_RotateList.java` - LeetCode 61: Rotate List.
- `LC143_ReorderList.java` - LeetCode 143: Reorder List.
- `LC142_LinkedListCycleII.java` - LeetCode 142: Linked List Cycle II.
- `LC141_LinkedListCycle.java` - LeetCode 141: Linked List Cycle.

---

### 🔹 [Week 11 - Stacks & LeetCode](Week_11_Stack/)
#### General
- `StackImplementationArray.java` - Stack implementation using fixed-size array (`push`, `pop`, `peek`, `isEmpty`, `isFull`, `size`, and `display`).
#### LeetCode
- `LC155_MinStack.java` - LeetCode 155: Min Stack with constant O(1) time retrieval of minimum element.
- `LC739_DailyTemperatures.java` - LeetCode 739: Daily Temperatures using monotonic stack in O(n) time.
