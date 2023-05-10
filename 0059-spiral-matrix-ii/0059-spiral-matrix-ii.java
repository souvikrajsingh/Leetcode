class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][]matrix = new int[n][n];
        int num = 1;
        
        int top = 0, left = 0;
        int bottom = n -1 , right = n -1;

        /*normal spiral matrix concept
        here since we have taken the size (n-1), everything is <= */
        
        while(left <= right && top <= bottom){
        for (int i = left ; i <= right ; i++) {
            matrix[top][i] = num;
            num++;
        }
        top++;

        for (int i = top; i <= bottom ; i++) {
                matrix[i][right] = num;
                num++;
            }
        right--;


            for (int i = right; i >= left ; i--) {
                matrix[bottom][i]  = num;
                num++;
            }
            
            bottom--;

            for (int i = bottom; i >= top ; i--) {
                matrix[i][left] = num;
                num++;
            }
            left++;
            }
        
        return matrix;
    }
}