class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        HashSet<Character> hs = new HashSet<>();
        int i=0, j=0, count=0;
        
        while(j < s.length()){
            if(hs.add(s.charAt(j))){
                count = Math.max(count, j-i+1);
                j++;
            }
            
            else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return count++;
    }
}