class Solution {
    public int findDuplicate(int[] nums) {
        
        
/* Hashmaps*/
        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(numMap.containsKey(nums[i])){
                return nums[i];
            }
            numMap.put(nums[i] , i);
        }
        
        return -1;
    }
}
        
        

/* Cyclic sort method */
       /* int i= 0;
        while( i < nums.length){
            if(nums[i] != i + 1){
                int correct  = nums[i]  -1;
                if(nums[i]!= nums[correct]){
                    int temp = nums[i];
                    nums[i] =nums[correct];
                    nums[correct] =temp;
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }*/
