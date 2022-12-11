//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            int answer[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n, answer);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static void Rearrange(int a[], int n, int answer[])
    {
       Arrays.sort(a);
       answer[0]=(a[0]);
       int j = 1;
       for(int i=1; i<=n/2; i++){    
           answer[j]=(a[n-i]);
           if(j+1<n){
           answer[j+1]=(a[i]);
           }
           j=j+2;
           
       }
 
    }
}
