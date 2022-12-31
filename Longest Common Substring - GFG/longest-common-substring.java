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
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        
         int max=Integer.MIN_VALUE;
         
         for(int i=0;i<S2.length();i++)
         {
           for(int j=i+1;j<=S2.length();j++)

            {
                String sub=S2.substring(i,j);

                if(S1.contains(sub))

                {
                    int len=sub.length();

                    if(len>max)

                    max=len;

                }

                

            }

        }

        return max==Integer.MIN_VALUE?0:max;
    }
}