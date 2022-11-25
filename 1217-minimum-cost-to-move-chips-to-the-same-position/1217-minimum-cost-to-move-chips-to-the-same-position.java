class Solution {
    public int minCostToMoveChips(int[] position) {
        int n = position.length;
        int cost = 0; 
        int first = 0;
        
        for(int i=0; i<n; i++){
            if(position[i] % 2 == 0)
                cost++;
            
            else
                first++;
        }
        return Math.min(cost, first);
    }
}