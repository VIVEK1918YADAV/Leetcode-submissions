class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] ch = colors.toCharArray();
        int cnt = 0;
        
        for(int i=0; i<neededTime.length-1; i++){
            
            if(ch[i] == ch[i+1]){
                
                if( neededTime[i] <  neededTime[i+1]){
                    cnt +=  neededTime[i];
                }
                
                else{
                   cnt +=  neededTime[i+1];
                   neededTime[i+1] =  neededTime[i]; 
                }
            }
        }
        return cnt;
    }
}