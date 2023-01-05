class Solution {
    public int binaryGap(int n) {
       
        int maxi=0, i=-1, j=0;
        while(n > 0){
            
            if((n&1) == 1){
                
                if(i != -1){
                    
                    maxi = Math.max(maxi, j-i);
                }
                
                i=j;
            }
            j++;
            n >>= 1;
        }
        return maxi;
    }
}