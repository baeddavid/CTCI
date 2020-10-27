public class QuestionOne {
}

class ThreeStack {
    private final int NUMBER_OF_STACKS = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * NUMBER_OF_STACKS];
        sizes = new int[NUMBER_OF_STACKS];
    }

    public void push(int stackNum, int value) throws FullStackException {
        if(isFull(stackNum)) {
            throw new FullStackException();
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum) {
        if(isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum) {
        if(isEmpty(stackNum)) {
            throw new EmptyStackException();
        }
        return values[indexOfTop(stackNum)];
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }
}
