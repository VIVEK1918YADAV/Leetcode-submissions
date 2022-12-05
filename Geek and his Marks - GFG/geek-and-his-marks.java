/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t -- > 0) {
            int n = scn.nextInt();
            int x = scn.nextInt(); //geek marks
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr, x));
        }
	 }
	 public static int solution(int[] arr, int x) {
	     int cnt = 0;
	     for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > x) {
	            cnt++;
	        }    
	     }
	     return cnt;

	}
}