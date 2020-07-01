public class StackMax {
    private int top;
    private Node[] StackArr;

    public StackMax(int size) {
        top = -1;
        StackArr = new Node[size];
    }

    public void push(int x) {
        int max = Math.max(x, max());
        Node d = new Node(x, max);
        StackArr[++top] = d;
    }

    public Node pop() {
        return StackArr[top--];
    }

    public int max() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return peek().max;
        }
    }

    public Node peek() {
        return StackArr[top];
    }
   
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackMax s = new StackMax(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(2);

        System.out.print(s.max());
    }
}

class Node {
    public int data;
    public int max;

    public Node(int data, int max) {
        this.data = data;
        this.max = max;
    }
}
