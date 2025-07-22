package Binary_Search_Tree;
// LeetCode Problem: 109. Convert Sorted List to Binary Search Tree
// Link: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

// TC: O(N)
// SC: O(log N)

public class linkedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        return toBST(head, null);
    }

    public TreeNode toBST(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == tail)
            return null;

        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode thead = new TreeNode(slow.val);
        thead.left = toBST(head, slow);
        thead.right = toBST(slow.next, tail);
        return thead;
    }
}
