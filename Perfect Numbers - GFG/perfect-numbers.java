//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(Long N) {
         long sum = 1;
        for(long i=2;i*i<=N;i++){
            
            if(N%i == 0){
                sum = sum + i + (N/i);
            }

        }
        if(sum == N && N!=1){

            return 1;

        }
        return 0;
    }
};