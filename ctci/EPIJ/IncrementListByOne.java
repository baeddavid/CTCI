import java.util.ArrayList;
import java.util.List;

public class IncrementListByOne {
    public static void incrementListByOne(List <Integer> A) {
	int carry = 1;
	for(int i = A.size() - 1; i >= 0; i--) {
	    A.set(i, A.get(i) + carry); 
	    carry = 0;
	    if(A.get(i) == 10) {
		carry = 1;
		A.set(i, 0);
	    } else {
		break;
	    }
	}

	if(A.get(0) == 0) {
	    A.set(0, 1);
	    A.add(0);
	}
    }

    public static void main(String[] args) {
	List <Integer> A = new ArrayList <>();
	A.add(9);
	A.add(9);
	A.add(9);

	incrementListByOne(A);
	System.out.println(A);
    }
}
