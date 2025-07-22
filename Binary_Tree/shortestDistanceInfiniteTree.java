package Binary_Tree;
// GfG: Find the Distance Between Two Nodes
// Link: https://www.geeksforgeeks.org/problems/find-the-distance-between-two-nodes4402/1

// TC: O(log(max(x, y)))
// SC: O(1)

public class shortestDistanceInfiniteTree {
    public int distance(int x, int y) {
        int count = 0;
        while(x != y) {
            if(x > y)
                x /= 2;
            else
                y /= 2;
            count++;
        }
        return count;
    }
}
