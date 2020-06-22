public class AdvanceByOffsets {
    public static boolean advanceByOffsets(int[] A) {
	int furthestReachSoFar = 0, lastIndex = A.length - 1;
	for(int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIndex; i++) {
	    furthestReachSoFar = Math.max(furthestReachSoFar, i + A[i]);
	}
	return furthestReachSoFar >= lastIndex;
    }
}
