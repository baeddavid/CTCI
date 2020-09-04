import java.util.HashMap;

class LRUCache {
    // Attributes
    public LRULinkedList list;
    public HashMap <Integer, LRUNode> map;
    public int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        list = new LRULinkedList();
        map = new HashMap<>();
    }

    public int get(int key) {
        LRUNode retrievedNode;
        if(map.containsKey(key)) {
            retrievedNode = map.get(key);
        } else {
            return -1;
        }
        if(list.getSize() != 1) {
            list.delete(retrievedNode);
            list.insert(retrievedNode.data.key, retrievedNode.data.val);
        }
        return retrievedNode.data.val;
    }

    public void put(int key, int val) {
        int currentSize = list.getSize();
        if(currentSize == capacity) {
            LRUNode node = list.deleteTail();
            map.remove(node.data.key);
        }
        map.put(key, new LRUNode(key, val));
        list.insert(key, val);
    }

    public void print() {
        list.print();
    }

    private boolean isFull() {
        return list.getSize() == capacity;
    }
}

class LRULinkedList {
    private LRUNode head;
    private LRUNode tail;
    private int size;

    public LRULinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Insert Method - Inserts from the front. We are building list backwards.
    // TODO take a node
    public void insert(int key, int val) {
        LRUNode newNode = new LRUNode(key, val);
        newNode.next = head;
        newNode.prev = null;
        if(head == null) { tail = newNode; }
        if(head != null) { head.prev = newNode; }
        head = newNode;
        size++;
    }

    // Delete Method - Removes a node from the list in constant time
    // TODO make it return a node
    public void delete(LRUNode node) {
        if(node.next == null) {
            deleteTail();
        } else {
            node.data = node.next.data;
            node.next.next.prev = node;
            node.next = node.next.next;
            size--;
        }
    }

    // Delete Tail Method - Removes the tail from the list
    public LRUNode deleteTail() {
        LRUNode deletedNode = tail;
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        size--;
        return deletedNode;
    }

    public void print() {
        LRUNode current = head;
        while(current != null) {
            System.out.print("(" + current.data.key + "," + current.data.val + ")");
            current = current.next;
        }
        System.out.println();
    }

    public LRUNode getTail() {
        return tail;
    }

    // Size Check Method for list
    public int getSize() {
        return size;
    }
}

class LRUNode {
    public LRUNode next;
    public LRUNode prev;
    public LRUPair data;

    public LRUNode(int key, int val) {
        next = null;
        prev = null;
        data = new LRUPair(key, val);
    }
}

class LRUPair {
    public int key;
    public int val;

    public LRUPair(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

public class LRUcachce {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(1);
        cache.put(2, 1);
        cache.print();
        System.out.println(cache.get(2));
        cache.put(3, 2);
        cache.print();
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
    }
}
