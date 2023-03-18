class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, top = 0;
        int right = matrix[0].length, bottom = matrix.length; //fixed initialization
        ArrayList<Integer> list =  new ArrayList<>();

        while(left < right && top < bottom){
            //iterate right
            for (int i = left; i < right ; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //iterate down
            for (int i = top; i < bottom ; i++) {
                list.add(matrix[i][right - 1]);
            }
            right--;

            if(left >= right || top >= bottom){ //fixed loop break condition
                break;
            }
            //iterate left
            for (int i = right - 1 ; i >= left ; i--) {
                list.add(matrix[bottom - 1][i]); //fixed matrix index
            }
            bottom--;

            //iterate up
            for (int i = bottom - 1; i >= top ; i--) {
                list.add(matrix[i][left]); //fixed matrix index
            }
            left++;
        }

        return list;  
    }
}