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
    

/*

This is Permutation 1 taking time complexity of O(n!)+O(n);
Space complexity of: O(n)[for ds we taking] + O(n)[for the mapping array freq]

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList= new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq= new boolean[nums.length];
        recursePermute(nums, ds, ansList, freq);
        return ansList;
    }
    public void recursePermute(int[]nums, List<Integer> ds, List<List<Integer>> ansList, boolean[] freq){
        
        /*if the data structure is the size of the array it self, then supposedly it contains one of the permutations.*/
         /*
        if(ds.size() == nums.length){
            ansList.add(new ArrayList<>(ds));
            return;
        }
        for(int i  = 0 ; i< nums.length; i++){ 
           if (!freq[i]){
               freq[i] = true; // here we are mapping it to be true, that is it is used 
               ds.add(nums[i]);
               recursePermute(nums, ds, ansList, freq); // this will call the next left recursion and then the next step is removing the last element from the data structure and changing the map array to false at that index
               ds.remove(ds.size() -1 );
               freq[i] = false;
           }
    }
    }
}

*/