// Write a program to sort a stack such that the smallest items are on the top. You can use an additional temporary stack, but you may not copy
// the elements into any other data structure. The stack supports the following operations: push, pop, peek, and isEmpty.

public class QuestionFive {
    public static void main(String[] args) {
        MinStack stack = new MinStack(5);
        stack.push(4);
        stack.push(7);
        stack.push(-1);
        stack.push(10);
        System.out.println(stack.peek());
    }
}

class MinStack {
    public Stack stack;
    public int capacity;
    public MinStack(int capacity) {
        this.capacity = capacity;
        stack = new Stack(capacity);
    }

    public void push(int val) {
        if(stack.isEmpty()) { stack.push(val); }
        else {
            Stack temp = new Stack(capacity);
            while(!stack.isEmpty() && stack.peek() < val) {
                temp.push(stack.pop());
            }
            stack.push(val);
            while(!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class Stack {
    public int top;
    public int capacity;
    public int[] stackArr;

    public Stack(int capacity) {
        top = -1;
        this.capacity = capacity;
        stackArr = new int[capacity];
    }

    public void push(int val) {
        stackArr[++top] = val;
    }

    public int pop() {
        return stackArr[top--];
    }

    public int peek() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
