class PairDiv60 {
    // This technically works but its too slow
    public static int numPairsDivisibleBy60(int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if((arr[i] + arr[j]) % 60 == 0) { counter++; }
            }
        }
        return counter;
    }

    public static int optimal(int[] A) {
        int[] cache = new int[60];
        int counter = 0;

        for(int a : A) {
            if(a % 60 == 0) { counter++; }
            else {
                counter += cache[60 - a % 60];
            }
            cache[a % 60]++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.print(numPairsDivisibleBy60(new int[] { 60, 60, 60 }));
    }
}
