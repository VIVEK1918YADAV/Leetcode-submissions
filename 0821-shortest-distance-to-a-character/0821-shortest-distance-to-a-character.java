class Solution {
    public int[] shortestToChar(String s, char c) {
       int min = Integer.MAX_VALUE;
       int n = s.length(); 
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               if(s.charAt(j) == c){
                   min = Math.min(min, Math.abs(i-j));
                   
               }
           }
           arr[i] = min;
           min = Integer.MAX_VALUE;
       } 
        return arr;
    }
}