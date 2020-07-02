interface iStack {
    public void push(int data);

    public int pop();

    public int size();

    public boolean isEmpty();
}

interface MyQueue {
    public void enque(int data);

    public int deque();

    public int size();

    public boolean isEmpty();
}

class Stack implements iStack {
    private int top;
    private int[] StackArr;

    public Stack(int size) {
        top = -1;
        StackArr = new int[size];
    }

    @Override
    public void push(int data) {
        StackArr[++top] = data;
    }

    @Override
    public int pop() {
        return StackArr[top--];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

public class QueueStack implements MyQueue {
    private Stack s1;
    private Stack s2;

    public QueueStack(int size) {
        s1 = new Stack(size);
        s2 = new Stack(size);
    }

    @Override
    public void enque(int data) {
        s1.push(data);
    }

    @Override
    public int deque() {
        if(s1.isEmpty() && s2.isEmpty())
            return null;

        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        Stack sTemp = s2;
        s2 = s1;
        s1 = sTemp;

        return s1.pop();
    }

    @Override
    public int size() {
        return s1.size();
    }

    @Override
    public boolean isEmpty() {
        return s1.isEmpty();
    }
}
