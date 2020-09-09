import java.util.HashMap;

class LRUCache {
    private final LinkedList list;
    private final HashMap<Integer, Node> map;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        list = new LinkedList();
        map = new HashMap<>();
    }

    public int get(int key) {
        Node node = map.get(key);
        if(node == null) { return -1; }
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int val) {
        Node node = map.get(key);
        if(node == null) {
            Node newNode = new Node(key, val);
            map.put(key, newNode);
            list.insert(newNode);

            if(list.size() > capacity) {
                Node deleted = list.delete(list.getTail());
                map.remove(deleted.key);
            }
        } else {
            node.val = val;
            moveToHead(node);
        }
    }

    private void moveToHead(Node node) {
        list.delete(node);
        list.insert(node);
    }

    public void print() {
        list.print();
    }
}

class Node {
    public Node next;
    public Node prev;
    public int val;
    public int key;

    public Node(int key, int val) {
        this.val = val;
        this.key = key;
        next = null;
        prev = null;
    }
}

class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public LinkedList() {
        size = 0;
        head = new Node(-1, -1);
        head.prev = null;

        tail = new Node(-1, -1);
        tail.next = null;

        head.next = tail;
        tail.next = head;
    }

    // Insert Method inserts a node at the head
    public void insert(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        size++;
    }

    public Node delete(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        Node deleted = node;

        prev.next = next;
        next.prev = prev;
        size--;

        return deleted;
    }

    public int size() {
        return size;
    }

    public Node getHead() {
        return head.next;
    }

    public Node getTail() {
        return tail.prev;
    }

    public void print() {
        Node current = head.next;
        while(current != tail) {
            System.out.print("(" + current.val + ")");
            current = current.next;
        }
        System.out.println();
    }
}
}
