class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ansList = new ArrayList<>();
     HashMap<Integer , Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = hMap.getOrDefault(nums[i], 0);
            hMap.put(nums[i], value + 1);
        }

        for(Map.Entry<Integer ,Integer> e : hMap.entrySet()){
            if(e.getValue()  > nums.length / 3 ){
             ansList.add(e.getKey());
            }
        }

        return ansList;
}
}