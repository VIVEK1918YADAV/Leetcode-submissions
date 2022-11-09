class Solution {
    public int countPrimes(int n) {
//         Scanner scn = new Scanner(System.in);
//         int count = 0;
//         for(int i=1; i<n; i++) {
//             for(int i=2; i*i<=n; i++){
//                 if(n%i ==0) {
//                     count++;
//                     break;
//                 }
//             }
//             for(int i=1;i<n;i++){
//             if(count ==0) {
//                 System.out.println(i);
//                 }
//             }
            
//         }
        
        
        boolean [] nPrimes = new boolean[n];
        int cnt = 2;
        if(n<=2) return 0;
        
        for(int i=2; i<Math.sqrt(n); i++){
            if(!nPrimes[i]){
                for(int j=i*i; j<n; j+=i){
                    if(!nPrimes[j]){
                        nPrimes[j] = true;
                        cnt++;
                    }
                }
            }
           
        }
         return nPrimes.length - cnt;
    }
}