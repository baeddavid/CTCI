public class NextGreaterElement {
    public void NextGreaterElement(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int next = -1;
            for(int j = i + 1; j < A.length; j++) {
                if(A[i] < A[j]) {
                    next = A[j];
                    break;
                }
            }
            System.out.print(A[i] + "-->" + next);
        }
    }

    public void NextGreaterElementOptimal(int[] A) {
        Stack s = new Stack(A.length);
        s.push(A[0]);

        for(int i = 1; i < A.length; i++) {
            int next = A[i];
            if(!s.isEmpty()) {
                int element = s.pop();
                while(element < next) {
                    System.out.print(element + "-->" + next);
                    if(!s.isEmpty())
                        break;
                    element = s.pop();
                }
                if(element > next)
                    s.push(element);
            }
            s.push(next);
        }
        while(!s.isEmpty()) {
            element = s.pop();
            next = -1;
            print(element + "-->" + next);
        }
    }
}

class Stack {
    private int top;
    private int[] stackArr;

    public Stack(int size) {
        stackArr = new int[size];
        top = -1;
    }

    public void push(int data) {
        stackArr[++top] = data;
    }

    public int pop() {
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
