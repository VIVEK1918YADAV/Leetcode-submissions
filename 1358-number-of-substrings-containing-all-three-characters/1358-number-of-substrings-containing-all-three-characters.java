class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length();
        int res=0, j=0;
        int[] nums = new int[3];
        
        for(int i=0; i<n; i++){
            nums[s.charAt(i)-'a']++;
            
            while(nums[0]>0 && nums[1]>0 && nums[2]>0){
                res += n-i;
                
                nums[s.charAt(j++)-'a']--;
            }
        }
        
        return res;
    }
}