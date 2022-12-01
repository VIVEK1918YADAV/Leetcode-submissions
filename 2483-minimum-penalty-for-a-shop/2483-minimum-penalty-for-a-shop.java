class Solution {
    public int bestClosingTime(String customers) {
        int nums = 0;
        int max = 0;
        int profit = 0;
        
        for(int i=0; i<customers.length(); i++){
            profit += (customers.charAt(i) == 'Y') ? 1 : -1;
            
           if(max < profit){
               max = profit;
               nums = i+1;
           } 
        }
        return nums;
    }
}