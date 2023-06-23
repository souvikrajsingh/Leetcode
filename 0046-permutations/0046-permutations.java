class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList= new ArrayList<>();
        recursePermute(0 , nums, ansList);
        return ansList;
    }
    public void recursePermute(int ind , int[] nums, List<List<Integer>> ansList){
        if(ind == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i< nums.length; i++){
                list.add(nums[i]);
            }
            ansList.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = ind; i< nums.length; i++){
            swap(ind , i , nums);
            recursePermute(ind + 1, nums, ansList);
            swap(ind , i , nums);
        }
        
        
        }
    
    public void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }
    
