class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        
        if(n == 0){
            return 0;
        }
        
        int ans = 0;
        for(int i=1; i<n-1; i++) {
            
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                
            int lo = i-1;
            int hi = i+1;
                
            while(lo >= 0 && arr[lo] < arr[lo + 1]){
                    lo--;
                }
                while(hi < n && arr[hi] < arr[hi - 1]){
                    hi++;
                }
                    lo++;
                    hi--;
                    ans = Math.max(ans, hi - lo + 1);
                }
           }
      
        
       return ans;
    }
}