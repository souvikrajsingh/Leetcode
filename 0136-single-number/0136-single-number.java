class Solution {
    public int singleNumber(int[] nums) {
        
        /* using bit manipualtion technique here*/
        
        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            ans^=nums[i];
        }
        return ans;
    }
}