package Binary_Tree;
// GfG: https://www.geeksforgeeks.org/problems/nodes-at-odd-levels/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

public class nodesOddLevels {
    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int level = 1;
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                Node node = q.remove();
                if (level % 2 == 1)
                    list.add(node.data);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);

                size--;
            }
            level++;
        }
        return list;
    }
}
