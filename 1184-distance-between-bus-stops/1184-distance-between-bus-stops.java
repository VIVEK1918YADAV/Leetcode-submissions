class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;
        int st = 0, end = 0;
        
        for(int i=start; i!=destination; i=(i+1)%n){
            st += distance[i];
        }
        
        for(int i=destination; i!=start; i=(i+1)%n){
            end += distance[i];
        }
        
        return Math.min(st, end);
    }
}