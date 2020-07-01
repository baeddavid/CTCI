// Stack Interface

interface iStack {
    public boolean push(int data);

    public int pop();

    public int peek();

    public int size();

    public boolean isEmpty();

    public void printStack();
}

// Stack Class

class Stack implements iStack {
    private int top;
    private int[] StackArr;

    public Stack(int size) {
        StackArr = new int[size];
        top = -1;
    }

    @Override
    public boolean push(int data) {
        if(top - 1 == StackArr.length) {
            return false;
        }
        StackArr[++top] = data;
        return true;
    }

    @Override
    public int pop() {
        return StackArr[top--];
    }

    @Override
    public int peek() {
        return StackArr[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void printStack() {
        for(Integer value : StackArr) {
            System.out.print("{" + value + "}, ");
        }
    }
}

// Solution to Sort Stack

public class SortStack {
    public static Stack sortStack(Stack s) {
        Stack t = new Stack(s.size());
        while(!s.isEmpty()) {
            int element = s.pop();
            while(!t.isEmpty() && element > t.peek()) {
                s.push(t.pop());
            }
            t.push(element);
        }
        return t;
    }

    public static void main(String[] args) {
        Stack s = new Stack(4);
        s.push(6);
        s.push(13);
        s.push(12);
        s.push(5);

        Stack t = sortStack(s);
        t.printStack();
    }
}
