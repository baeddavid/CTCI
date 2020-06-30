public class BalancedParentheses {
    public boolean areParanthesBalanced(String s) {
        Stack S = new Stack(s.length());
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                S.push(s.charAt(i));
            } else {
                char parantheses = S.pop();
                if(S.isEmpty()) {
                    return false;
                }
                if (!isMatching(parantheses, s.charAt(i))) {
                    return false;
                }
            }
        }
        return S.isEmpty() == true;
    }

    private boolean isMatching(char a, char b) {
        if(a == '{' && b == '}') {
            return true;
        } else if(a =='[' && b == ']') {
            return true;
        } else if(a == '(' && b == ')') {
            return true;
        } else {
            return false;
        }
    }
}

class Stack {
    private char[] stackArr;
    private int top;

    public Stack(int size) {
        stackArr = new char[size];
        top = -1;
    }

    public void push(char data) {
        stackArr[++top] = data;
    }

    public char pop() {
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
