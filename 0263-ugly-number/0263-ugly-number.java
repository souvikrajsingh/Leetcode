class Solution {
    public boolean isUgly(int n) {
        
         int[] arr = { 2 ,3 ,5};
        if(n <= 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            while(n % arr[i] == 0){
                n = n/arr[i];
            }
        }
        if(n == 1){
            return true;
        }
        return false;

        
    }
        

}
