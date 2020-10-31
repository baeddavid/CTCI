// Implement a MyQueue class which implements a queue using two stacks

public class MyQueue {
    public static void main(String[] args) {

    }
}

class MyQueue {
    public Stack stack;
    public int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        stack = new Stack(capacity);
    }

    public void enque(int val) {
        if(stack.isEmpty()) { stack.push(val); }
        else {
            Stack temp = new Stack(capacity);
            temp.push(val);
            while(!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            stack = temp;
        }
    }

    public int deque() {
        return stack.pop();
    }
}

class Stack {
    public int top;
    public int[] stackArr;

    public Stack(int capacity) {
        stackArr = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        stackArr[++top] = val;
    }

    public int pop() {
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
