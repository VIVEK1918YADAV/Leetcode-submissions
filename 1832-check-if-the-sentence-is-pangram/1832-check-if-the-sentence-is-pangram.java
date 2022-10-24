class Solution {
    public boolean checkIfPangram(String s) {
        int [] res=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            res[idx]++;
        }
        
        for(int x:res)
        {
            if(x==0)
                return false;
                
        }
        
        return true;
    }
}