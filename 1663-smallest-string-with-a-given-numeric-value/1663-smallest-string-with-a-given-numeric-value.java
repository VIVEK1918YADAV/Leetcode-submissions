class Solution {
    public String getSmallestString(int n, int k) {
        char[] ch =  new char[n];
        Arrays.fill(ch, 'a');
        k = k-n;
        
        for(int i=n-1; i>=0; i--){
           if(k > 25){
               ch[i] = 'z';
               k -= 25;
               
           } 
            else if(k == 0) break;
            
            else{
              ch[i] = (char)('a' + k);
              k -= k;  
            }
        }
        return new String(ch);
    }
}