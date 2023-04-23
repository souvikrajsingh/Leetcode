class Solution {
   public  int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = hMap.getOrDefault(nums[i], 0);
            hMap.put(nums[i], value + 1);
        }

        for(Map.Entry<Integer ,Integer> e : hMap.entrySet()){
            if(e.getValue()  > nums.length / 2 ){
                return e.getKey();
            }
        }

        return  -1;
}
}