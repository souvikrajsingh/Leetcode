class Solution {
    public void moveZeroes(int[] nums) {
      int count = 0 , size = nums.length;

    for (int i = 0; i< size; i++) {
    if ( nums[i] == 0) { count ++;}
     if ( nums[i] != 0) { nums[i - count] = nums[i];}
        }
        for (int i = 0; i < count; i++ ) {
    nums[size - count  + i] = 0;
        }
    }
}