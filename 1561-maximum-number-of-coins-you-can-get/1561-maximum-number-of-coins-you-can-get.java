class Solution {
    public int maxCoins(int[] piles) {
      
        int Coin=0;
        Arrays.sort(piles);
        int i=0;
        int j=piles.length-2;
        
        while(i++<piles.length/3){
            
          Coin+=piles[j];
          j-=2;
        }
        return Coin;
    }
}