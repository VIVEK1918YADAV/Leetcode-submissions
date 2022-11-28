class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int k = -1 ;
        int count = 0;
        
        Arrays.sort(candyType);
        
        for(int i=0; i<n; i++){
            
            if(k != candyType[i]){
                count++;
                k = candyType[i];
            }
        }
        return Math.min(count, n/2);
    }
}