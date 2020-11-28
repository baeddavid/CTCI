// We need to move all the chips to the same position
// Moving a chip two positions costs 0
// Moving a chip one position costs 1

// We need to minmize the number of moves.
// Moving a piece two places cost zero so we can move all pieces to index 0  and 1 for free. The minimum cost is the smaller of the two
class Solution {
    public int minCostToMoveChips(int[] positions) {
        int evenCoin = 0, oddCoin = 0;
        for(int coin : positions) {
            if(coin % 2 == 0) {
                evenCoin++;
            } else {
                oddCoint++;
            }
        }
        return Math.min(evenCoin, oddCoin);
    }
}
