class Solution {
    public int pivotInteger(int n) {
        int an = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            if(i*i == an)
                return i;
        }
        return -1;
    }
}