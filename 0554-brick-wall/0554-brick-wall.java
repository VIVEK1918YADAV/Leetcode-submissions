class Solution {
    public int leastBricks(List<List<Integer>> wall) {
      
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max= 0;
        
        for(List<Integer> al : wall){
            int prefixSum = 0;
            
            for(int i=0; i<al.size()-1; i++){
                int val = al.get(i);
                prefixSum += val;
                
                hm.put(prefixSum, hm.getOrDefault(prefixSum,0)+1);
                max = Math.max(max, hm.get(prefixSum));
            }
        }
        return wall.size()-max;
    }
}