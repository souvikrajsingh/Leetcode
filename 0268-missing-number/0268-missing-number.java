class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        // 3 0 1 
        // 0 1 3


        // 0 1  3
        // 0 1 2 
        int i  = 0;
        while( i < nums.length){
            if(nums[i] != i){
                return i;
            }
            else{
                 i++;   
            }
        }
        return i ;
    }
}