class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2001];
        for(int j : arr){
            freq[j+1000]++;
        }
        
        Arrays.sort(freq);
        for(int i=1; i<freq.length; i++){
            if(freq[i] == freq[i-1] && freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}