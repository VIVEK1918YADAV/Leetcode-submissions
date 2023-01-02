//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
       
       Set<Character> hs = new HashSet<>();
       int i=0, j=0, len=0;
       
       while(j < S.length()){
          if(hs.add(S.charAt(j))){
              len = Math.max(len, j-i+1);
              j++;
          }
          
          else{
              hs.remove(S.charAt(i));
              i++;
          }
       }
       return len;
    }
}