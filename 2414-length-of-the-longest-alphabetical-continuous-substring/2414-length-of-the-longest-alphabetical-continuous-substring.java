class Solution {
    public int longestContinuousSubstring(String s) {
       int cnt=1;
        int total=0;
      int longest=1;
        for(int i=1;i<s.length();i++)
        {
           int e=s.charAt(i)-'a';
              int d=s.charAt(i-1)-'a';
                               
             if((e-d)==1)
            {
                cnt++;
            }
            else
            {
                 cnt=1; 
            }
            longest= Math.max(longest,cnt);  
        }
        return  longest; 
    }
}