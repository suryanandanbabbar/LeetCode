# LeetCode Solutions

This repository contains my personal collection of LeetCode solutions. The solutions are implemented primarily in Java (and in C++) and cover a wide range of topics including:

- Arrays
- Binary Trees & Binary Search Trees
- HashMaps
- Heaps (Priority Queues)
- Kadane's Algorithm
- Queues
- Stacks
- String Manipulation
- Bit Manipulation
- Sliding Window & Two Pointers


## 📁 Repository Structure

Below, click on any topic to view the list of solved problems with details.

<details>
<summary><strong>Arrays</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 1380. | Lucky Number in a Matrix | [Link](https://leetcode.com/problems/lucky-numbers-in-a-matrix/) | LeetCode | O(m * n) | O(m + n) |
| 2 | 90. | Subsets II | [Link](https://leetcode.com/problems/subsets-ii/) | LeetCode | O(n^2 log n) | O(n^2) |
| 3 | 1508. | Range Sum of Sorted Subarray Sums | [Link](https://leetcode.com/problems/range-sum-of-sorted-subarray-sums) | LeetCode | O(n^2 log n) | O(n^2) |
| 4 | 991. | Broken Calculator | [Link](https://leetcode.com/problems/broken-calculator/) | LeetCode | O(log(target/startValue)) | O(1) |
| 5 | 1833. | Maximum Ice Cream Bars | [Link](https://leetcode.com/problems/maximum-ice-cream-bars/description/) | LeetCode | O(n log n) | O(1) |
| 6 | 27. | Remove Element | [Link](https://leetcode.com/problems/remove-element/) | LeetCode | O(n) | O(1) |
| 7 | 26. | Remove Duplicates from Sorted Array | [Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | LeetCode | O(n log n) | O(1) |
| 8 | 435. | Non-overlapping Intervals | [Link](https://leetcode.com/problems/non-overlapping-intervals/) | LeetCode | O(n log n) | O(1) |
| 9 | 80. | Remove Duplicates from Sorted Array II | [Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | LeetCode | O(n) | O(1) |
| 10 | 2270. | Valid Split of an Array | [Link](https://leetcode.com/problems/number-of-ways-to-split-array/) | LeetCode | O(n) | O(1) |
| 11 | 77. | Combinations | [Link](https://leetcode.com/problems/combinations/) | LeetCode | O(n! / (k! * (n - k)!)) | O(k) |
| 12 | 202. | Happy Number | [Link](https://leetcode.com/problems/happy-number/) | LeetCode | O(log n) | O(1) |
| 13 | 56. | Merge Intervals | [Link](https://leetcode.com/problems/merge-intervals/) | LeetCode | O(n log n) | O(n) |
| 14 | 88. | Merge Sorted Array | [Link](https://leetcode.com/problems/merge-sorted-array/) | LeetCode | O((m + n) log(m + n)) | O(1) |
| 15 | 921. | Minimum Add to Make Parentheses Valid | [Link](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/) | LeetCode | O(n) | O(n) |
| 16 | 1051. | Height Checker | [Link](https://leetcode.com/problems/height-checker/) | LeetCode | O(n log n) | O(n) |
| 17 | 189. | Rotate Array | [Link](https://leetcode.com/problems/rotate-array/) | LeetCode | O(n) | O(1) |
| 18 | 1846. | Maximum Element After Decrementing And Rearranging | [Link](https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/) | LeetCode | O(n log n) | O(1) |
| 19 | 1346. | Check If N and Its Double Exist | [Link](https://leetcode.com/problems/check-if-n-and-its-double-exist/) | LeetCode | O(n^2) | O(1) |
| 20 | 9. | Palindrome Number | [Link](https://leetcode.com/problems/palindrome-number/) | LeetCode | O(log n) | O(1) |
| 21 | - | Perfect Sum Problem | [Link](https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1) | GfG | O(n * target) | O(target) |
| 22 | 39. | Combination Sum | [Link](https://leetcode.com/problems/combination-sum/) | LeetCode | O(2^n) | O(k) |
| 23 | - | Subset Sum Problem | [Link](https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1) | GfG | O(n * sum) | O(n * sum) |
| 24 | 7. | Reverse Integer | [Link](https://leetcode.com/problems/reverse-integer/) | LeetCode | O(log n) | O(1) |
| 25 | 69. | Sqrt(x) | [Link](https://leetcode.com/problems/sqrtx/) | LeetCode | O(log x) | O(1) |
| 26 | 169. | Majority Element | [Link](https://leetcode.com/problems/majority-element/) | LeetCode | O(n) | O(1) |
| 27 | 121. | Buy and Sell Stock | [Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | LeetCode | O(n) | O(1) |

</details>

<details>
<summary><strong>Binary_Tree</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | - | Perfect Binary Tree | [Link](https://www.geeksforgeeks.org/problems/perfect-binary-tree/1) | GfG | O(N) | O(h) |
| 2 | - | Children Sum Parent | [Link](https://www.geeksforgeeks.org/problems/children-sum-parent/1) | GfG | O(N) | O(H) |
| 3 | - | Largest Value in Each Level | [Link](https://www.geeksforgeeks.org/problems/largest-value-in-each-level/1) | GfG | O(N) | O(N) |
| 4 | 872. | Leaf-Similar Trees | [Link](https://leetcode.com/problems/leaf-similar-trees/) | LeetCode | O(N + M) | O(N + M) |
| 5 | 110. | Balanced Binary Tree | [Link](https://leetcode.com/problems/balanced-binary-tree/) | LeetCode | O(N) | O(h) |
| 6 | - | Maximum Node Level | [Link](https://www.geeksforgeeks.org/problems/maximum-node-level/1) | GfG | O(n) | O(n) |
| 7 | - | Root to Leaf Paths | [Link](https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1) | GfG | O(N * h) | O(N * h) |
| 8 | 100. | Same Tree | [Link](https://leetcode.com/problems/same-tree/) | LeetCode | O(N) | O(N) |
| 9 | - | Nodes at Odd Levels | [Link](https://www.geeksforgeeks.org/problems/nodes-at-odd-levels/1) | GfG | O(N) | O(N) |
| 10 | - | Top View of Binary Tree | [Link](https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1) | GfG | O(N log N) | O(N) |
| 11 | 236. | Lowest Common Ancestor of a Binary Tree | [Link](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | LeetCode | O(N) | O(H) |
| 12 | - | Root to Leaf Path Sum | [Link](https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1) | GfG | O(N) | O(H) |
| 13 | 101. | Symmetric Tree | [Link](https://leetcode.com/problems/symmetric-tree/) | LeetCode | O(N) | O(N) |
| 14 | 117. | Populating Next Right Pointers in Each Node2 II | [Link](https://leetcode.com/problems/populating-next-right-pointers-in-each-node2-ii/description/) | LeetCode | O(N) | O(N) |
| 15 | - | Find the Distance Between Two Nodes | [Link](https://www.geeksforgeeks.org/problems/find-the-distance-between-two-nodes4402/1) | GfG | O(log(max(x, y))) | O(1) |
| 16 | 199. | Binary Tree Right Side View | [Link](https://leetcode.com/problems/binary-tree-right-side-view/description/) | LeetCode | O(N) | O(H) |
| 17 | - | Left View of Binary Tree | [Link](https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1) | GfG | O(N) | O(N) |
| 18 | 226. | Binary Tree | [Link](https://leetcode.com/problems/invert-binary-tree/description/) | LeetCode | O(N) | O(H) |
| 19 | 111. | Minimum Depth of Binary Tree | [Link](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | LeetCode | O(N) | O(H) |
| 20 | 112. | Path Sum | [Link](https://leetcode.com/problems/path-sum/submissions/1699844158/) | LeetCode | O(N) | O(N) |
| 21 | 669. | Trim a Binary Search Tree | [Link](https://leetcode.com/problems/trim-a-binary-search-tree/description/) | LeetCode | O(N) | O(H) |
| 22 | - | Bottom View of Binary Tree | [Link](https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1) | GfG | O(N log N) | O(N) |
| 23 | 543. | Diameter of Binary Tree | [Link](https://leetcode.com/problems/diameter-of-binary-tree/) | LeetCode | O(n) | O(h) |

</details>

<details>
<summary><strong>Binary_Search_Tree</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | - | Print BST Elements in Given Range | [Link](https://practice.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1) | GfG | O(N) | O(N) |
| 2 | - | Largest BST from BT | [Link](https://www.geeksforgeeks.org/problems/largest-bst/1) | GfG | O(N) | O(N) |
| 3 | 450. | Delete Node in BST | [Link](https://leetcode.com/problems/delete-node-in-a-bst/submissions/1701090443/) | LeetCode | O(H) | O(H) |
| 4 | 701. | Insert into Binary Search Tree | [Link](https://leetcode.com/problems/insert-into-a-binary-search-tree/) | LeetCode | O(n) worst-case | O(n) worst-case |
| 5 | 95. | Unique Binary Search Trees II | [Link](https://leetcode.com/problems/unique-binary-search-trees-ii/description) | LeetCode | O(4^n / n^(3/2)) | O(n) |
| 6 | 230. | Kth Smallest Element in a BST | [Link](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description) | LeetCode | O(H + k) | O(H) |
| 7 | 108. | Convert Sorted Array to Binary Search Tree | [Link](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | LeetCode | O(N) | O(N) |
| 8 | - | Minimum Element in BST | [Link](https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1) | GfG | O(H) | O(1) |
| 9 | 99. | Recover Binary Search Tree | [Link](https://leetcode.com/problems/recover-binary-search-tree/description/) | LeetCode | O(N) | O(H) |
| 10 | - | Floor in BST | [Link](https://www.geeksforgeeks.org/problems/floor-in-bst/1) | GfG | O(h) |  |
| 11 | - | Check Whether BST Contains Dead End | [Link](https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1) | GfG | O(N) | O(N) |
| 12 | - | Brothers from Different Root | [Link](https://www.geeksforgeeks.org/problems/brothers-from-different-root/1) | GfG | O(N1 + N2) | O(N1 + N2) |
| 13 | - | Merge Two BSTs | [Link](https://www.geeksforgeeks.org/problems/merge-two-bst-s/1) | GfG | O(N + M) | O(N + M) |
| 14 | - | Sum of K Smallest Elements in BST | [Link](https://www.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst3029/1) | GfG | O(N) | O(N) |
| 15 | - | Delete Nodes Greater Than K | [Link](https://www.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1) | GfG | O(N) | O(N) |
| 16 | 700. | Search in a Binary Search Tree | [Link](https://leetcode.com/problems/search-in-a-binary-search-tree/) | LeetCode | O(H) | O(H) |
| 17 | 98. | Validate Binary Search Tree | [Link](https://leetcode.com/problems/validate-binary-search-tree/description/) | LeetCode | O(H) | O(H) |
| 18 | 109. | Convert Sorted List to Binary Search Tree | [Link](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/) | LeetCode | O(N) | O(log N) |
| 19 | - | Print Common Nodes in BST | [Link](https://www.geeksforgeeks.org/problems/print-common-nodes-in-bst/1) | GfG | O(N1 + N2) | O(N1 + N2) |
| 20 | 653. | Two Sum IV - Input is a BST | [Link](https://leetcode.com/problems/two-sum-iv-input-is-a-bst) | LeetCode | O(N) | O(N) |
| 21 | - | Implementing Ceil in BST | [Link](https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1) | GfG | O(h) | O(1) |
| 22 | 1382. | Balance a Binary Search Tree | [Link](https://leetcode.com/problems/balance-a-binary-search-tree/description/) | LeetCode | O(N) | O(N) |
| 23 | - | Predecessor and Successor in BST | [Link](https://www.geeksforgeeks.org/problems/predecessor-and-successor/1) | GfG | O(N) | O(N) |
| 24 | - | Median of BST | [Link](https://www.geeksforgeeks.org/problems/median-of-bst/1) | GfG | O(N) | O(N) |

</details>

<details>
<summary><strong>Graphs</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | - | Print Adjacency List | [Link](https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1) | GfG | O(V + E) | O(V + E) |
| 2 | 200. | Number of Islands | [Link](https://leetcode.com/problems/number-of-islands/) | LeetCode | O(m * n) | O(m * n) |
| 3 | - | BFS Traversal of Graph | [Link](https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1) | GfG | O(V + E) | O(V + E) |
| 4 | - | Depth First Traversal of Graph | [Link](https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1) | GfG | O(V + E) | O(V) |
| 5 | 542. | 01 Matrix | [Link](https://leetcode.com/problems/01-matrix/description/) | LeetCode | O(m * n) | O(m * n) |
| 6 | - | Creating and Printing Adjacency List | [Link](https://www.naukri.com/code360/problems/creating-and-printing_1214551) | GfG | O(V + E) | O(V + E) |
| 7 | - | Count Connected Components | [Link](https://neetcode.io/problems/count-connected-components) | NeetCode | O(V + E) | O(V + E) |
| 8 | - | Detect Cycle in an Undirected Graph | [Link](https://www.geeksforgeeks.org/detect-cycle-in-an-undirected-) | GfG | O(V + E) | O(V + E) |
| 9 | 130. | Surrounded Regions | [Link](https://leetcode.com/problems/surrounded-regions/description/) | LeetCode | O(m * n) | O(m * n) |
| 10 | 994. | Rotting Oranges | [Link](https://leetcode.com/problems/rotting-oranges/description/) | LeetCode | O(m * n) | O(m * n) |

</details>

<details>
<summary><strong>HashMap</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 1207. | Unique Number of Occurrences | [Link](https://leetcode.com/problems/unique-number-of-occurrences/) | LeetCode | O(n) | O(n) |
| 2 | 930. | Binary Subarrays With Sum | [Link](https://leetcode.com/problems/binary-subarrays-with-sum/) | LeetCode | O(n) | O(n) |
| 3 | 383. | Ransom Note | [Link](https://leetcode.com/problems/ransom-note/description/) | LeetCode | O(n + m) | O(n) |

</details>

<details>
<summary><strong>Heaps</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 1046. | Last Stone Weight | [Link](https://leetcode.com/problems/last-stone-weight/description/) | LeetCode | O(N log N) | O(N) |
| 2 | - | K-th Largest Sum Contiguous Subarray | [Link](https://www.naukri.com/code360/problems/k-th-largest-sum-contiguous-subarray_920398) | Code360 | O(N^2 log K) | O(K) |
| 3 | 347. | Top K Frequent Elements | [Link](https://leetcode.com/problems/top-k-frequent-elements/description/) | LeetCode | O(N log K) | O(K) |
| 4 | - | Sum of Elements Between K1th and K2th Smallest Elements | [Link](https://www.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements3133/1) | GfG | O(N long N) | O(N) |
| 5 | - | Merge K Sorted Arrays | [Link](https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1) | GfG | O(N log K) | O(N) |
| 6 | - | Merge Two Binary Max Heaps | [Link](https://www.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1) | GfG | O((N + M) log(N + M)) | O(N + M) |
| 7 | - | Does Array Represent Heap? | [Link](https://www.geeksforgeeks.org/problems/does-array-represent-heap4345/1) | GfG | O(N) | O(1) |
| 8 | - | Minimum Cost of Ropes | [Link](https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1) | GfG | O(N log N) | O(N) |
| 9 | - | Kth Smallest Element | [Link](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1) | GfG | O(N log K) | O(K) |
| 10 | 215. | Kth Largest Element in an Array | [Link](https://leetcode.com/problems/kth-largest-element-in-an-array/description/) | LeetCode | O(N log K) | O(K) |
| 11 | 2558. | Take Gifts From the Richest Pile | [Link](https://leetcode.com/problems/take-gifts-from-the-richest-pile/) | LeetCode | O(k log N) | O(N) |
| 12 | - | Height of Heap | [Link](https://www.geeksforgeeks.org/problems/height-of-heap5025/1) | GfG | O(log N) | O(1) |
| 13 | - | Magician and Chocolates | [Link](https://www.naukri.com/code360/problems/magician-and-chocolates_920437) | Code360 | O(N log N) | O(N) |

</details>

<details>
<summary><strong>Kadane_Algorithm</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 918. | Maximum Sum Circular Subarray | [Link](https://leetcode.com/problems/maximum-sum-circular-subarray/) | LeetCode | O(n) | O(1) |

</details>

<details>
<summary><strong>Queues</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | - | Reverse First K Elements of Queue | [Link](https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue) | GfG | O(n) | O(n) |
| 2 | 2014. | Longest Substring With K Repeating Characters | [Link](https://leetcode.com/problems/longest-substring-with-k-repeating-characters) | LeetCode | O(n * k) | O(n) |
| 3 | 225. | Implement Stack using Queues | [Link](https://leetcode.com/problems/implement-stack-using-queues/) | LeetCode | O(n) | O(n) |
| 4 | - | Generate Binary Numbers | [Link](https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620) | GfG | O(n) | O(n) |

</details>

<details>
<summary><strong>Stack</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 234. | Palindrome Linked List | [Link](https://leetcode.com/problems/palindrome-linked-list/) | LeetCode | O(n) | O(n) |
| 2 | 3174. | Clear Digits | [Link](https://leetcode.com/problems/clear-digits/) | LeetCode | O(n) | O(n) |
| 3 | 1544. | Make The String Great | [Link](https://leetcode.com/problems/make-the-string-great/) | LeetCode | O(n) | O(n) |
| 4 | 1021. | Remove Outermost Parentheses | [Link](https://leetcode.com/problems/remove-outermost-parentheses/) | LeetCode | O(n) | O(n) |
| 5 | - | Next Greater Element | [Link](https://www.naukri.com/code360/problems/next-greater-element_1112581) | Code360 | O(n) | O(n) |
| 6 | 1019 | : Next Greater Node In Linked List | [Link](https://www.geeksforgeeks.org/problems/next-larger-element-1587115620) | LeetCode | O(n) | O(n) |
| 7 | 682. | Baseball Game | [Link](https://leetcode.com/problems/baseball-game/) | LeetCode | O(n) | O(n) |
| 8 | 2487. | Remove Nodes From Linked List | [Link](https://leetcode.com/problems/remove-nodes-from-linked-list/) | LeetCode | O(n) | O(n) |
| 9 | 1209 | : Remove All Adjacent Duplicates in String II | [Link](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/) | LeetCode | O(n) | O(n) |
| 10 | - | Smallest Number on Left | [Link](https://www.geeksforgeeks.org/problems/smallest-number-on-left3403) | GfG | O(n) | O(n) |
| 11 | 1653. | Minimum Deletions to Make String Balanced | [Link](https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/) | LeetCode | O(n) | O(n) |
| 12 | 2696. | Minimum String Length After Removing Substrings | [Link](https://leetcode.com/problems/minimum-string-length-after-removing-substrings/) | LeetCode | O(n) | O(n) |
| 13 | 921. | Minimum Add to Make Parentheses Valid | [Link](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/) | LeetCode | O(n) | O(n) |
| 14 | 232. | Implement Queue using Stacks | [Link](https://leetcode.com/problems/implement-queue-using-stacks/) | LeetCode | O(n) | O(n) |
| 15 | 1475. | Final Prices With a Special Discount in a Shop | [Link](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a) | LeetCode |  |  |
| 16 | 150. | Evaluate Reverse Polish Notation | [Link](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | LeetCode | O(n) | O(n) |
| 17 | 1598. | Crawler Log Folder | [Link](https://leetcode.com/problems/crawler-log-folder/) | LeetCode | O(n) | O(1) |
| 18 | 1047. | Remove All Adjacent Duplicates In String | [Link](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/) | LeetCode | O(n) | O(n) |
| 19 | 735. | Asteroid Collision | [Link](https://leetcode.com/problems/asteroid-collision/) | LeetCode | O(n) | O(n) |

</details>

<details>
<summary><strong>Strings</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 3304. | Kth Character in String Game I | [Link](https://leetcode.com/problems/find-the-k-th-character-in-string-game-i) | LeetCode | O(1) | O(1) |
| 2 | 6. | ZigZag Conversion | [Link](https://leetcode.com/problems/zigzag-conversion/description/) | LeetCode | O(n) | O(n) |
| 3 | 1328. | Break a Palindrome | [Link](https://leetcode.com/problems/break-a-palindrome/) | LeetCode | O(n) | O(n) |
| 4 | 3042. | Is Prefix and Suffix | [Link](https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/) | LeetCode | O(n) | O(1) |
| 5 | 3136. | Valid Word | [Link](https://leetcode.com/problems/valid-word/) | LeetCode | O(n) | O(1) |
| 6 | 131. | Palindrome Partioning | [Link](https://leetcode.com/problems/palindrome-partitioning/) | LeetCode | O(n * 2^n) | O(n * 2^n) |
| 7 | 2678. | Count the Number of Senior Citizens | [Link](https://leetcode.com/problems/number-of-senior-citizens/description/) | LeetCode | O(n) | O(1) |
| 8 | 17. | Letter Combinations of Phone Number | [Link](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | LeetCode | O(3^n) | O(3^n) |
| 9 | 3337. | Total Characters in String After Transformations II | [Link](https://leetcode.com/problems/total-characters-in-string-after-transformations-ii/description/) | LeetCode | O(t * n * m) | O(n * m) |
| 10 | 205. | Isomorphic Strings | [Link](https://leetcode.com/problems/isomorphic-strings/) | LeetCode | O(n) | O(1) |
| 11 | 451. | Sort Characters By Frequency | [Link](https://leetcode.com/problems/sort-characters-by-frequency/description/) | LeetCode | O(n log n) | O(n) |
| 12 | 2053. | Kth Distinct String in an Array | [Link](https://leetcode.com/problems/distinct-string/) | LeetCode | O(n) | O(n) |
| 13 | 3335. | Total Characters in String After Transformations | [Link](https://leetcode.com/problems/total-characters-in-string-after-transformations-i/) | LeetCode | O(t * n) | O(1) |

</details>

<details>
<summary><strong>Bit_Manipulation</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | - | Bit Manipulation | [Link](https://www.geeksforgeeks.org/problems/bit-manipulation-1666686020/1) | GfG | O(1) | O(1) |
| 2 | - | Odd or Even | [Link](https://www.geeksforgeeks.org/problems/odd-or-even3618/1) | GfG | O(1) | O(1) |
| 3 | 231. | Power of Two | [Link](https://leetcode.com/problems/power-of-two/) | LeetCode | O(1) | O(1) |
| 4 | - | RightMost Different Bit | [Link](https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1) | GfG | O(log(max(m, n))) | O(1) |
| 5 | 485. | Max Consecutive Ones | [Link](https://leetcode.com/problems/max-consecutive-ones/) | LeetCode | O(n) | O(1) |
| 6 | 338. | Counting Bits | [Link](https://leetcode.com/problems/counting-bits/) | LeetCode | O(n) | O(n) |
| 7 | - | Find XOR of Numbers from L to R | [Link](https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1) | GfG | O(1) | O(1) |
| 8 | - | Set the Rightmost Unset Bit | [Link](https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1) | GfG | O(1) | O(1) |
| 9 | 2220. | Minimum Bit Flips to Convert Number | [Link](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/) | LeetCode | O(log n) | O(1) |
| 10 | - | Find First Set Bit | [Link](https://www.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1) | GfG | O(log n) | O(1) |
| 11 | - | Check Kth Bit Set or Not | [Link](https://www.geeksforgeeks.org/check-kth-bit-set-not/) | GfG | O(1) | O(1) |
| 12 | - | Swap Two Numbers | [Link](https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1) | GfG | O(1) | O(1) |
| 13 | - | Print All Bitwise Subsets of a Number | [Link](https://www.geeksforgeeks.org/problems/print-all-bitwise-subsets-of-a-number-n3301/1) | GfG | O(n) | O(n) |
| 14 | 136. | Single Number | [Link](https://leetcode.com/problems/single-number/) | LeetCode | O(n) | O(1) |
| 15 | 67. | Add Binary | [Link](https://leetcode.com/problems/add-binary/) | LeetCode | O(max(m, n)) | O(max(m, n)) |
| 16 | 191. | Number of 1 Bits | [Link](https://leetcode.com/problems/number-of-1-bits/) | LeetCode | O(log n) | O(1) |

</details>

<details>
<summary><strong>Two_Pointers</strong></summary>

| S.No | QuestionNumber | Title | Link | Platform | Time | Space |
|---|---|---|---|---|---|---|
| 1 | 125. | Valid Palindrome | [Link](https://leetcode.com/problems/valid-palindrome/) | LeetCode | O(n) | O(1) |
| 2 | 948. | Bag of Tokens | [Link](https://leetcode.com/problems/bag-of-tokens/) | LeetCode | O(n log n) | O(1) |
| 3 | 3. | Longest Substring Without Repeating Characters | [Link](https://leetcode.com/problems/longest-substring-without-repeating-characters) | LeetCode | O(n) | O(min(n, m)) |
| 4 | 1358. | Number of Substrings Containing All Three Characters | [Link](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/) | LeetCode | O(n) | O(1) |
| 5 | 209. | Minimum Size Subarray Sum | [Link](https://leetcode.com/problems/minimum-size-subarray-sum/) | LeetCode | O(n) | O(1) |
| 6 | 392. | Is Subsequence | [Link](https://leetcode.com/problems/is-subsequence/description/) | LeetCode | O(n) | O(1) |
| 7 | 128. | Longest Consecutive Sequence | [Link](https://leetcode.com/problems/longest-consecutive-sequence/) | LeetCode | O(n) | O(n) |
| 8 | 2958. | Length of Longest Subarray with at most K Frequency | [Link](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency) | LeetCode | O(n) | O(n) |
| 9 | 5. | Longest Palindromic Substring | [Link](https://leetcode.com/problems/longest-palindromic-substring/description/) | LeetCode | O(n^2) | O(1) |
| 10 | 713. | Subarray Product Less Than K | [Link](https://leetcode.com/problems/subarray-product-less-than-k/) | LeetCode | O(n) | O(1) |
| 11 | 167. | Two Sum II - Input array is sorted | [Link](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted) | LeetCode | O(n) | O(1) |
| 12 | 881. | Boats to Save People | [Link](https://leetcode.com/problems/boats-to-save-people/) | LeetCode | O(n log n) | O(1) |
| 13 | 875. | Koko Eating Bananas | [Link](https://leetcode.com/problems/koko-eating-bananas/) | LeetCode | O(n log(max(piles))) | O(1) |
| 14 | 14. | Longest Common Prefix | [Link](https://leetcode.com/problems/longest-common-prefix/) | LeetCode | O(n * m) | O(1) |
| 15 | 1482. | Minimum Number of Days to Make m Bouquets | [Link](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/) | LeetCode | O(n log(max(bloomDay))) | O(1) |
| 16 | 1004. | Max Consecutive Ones III | [Link](https://leetcode.com/problems/max-consecutive-ones-iii/) | LeetCode | O(n) | O(1) |

</details>


## Programming Stack Used

- Java 17+
- C++


## 🏁 Getting Started

To try out the solutions locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/suryanandanbabbar/LeetCode.git
   cd LeetCode
   ```
2. Open in your favorite IDE (e.g., IntelliJ, VS Code).
3. Run any solution as a standalone file or include it in a test suite.

## Let's Connect
- LinkedIn: https://www.linkedin.com/in/suryanandanbabbar/
- GitHub: https://github.com/suryanandanbabbar/
- Portfolio: https://suryanandan.framer.website/

## Note

All solutions are added after solving and understanding the problem — no blind copying. Contributions & PRs are welcome if you would like to improve or add optimized versions.

---

If this repo helps you in your journey, consider giving it a ⭐!
