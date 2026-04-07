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
    HashMap<Integer, Node> cache; // Map key to nodes
    Node left; // Least Recently Used
    Node right; // Most Recently Used

    public LRUCache(int capacity) {
        this.capacity = capacity;    
        this.cache = new HashMap<>(); 
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    
    // Remove node from the list
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    // Insert node into the list at right
    private void insert(Node node) {
        Node prev = right.prev;
        Node next = right;
        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public int get(int key) {
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }
        
        Node newNode = new Node(key, value);
        cache.put(key, newNode); // Point key to the newNode
        insert(newNode); // Insert into linked list

        if(cache.size() > capacity) {
            // Remove the list and delete the LRU from the hashmap
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);

        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */