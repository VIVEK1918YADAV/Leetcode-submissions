class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int n = letters.length;
        int lo = 0, hi = n-1;
        
        while(lo <= hi) {
        int mid = lo + (hi - lo)/2;
            
            if(target < letters[mid])
                hi = mid-1;
            
            else
                lo = mid+1;
        }
        
        return letters[lo % n];
    }
}