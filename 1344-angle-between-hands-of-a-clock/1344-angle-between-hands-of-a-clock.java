class Solution {
    public double angleClock(int hour, int minutes) {
        double angleHo = hour*30, angleMinutes = minutes*6;
        
        angleHo =angleHo + 0.5*(minutes);
        
        double res = Math.abs(angleHo - angleMinutes);
        
        return Math.min(res, 360-res); 
    }
}