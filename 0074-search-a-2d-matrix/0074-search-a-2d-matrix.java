class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        /*
        
        this solution works but is more appropriate for row-wise and column -wise
        sorted matrix
        
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
    */
        
        int rows = matrix.length;
    int cols = matrix[0].length;
    
    for (int row = 0; row < rows; row++) {
        int left = 0;
        int right = cols - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    
    return false;
}
}
