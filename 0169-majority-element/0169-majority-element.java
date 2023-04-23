class Solution {
   public  int majorityElement(int[] nums) {
       
//        moore's voting algorithm - optimal approach

        int cnt =0 ;
        int el = 0;

        for(int i  = 0; i< nums.length; i++){
            if(cnt == 0){
                el = nums[i];
                cnt = 1;
            }
            else if(el == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int finalCnt = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == el){
                finalCnt++;
            }
        }

        if(finalCnt > (nums.length /2)){
            return el;
        }

        return -1;
       
       
       /* better approach
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
        */
}
}