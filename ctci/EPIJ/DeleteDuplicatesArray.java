class DeleteDuplicatesArray {
    public static int deleteDuplicates(List<Integer> array) {
        int writeIndex = 1;
        for(int i = 1; i < array.size(); i++) {
            if(!a.get(writeIndex - 1).equals(a.get(i))) {
                a.set(writeIndex++, a.get(i));
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        int[] A = new int {2, 3, 5, 5 ,6 ,8, 11, 11, 11 13};
        System.out.print(deleteDuplicates(array));
    }
}
