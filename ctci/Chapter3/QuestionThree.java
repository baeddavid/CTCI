// Imagine a literal stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we sould likely start a new stack when the
// previous stack exceeds some threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and
// should create a new stack once the previous one exceeds capacity.

import java.util.List;
import java.util.ArrayList;

public class QuestionThree {
    public static void main(String[] args) {
        SetOfStacks stack = new SetOfStacks(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for(int i = 4; i > 0; i--) {
            System.out.println(stack.pop());
        }
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
        return top == stackArr.length - 1;
    }
}

class SetOfStacks {
    public List<Stack> setOfStacks;
    public int top;
    public int capacity;

    public SetOfStacks(int capacity) {
        setOfStacks = new ArrayList<>();
        setOfStacks.add(new Stack(capacity));
        top = 0;
        this.capacity = capacity;
    }

    public void push(int val) {
        if(setOfStacks.get(top).isFull()) {
            Stack stack = new Stack(capacity);
            stack.push(val);
            setOfStacks.add(stack);
            top++;
        }
        else {
            setOfStacks.get(top).push(val);
        }
    }

    public int pop() {
        if(setOfStacks.get(top).isEmpty()) { top--; }
        return setOfStacks.get(top).pop();
    }
}
