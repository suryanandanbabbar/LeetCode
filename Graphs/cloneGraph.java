package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class cloneGraph {
    public HashMap<Integer, Node> map = new HashMap<>();
    
    public Node cloneG(Node node) {
        return clone(node);
    }
    
    public Node clone(Node node) {
        if (node == null) return null;
        
        if (map.containsKey(node.val)) 
            return map.get(node.val);
        
        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(newNode.val, newNode);
        
        for (Node neighbor : node.neighbors) 
            newNode.neighbors.add(clone(neighbor));
        
        return newNode;
    }
}
