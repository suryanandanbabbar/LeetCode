// node
class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    int capacity;
    // HashMap (key -> nodes)
    HashMap<Integer, Node> cache;
    // Left pointer for LRU, right pointer for MRU
    Node left;
    Node right;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        // Link left and right for doubly linked list
        this.left.next = right;
        this.right.prev = left;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            // Remove the node from the list
            remove(node);
            // Insert the node at the rightmost side
            insert(node);
            return node.value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            // Update the value of the key : cache.get(key);
            // Before we can insert the new (key-value) pair, we need to remove it from the list
            remove(cache.get(key));
        }

        Node newNode = new Node(key, value);
        // Point the key to the newNode
        cache.put(key, newNode);
        // Insert into the linked list at right end
        insert(newNode);
        
        // If capacity is not enough
        if(cache.size() > capacity) {
            // Remove the LRU, that is, left 
            // Remove from the list and from the hashmap
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    // Helper method for insertion at the right end
    private void insert(Node node) {
        Node prev = right.prev;
        Node next = right;

        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */