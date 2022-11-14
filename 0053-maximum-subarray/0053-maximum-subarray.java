class Solution {
        public int maxSubArray(int[] nums) {
            
//                      used kadane algorithm here gor O(n) 
//                 this algorithm was asked in google interviews
                
            int sum  = 0;
            int max = nums[0];
            
            for(int i = 0; i< nums.length ; i++){
                sum = sum + nums[i];
                max = (int)Math.max(max, sum);
                
                if(sum < 0){
                    sum = 0;
                }
            }
            
            return max;
            
            
        }
}
