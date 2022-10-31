class Solution {
    public int poorPigs(int buckets, int tdie, int ttest) {
        int cnt=0;
        int test_val = ttest/tdie;
        
        while( Math.pow(test_val+1,cnt) < buckets ){
            cnt++;
        }
        
        return cnt; 
    }
}