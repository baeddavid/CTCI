import java.util.ArrayList;

interface IStack {
    public void push(int data);

    public int pop();

    public int size();

    public boolean isEmpty();

    public boolean isFull();
}

interface SetOfStacks {
    public void push(int data);

    public int pop();

    public int size();

    public boolean isEmpty();
}

class Stack implements IStack {
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

    @Override
    public boolean isFull() {
        return top == StackArr.length - 1;
    }
}

public class StackPlates implements SetOfStacks {
    private int topOfStack = 0;
    private int stackSize;
    private ArrayList <Stack> A;

    public StackPlates(int size) {
        stackSize = size;
        A = new ArrayList <>();
    }

    @Override
    public void push(int data) {
        if(A.isEmpty()) {
            A.add(new Stack(stackSize));
        }

        if(A.get(topOfStack).isFull()) {
            topOfStack++;
            A.add(new Stack(stackSize));
        }
        A.get(topOfStack).push(data);
    }

    @Override
    public int pop() {
        if(A.get(topOfStack).isEmpty()) {
            topOfStack--;
        }
        return A.get(topOfStack).pop();
    }

    @Override
    public int size() {
        int size = 0;
        for(Stack st : A) {
            size += st.size();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for(Stack st : A) {
            if(!st.isEmpty())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StackPlates stack = new StackPlates(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print(stack.pop());
        System.out.print(stack.pop());
    }
}
