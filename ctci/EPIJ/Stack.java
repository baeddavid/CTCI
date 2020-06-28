interface IStack <T> {
    public boolean push(T value);

    public T pop();

    public boolean contains(T value);

    public int size();

    public void clear();

    public boolean isEmpty();
}

class ArrayStack <T> implements IStack <T>  {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] store;
    private int size = 0;
    private int capacity;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.capacity = DEFAULT_CAPACITY;
        store = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = top; i >= 0; i--) {
            sb.append(this.pop());
            if(i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

public class Stack {
    public static void main(String[] args) {
        IStack <Integer> s = new ArrayStack <Integer>();
        s.push(4);
        s.push(2);
        String d = s.toString();
        System.out.print(d);
    }
}
