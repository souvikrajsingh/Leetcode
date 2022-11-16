class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
/* brute force approach 
Time complexity  = O(n^2)
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(i!=j && (nums[i] + nums[j] == target)){
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }

        return sum;*/
        
        
/*optimised solution using hashmaps

   Time Complexity O(n)*/
        
        int[] results  = new int [2];
        Map<Integer , Integer> map = new HashMap<Integer,Integer>();
        for(int i  = 0 ; i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                results[1] = i;
                results[0] = map.get(target - nums[i]);
                return results;
            }
            map.put(nums[i] , i );
        }
        return results;
        
    }
}