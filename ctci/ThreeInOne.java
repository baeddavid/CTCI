public class ThreeInOne {
    private int NumberOfStacks = 3;
    private int stackCapacity;
    private int[] size;
    private int[] value;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * NumberOfStacks];
        sizes = new int[NumberOfStacks];
    }

    public void push(int stackNum, int value) throws FullStackException {
        if(isFull(stackNum)) {
            throw new FullStackException;
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)];
    }

    public int pop(int stackNum) {
        if(isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[StackNum]--;
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
