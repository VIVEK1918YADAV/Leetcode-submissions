/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		 Scanner scn = new Scanner(System.in);
         int t = scn.nextInt();
         for(int i=0;i<t;i++){ 
             
          int a = scn.nextInt();
          int b = scn.nextInt();
          int c = scn.nextInt();
         int n = scn.nextInt();
         int count = 3;
         int k=0;
         
          for(int j=0; j<n; j++){
         k = a+b+c;
         a = b;
         b = c;
         c = k;
         count = count+1;
         if(count==n){
             break;
         }
     }
     System.out.println(k);
 }

	}
}