public class ThreeInOne {
    private int numberOfStacks = 3;
    private int[] stackArr;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }
}
