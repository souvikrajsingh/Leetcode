class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxk = 0;
        for(int i : piles)
            maxk = Math.max(maxk, i);
        
        int res = maxk, l = 1, r = maxk;
        
        while(l <= r){
            
            int mid = l + (r - l) / 2;
            int hour = 0;
            for(int i : piles){
                
                hour += Math.ceil((double)i / mid );
            }
            
            if(hour <= h){
                r = mid - 1;
                res = Math.min(res, mid);
            }else{
                l = mid + 1;
            }
        }
        
        return res;
    }
}