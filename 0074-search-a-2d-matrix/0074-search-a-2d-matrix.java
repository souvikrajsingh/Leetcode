class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        /*
        
        this solution works but is more appropriate for row-wise and column -wise
        sorted matrix, it a  better solution in this case
        
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
        
// refer to your notes 
        
      int n = matrix.length;
        int m = matrix[0].length ;
        
        int low = 0;
        int high = ((n*m) - 1);
        
        while(low <= high){
            int mid = (low+ (high - low) /2);
            if(matrix[mid/m][mid%m] == target){
                return true;
            }
            if(matrix[mid/m][mid%m] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            }
        
    
    return false;
}
}
