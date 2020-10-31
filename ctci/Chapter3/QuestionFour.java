// Implement a MyQueue class which implements a queue using two stacks

public class QuestionFour {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
    }
}

class MyQueue {
    public Stack stack;
    public int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        stack = new Stack(capacity);
    }

    // This is the O(n) enque implementation
    public void enque(int val) {
        if(stack.isEmpty()) { stack.push(val); }
        else {
            Stack temp = new Stack(capacity);
            while(!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            stack.push(val);
            while(!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
    }

    public int deque() {
        return stack.pop();
    }

    // This is the O(n) deque implementation
    public void enque(int val) {
        stack.push(val);
    }

    public int deque() {
        Stack temp = new Stack(capacity);

        if(!stack.isEmpty()) {
            while(!stack.isEmpty()) {
                temp.push(stack.pop());
            }
        }
        stack = temp;
        return stack.pop();
    }
}

class Stack {
    public int top;
    public int[] stackArr;
    public int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
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
