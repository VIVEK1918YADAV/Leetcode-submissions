class Solution {
    public int maxDistance(int[] colors) {
       int cnt = 0;
       int max = 0;
       for(int i=0; i<colors.length; i++){
           cnt = 0;
           for(int j=0; j<colors.length; j++){
               if(colors[i] != colors[j])
                   cnt = Math.abs(i-j);
               
               if(cnt > max)
                   max = cnt;
           }
           
       } 
        return max;
    }
}