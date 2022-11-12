//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        long oneend=1;

        long zeroend=1;
        
        long sum = oneend + zeroend;
        if(n==1) return sum;
        
        for(int i=2; i<=n; i++)

        {

            oneend=zeroend%1000000007;

            zeroend=sum%1000000007;

            sum = (oneend + zeroend)%1000000007;

        }

        

        return sum;
    }
}