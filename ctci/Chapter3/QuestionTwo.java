// How would you design a stack which, in additon to push and pop, has a function min which returns the minimum element?

public class QuestionTwo {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(4);
        stack.push(-2);
        stack.push(2);
        stack.push(100);
        System.out.println(stack.min());
    }
}

class Stack {
    public int top;
    public Node[] stackArr;
    public int size;

    public Stack(int size) {
        stackArr = new Node[size];
        top = -1;
        size = 0;
    }

    public void push(int val) {
        if(size == 0) {
            stackArr[++top] = new Node(val, val);
            size++;
        } else {
            int min = min();
            stackArr[++top] = new Node(val, Math.min(val, min));
            size++;
        }
    }

    public int pop() {
        size--;
        return stackArr[top--].value;
    }

    public int min() {
        return stackArr[top].minValue;
    }
}

class Node {
    public int value;
    public int minValue;

    public Node(int value, int minValue) {
        this.value = value;
        this.minValue = minValue;
    }
}
