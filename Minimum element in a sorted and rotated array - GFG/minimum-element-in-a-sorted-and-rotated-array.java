//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
        int l = 0;
        int r = n-1;
        while(l < r){
            int mid = l + (r-l)/2;
            if(arr[mid] > arr[r]){
                l = mid+1;
            }
            else{
                r = mid ;
            }
        }
        return arr[l];
    }
}
