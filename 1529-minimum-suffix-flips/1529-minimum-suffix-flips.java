class Solution {
    public int minFlips(String target) {
       int cnt=0;
        char curr = '0';
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!=curr){
                cnt++;
                curr=target.charAt(i);
            }
        }
        return cnt;  
    }
}