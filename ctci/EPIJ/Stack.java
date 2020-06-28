class Stack <T> implements IStack <T> {
    private static fonal int DEFAULT_CAPACITY = 10;
    private T[] store;
    private int size = 0;
    private int capacity;
    private int top;

    @SupressWarnings("unchecked")
    public ArrayStack() {
        this.capacity = DEFAULT_CAPACITY;
        store = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    @SupressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        store = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public boolean push(T value) {
        if(top == store.length - 1) {
            return false;
        }
        store[++top] = value;
        size++;
        return true;
    }

    @Override
    public T pop() {
        if(size <= 0) {
            return null;
        }

        T value = store[top--];
        size--;
        return value;
    }

    @Override
    public boolean contains(T value) {
        boolean found = false;
        for(int i = 0; i < size; i++) {
            T element = store[i];
            if(element.equals(value)) {
                found = true;
            }
        }
        return found;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++) {
            store[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBulder();
        sb.append("[");
        for(int i = top; i >= 0; i--) {
            sb.appendt(this.pop());
            if(i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
